package de.viadee.i2t;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import mapper.*;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import talendfile.AbstractExternalData;
import talendfile.ColumnType;
import talendfile.ConnectionType;
import talendfile.ElementParameterType;
import talendfile.ElementValueType;
import talendfile.MetadataType;
import talendfile.NodeType;
import talendfile.TalendfileFactory;

import de.viadee.i2t.datatypes.TAggregateOperationInfo;
import de.viadee.i2t.datatypes.TColumnInfo;
import de.viadee.i2t.datatypes.TSortOperationInfo;
import de.viadee.i2t.datatypes.TTableInfo;

/**
 * Factory for construction of Talend components
 * Uses EMF TalendfileFactory to compose the structure of components and connections.
 * @author GrS 02.11.2011
 */
public class I2TTalendFactory {

    /**
     * Talend file structure factory
     */
    static TalendfileFactory tff = TalendfileFactory.eINSTANCE;
    /**
     * required for construction of schema data for tMap
     */
    static MapperFactory tmf = MapperFactory.eINSTANCE;
    static Logger logger = Logger.getLogger(I2TTalendFactory.class);

    /**
     * Create a tUnite component
     * Merges data from various sources, based on a common schema.
     * Purpose: centralize data from various and heterogeneous sources.
     * @author GrS 08.11.2011 Comment method "createTUniteComponent".
     * @param uniqueName    - Name of component
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, currently not used
     * @param columns       - List of TColumnInfo for meta data
     * @return NodeType
     */
    public static NodeType createTUniteComponent(String uniqueName, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String, TColumnInfo> columns){
        logger.info("creating tUnite component: "+uniqueName+"\n");
        
        NodeType nodeTUnite = tff.createNodeType();
        nodeTUnite.setComponentName("tUnite");
        nodeTUnite.setPosX(posX);
        nodeTUnite.setPosY(posY);
        nodeTUnite.setOffsetLabelX(0);
        nodeTUnite.setOffsetLabelY(0);
        nodeTUnite.setComponentVersion("0.101");
        
        String[][] elementParameters= {
                {"TEXT","UNIQUE_NAME",uniqueName},
                {"TEXT","CONNECTION_FORMAT","row"},
                {"CHECK","INFORMATION","false"},
                {"MEMO","COMMENT",""},
                {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeTUnite.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }

//      <metadata connector="FLOW" label="HH_EMPLOYEES" name="tUnite_1">
//        <column comment="" key="true" length="1" name="EMPLOYEE_ID" nullable="false" pattern="" precision="1" sourceType="INT IDENTITY" type="id_Integer"/>
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(uniqueName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();
        
        for(Map.Entry<String, TColumnInfo> entry : columns.entrySet()){
            TColumnInfo ci = entry.getValue();
            listColumns.add(createNodeColumn(ci));
        }
        nodeTUnite.getMetadata().add(md);
        
        return nodeTUnite;
    }
    
    /**
     * Create a tSortRowComponent
     * Sorts input data based on one or several columns, by sort type and order
     * Purpose: Helps creating metrics and classification table.
     * @author GrS 08.11.2011 Comment method "createTSortRowComponent".
     * @param uniqueName    - Name of component
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, currently not used
     * @param sortColumns   - LinkedHashMap for TSortOperations
     * @param columns       - List of TColumnInfo for meta data
     * @return NodeType
     */
    public static NodeType createTSortRowComponent(String uniqueName, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String,TSortOperationInfo> sortColumns, LinkedHashMap<String, TColumnInfo> columns){
        logger.info("creating tSortRow component: "+uniqueName+"\n");
        
        NodeType nodeTSortRow = tff.createNodeType();
        nodeTSortRow.setComponentName("tSortRow");
        nodeTSortRow.setPosX(posX);
        nodeTSortRow.setPosY(posY);
        nodeTSortRow.setOffsetLabelX(0);
        nodeTSortRow.setOffsetLabelY(0);
        nodeTSortRow.setComponentVersion("0.101");
        
        String[][] elementParameters= {
                {"TEXT","UNIQUE_NAME",uniqueName},
                {"CHECK","EXTERNAL","false"},
                {"DIRECTORY","TEMPFILE",""},
                {"CHECK","CREATEDIR","true"},
                {"TEXT","EXTERNAL_SORT_BUFFERSIZE","1000000"},
                {"TEXT","CONNECTION_FORMAT","row"},
                {"CHECK","INFORMATION","false"},
                {"MEMO","COMMENT",""},
                {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeTSortRow.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        
//      <elementParameter field="TABLE" name="CRITERIA">
//        <elementValue elementRef="COLNAME" value="ITEMGROUP_ID"/>
//        <elementValue elementRef="SORT" value="num"/>
//        <elementValue elementRef="ORDER" value="asc"/>
//      </elementParameter>
        ElementParameterType elemParameterFieldCriteria= tff.createElementParameterType();
        elemParameterFieldCriteria.setField("TABLE");
        elemParameterFieldCriteria.setName("CRITERIA");
        EList<ElementValueType> listElementValues = elemParameterFieldCriteria.getElementValue();
        elements.add(elemParameterFieldCriteria);
        for(Map.Entry<String, TSortOperationInfo> entry : sortColumns.entrySet()){
            listElementValues.add(createNodeElementParameterElementValue("COLNAME", entry.getKey()));
            listElementValues.add(createNodeElementParameterElementValue("SORT", entry.getValue().getSort()));
            listElementValues.add(createNodeElementParameterElementValue("ORDER", entry.getValue().getOrder()));
        }

//      <metadata connector="FLOW" label="SA_ITEM_GROUPS" name="tSortRow_1">
//        <column comment="" key="true" length="10" name="ITEMGROUP_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//      </metadata>
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(uniqueName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();
        
        for(Map.Entry<String, TColumnInfo> entry : columns.entrySet()){
            TColumnInfo ci = entry.getValue();
            listColumns.add(createNodeColumn(ci));
        }
        nodeTSortRow.getMetadata().add(md);
        
        return nodeTSortRow;
    }
    
    /**
     * Create a tJoin component
     * tJoin joins two tables by doing an exact match on several columns. It compares columns from the main flow with reference columns from the lookup flow and outputs the main flow data and/or the rejected data.
     * Purpose: Helps ensuring the data quality of any source data against a reference data source.
     * @author GrS 08.11.2011 Comment method "createTJoinComponente".
     * @param uniqueName    - Name of component
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, available keys: USE_INNER_JOIN
     * @param joinColumns   - LinkedHashMap for joinColumns
     * @param columns       - List of TColumnInfo for meta data
     * @return NodeType
     */
    public static NodeType createTJoinComponent(String uniqueName, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String,String> joinColumns, LinkedHashMap<String, TColumnInfo> columns){
        logger.info("creating tJoin component: "+uniqueName+"\n");
        
        NodeType nodeTJoin = tff.createNodeType();
        nodeTJoin.setComponentName("tJoin");
        nodeTJoin.setPosX(posX);
        nodeTJoin.setPosY(posY);
        nodeTJoin.setOffsetLabelX(0);
        nodeTJoin.setOffsetLabelY(0);
        nodeTJoin.setComponentVersion("0.101");

        String[][] elementParameters= {
                {"TEXT","UNIQUE_NAME",uniqueName},
              {"CHECK","USE_LOOKUP_COLS","false"},
              {"CHECK","USE_INNER_JOIN",options.get("USE_INNER_JOIN")},
              {"TEXT","CONNECTION_FORMAT","row"},
              {"CHECK","INFORMATION","false"},
              {"MEMO","COMMENT",""},
              {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeTJoin.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        ElementParameterType elemParameterFieldLookupCols= tff.createElementParameterType();
        elemParameterFieldLookupCols.setField("TABLE");
        elemParameterFieldLookupCols.setName("LOOKUP_COLS");
        elements.add(elemParameterFieldLookupCols);
        
//      <elementParameter field="TABLE" name="JOIN_KEY">
//        <elementValue elementRef="INPUT_COLUMN" value="MANUFACTURER_ID"/>
//        <elementValue elementRef="LOOKUP_COLUMN" value="MANUFACTURER_ID"/>
//      </elementParameter>
        ElementParameterType elemParameterFieldJoinKey= tff.createElementParameterType();
        elemParameterFieldJoinKey.setField("TABLE");
        elemParameterFieldJoinKey.setName("JOIN_KEY");
        EList<ElementValueType> listElementValues = elemParameterFieldJoinKey.getElementValue();
        elements.add(elemParameterFieldJoinKey);
        for(Map.Entry<String, String> entry : joinColumns.entrySet()){
            listElementValues.add(createNodeElementParameterElementValue("INPUT_COLUMN", entry.getKey()));
            listElementValues.add(createNodeElementParameterElementValue("LOOKUP_COLUMN", entry.getValue()));
        }

//      <metadata connector="FLOW" label="HQ_Items" name="tJoin_1">
//        <column comment="" key="true" length="10" name="ITEM_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//      </metadata>
//      <metadata connector="REJECT" label="HQ_Items" name="REJECT">
//        <column comment="" key="true" length="10" name="ITEM_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//      </metadata>
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(uniqueName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();

        MetadataType mdr = tff.createMetadataType();
        mdr.setConnector("REJECT");
        mdr.setLabel(uniqueName);
        mdr.setName(uniqueName);
        EList<ColumnType> rejectColumns = mdr.getColumn();
        
        for(Map.Entry<String, TColumnInfo> entry : columns.entrySet()){
            TColumnInfo ci = entry.getValue();
            listColumns.add(createNodeColumn(ci));
            rejectColumns.add(createNodeColumn(ci));
        }
        nodeTJoin.getMetadata().add(md);
        nodeTJoin.getMetadata().add(mdr);
        
        return nodeTJoin;
    }
    
    /**
     * Create a tAggregatorRow component
     * tAggregateRow receives a flow and aggregates it based on one or more columns. For each output line, are provided the aggregation key and the relevant result of set operations (min, max, sum...).
     * Purpose: Helps to provide a set of metrics based on values or calculations.
     * @author GrS 08.11.2011 Comment method "createTAggregateRowComponent".
     * @param uniqueName    - Name of component
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, currently not used
     * @param groupByColumns- LinkedList for groupByColumns
     * @param operations    - LinkedHashMap for TAggregateOperationInfo
     * @return NodeType
     */
    public static NodeType createTAggregateRowComponent(String uniqueName, int posX, int posY, HashMap<String,String> options, LinkedList<String> groupByColumns, LinkedHashMap<String,TAggregateOperationInfo> operations){
        logger.info("creating tAggregateRow component: "+uniqueName+"\n");
        
        NodeType nodeTAggregateRow = tff.createNodeType();
        nodeTAggregateRow.setComponentName("tAggregateRow");
        nodeTAggregateRow.setPosX(posX);
        nodeTAggregateRow.setPosY(posY);
        nodeTAggregateRow.setOffsetLabelX(0);
        nodeTAggregateRow.setOffsetLabelY(0);
        nodeTAggregateRow.setComponentVersion("0.102");
    
        String[][] elementParameters= {
                {"TEXT","UNIQUE_NAME",uniqueName},
                {"TEXT","LIST_DELIMITER","\"\""},
                {"CHECK","USE_FINANCIAL_PRECISION","true"},
                {"CHECK","CHECK_TYPE_OVERFLOW","false"},
                {"CHECK","CHECK_ULP","false"},
                {"TEXT","CONNECTION_FORMAT","row"},
                {"CHECK","INFORMATION","false"},
                {"MEMO","COMMENT",options.get("COMMENT")},
                {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeTAggregateRow.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }

//      <elementParameter field="TABLE" name="GROUPBYS">
//        <elementValue elementRef="OUTPUT_COLUMN" value="EMPLOYEE_ID"/>
//        <elementValue elementRef="INPUT_COLUMN" value="EMPLOYEE_ID"/>
//      </elementParameter>
        ElementParameterType elemParameterFieldGroupbys= tff.createElementParameterType();
        elemParameterFieldGroupbys.setField("TABLE");
        elemParameterFieldGroupbys.setName("GROUPBYS");
        EList<ElementValueType> listElementValues = elemParameterFieldGroupbys.getElementValue();
        elements.add(elemParameterFieldGroupbys);
        for(String groupByColumn : groupByColumns){
            listElementValues.add(createNodeElementParameterElementValue("OUTPUT_COLUMN", groupByColumn));
            listElementValues.add(createNodeElementParameterElementValue("INPUT_COLUMN", groupByColumn));
        }
        
        
//    <metadata connector="FLOW" name="tAggregateRow_1">
//      <column comment="" key="false" length="10" name="EMPLOYEE_ID" nullable="true" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//    </metadata>
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(uniqueName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();

//      <elementParameter field="TABLE" name="OPERATIONS">
//        <elementValue elementRef="OUTPUT_COLUMN" value="TURNOVER"/>
//        <elementValue elementRef="FUNCTION" value="sum"/>
//        <elementValue elementRef="INPUT_COLUMN" value="TURNOVER"/>
//        <elementValue elementRef="IGNORE_NULL" value="false"/>
//      </elementParameter>
        ElementParameterType elemParameterFieldOperations= tff.createElementParameterType();
        elemParameterFieldOperations.setField("TABLE");
        elemParameterFieldOperations.setName("OPERATIONS");
        listElementValues = elemParameterFieldOperations.getElementValue();
        elements.add(elemParameterFieldOperations);
        for (Map.Entry<String, TAggregateOperationInfo> table : operations.entrySet()) {
            TAggregateOperationInfo operation = table.getValue();
            TColumnInfo ci = operation.getColumnInfo();
            if(ci != null){
                listColumns.add(createNodeColumn(ci));
            }
            if(!operation.getFunction().equals("")){
                listElementValues.add(createNodeElementParameterElementValue("OUTPUT_COLUMN", operation.getOutputColumn()));
                listElementValues.add(createNodeElementParameterElementValue("FUNCTION", operation.getFunction()));
                listElementValues.add(createNodeElementParameterElementValue("INPUT_COLUMN", operation.getInputColumn()));
                listElementValues.add(createNodeElementParameterElementValue("IGNORE_NULL", operation.getIgnoreNull()));
            }
        }
        nodeTAggregateRow.getMetadata().add(md);
            
        return nodeTAggregateRow;
    }
    
    /**
     * Create a tMap component
     * tMap is an advanced component, which integrates itself as plugin to Talend Open Studio.
     * Purpose: tMap transforms and routes data from single or multiple sources to single or multiple destinations.
     * @author GrS 08.11.2011 Comment method "createTMapComponent".
     * @param uniqueName    - Name of component
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, available keys: COMMENT
     * @param inputTables   - LinkedHashMap of TTableInfo objects for input flows 
     * @param outputTables  - LinkedHashMap of TTableInfo objects for output flows
     * @return NodeType
     */
    public static NodeType createTMapComponent(String uniqueName, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String,TTableInfo> inputTables, LinkedHashMap<String,TTableInfo> outputTables){
        logger.info("creating tMap component: "+uniqueName+"\n");
        
        NodeType nodeTMap = tff.createNodeType();
        nodeTMap.setComponentName("tMap");
        nodeTMap.setPosX(posX);
        nodeTMap.setPosY(posY);
        nodeTMap.setOffsetLabelX(0);
        nodeTMap.setOffsetLabelY(0);
        nodeTMap.setComponentVersion("2.1");
        
        MapperData mapperData = tmf.createMapperData();
        //<uiProperties shellMaximized="true"/>
        UiProperties ui = tmf.createUiProperties();
        ui.setShellMaximized(true);
        mapperData.setUiProperties(ui);
        
        //<varTables sizeState="INTERMEDIATE" name="Var"/>
        VarTable vt = tmf.createVarTable();
        vt.setName("Var");
        vt.setSizeState(SizeState.INTERMEDIATE);
        mapperData.getVarTables().add(vt);
        
        //<outputTables sizeState="INTERMEDIATE" name="row4">
        for (Map.Entry<String, TTableInfo> table : outputTables.entrySet()) {
            String tableName = table.getKey();
            TTableInfo tableInfo = table.getValue();
            
            OutputTable ot = tmf.createOutputTable();
            ot.setName(tableName);
            ot.setSizeState(SizeState.INTERMEDIATE);
            if(tableInfo.getOptions().get("activateExpressionFilter") != null){
                ot.setActivateExpressionFilter(Boolean.valueOf(tableInfo.getOptions().get("activateExpressionFilter")));
            }
            if(tableInfo.getOptions().get("expressionFilter") != null){
                ot.setExpressionFilter(tableInfo.getOptions().get("expressionFilter"));
            }

//          <metadata connector="FLOW" label="row4" name="row4">
//            <column comment="" key="true" length="10" name="ORDER_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//          </metadata>
       
            MetadataType md = tff.createMetadataType();
            md.setConnector("FLOW");
            md.setLabel(tableName);
            md.setName(tableName);
            EList<ColumnType> listColumns = md.getColumn();
            for (Map.Entry<String, TColumnInfo> entry : tableInfo.getColumns().entrySet()) {
                TColumnInfo ci = entry.getValue();
                listColumns.add(createNodeColumn(ci));
            }
            nodeTMap.getMetadata().add(md);
            
            for(Map.Entry<String, TColumnInfo> column : tableInfo.getColumns().entrySet()) {
                TColumnInfo columnInfo = column.getValue();
                
                //<mapperTableEntries name="ORDER_ID" expression="row1.ORDER_ID  " type="id_Integer"/>
                MapperTableEntry mte = tmf.createMapperTableEntry();
                mte.setExpression(columnInfo.getExpression());
                mte.setName(columnInfo.getName());
                mte.setType(columnInfo.getType());
                
                ot.getMapperTableEntries().add(mte);
            }
            mapperData.getOutputTables().add(ot);
        }

        //<inputTables sizeState="INTERMEDIATE" name="row1" matchingMode="UNIQUE_MATCH" lookupMode="LOAD_ONCE">
        for (Map.Entry<String, TTableInfo> table : inputTables.entrySet()) {
            String tableName = table.getKey();
            TTableInfo tableInfo = table.getValue();
            
            InputTable it = tmf.createInputTable();
            it.setName(tableName);
            it.setSizeState(SizeState.INTERMEDIATE);
            it.setMatchingMode(tableInfo.getOptions().get("matchingMode"));
            it.setLookupMode(tableInfo.getOptions().get("lookupMode"));
            if(tableInfo.getOptions().get("innerJoin") != null){
                it.setInnerJoin(tableInfo.getOptions().get("innerJoin").equals("true"));
            }
            for(Map.Entry<String, TColumnInfo> column : tableInfo.getColumns().entrySet()) {
                TColumnInfo columnInfo = column.getValue();
                
                //<mapperTableEntries name="ORDER_ID" type="id_Integer"/>
                MapperTableEntry mte = tmf.createMapperTableEntry();
                mte.setName(columnInfo.getName());
                mte.setType(columnInfo.getType());
                if(columnInfo.isNullable())
                    mte.setNullable(true);
                if(columnInfo.getExpression()!= null){
                    mte.setExpression(columnInfo.getExpression());
                }
                if(columnInfo.getOperator()!=null){
                    mte.setOperator(columnInfo.getOperator());
                }
                it.getMapperTableEntries().add(mte);
            }
            mapperData.getInputTables().add(it);
        }
        
        nodeTMap.setNodeData((AbstractExternalData)mapperData);
        
        String[][] elementParameters= {
            {"TEXT","UNIQUE_NAME",uniqueName},
            {"EXTERNAL","MAP",""},
            {"CLOSED_LIST","LINK_STYLE","AUTO"},
            {"DIRECTORY","TEMPORARY_DATA_DIRECTORY",""},
            {"IMAGE","PREVIEW",""},
            {"CHECK","DIE_ON_ERROR","true"},
            {"CHECK","LKUP_PARALLELIZE","false"},
            {"TEXT","ROWS_BUFFER_SIZE","2000000"},
            {"TEXT","CONNECTION_FORMAT","row"},
            {"CHECK","INFORMATION","false"},
            {"MEMO","COMMENT",options.get("COMMENT")},
            {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeTMap.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        
        return nodeTMap;
    }
    
    /**
     * Create a Talend connection between to components.
     * @author GrS 08.11.2011 Comment method "createConnection".
     * @param uniqueName    - Name of component
     * @param metaName      - Meta name of flow
     * @param source        - Name of source component
     * @param target        - Name of target component
     * @param columns       - List of TColumnInfo for meta data
     * @return ConnectionType
     */
    public static ConnectionType createConnection(String uniqueName, String metaName, String source, String target, LinkedList<String> columns){
        logger.info("creating connection: "+uniqueName+" between "+source+" and "+target+" "+columns);
        
        ConnectionType connection = tff.createConnectionType();
        connection.setConnectorName("FLOW");
        connection.setLabel(uniqueName);
        connection.setLineStyle(0);
        connection.setMetaname(metaName);
        connection.setOffsetLabelX(0);
        connection.setOffsetLabelY(0);
        connection.setSource(source);
        connection.setTarget(target);
        
        String[][] elementParameters= {
          {"CHECK","MONITOR_CONNECTION","false"},
          {"CHECK","USEROWLABEL","true"},
          {"CHECK","TRACES_CONNECTION_ENABLE","true"},
          {"TEXT","METTERLABEL","\"MyLabel\""},
          {"CLOSED_LIST","ABSOLUTE","Absolute"},
          {"CONNECTION_LIST","CONNECTIONS",""},
          {"TABLE","THRESHLODS",""},
          {"CHECK","ACTIVATE","true"},
          {"TEXT","UNIQUE_NAME",uniqueName}
        };
        EList<ElementParameterType> elements = connection.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        
        //<elementParameter field="TABLE" name="TRACES_CONNECTION_FILTER">
        ElementParameterType elemParameterFieldOptions= tff.createElementParameterType();
        elemParameterFieldOptions.setField("TABLE");
        elemParameterFieldOptions.setName("TRACES_CONNECTION_FILTER");
        
        EList<ElementValueType> listElementValues = elemParameterFieldOptions.getElementValue();
        elements.add(elemParameterFieldOptions);
       
        for(String column: columns){
            //<elementValue elementRef="TRACE_COLUMN" value="ITEMGROUP_ID"/>
            //<elementValue elementRef="TRACE_COLUMN_CHECKED" value="true"/>
            //<elementValue elementRef="TRACE_COLUMN_CONDITION" value=""/>
            listElementValues.add(createNodeElementParameterElementValue("TRACE_COLUMN", column));
            listElementValues.add(createNodeElementParameterElementValue("TRACE_COLUMN_CHECKED", "true"));
            listElementValues.add(createNodeElementParameterElementValue("TRACE_COLUMN_CONDITION", ""));
        }
        
        return connection;
    }
    
    /**
     * Create a tMSSqlOutput component
     * @author GrS 08.11.2011 Comment method "createMSSqlOutputComponent".
     * @param uniqueName    - Name of component
     * @param tableName     - Name of table
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, available keys: HOST, PORT, DB_SCHEMA, DB_NAME, USER, PASS, PROPERTIES, 
     * @param columns       - List of TColumnInfo for meta data
     * @return
     */
    public static NodeType createMSSqlOutputComponent(String uniqueName,String tableName, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String,TColumnInfo> columns){
        logger.info("creating tMSSqlOutput component: "+uniqueName+"\n");
        
        NodeType nodeMsSqlOutput = tff.createNodeType();
        nodeMsSqlOutput.setComponentName("tMSSqlOutput");
        nodeMsSqlOutput.setComponentVersion("0.102");
        nodeMsSqlOutput.setOffsetLabelX(0);
        nodeMsSqlOutput.setOffsetLabelY(0);
        nodeMsSqlOutput.setPosX(posX);
        nodeMsSqlOutput.setPosY(posY);
        
        String[][] elementParameters= {
                {"TEXT","UNIQUE_NAME",uniqueName},
//                {"TECHNICAL","PROPERTY:PROPERTY_TYPE","REPOSITORY"},
//                {"TECHNICAL","PROPERTY:REPOSITORY_PROPERTY_TYPE",""},
                {"CHECK","USE_EXISTING_CONNECTION","false"},
                {"COMPONENT_LIST","CONNECTION",""},
                {"TEXT","HOST","\""+options.get("HOST")+"\""},
                {"TEXT","PORT","\""+options.get("PORT")+"\""},
                {"TEXT","DB_SCHEMA","\""+options.get("DB_SCHEMA")+"\""},
                {"TEXT","DBNAME","\""+options.get("DBNAME")+"\""},
                {"TEXT","TYPE","MSSQL"},
                {"TEXT","USER","\""+options.get("USER")+"\""},
                {"TEXT","PASS","\""+options.get("PASS")+"\""},
                {"DBTABLE","TABLE","\""+tableName+"\""},
                {"CLOSED_LIST","TABLE_ACTION","NONE"},
                {"CHECK","IDENTITY_INSERT","false"},
                //TODO: use settings from UPDATE_STRATEGY
                {"CLOSED_LIST","DATA_ACTION","INSERT_IF_NOT_EXIST"},
                {"LABEL","NOTE","NOTE: batch size must be less than or equal to total number of parameter markers divided by number of columns"},
                {"CHECK","SPECIFY_IDENTITY_FIELD","false"},
                {"COLUMN_LIST","IDENTITY_FIELD","ITEMGROUP_ID"},
                {"TEXT","START_VALUE","1"},
                {"TEXT","STEP","1"},
//                {"TECHNICAL","SCHEMA_FLOW:SCHEMA_TYPE","REPOSITORY"},
//                {"TECHNICAL","SCHEMA_FLOW:REPOSITORY_SCHEMA_TYPE","_aXLToNU5EeCqEJUYgJ5aYw - DWH_ITEMGROUPS2"},
                {"CHECK","DIE_ON_ERROR","false"},
                {"MAPPING_TYPE","MAPPING","id_MSSQL"},
                {"TEXT","PROPERTIES","\""+options.get("PROPERTIES")+"\""},
                {"ENCODING_TYPE","ENCODING","&quot;ISO-8859-15&quot;"},
                {"TECHNICAL","ENCODING:ENCODING_TYPE","ISO-8859-15"},
                {"TEXT","COMMIT_EVERY","10000"},
                {"TABLE","ADD_COLS",""},
                {"CHECK","USE_FIELD_OPTIONS","false"},
                {"CHECK","ENABLE_DEBUG_MODE","false"},
                {"CHECK","SUPPORT_NULL_WHERE","false"},
                {"CHECK","USE_BATCH_SIZE","true"},
                {"TEXT","BATCH_SIZE","10000"},
                {"TEXT","LABEL","__TABLE__"},
                {"TEXT","CONNECTION_FORMAT","row"},
                {"CHECK","INFORMATION","false"},
                {"MEMO","COMMENT",""},
                {"CHECK","VALIDATION_RULES","false"}
        };

        EList<ElementParameterType> elements = nodeMsSqlOutput.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        

//      <elementParameter field="TABLE" name="FIELD_OPTIONS">
//        <elementValue elementRef="SCHEMA_COLUMN" value="ITEMGROUP_ID"/>
//      </elementParameter>
      ElementParameterType elemParameterFieldOptions= tff.createElementParameterType();
      elemParameterFieldOptions.setField("TABLE");
      elemParameterFieldOptions.setName("FIELD_OPTIONS");
      EList<ElementValueType> listElementValues = elemParameterFieldOptions.getElementValue();
      elements.add(elemParameterFieldOptions);
      
//        <metadata connector="FLOW" label="DWH_ITEMGROUPS2" name="tMSSqlOutput_1">
//          <column comment="" key="true" length="10" name="ITEMGROUP_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//          <column comment="" key="false" length="30" name="NAME" nullable="true" pattern="" precision="0" sourceType="VARCHAR" type="id_String"/>
//        </metadata>
//        <metadata connector="REJECT" label="DWH_ITEMGROUPS2" name="REJECT">
//          <column comment="" key="true" length="10" name="ITEMGROUP_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
//          <column comment="" key="false" length="30" name="NAME" nullable="true" pattern="" precision="0" sourceType="VARCHAR" type="id_String"/>
//          <column defaultValue="" key="false" length="255" name="errorCode" nullable="true" precision="0" sourceType="" type="id_String"/>
//          <column defaultValue="" key="false" length="255" name="errorMessage" nullable="true" precision="0" sourceType="" type="id_String"/>
//        </metadata>
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(tableName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();
        
        MetadataType mdReject = tff.createMetadataType();
        mdReject.setConnector("REJECT");
        mdReject.setLabel(tableName);
        mdReject.setName("REJECT");
        EList<ColumnType> rejectColumns = mdReject.getColumn();
        for (Map.Entry<String, TColumnInfo> entry : columns.entrySet()) {
            String key = entry.getKey();
            TColumnInfo ci = entry.getValue();
            listColumns.add(createNodeColumn(ci));
            rejectColumns.add(createNodeColumn(ci));

            //add elementValues for FIELD_OPTIONS
            //TODO: use settings from UPDATE_STRATEGY
            listElementValues.add(createNodeElementParameterElementValue("SCHEMA_COLUMN", key));
            listElementValues.add(createNodeElementParameterElementValue("UPDATE_KEY", "false"));
            listElementValues.add(createNodeElementParameterElementValue("DELETE_KEY", "false"));
            listElementValues.add(createNodeElementParameterElementValue("UPDATABLE", "true"));
            listElementValues.add(createNodeElementParameterElementValue("INSERTABLE", "true"));
            
        }
        TColumnInfo errorColumn = new TColumnInfo("",false,255,"errorCode",true, "", 0,"","id_String");
        rejectColumns.add(createNodeColumn(errorColumn));
        TColumnInfo errorMessage = new TColumnInfo("",false,255,"errorMessage",true, "", 0,"","id_String");
        rejectColumns.add(createNodeColumn(errorMessage));
        
        nodeMsSqlOutput.getMetadata().add(md);
        nodeMsSqlOutput.getMetadata().add(mdReject);
        
        return nodeMsSqlOutput;
    }

    /**
     * Create a tMSSqlInput component
     * @author GrS 08.11.2011 Comment method "createMSSqlInputComponent".
     * @param uniqueName    - Name of component
     * @param tableName     - Name of table
     * @param query         - SQL query for input
     * @param posX          - xPos in design
     * @param posY          - yPos in design
     * @param options       - HashMap for options, available keys: HOST, PORT, DB_SCHEMA, DB_NAME, USER, PASS, PROPERTIES, GUESS_SCHEMA 
     * @param columns       - List of TColumnInfo for meta data
     * @return
     */
    public static NodeType createMSSqlInputComponent(String uniqueName, String tableName, String query, int posX, int posY, HashMap<String,String> options, LinkedHashMap<String,TColumnInfo> columns){
    
        logger.info("creating tMSSqlInput component: "+uniqueName+"\n");
        
        NodeType nodeMsSqlInput = tff.createNodeType();
        nodeMsSqlInput.setComponentName("tMSSqlInput");
        nodeMsSqlInput.setComponentVersion("0.102");
        nodeMsSqlInput.setOffsetLabelX(0);
        nodeMsSqlInput.setOffsetLabelY(0);
        nodeMsSqlInput.setPosX(posX);
        nodeMsSqlInput.setPosY(posY);
        
        String[][] elementParameters= {
            {"TEXT","UNIQUE_NAME",uniqueName},
            {"CHECK","START","true"},
            {"CHECK","USE_EXISTING_CONNECTION","false"},
            {"COMPONENT_LIST","CONNECTION",""},
//            {"TECHNICAL","PROPERTY:PROPERTY_TYPE","REPOSITORY"},
//            {"TECHNICAL","PROPERTY:REPOSITORY_PROPERTY_TYPE",""},
            {"TEXT","HOST","\""+options.get("HOST")+"\""},
            {"TEXT","TYPE","MSSQL"},
            {"TEXT","PORT","\""+options.get("PORT")+"\""},
            {"TEXT","DB_SCHEMA","\""+options.get("DB_SCHEMA")+"\""},
            {"TEXT","DBNAME","\""+options.get("DBNAME")+"\""},
            {"TEXT","USER","\""+options.get("USER")+"\""},
            {"TEXT","PASS","\""+options.get("PASS")+"\""},
//            {"TECHNICAL","SCHEMA:SCHEMA_TYPE","REPOSITORY"},
//            {"TECHNICAL","SCHEMA:REPOSITORY_SCHEMA_TYPE",""},
            {"DBTABLE","TABLE","\""+tableName+"\""},
            {"QUERYSTORE_TYPE","QUERYSTORE","\"\""},
            {"TECHNICAL","QUERYSTORE:REPOSITORY_QUERYSTORE_TYPE",""},
            {"TECHNICAL","QUERYSTORE:QUERYSTORE_TYPE","BUILT_IN"},
            {"GUESS_SCHEMA","GUESS_SCHEMA","\""+options.get("GUESS_SCHEMA")+"\""},
            {"MEMO_SQL","QUERY","\""+query+"\""},
            {"MAPPING_TYPE","MAPPING","id_MSSQL"},
            {"TEXT","PROPERTIES","\""+options.get("PROPERTIES")+"\""},
            {"ENCODING_TYPE","ENCODING","&quot;ISO-8859-15&quot;"},
            {"TECHNICAL","ENCODING:ENCODING_TYPE","ISO-8859-15"},
            {"CHECK","TRIM_ALL_COLUMN","false"},
            {"TEXT","LABEL","__TABLE__"},
            {"TEXT","CONNECTION_FORMAT","row"},
            {"CHECK","INFORMATION","false"},
            {"MEMO","COMMENT",""},
            {"CHECK","VALIDATION_RULES","false"}
        };
        
        EList<ElementParameterType> elements = nodeMsSqlInput.getElementParameter();
        for(int i=0;i<elementParameters.length;i++){
            elements.add(createNodeElementParameter(elementParameters[i][0],elementParameters[i][1],elementParameters[i][2]));
        }
        
        //<elementParameter field="TABLE" name="TRIM_COLUMN">  
        //    <elementValue elementRef="SCHEMA_COLUMN" value="NAME"/>
        //    <elementValue elementRef="TRIM" value="false"/>
        //</elementParameter>
        ElementParameterType elemParameterTrimColumn = tff.createElementParameterType();
        elemParameterTrimColumn.setField("TABLE");
        elemParameterTrimColumn.setName("TRIM_COLUMN");
        EList<ElementValueType> listElementValues = elemParameterTrimColumn.getElementValue();
        elements.add(elemParameterTrimColumn);
        
        //<metadata connector="FLOW" label="SA_ITEM_GROUPS" name="tMSSqlInput_1">
        //  <column comment="" key="true" length="10" name="ITEMGROUP_ID" nullable="false" pattern="" precision="0" sourceType="INT" type="id_Integer"/>
        //  <column comment="" key="false" length="30" name="NAME" nullable="true" pattern="" precision="0" sourceType="VARCHAR" type="id_String"/>
        //</metadata>   
        MetadataType md = tff.createMetadataType();
        md.setConnector("FLOW");
        md.setLabel(tableName);
        md.setName(uniqueName);
        EList<ColumnType> listColumns = md.getColumn();
        for (Map.Entry<String, TColumnInfo> entry : columns.entrySet()) {
            String key = entry.getKey();
            TColumnInfo ci = entry.getValue();
            listColumns.add(createNodeColumn(ci));
            //    <elementValue elementRef="SCHEMA_COLUMN" value="ITEMGROUP_ID"/>
            //    <elementValue elementRef="TRIM" value="false"/>
            listElementValues.add(createNodeElementParameterElementValue("SCHEMA_COLUMN", key));
            listElementValues.add(createNodeElementParameterElementValue("TRIM", "false"));
        }
        nodeMsSqlInput.getMetadata().add(md);
        
        return nodeMsSqlInput;
    }
    
    /**
     * Helper to create element parameter value structure
     * @author GrS 08.11.2011 Comment method "createNodeElementParameterElementValue".
     * @param elementRef    - String of element reference
     * @param value         - String value
     * @return ElementValueType
     */
    public static ElementValueType createNodeElementParameterElementValue(String elementRef, String value){
        ElementValueType elemValue = tff.createElementValueType();
        elemValue.setElementRef(elementRef);
        elemValue.setValue(value);
        return elemValue;
    }
    
    /**
     * Helper to create element parameter structure
     * @author GrS 08.11.2011 Comment method "createNodeElementParameter".
     * @param field - String field
     * @param name  - String name
     * @param value - String value
     * @return ElementParameterType
     */
    public static ElementParameterType createNodeElementParameter(String field, String name, String value){
        ElementParameterType elemParam = tff.createElementParameterType();
        elemParam.setField(field);
        elemParam.setName(name);
        elemParam.setValue(value);
        return elemParam;
    }
    
    /**
     * Helper to create node column structure from TColumnInfo
     * @author GrS 08.11.2011 Comment method "createNodeColumn".
     * @param ci
     * @return
     */
    public static ColumnType createNodeColumn(TColumnInfo ci){
        ColumnType col = tff.createColumnType();
        col.setComment(ci.getComment());
        col.setKey(ci.isKey());
        col.setLength(ci.getLength());
        col.setName(ci.getName());
        col.setNullable(ci.isNullable());
        col.setPattern(ci.getPattern());
        col.setPrecision(ci.getPrecision());
        col.setSourceType(ci.getSourceType());
        col.setType(ci.getType());
        return col;
    }
}
