package de.viadee.i2t.tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.custommonkey.xmlunit.XMLTestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.viadee.i2t.I2TApplication;
import de.viadee.i2t.I2TApplicationException;
import de.viadee.i2t.I2TPowrmartVisitor;
import de.viadee.i2t.I2TPreprocessorVisitor;
import de.viadee.i2t.I2TUtil;

/**
 * Test case for the comparison of converted ETL processes and control models.
 * @author GrS 18.11.2011
 */
@SuppressWarnings("unchecked")
@ContextConfiguration(locations = { "classpath:applicationContext-common.xml","classpath:applicationContext-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestXmlEquality extends XMLTestCase {
protected String workPath = new java.io.File("").getAbsolutePath()+"/src/test/resources";
    
    static Logger logger = Logger.getLogger(TestXmlEquality.class);
    
    @Autowired    
    protected I2TPowrmartVisitor powrmartVisitor;
    
    @Autowired
    protected I2TPreprocessorVisitor preprocessorVisitor;
    
    @Before
    public void setUp() {
        PropertyConfigurator.configure("log4j.properties");
    }      
    
    @After
    public void tearDown() {    
        powrmartVisitor = null;
        preprocessorVisitor = null;
    }
    
    /**
     * Runs an application instance and compare the result with a control file
     * @author GrS 10.11.2011 Comment method "defaultXmlComparison".
     * @param modelName
     * @throws Exception
     */
    protected void defaultXmlComparison(String modelName) throws Exception{
        String controlFilePath = workPath + "/control/" + modelName + ".item";
        String outputFilePath = workPath + "/output/" + modelName + ".item";
        String inputPath = workPath + "/input";
        String outputPath = workPath + "/output";
        
        I2TApplication application = new I2TApplication(modelName, preprocessorVisitor, powrmartVisitor);
        try {
            application.setInputPath(inputPath);
            application.setOutputPath(outputPath);
            application.run();
        } catch (I2TApplicationException e) {
            e.printStackTrace();
        } finally {
            application.close();
        }
        logger.debug("comparing "+outputFilePath+" to control xml "+controlFilePath);
        assertXMLEqual("comparing test xml to control xml", I2TUtil.convertXMLFileToString(outputFilePath), I2TUtil.convertXMLFileToString(controlFilePath));
    }

    @Test
    @DirtiesContext
    public void testExpressionTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Expression");
    }

    @Test
    @DirtiesContext
    public void testUnionTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Union");
    }

    @Test
    @DirtiesContext
    public void testAggregatorTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Aggregate");
    }

    @Test
    @DirtiesContext
    public void testFilterTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_FilterRow");
    }

    @Test
    @DirtiesContext
    public void testSorterTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_SortRow");
    }

    @Test
    @DirtiesContext
    public void testRouterTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Router");
    }

    @Test
    @DirtiesContext
    public void testSourceQualifierTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_SourceQualifier");
    }

    @Test
    @DirtiesContext
    public void testJoinerTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Join");
    }

    @Test
    @DirtiesContext
    public void testLookupTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Lookup");
    }

    @Test
    @DirtiesContext
    public void testSequenceTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Sequence");
    }

    @Test
    @DirtiesContext
    public void testRankTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_Rank");
    }

    @Test
    @DirtiesContext
    public void testUpdateStrategyTransformationXmlComparision() throws Exception {
        defaultXmlComparison("m_UpdateStrategy");
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(TestXmlEquality.class);
    }
}
