/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Powrmart.impl;

import Powrmart.PowrmartFactory;
import Powrmart.PowrmartPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PowrmartPackageImpl extends EPackageImpl implements PowrmartPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String packageFilename = "Powrmart.ecore";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associatedsourceinstanceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass configreferenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass configTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectionreferenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conwfruninfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dailyfrequencyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endoptionsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass erpinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass erpsrcinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exprmacrodependencyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exprmacroTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fieldattributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fielddependencyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass filterTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flatfileTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass folderTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass folderversionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hashkeyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass initpropTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass instanceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass keyrangeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass keywordTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macroargumentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macrodependencyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mapdependencyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappingvariableTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mappletTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass metadataextensionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass partitionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powermartTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass recurringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repeatTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass repositoryTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourcereferenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapcodeblockTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapfuncinstanceparamfldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapfuncinstanceparamTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapfuncparamTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapfunctioninstanceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapfunctionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapoutputportTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapprogramflowobjectTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapprogramTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapstructurefieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapstructureTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass saptableinstanceparamTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass saptableparamTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sapvariableTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleinfoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scheduleoptionsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schedulerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sebljoinTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sebllinkTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass seblmvlinkrelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass seblmvlinkTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass seblsrcinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sessioncomponentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sessionextensionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sessionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sesstransformationgroupTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sesstransformationinstTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass shortcutTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourcefieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass startoptionsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableattributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetfieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetindexfieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetindexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetloadorderTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskinstanceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timerTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformfieldattrdefTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformfieldattrTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformfieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformresourcerefTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valuepairTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workfloweventTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workflowlinkTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workflowTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workflowvariableTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workletTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmlinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmltextTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum aggfunctionTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum datatypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum dayTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum endtypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum failparentifinstancedidnotrunTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum failparentifinstancefailsTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ignoreincompareTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ignorenullinputsTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isclienteditableTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isclientvisibleTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isdefaultTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isenabledTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isenabledType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isexpressionvariableTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isfilenamefieldTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isnoneTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isnullTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isoptionalTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isoptionalType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isoutputportTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isparamTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ispersistentTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isprofilemappingTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isreferenceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isrepartitionpointTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isreusableTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isrunnableserviceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isserviceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum issharereadTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum issharewriteTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum issortkeyTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isvalidTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isvalidType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isvalidType2EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum isvalidType3EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum macrotypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum nullableTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum nullableType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum nullchartypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum objecttypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum occurrenceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum outerjoinrelTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parenttypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parenttypeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parenttypeType2EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum parenttypeType3EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum referencetypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableschedulerTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType2EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType3EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType4EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType5EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reusableType6EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reverseassignmentTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum runforeverTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum runonceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum scheduletypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum scheduletypeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum sharedTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum sortdirectionTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum stagefilepersistTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum stagefilereinitTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum subtypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum subtypeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum suspendonerrorTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tasksmustrunonserverTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum timertypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum treatinputlinkasandTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType2EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType3EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType4EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType5EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType6EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType7EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeType8EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum userdefinedTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum userdefinedType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum valuetypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum valuetypeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum valuetypeType2EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType aggfunctionTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType datatypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType dayTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType endtypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType failparentifinstancedidnotrunTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType failparentifinstancefailsTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType ignoreincompareTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType ignorenullinputsTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isclienteditableTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isclientvisibleTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isdefaultTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isenabledTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isenabledTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isexpressionvariableTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isfilenamefieldTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isnoneTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isnullTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isoptionalTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isoptionalTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isoutputportTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isparamTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType ispersistentTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isprofilemappingTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isreferenceTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isrepartitionpointTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isreusableTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isrunnableserviceTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isserviceTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType issharereadTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType issharewriteTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType issortkeyTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isvalidTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isvalidTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isvalidTypeObject2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType isvalidTypeObject3EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType macrotypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nullableTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nullableTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType nullchartypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType objecttypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType occurrenceTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType outerjoinrelTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType parenttypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType parenttypeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType parenttypeTypeObject2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType parenttypeTypeObject3EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType referencetypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableschedulerTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject3EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject4EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject5EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reusableTypeObject6EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reverseassignmentTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType runforeverTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType runonceTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType scheduletypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType scheduletypeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType sharedTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType sortdirectionTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stagefilepersistTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stagefilereinitTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType subtypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType subtypeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType suspendonerrorTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tasksmustrunonserverTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType timertypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType treatinputlinkasandTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject2EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject3EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject4EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject5EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject6EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject7EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeTypeObject8EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType userdefinedTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType userdefinedTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType valuetypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType valuetypeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType valuetypeTypeObject2EDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see Powrmart.PowrmartPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PowrmartPackageImpl() {
        super(eNS_URI, PowrmartFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link PowrmartPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static PowrmartPackage init() {
        if (isInited) return (PowrmartPackage)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI);

        // Obtain or create and register package
        PowrmartPackageImpl thePowrmartPackage = (PowrmartPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PowrmartPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PowrmartPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Load packages
        thePowrmartPackage.loadPackage();

        // Fix loaded packages
        thePowrmartPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        thePowrmartPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PowrmartPackage.eNS_URI, thePowrmartPackage);
        return thePowrmartPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getASSOCIATEDSOURCEINSTANCEType() {
        if (associatedsourceinstanceTypeEClass == null) {
            associatedsourceinstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(2);
        }
        return associatedsourceinstanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getASSOCIATEDSOURCEINSTANCEType_NAME() {
        return (EAttribute)getASSOCIATEDSOURCEINSTANCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getATTRIBUTEType() {
        if (attributeTypeEClass == null) {
            attributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(3);
        }
        return attributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getATTRIBUTEType_NAME() {
        return (EAttribute)getATTRIBUTEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getATTRIBUTEType_PARTITIONNAME() {
        return (EAttribute)getATTRIBUTEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getATTRIBUTEType_VALUE() {
        return (EAttribute)getATTRIBUTEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCONFIGREFERENCEType() {
        if (configreferenceTypeEClass == null) {
            configreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(4);
        }
        return configreferenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCONFIGREFERENCEType_ATTRIBUTE() {
        return (EReference)getCONFIGREFERENCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGREFERENCEType_REFOBJECTNAME() {
        return (EAttribute)getCONFIGREFERENCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGREFERENCEType_TYPE() {
        return (EAttribute)getCONFIGREFERENCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCONFIGType() {
        if (configTypeEClass == null) {
            configTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(5);
        }
        return configTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCONFIGType_ATTRIBUTE() {
        return (EReference)getCONFIGType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGType_DESCRIPTION() {
        return (EAttribute)getCONFIGType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGType_ISDEFAULT() {
        return (EAttribute)getCONFIGType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGType_NAME() {
        return (EAttribute)getCONFIGType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONFIGType_VERSIONNUMBER() {
        return (EAttribute)getCONFIGType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCONNECTIONREFERENCEType() {
        if (connectionreferenceTypeEClass == null) {
            connectionreferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(6);
        }
        return connectionreferenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCONNECTIONREFERENCEType_ATTRIBUTE() {
        return (EReference)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_CNXREFNAME() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_COMPONENTVERSION() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_CONNECTIONNAME() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_CONNECTIONNUMBER() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_CONNECTIONSUBTYPE() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_CONNECTIONTYPE() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_PARTITIONNAME() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTIONREFERENCEType_VARIABLE() {
        return (EAttribute)getCONNECTIONREFERENCEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCONNECTORType() {
        if (connectorTypeEClass == null) {
            connectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(7);
        }
        return connectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_FROMFIELD() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_FROMINSTANCE() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_FROMINSTANCETYPE() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_TOFIELD() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_TOINSTANCE() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONNECTORType_TOINSTANCETYPE() {
        return (EAttribute)getCONNECTORType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCONWFRUNINFOType() {
        if (conwfruninfoTypeEClass == null) {
            conwfruninfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(8);
        }
        return conwfruninfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONWFRUNINFOType_CONWFPARAMFILE() {
        return (EAttribute)getCONWFRUNINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCONWFRUNINFOType_CONWFRUNINSTNAME() {
        return (EAttribute)getCONWFRUNINFOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCUSTOMType() {
        if (customTypeEClass == null) {
            customTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(9);
        }
        return customTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCUSTOMType_DAILYFREQUENCY() {
        return (EReference)getCUSTOMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCUSTOMType_REPEAT() {
        return (EReference)getCUSTOMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDAILYFREQUENCYType() {
        if (dailyfrequencyTypeEClass == null) {
            dailyfrequencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(10);
        }
        return dailyfrequencyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDAILYFREQUENCYType_HOURS() {
        return (EAttribute)getDAILYFREQUENCYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDAILYFREQUENCYType_MINUTES() {
        return (EAttribute)getDAILYFREQUENCYType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDAILYFREQUENCYType_RUNONCE() {
        return (EAttribute)getDAILYFREQUENCYType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        if (documentRootEClass == null) {
            documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(15);
        }
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ASSOCIATEDSOURCEINSTANCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ATTRIBUTE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CONFIG() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CONFIGREFERENCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CONNECTIONREFERENCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CONNECTOR() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CONWFRUNINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CUSTOM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DAILYFREQUENCY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ENDOPTIONS() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ERPINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ERPSRCINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EXPRMACRO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EXPRMACRODEPENDENCY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FIELDATTRIBUTE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FIELDDEPENDENCY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FILTER() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FLATFILE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FOLDER() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FOLDERVERSION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GROUP() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_HASHKEY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_INITPROP() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_INSTANCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_KEYRANGE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_KEYWORD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MACROARGUMENT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MACRODEPENDENCY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MAPDEPENDENCY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MAPPING() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MAPPINGVARIABLE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MAPPLET() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_METADATAEXTENSION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PARTITION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_POWERMART() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RECURRING() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_REPEAT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_REPOSITORY() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RESOURCEREFERENCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPCODEBLOCK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPFUNCINSTANCEPARAM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPFUNCINSTANCEPARAMFLD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPFUNCPARAM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPFUNCTION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPFUNCTIONINSTANCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPOUTPUTPORT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPPROGRAM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPPROGRAMFLOWOBJECT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPSTRUCTURE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPSTRUCTUREFIELD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPTABLEINSTANCEPARAM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPTABLEPARAM() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SAPVARIABLE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SCHEDULEINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SCHEDULEOPTIONS() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SCHEDULER() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SEBLJOIN() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SEBLLINK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SEBLMVLINK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SEBLMVLINKREL() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SEBLSRCINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SESSION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SESSIONCOMPONENT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SESSIONEXTENSION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SESSTRANSFORMATIONGROUP() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SESSTRANSFORMATIONINST() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SHORTCUT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SOURCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SOURCEFIELD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_STARTOPTIONS() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TABLEATTRIBUTE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TARGET() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TARGETFIELD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TARGETINDEX() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TARGETINDEXFIELD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TARGETLOADORDER() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TASK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TASKINSTANCE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TIMER() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TRANSFORMATION() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TRANSFORMFIELD() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TRANSFORMFIELDATTR() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TRANSFORMFIELDATTRDEF() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TRANSFORMRESOURCEREF() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_VALUEPAIR() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WORKFLOW() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WORKFLOWEVENT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WORKFLOWLINK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WORKFLOWVARIABLE() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WORKLET() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLINFO() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLTEXT() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getENDOPTIONSType() {
        if (endoptionsTypeEClass == null) {
            endoptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(16);
        }
        return endoptionsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getENDOPTIONSType_ENDAFTER() {
        return (EAttribute)getENDOPTIONSType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getENDOPTIONSType_ENDON() {
        return (EAttribute)getENDOPTIONSType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getENDOPTIONSType_ENDTYPE() {
        return (EAttribute)getENDOPTIONSType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getENDOPTIONSType_RUNFOREVER() {
        return (EAttribute)getENDOPTIONSType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getERPINFOType() {
        if (erpinfoTypeEClass == null) {
            erpinfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(19);
        }
        return erpinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPFUNCTION() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPSTRUCTURE() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPPROGRAM() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getERPINFOType_Group() {
        return (EAttribute)getERPINFOType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPOUTPUTPORT() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPVARIABLE() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPINFOType_SAPPROGRAMFLOWOBJECT() {
        return (EReference)getERPINFOType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getERPSRCINFOType() {
        if (erpsrcinfoTypeEClass == null) {
            erpsrcinfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(20);
        }
        return erpsrcinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getERPSRCINFOType_SEBLSRCINFO() {
        return (EReference)getERPSRCINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEXPRMACRODEPENDENCYType() {
        if (exprmacrodependencyTypeEClass == null) {
            exprmacrodependencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(21);
        }
        return exprmacrodependencyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACRODEPENDENCYType_NAME() {
        return (EAttribute)getEXPRMACRODEPENDENCYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEXPRMACROType() {
        if (exprmacroTypeEClass == null) {
            exprmacroTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(22);
        }
        return exprmacroTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEXPRMACROType_MACROARGUMENT() {
        return (EReference)getEXPRMACROType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEXPRMACROType_MACRODEPENDENCY() {
        return (EReference)getEXPRMACROType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_DESCRIPTION() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_EXPRESSION() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_MACROTYPE() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_NAME() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_OBJECTVERSION() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_PROTOTYPE() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_RETURNTYPE() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEXPRMACROType_VERSIONNUMBER() {
        return (EAttribute)getEXPRMACROType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFIELDATTRIBUTEType() {
        if (fieldattributeTypeEClass == null) {
            fieldattributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(27);
        }
        return fieldattributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFIELDATTRIBUTEType_NAME() {
        return (EAttribute)getFIELDATTRIBUTEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFIELDATTRIBUTEType_VALUE() {
        return (EAttribute)getFIELDATTRIBUTEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFIELDDEPENDENCYType() {
        if (fielddependencyTypeEClass == null) {
            fielddependencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(28);
        }
        return fielddependencyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFIELDDEPENDENCYType_INPUTFIELD() {
        return (EAttribute)getFIELDDEPENDENCYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFIELDDEPENDENCYType_OUTPUTFIELD() {
        return (EAttribute)getFIELDDEPENDENCYType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFILTERType() {
        if (filterTypeEClass == null) {
            filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(29);
        }
        return filterTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFILTERType_DAY() {
        return (EAttribute)getFILTERType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFILTERType_DAYOFMONTH() {
        return (EAttribute)getFILTERType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFILTERType_OCCURRENCE() {
        return (EAttribute)getFILTERType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFLATFILEType() {
        if (flatfileTypeEClass == null) {
            flatfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(30);
        }
        return flatfileTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_CODEPAGE() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_CONSECDELIMITERSASONE() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_DELIMITED() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_DELIMITERS() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_DELIMITERSINBINARY() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_ESCAPECHARACTER() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_FILENAME() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_FILETYPE() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_KEEPESCAPECHAR() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_LINESEQUENTIAL() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_NULLCHARACTER() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_NULLCHARTYPE() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_PADBYTES() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_QUOTECHARACTER() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_REPEATABLE() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_ROWDELIMITER() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_SHIFTSENSITIVEDATA() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_SKIPLEADINGBYTES() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_SKIPROWS() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_SKIPTRAILINGBYTES() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_STAGEFILEPERSIST() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_STAGEFILEREINIT() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFLATFILEType_STRIPTRAILINGBLANKS() {
        return (EAttribute)getFLATFILEType().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFOLDERType() {
        if (folderTypeEClass == null) {
            folderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(31);
        }
        return folderTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_Group() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_FOLDERVERSION() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_CONFIG() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_SCHEDULER() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_TASK() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_SESSION() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_WORKLET() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_WORKFLOW() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_SOURCE() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_TARGET() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_TRANSFORMATION() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_MAPPLET() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_MAPPING() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_SHORTCUT() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERType_EXPRMACRO() {
        return (EReference)getFOLDERType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_DESCRIPTION() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_GROUP1() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_NAME() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_OWNER() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_PERMISSIONS() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_SHARED() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERType_UUID() {
        return (EAttribute)getFOLDERType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFOLDERVERSIONType() {
        if (folderversionTypeEClass == null) {
            folderversionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(32);
        }
        return folderversionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_SOURCE() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_TARGET() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_TRANSFORMATION() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_MAPPLET() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_MAPPING() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFOLDERVERSIONType_SHORTCUT() {
        return (EReference)getFOLDERVERSIONType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERVERSIONType_DESCRIPTION() {
        return (EAttribute)getFOLDERVERSIONType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFOLDERVERSIONType_NAME() {
        return (EAttribute)getFOLDERVERSIONType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGROUPType() {
        if (groupTypeEClass == null) {
            groupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(33);
        }
        return groupTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGROUPType_DESCRIPTION() {
        return (EAttribute)getGROUPType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGROUPType_EXPRESSION() {
        return (EAttribute)getGROUPType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGROUPType_NAME() {
        return (EAttribute)getGROUPType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGROUPType_ORDER() {
        return (EAttribute)getGROUPType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGROUPType_TYPE() {
        return (EAttribute)getGROUPType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHASHKEYType() {
        if (hashkeyTypeEClass == null) {
            hashkeyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(34);
        }
        return hashkeyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHASHKEYType_GROUP() {
        return (EAttribute)getHASHKEYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getHASHKEYType_NAME() {
        return (EAttribute)getHASHKEYType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getINITPROPType() {
        if (initpropTypeEClass == null) {
            initpropTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(39);
        }
        return initpropTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINITPROPType_DESCRIPTION() {
        return (EAttribute)getINITPROPType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINITPROPType_NAME() {
        return (EAttribute)getINITPROPType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINITPROPType_USERDEFINED() {
        return (EAttribute)getINITPROPType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINITPROPType_VALUE() {
        return (EAttribute)getINITPROPType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getINSTANCEType() {
        if (instanceTypeEClass == null) {
            instanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(40);
        }
        return instanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getINSTANCEType_TABLEATTRIBUTE() {
        return (EReference)getINSTANCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getINSTANCEType_EXPRMACRODEPENDENCY() {
        return (EReference)getINSTANCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getINSTANCEType_INITPROP() {
        return (EReference)getINSTANCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getINSTANCEType_ASSOCIATEDSOURCEINSTANCE() {
        return (EReference)getINSTANCEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_ASSOCIATEDDSQ() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_ASSOCIATEDDSQTYPE() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_DBDNAME() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_DESCRIPTION() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_NAME() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_REUSABLE() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_TRANSFORMATIONNAME() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_TRANSFORMATIONTYPE() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getINSTANCEType_TYPE() {
        return (EAttribute)getINSTANCEType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKEYRANGEType() {
        if (keyrangeTypeEClass == null) {
            keyrangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(95);
        }
        return keyrangeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYRANGEType_ENDRANGE() {
        return (EAttribute)getKEYRANGEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYRANGEType_GROUP() {
        return (EAttribute)getKEYRANGEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYRANGEType_NAME() {
        return (EAttribute)getKEYRANGEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYRANGEType_SRCINSTANCENAME() {
        return (EAttribute)getKEYRANGEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYRANGEType_STARTRANGE() {
        return (EAttribute)getKEYRANGEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKEYWORDType() {
        if (keywordTypeEClass == null) {
            keywordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(96);
        }
        return keywordTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEYWORDType_NAME() {
        return (EAttribute)getKEYWORDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMACROARGUMENTType() {
        if (macroargumentTypeEClass == null) {
            macroargumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(97);
        }
        return macroargumentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACROARGUMENTType_ARGORDER() {
        return (EAttribute)getMACROARGUMENTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACROARGUMENTType_DATATYPE() {
        return (EAttribute)getMACROARGUMENTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACROARGUMENTType_NAME() {
        return (EAttribute)getMACROARGUMENTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACROARGUMENTType_PRECISION() {
        return (EAttribute)getMACROARGUMENTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACROARGUMENTType_SCALE() {
        return (EAttribute)getMACROARGUMENTType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMACRODEPENDENCYType() {
        if (macrodependencyTypeEClass == null) {
            macrodependencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(98);
        }
        return macrodependencyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMACRODEPENDENCYType_NAME() {
        return (EAttribute)getMACRODEPENDENCYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMAPDEPENDENCYType() {
        if (mapdependencyTypeEClass == null) {
            mapdependencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(101);
        }
        return mapdependencyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPDEPENDENCYType_FROMINSTANCE() {
        return (EAttribute)getMAPDEPENDENCYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPDEPENDENCYType_FROMINSTANCETYPE() {
        return (EAttribute)getMAPDEPENDENCYType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPDEPENDENCYType_TOINSTANCE() {
        return (EAttribute)getMAPDEPENDENCYType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPDEPENDENCYType_TOINSTANCETYPE() {
        return (EAttribute)getMAPDEPENDENCYType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMAPPINGType() {
        if (mappingTypeEClass == null) {
            mappingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(102);
        }
        return mappingTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_TRANSFORMATION() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_INSTANCE() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_CONNECTOR() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_MAPDEPENDENCY() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_TARGETLOADORDER() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_MAPPINGVARIABLE() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_ERPINFO() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPINGType_METADATAEXTENSION() {
        return (EReference)getMAPPINGType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_CRCVALUE() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_DESCRIPTION() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_ISPROFILEMAPPING() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_ISVALID() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_NAME() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_OBJECTVERSION() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGType_VERSIONNUMBER() {
        return (EAttribute)getMAPPINGType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMAPPINGVARIABLEType() {
        if (mappingvariableTypeEClass == null) {
            mappingvariableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(103);
        }
        return mappingvariableTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_AGGFUNCTION() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_DATATYPE() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_DEFAULTVALUE() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_DESCRIPTION() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_ISEXPRESSIONVARIABLE() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_ISPARAM() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_NAME() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_PRECISION() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_SCALE() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPINGVARIABLEType_USERDEFINED() {
        return (EAttribute)getMAPPINGVARIABLEType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMAPPLETType() {
        if (mappletTypeEClass == null) {
            mappletTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(104);
        }
        return mappletTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_TRANSFORMATION() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_INSTANCE() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_CONNECTOR() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_MAPPINGVARIABLE() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_ERPINFO() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMAPPLETType_METADATAEXTENSION() {
        return (EReference)getMAPPLETType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_CRCVALUE() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_DESCRIPTION() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_ISVALID() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_NAME() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_OBJECTVERSION() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMAPPLETType_VERSIONNUMBER() {
        return (EAttribute)getMAPPLETType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMETADATAEXTENSIONType() {
        if (metadataextensionTypeEClass == null) {
            metadataextensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(105);
        }
        return metadataextensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_COMPONENTVERSION() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_DATATYPE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_DESCRIPTION() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_DOMAINNAME() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_ISCLIENTEDITABLE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_ISCLIENTVISIBLE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_ISREUSABLE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_ISSHAREREAD() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_ISSHAREWRITE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_MAXLENGTH() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_NAME() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_VALUE() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMETADATAEXTENSIONType_VENDORNAME() {
        return (EAttribute)getMETADATAEXTENSIONType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPARTITIONType() {
        if (partitionTypeEClass == null) {
            partitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(126);
        }
        return partitionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPARTITIONType_KEYRANGE() {
        return (EReference)getPARTITIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPARTITIONType_DESCRIPTION() {
        return (EAttribute)getPARTITIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPARTITIONType_NAME() {
        return (EAttribute)getPARTITIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPOWERMARTType() {
        if (powermartTypeEClass == null) {
            powermartTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(127);
        }
        return powermartTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPOWERMARTType_REPOSITORY() {
        return (EReference)getPOWERMARTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPOWERMARTType_CREATIONDATE() {
        return (EAttribute)getPOWERMARTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPOWERMARTType_REPOSITORYVERSION() {
        return (EAttribute)getPOWERMARTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRECURRINGType() {
        if (recurringTypeEClass == null) {
            recurringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(128);
        }
        return recurringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRECURRINGType_DAYS() {
        return (EAttribute)getRECURRINGType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRECURRINGType_HOURS() {
        return (EAttribute)getRECURRINGType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRECURRINGType_MINUTES() {
        return (EAttribute)getRECURRINGType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getREPEATType() {
        if (repeatTypeEClass == null) {
            repeatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(131);
        }
        return repeatTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getREPEATType_FILTER() {
        return (EReference)getREPEATType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPEATType_INTERVAL() {
        return (EAttribute)getREPEATType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPEATType_TYPE() {
        return (EAttribute)getREPEATType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getREPOSITORYType() {
        if (repositoryTypeEClass == null) {
            repositoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(132);
        }
        return repositoryTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getREPOSITORYType_FOLDER() {
        return (EReference)getREPOSITORYType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPOSITORYType_CODEPAGE() {
        return (EAttribute)getREPOSITORYType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPOSITORYType_DATABASETYPE() {
        return (EAttribute)getREPOSITORYType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPOSITORYType_NAME() {
        return (EAttribute)getREPOSITORYType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPOSITORYType_PARENTREPOSITORY() {
        return (EAttribute)getREPOSITORYType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getREPOSITORYType_VERSION() {
        return (EAttribute)getREPOSITORYType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRESOURCEREFERENCEType() {
        if (resourcereferenceTypeEClass == null) {
            resourcereferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(133);
        }
        return resourcereferenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRESOURCEREFERENCEType_NAME() {
        return (EAttribute)getRESOURCEREFERENCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRESOURCEREFERENCEType_TYPE() {
        return (EAttribute)getRESOURCEREFERENCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPCODEBLOCKType() {
        if (sapcodeblockTypeEClass == null) {
            sapcodeblockTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(156);
        }
        return sapcodeblockTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPCODEBLOCKType_CODEBLOCK() {
        return (EAttribute)getSAPCODEBLOCKType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPCODEBLOCKType_DESCRIPTION() {
        return (EAttribute)getSAPCODEBLOCKType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPCODEBLOCKType_DSQINSTNAME() {
        return (EAttribute)getSAPCODEBLOCKType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPCODEBLOCKType_NAME() {
        return (EAttribute)getSAPCODEBLOCKType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFUNCINSTANCEPARAMFLDType() {
        if (sapfuncinstanceparamfldTypeEClass == null) {
            sapfuncinstanceparamfldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(157);
        }
        return sapfuncinstanceparamfldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMFLDType_NAME() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMFLDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMFLDType_VALUE() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMFLDType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMFLDType_VALUETYPE() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMFLDType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFUNCINSTANCEPARAMType() {
        if (sapfuncinstanceparamTypeEClass == null) {
            sapfuncinstanceparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(158);
        }
        return sapfuncinstanceparamTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPFUNCINSTANCEPARAMType_SAPFUNCINSTANCEPARAMFLD() {
        return (EReference)getSAPFUNCINSTANCEPARAMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMType_NAME() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMType_TYPE() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMType_VALUE() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCINSTANCEPARAMType_VALUETYPE() {
        return (EAttribute)getSAPFUNCINSTANCEPARAMType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFUNCPARAMType() {
        if (sapfuncparamTypeEClass == null) {
            sapfuncparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(159);
        }
        return sapfuncparamTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_DATATYPE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_DEF() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_DEFAULTVALUE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_ISOPTIONAL() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_ISREFERENCE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_NAME() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_ORDER() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_PRECISION() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_SCALE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_SUBTYPE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCPARAMType_TYPE() {
        return (EAttribute)getSAPFUNCPARAMType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFUNCTIONINSTANCEType() {
        if (sapfunctioninstanceTypeEClass == null) {
            sapfunctioninstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(160);
        }
        return sapfunctioninstanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPFUNCTIONINSTANCEType_SAPFUNCINSTANCEPARAM() {
        return (EReference)getSAPFUNCTIONINSTANCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPFUNCTIONINSTANCEType_SAPTABLEINSTANCEPARAM() {
        return (EReference)getSAPFUNCTIONINSTANCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCTIONINSTANCEType_DSQINSTNAME() {
        return (EAttribute)getSAPFUNCTIONINSTANCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCTIONINSTANCEType_FUNCTIONNAME() {
        return (EAttribute)getSAPFUNCTIONINSTANCEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPFUNCTIONType() {
        if (sapfunctionTypeEClass == null) {
            sapfunctionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(161);
        }
        return sapfunctionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPFUNCTIONType_SAPFUNCPARAM() {
        return (EReference)getSAPFUNCTIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPFUNCTIONType_SAPTABLEPARAM() {
        return (EReference)getSAPFUNCTIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCTIONType_DESCRIPTION() {
        return (EAttribute)getSAPFUNCTIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPFUNCTIONType_NAME() {
        return (EAttribute)getSAPFUNCTIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPOUTPUTPORTType() {
        if (sapoutputportTypeEClass == null) {
            sapoutputportTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(162);
        }
        return sapoutputportTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPOUTPUTPORTType_DSQINSTNAME() {
        return (EAttribute)getSAPOUTPUTPORTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPOUTPUTPORTType_FIELDNAME() {
        return (EAttribute)getSAPOUTPUTPORTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPOUTPUTPORTType_PORTNAME() {
        return (EAttribute)getSAPOUTPUTPORTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPOUTPUTPORTType_VARNAME() {
        return (EAttribute)getSAPOUTPUTPORTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPPROGRAMFLOWOBJECTType() {
        if (sapprogramflowobjectTypeEClass == null) {
            sapprogramflowobjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(163);
        }
        return sapprogramflowobjectTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPPROGRAMFLOWOBJECTType_SAPFUNCTIONINSTANCE() {
        return (EReference)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPPROGRAMFLOWOBJECTType_SAPCODEBLOCK() {
        return (EReference)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_DSQINSTNAME() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_JOINBITMAP() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_ORDER() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_REFDBDNAME() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_REFSOURCENAME() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_REFSOURCEINSTNAME() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMFLOWOBJECTType_TYPE() {
        return (EAttribute)getSAPPROGRAMFLOWOBJECTType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPPROGRAMType() {
        if (sapprogramTypeEClass == null) {
            sapprogramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(164);
        }
        return sapprogramTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_CLIENTSPACE() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_HOSTNAME() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_INSTALLTIME() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_ISVALID() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_NAME() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_PROGRAMTYPE() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPPROGRAMType_USERNAME() {
        return (EAttribute)getSAPPROGRAMType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPSTRUCTUREFIELDType() {
        if (sapstructurefieldTypeEClass == null) {
            sapstructurefieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(165);
        }
        return sapstructurefieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREFIELDType_DATATYPE() {
        return (EAttribute)getSAPSTRUCTUREFIELDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREFIELDType_NAME() {
        return (EAttribute)getSAPSTRUCTUREFIELDType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREFIELDType_ORDER() {
        return (EAttribute)getSAPSTRUCTUREFIELDType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREFIELDType_PRECISION() {
        return (EAttribute)getSAPSTRUCTUREFIELDType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREFIELDType_SCALE() {
        return (EAttribute)getSAPSTRUCTUREFIELDType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPSTRUCTUREType() {
        if (sapstructureTypeEClass == null) {
            sapstructureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(166);
        }
        return sapstructureTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPSTRUCTUREType_SAPSTRUCTUREFIELD() {
        return (EReference)getSAPSTRUCTUREType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPSTRUCTUREType_NAME() {
        return (EAttribute)getSAPSTRUCTUREType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPTABLEINSTANCEPARAMType() {
        if (saptableinstanceparamTypeEClass == null) {
            saptableinstanceparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(167);
        }
        return saptableinstanceparamTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSAPTABLEINSTANCEPARAMType_SAPFUNCINSTANCEPARAMFLD() {
        return (EReference)getSAPTABLEINSTANCEPARAMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEINSTANCEPARAMType_NAME() {
        return (EAttribute)getSAPTABLEINSTANCEPARAMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEINSTANCEPARAMType_TYPE() {
        return (EAttribute)getSAPTABLEINSTANCEPARAMType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEINSTANCEPARAMType_VALUE() {
        return (EAttribute)getSAPTABLEINSTANCEPARAMType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEINSTANCEPARAMType_VALUETYPE() {
        return (EAttribute)getSAPTABLEINSTANCEPARAMType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPTABLEPARAMType() {
        if (saptableparamTypeEClass == null) {
            saptableparamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(168);
        }
        return saptableparamTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEPARAMType_DEF() {
        return (EAttribute)getSAPTABLEPARAMType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEPARAMType_ISOPTIONAL() {
        return (EAttribute)getSAPTABLEPARAMType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEPARAMType_NAME() {
        return (EAttribute)getSAPTABLEPARAMType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEPARAMType_ORDER() {
        return (EAttribute)getSAPTABLEPARAMType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPTABLEPARAMType_TYPE() {
        return (EAttribute)getSAPTABLEPARAMType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSAPVARIABLEType() {
        if (sapvariableTypeEClass == null) {
            sapvariableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(169);
        }
        return sapvariableTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_DATATYPE() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_DEFAULTVALUE() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_DSQINSTNAME() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_ISOUTPUTPORT() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_NAME() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_PRECISION() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_SCALE() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_SUBTYPE() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSAPVARIABLEType_VARDEF() {
        return (EAttribute)getSAPVARIABLEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCHEDULEINFO() {
        if (scheduleinfoEClass == null) {
            scheduleinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(170);
        }
        return scheduleinfoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEINFO_SCHEDULEINFO() {
        return (EReference)getSCHEDULEINFO().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCHEDULEINFOType() {
        if (scheduleinfoTypeEClass == null) {
            scheduleinfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(171);
        }
        return scheduleinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEINFOType_STARTOPTIONS() {
        return (EReference)getSCHEDULEINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEINFOType_SCHEDULEOPTIONS() {
        return (EReference)getSCHEDULEINFOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEINFOType_ENDOPTIONS() {
        return (EReference)getSCHEDULEINFOType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULEINFOType_SCHEDULETYPE() {
        return (EAttribute)getSCHEDULEINFOType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCHEDULEOPTIONSType() {
        if (scheduleoptionsTypeEClass == null) {
            scheduleoptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(172);
        }
        return scheduleoptionsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEOPTIONSType_RECURRING() {
        return (EReference)getSCHEDULEOPTIONSType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSCHEDULEOPTIONSType_CUSTOM() {
        return (EReference)getSCHEDULEOPTIONSType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULEOPTIONSType_SCHEDULETYPE() {
        return (EAttribute)getSCHEDULEOPTIONSType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSCHEDULERType() {
        if (schedulerTypeEClass == null) {
            schedulerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(173);
        }
        return schedulerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULERType_DESCRIPTION() {
        return (EAttribute)getSCHEDULERType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULERType_NAME() {
        return (EAttribute)getSCHEDULERType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULERType_REUSABLE() {
        return (EAttribute)getSCHEDULERType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSCHEDULERType_VERSIONNUMBER() {
        return (EAttribute)getSCHEDULERType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSEBLJOINType() {
        if (sebljoinTypeEClass == null) {
            sebljoinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(178);
        }
        return sebljoinTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_DESTCOL() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_FKTABLE() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_NAME() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_OUTERJOINREL() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_PKTABLE() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLJOINType_SRCCOL() {
        return (EAttribute)getSEBLJOINType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSEBLLINKType() {
        if (sebllinkTypeEClass == null) {
            sebllinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(179);
        }
        return sebllinkTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_CHILDBC() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_DESTBCBASETABLE() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_DESTCOL() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_INTERCHILDCOL() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_INTERPARENTCOL() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_INTERTABLE() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_NAME() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_PARENTBC() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_PRIMARYID() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLLINKType_SRCCOL() {
        return (EAttribute)getSEBLLINKType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSEBLMVLINKRELType() {
        if (seblmvlinkrelTypeEClass == null) {
            seblmvlinkrelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(180);
        }
        return seblmvlinkrelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKRELType_DESTMVLINK() {
        return (EAttribute)getSEBLMVLINKRELType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKRELType_FIELD() {
        return (EAttribute)getSEBLMVLINKRELType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKRELType_SRCMVLINK() {
        return (EAttribute)getSEBLMVLINKRELType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSEBLMVLINKType() {
        if (seblmvlinkTypeEClass == null) {
            seblmvlinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(181);
        }
        return seblmvlinkTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_BCNAME() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_DESTBC() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_DESTLINK() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_MVLINK() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_PRIMARYID() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSEBLMVLINKType_SRCFIELD() {
        return (EAttribute)getSEBLMVLINKType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSEBLSRCINFOType() {
        if (seblsrcinfoTypeEClass == null) {
            seblsrcinfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(182);
        }
        return seblsrcinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSEBLSRCINFOType_SEBLJOIN() {
        return (EReference)getSEBLSRCINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSEBLSRCINFOType_SEBLLINK() {
        return (EReference)getSEBLSRCINFOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSEBLSRCINFOType_SEBLMVLINK() {
        return (EReference)getSEBLSRCINFOType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSEBLSRCINFOType_SEBLMVLINKREL() {
        return (EReference)getSEBLSRCINFOType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSESSIONCOMPONENTType() {
        if (sessioncomponentTypeEClass == null) {
            sessioncomponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(183);
        }
        return sessioncomponentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONCOMPONENTType_TASK() {
        return (EReference)getSESSIONCOMPONENTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONCOMPONENTType_VALUEPAIR() {
        return (EReference)getSESSIONCOMPONENTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONCOMPONENTType_ATTRIBUTE() {
        return (EReference)getSESSIONCOMPONENTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONCOMPONENTType_ISNONE() {
        return (EAttribute)getSESSIONCOMPONENTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONCOMPONENTType_REFOBJECTNAME() {
        return (EAttribute)getSESSIONCOMPONENTType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONCOMPONENTType_REUSABLE() {
        return (EAttribute)getSESSIONCOMPONENTType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONCOMPONENTType_TYPE() {
        return (EAttribute)getSESSIONCOMPONENTType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSESSIONEXTENSIONType() {
        if (sessionextensionTypeEClass == null) {
            sessionextensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(184);
        }
        return sessionextensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONEXTENSIONType_CONNECTIONREFERENCE() {
        return (EReference)getSESSIONEXTENSIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONEXTENSIONType_ATTRIBUTE() {
        return (EReference)getSESSIONEXTENSIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_COMPONENTVERSION() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_DSQINSTNAME() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_DSQINSTTYPE() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_NAME() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_SINSTANCENAME() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_SUBTYPE() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_TRANSFORMATIONTYPE() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONEXTENSIONType_TYPE() {
        return (EAttribute)getSESSIONEXTENSIONType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSESSIONType() {
        if (sessionTypeEClass == null) {
            sessionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(185);
        }
        return sessionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_TASK() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_SESSTRANSFORMATIONINST() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_CONFIGREFERENCE() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_SESSIONCOMPONENT() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_SESSIONEXTENSION() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_ATTRIBUTE() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_METADATAEXTENSION() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_Group() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_RESOURCEREFERENCE() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSIONType_TRANSFORMRESOURCEREF() {
        return (EReference)getSESSIONType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_DESCRIPTION() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_ISVALID() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_MAPPINGNAME() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_MAPPINGVERSION() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_NAME() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_PARENT() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_PARENTTYPE() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_REUSABLE() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_SORTORDER() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSIONType_VERSIONNUMBER() {
        return (EAttribute)getSESSIONType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSESSTRANSFORMATIONGROUPType() {
        if (sesstransformationgroupTypeEClass == null) {
            sesstransformationgroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(186);
        }
        return sesstransformationgroupTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONGROUPType_GROUP() {
        return (EAttribute)getSESSTRANSFORMATIONGROUPType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONGROUPType_PARTITIONTYPE() {
        return (EAttribute)getSESSTRANSFORMATIONGROUPType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSESSTRANSFORMATIONINSTType() {
        if (sesstransformationinstTypeEClass == null) {
            sesstransformationinstTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(187);
        }
        return sesstransformationinstTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSTRANSFORMATIONINSTType_SESSTRANSFORMATIONGROUP() {
        return (EReference)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSTRANSFORMATIONINSTType_PARTITION() {
        return (EReference)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSTRANSFORMATIONINSTType_HASHKEY() {
        return (EReference)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSTRANSFORMATIONINSTType_FLATFILE() {
        return (EReference)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSESSTRANSFORMATIONINSTType_ATTRIBUTE() {
        return (EReference)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_ISREPARTITIONPOINT() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_PARTITIONTYPE() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_PIPELINE() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_SINSTANCENAME() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_STAGE() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_TRANSFORMATIONNAME() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSESSTRANSFORMATIONINSTType_TRANSFORMATIONTYPE() {
        return (EAttribute)getSESSTRANSFORMATIONINSTType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSHORTCUTType() {
        if (shortcutTypeEClass == null) {
            shortcutTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(190);
        }
        return shortcutTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_COMMENTS() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_DBDNAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_FOLDERNAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_FOLDERVERSIONNAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_NAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_OBJECTSUBTYPE() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_OBJECTTYPE() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_REFERENCEDDBD() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_REFERENCETYPE() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_REFOBJECTNAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_REPOSITORYNAME() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_TEMPLATEID() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSHORTCUTType_VERSIONNUMBER() {
        return (EAttribute)getSHORTCUTType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSOURCEFIELDType() {
        if (sourcefieldTypeEClass == null) {
            sourcefieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(193);
        }
        return sourcefieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEFIELDType_SOURCEFIELD() {
        return (EReference)getSOURCEFIELDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEFIELDType_FIELDATTRIBUTE() {
        return (EReference)getSOURCEFIELDType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_BUSINESSNAME() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_DATATYPE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_DESCRIPTION() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_FIELDNUMBER() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_FIELDTYPE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_GROUP() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_HIDDEN() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_KEYTYPE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_LENGTH() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_LEVEL() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_NAME() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_NULLABLE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_OCCURS() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_OFFSET() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_PHYSICALLENGTH() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_PHYSICALOFFSET() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_PICTURETEXT() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_PRECISION() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_REDEFINES() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_REFERENCEDDBD() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_REFERENCEDFIELD() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_REFERENCEDTABLE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_SCALE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_SHIFTSTATE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_USAGE() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEFIELDType_USAGEFLAGS() {
        return (EAttribute)getSOURCEFIELDType().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSOURCEType() {
        if (sourceTypeEClass == null) {
            sourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(194);
        }
        return sourceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_FLATFILE() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_XMLINFO() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_ERPSRCINFO() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_GROUP() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_TABLEATTRIBUTE() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_SOURCEFIELD() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSOURCEType_METADATAEXTENSION() {
        return (EReference)getSOURCEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_BUSINESSNAME() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_COMPONENTVERSION() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_CRCVALUE() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_DATABASESUBTYPE() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_DATABASETYPE() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_DBDNAME() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_DESCRIPTION() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_IBMCOMP() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_NAME() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_OBJECTVERSION() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_OWNERNAME() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSOURCEType_VERSIONNUMBER() {
        return (EAttribute)getSOURCEType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSTARTOPTIONSType() {
        if (startoptionsTypeEClass == null) {
            startoptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(199);
        }
        return startoptionsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSTARTOPTIONSType_STARTDATE() {
        return (EAttribute)getSTARTOPTIONSType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSTARTOPTIONSType_STARTTIME() {
        return (EAttribute)getSTARTOPTIONSType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTABLEATTRIBUTEType() {
        if (tableattributeTypeEClass == null) {
            tableattributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(206);
        }
        return tableattributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTABLEATTRIBUTEType_NAME() {
        return (EAttribute)getTABLEATTRIBUTEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTABLEATTRIBUTEType_VALUE() {
        return (EAttribute)getTABLEATTRIBUTEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTARGETFIELDType() {
        if (targetfieldTypeEClass == null) {
            targetfieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(207);
        }
        return targetfieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETFIELDType_FIELDATTRIBUTE() {
        return (EReference)getTARGETFIELDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_BUSINESSNAME() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_DATATYPE() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_DESCRIPTION() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_FIELDNUMBER() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_GROUP() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_ISFILENAMEFIELD() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_KEYTYPE() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_NAME() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_NULLABLE() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_PICTURETEXT() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_PRECISION() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_REFERENCEDFIELD() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_REFERENCEDTABLE() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETFIELDType_SCALE() {
        return (EAttribute)getTARGETFIELDType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTARGETINDEXFIELDType() {
        if (targetindexfieldTypeEClass == null) {
            targetindexfieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(208);
        }
        return targetindexfieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETINDEXFIELDType_NAME() {
        return (EAttribute)getTARGETINDEXFIELDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTARGETINDEXType() {
        if (targetindexTypeEClass == null) {
            targetindexTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(209);
        }
        return targetindexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETINDEXType_TARGETINDEXFIELD() {
        return (EReference)getTARGETINDEXType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETINDEXType_DESCRIPTION() {
        return (EAttribute)getTARGETINDEXType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETINDEXType_NAME() {
        return (EAttribute)getTARGETINDEXType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETINDEXType_UNIQUE() {
        return (EAttribute)getTARGETINDEXType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTARGETLOADORDERType() {
        if (targetloadorderTypeEClass == null) {
            targetloadorderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(210);
        }
        return targetloadorderTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETLOADORDERType_ORDER() {
        return (EAttribute)getTARGETLOADORDERType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETLOADORDERType_TARGETINSTANCE() {
        return (EAttribute)getTARGETLOADORDERType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTARGETType() {
        if (targetTypeEClass == null) {
            targetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(211);
        }
        return targetTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_KEYWORD() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_FLATFILE() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_XMLINFO() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_GROUP() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_TARGETFIELD() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_TARGETINDEX() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_TABLEATTRIBUTE() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTARGETType_METADATAEXTENSION() {
        return (EReference)getTARGETType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_BUSINESSNAME() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_COMPONENTVERSION() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_CONSTRAINT() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_CRCVALUE() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_DATABASETYPE() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_DESCRIPTION() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_NAME() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_OBJECTVERSION() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_TABLEOPTIONS() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_TABLETYPE() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTARGETType_VERSIONNUMBER() {
        return (EAttribute)getTARGETType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTASKINSTANCEType() {
        if (taskinstanceTypeEClass == null) {
            taskinstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(212);
        }
        return taskinstanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_ATTRIBUTE() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_WORKFLOWVARIABLE() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_VALUEPAIR() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_CONFIGREFERENCE() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_SESSIONCOMPONENT() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_SESSIONEXTENSION() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_Group() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_RESOURCEREFERENCE() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKINSTANCEType_TRANSFORMRESOURCEREF() {
        return (EReference)getTASKINSTANCEType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_DESCRIPTION() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_FAILPARENTIFINSTANCEDIDNOTRUN() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_FAILPARENTIFINSTANCEFAILS() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_ISENABLED() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_NAME() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_REUSABLE() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_SERVEROVERRIDE() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_TASKNAME() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_TASKTYPE() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKINSTANCEType_TREATINPUTLINKASAND() {
        return (EAttribute)getTASKINSTANCEType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTASKType() {
        if (taskTypeEClass == null) {
            taskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(215);
        }
        return taskTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKType_ATTRIBUTE() {
        return (EReference)getTASKType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKType_EXPRMACRODEPENDENCY() {
        return (EReference)getTASKType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKType_TIMER() {
        return (EReference)getTASKType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKType_VALUEPAIR() {
        return (EReference)getTASKType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTASKType_RESOURCEREFERENCE() {
        return (EReference)getTASKType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_DESCRIPTION() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_NAME() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_PARENT() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_PARENTTYPE() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_REUSABLE() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_TYPE() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTASKType_VERSIONNUMBER() {
        return (EAttribute)getTASKType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTIMERType() {
        if (timerTypeEClass == null) {
            timerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(216);
        }
        return timerTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTIMERType_STARTOPTIONS() {
        return (EReference)getTIMERType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTIMERType_RECURRING() {
        return (EReference)getTIMERType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTIMERType_TIMERTYPE() {
        return (EAttribute)getTIMERType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRANSFORMATIONType() {
        if (transformationTypeEClass == null) {
            transformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(219);
        }
        return transformationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_GROUP() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_SOURCEFIELD() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_TRANSFORMFIELD() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_TABLEATTRIBUTE() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_INITPROP() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_METADATAEXTENSION() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_TRANSFORMFIELDATTRDEF() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_FIELDDEPENDENCY() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_FLATFILE() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMATIONType_EXPRMACRODEPENDENCY() {
        return (EReference)getTRANSFORMATIONType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_COMPONENTVERSION() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_CRCVALUE() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_DESCRIPTION() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_ISVSAMNORMALIZER() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_NAME() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_OBJECTVERSION() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_PARENT() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_PARENTTYPE() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_REFDBDNAME() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_REFSOURCENAME() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_REUSABLE() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_TEMPLATEID() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_TEMPLATENAME() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_TYPE() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMATIONType_VERSIONNUMBER() {
        return (EAttribute)getTRANSFORMATIONType().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRANSFORMFIELDATTRDEFType() {
        if (transformfieldattrdefTypeEClass == null) {
            transformfieldattrdefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(220);
        }
        return transformfieldattrdefTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_DATATYPE() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_DEFAULTVALUE() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_DESCRIPTION() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_NAME() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_ORDER() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRDEFType_TYPE() {
        return (EAttribute)getTRANSFORMFIELDATTRDEFType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRANSFORMFIELDATTRType() {
        if (transformfieldattrTypeEClass == null) {
            transformfieldattrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(221);
        }
        return transformfieldattrTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRType_NAME() {
        return (EAttribute)getTRANSFORMFIELDATTRType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDATTRType_VALUE() {
        return (EAttribute)getTRANSFORMFIELDATTRType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRANSFORMFIELDType() {
        if (transformfieldTypeEClass == null) {
            transformfieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(222);
        }
        return transformfieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMFIELDType_TRANSFORMFIELDATTR() {
        return (EReference)getTRANSFORMFIELDType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_DATATYPE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_DEFAULTVALUE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_DESCRIPTION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_EXPRESSION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_EXPRESSIONDESCRIPTION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_EXPRESSIONTYPE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_FIELDNUMBER() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_GROUP() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_IGNOREINCOMPARE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_IGNORENULLINPUTS() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_ISSORTKEY() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_MAPPLETGROUP() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_NAME() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_OUTPUTGROUP() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_PICTURETEXT() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_PORTTYPE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_PRECISION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_REFFIELD() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_REFINSTANCETYPE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_REFSOURCEFIELD() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_REFTRANSFORMATION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_SCALE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_SEQUENCEGENERATORVALUE() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMFIELDType_SORTDIRECTION() {
        return (EAttribute)getTRANSFORMFIELDType().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTRANSFORMRESOURCEREFType() {
        if (transformresourcerefTypeEClass == null) {
            transformresourcerefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(223);
        }
        return transformresourcerefTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTRANSFORMRESOURCEREFType_RESOURCEREFERENCE() {
        return (EReference)getTRANSFORMRESOURCEREFType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMRESOURCEREFType_SINSTANCENAME() {
        return (EAttribute)getTRANSFORMRESOURCEREFType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTRANSFORMRESOURCEREFType_TRANSFORMATIONTYPE() {
        return (EAttribute)getTRANSFORMRESOURCEREFType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVALUEPAIRType() {
        if (valuepairTypeEClass == null) {
            valuepairTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(248);
        }
        return valuepairTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVALUEPAIRType_COMMENTS() {
        return (EAttribute)getVALUEPAIRType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVALUEPAIRType_NAME() {
        return (EAttribute)getVALUEPAIRType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVALUEPAIRType_REVERSEASSIGNMENT() {
        return (EAttribute)getVALUEPAIRType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getVALUEPAIRType_VALUE() {
        return (EAttribute)getVALUEPAIRType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWORKFLOWEVENTType() {
        if (workfloweventTypeEClass == null) {
            workfloweventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(255);
        }
        return workfloweventTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWEVENTType_DESCRIPTION() {
        return (EAttribute)getWORKFLOWEVENTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWEVENTType_NAME() {
        return (EAttribute)getWORKFLOWEVENTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWORKFLOWLINKType() {
        if (workflowlinkTypeEClass == null) {
            workflowlinkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(256);
        }
        return workflowlinkTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWLINKType_EXPRMACRODEPENDENCY() {
        return (EReference)getWORKFLOWLINKType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWLINKType_CONDITION() {
        return (EAttribute)getWORKFLOWLINKType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWLINKType_FROMTASK() {
        return (EAttribute)getWORKFLOWLINKType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWLINKType_TOTASK() {
        return (EAttribute)getWORKFLOWLINKType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWORKFLOWType() {
        if (workflowTypeEClass == null) {
            workflowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(257);
        }
        return workflowTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_SCHEDULER() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_TASK() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_SESSION() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_WORKLET() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_TASKINSTANCE() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_WORKFLOWLINK() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_WORKFLOWVARIABLE() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_WORKFLOWEVENT() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_ATTRIBUTE() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_METADATAEXTENSION() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKFLOWType_CONWFRUNINFO() {
        return (EReference)getWORKFLOWType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_DESCRIPTION() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_ISENABLED() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_ISRUNNABLESERVICE() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_ISSERVICE() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_ISVALID() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_NAME() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_REUSABLESCHEDULER() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SCHEDULERNAME() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SERVERDOMAINNAME() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SERVERNAME() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SERVICELEVELNAME() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SUSPENDONERROR() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_SUSPENSIONEMAIL() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_TASKSMUSTRUNONSERVER() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWType_VERSIONNUMBER() {
        return (EAttribute)getWORKFLOWType().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWORKFLOWVARIABLEType() {
        if (workflowvariableTypeEClass == null) {
            workflowvariableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(258);
        }
        return workflowvariableTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_DATATYPE() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_DEFAULTVALUE() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_DESCRIPTION() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_ISNULL() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_ISPERSISTENT() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_NAME() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKFLOWVARIABLEType_USERDEFINED() {
        return (EAttribute)getWORKFLOWVARIABLEType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWORKLETType() {
        if (workletTypeEClass == null) {
            workletTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(259);
        }
        return workletTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_TASK() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_SESSION() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_WORKLET() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_TASKINSTANCE() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_WORKFLOWLINK() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_WORKFLOWVARIABLE() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_WORKFLOWEVENT() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_ATTRIBUTE() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWORKLETType_METADATAEXTENSION() {
        return (EReference)getWORKLETType().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_DESCRIPTION() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_ISVALID() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_NAME() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_PARENT() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_PARENTTYPE() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_REUSABLE() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWORKLETType_VERSIONNUMBER() {
        return (EAttribute)getWORKLETType().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXMLINFOType() {
        if (xmlinfoTypeEClass == null) {
            xmlinfoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(260);
        }
        return xmlinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMLINFOType_XMLTEXT() {
        return (EReference)getXMLINFOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLINFOType_TEXT() {
        return (EAttribute)getXMLINFOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLINFOType_TYPE() {
        return (EAttribute)getXMLINFOType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXMLTEXTType() {
        if (xmltextTypeEClass == null) {
            xmltextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(261);
        }
        return xmltextTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLTEXTType_NAMESPACE() {
        return (EAttribute)getXMLTEXTType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLTEXTType_TEXT() {
        return (EAttribute)getXMLTEXTType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLTEXTType_TYPE() {
        return (EAttribute)getXMLTEXTType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAGGFUNCTIONType() {
        if (aggfunctionTypeEEnum == null) {
            aggfunctionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(0);
        }
        return aggfunctionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDATATYPEType() {
        if (datatypeTypeEEnum == null) {
            datatypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(11);
        }
        return datatypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDAYType() {
        if (dayTypeEEnum == null) {
            dayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(13);
        }
        return dayTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getENDTYPEType() {
        if (endtypeTypeEEnum == null) {
            endtypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(17);
        }
        return endtypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFAILPARENTIFINSTANCEDIDNOTRUNType() {
        if (failparentifinstancedidnotrunTypeEEnum == null) {
            failparentifinstancedidnotrunTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(23);
        }
        return failparentifinstancedidnotrunTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFAILPARENTIFINSTANCEFAILSType() {
        if (failparentifinstancefailsTypeEEnum == null) {
            failparentifinstancefailsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(25);
        }
        return failparentifinstancefailsTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIGNOREINCOMPAREType() {
        if (ignoreincompareTypeEEnum == null) {
            ignoreincompareTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(35);
        }
        return ignoreincompareTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getIGNORENULLINPUTSType() {
        if (ignorenullinputsTypeEEnum == null) {
            ignorenullinputsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(37);
        }
        return ignorenullinputsTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISCLIENTEDITABLEType() {
        if (isclienteditableTypeEEnum == null) {
            isclienteditableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(41);
        }
        return isclienteditableTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISCLIENTVISIBLEType() {
        if (isclientvisibleTypeEEnum == null) {
            isclientvisibleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(43);
        }
        return isclientvisibleTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISDEFAULTType() {
        if (isdefaultTypeEEnum == null) {
            isdefaultTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(45);
        }
        return isdefaultTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISENABLEDType() {
        if (isenabledTypeEEnum == null) {
            isenabledTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(47);
        }
        return isenabledTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISENABLEDType1() {
        if (isenabledType1EEnum == null) {
            isenabledType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(48);
        }
        return isenabledType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISEXPRESSIONVARIABLEType() {
        if (isexpressionvariableTypeEEnum == null) {
            isexpressionvariableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(51);
        }
        return isexpressionvariableTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISFILENAMEFIELDType() {
        if (isfilenamefieldTypeEEnum == null) {
            isfilenamefieldTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(53);
        }
        return isfilenamefieldTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISNONEType() {
        if (isnoneTypeEEnum == null) {
            isnoneTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(55);
        }
        return isnoneTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISNULLType() {
        if (isnullTypeEEnum == null) {
            isnullTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(57);
        }
        return isnullTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISOPTIONALType() {
        if (isoptionalTypeEEnum == null) {
            isoptionalTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(59);
        }
        return isoptionalTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISOPTIONALType1() {
        if (isoptionalType1EEnum == null) {
            isoptionalType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(60);
        }
        return isoptionalType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISOUTPUTPORTType() {
        if (isoutputportTypeEEnum == null) {
            isoutputportTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(63);
        }
        return isoutputportTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISPARAMType() {
        if (isparamTypeEEnum == null) {
            isparamTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(65);
        }
        return isparamTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISPERSISTENTType() {
        if (ispersistentTypeEEnum == null) {
            ispersistentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(67);
        }
        return ispersistentTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISPROFILEMAPPINGType() {
        if (isprofilemappingTypeEEnum == null) {
            isprofilemappingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(69);
        }
        return isprofilemappingTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISREFERENCEType() {
        if (isreferenceTypeEEnum == null) {
            isreferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(71);
        }
        return isreferenceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISREPARTITIONPOINTType() {
        if (isrepartitionpointTypeEEnum == null) {
            isrepartitionpointTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(73);
        }
        return isrepartitionpointTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISREUSABLEType() {
        if (isreusableTypeEEnum == null) {
            isreusableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(75);
        }
        return isreusableTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISRUNNABLESERVICEType() {
        if (isrunnableserviceTypeEEnum == null) {
            isrunnableserviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(77);
        }
        return isrunnableserviceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISSERVICEType() {
        if (isserviceTypeEEnum == null) {
            isserviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(79);
        }
        return isserviceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISSHAREREADType() {
        if (issharereadTypeEEnum == null) {
            issharereadTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(81);
        }
        return issharereadTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISSHAREWRITEType() {
        if (issharewriteTypeEEnum == null) {
            issharewriteTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(83);
        }
        return issharewriteTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISSORTKEYType() {
        if (issortkeyTypeEEnum == null) {
            issortkeyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(85);
        }
        return issortkeyTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISVALIDType() {
        if (isvalidTypeEEnum == null) {
            isvalidTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(87);
        }
        return isvalidTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISVALIDType1() {
        if (isvalidType1EEnum == null) {
            isvalidType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(88);
        }
        return isvalidType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISVALIDType2() {
        if (isvalidType2EEnum == null) {
            isvalidType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(89);
        }
        return isvalidType2EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getISVALIDType3() {
        if (isvalidType3EEnum == null) {
            isvalidType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(90);
        }
        return isvalidType3EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMACROTYPEType() {
        if (macrotypeTypeEEnum == null) {
            macrotypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(99);
        }
        return macrotypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNULLABLEType() {
        if (nullableTypeEEnum == null) {
            nullableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(106);
        }
        return nullableTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNULLABLEType1() {
        if (nullableType1EEnum == null) {
            nullableType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(107);
        }
        return nullableType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getNULLCHARTYPEType() {
        if (nullchartypeTypeEEnum == null) {
            nullchartypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(110);
        }
        return nullchartypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOBJECTTYPEType() {
        if (objecttypeTypeEEnum == null) {
            objecttypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(112);
        }
        return objecttypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOCCURRENCEType() {
        if (occurrenceTypeEEnum == null) {
            occurrenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(114);
        }
        return occurrenceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOUTERJOINRELType() {
        if (outerjoinrelTypeEEnum == null) {
            outerjoinrelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(116);
        }
        return outerjoinrelTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPARENTTYPEType() {
        if (parenttypeTypeEEnum == null) {
            parenttypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(118);
        }
        return parenttypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPARENTTYPEType1() {
        if (parenttypeType1EEnum == null) {
            parenttypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(119);
        }
        return parenttypeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPARENTTYPEType2() {
        if (parenttypeType2EEnum == null) {
            parenttypeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(120);
        }
        return parenttypeType2EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getPARENTTYPEType3() {
        if (parenttypeType3EEnum == null) {
            parenttypeType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(121);
        }
        return parenttypeType3EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREFERENCETYPEType() {
        if (referencetypeTypeEEnum == null) {
            referencetypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(129);
        }
        return referencetypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLESCHEDULERType() {
        if (reusableschedulerTypeEEnum == null) {
            reusableschedulerTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(134);
        }
        return reusableschedulerTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType() {
        if (reusableTypeEEnum == null) {
            reusableTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(136);
        }
        return reusableTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType1() {
        if (reusableType1EEnum == null) {
            reusableType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(137);
        }
        return reusableType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType2() {
        if (reusableType2EEnum == null) {
            reusableType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(138);
        }
        return reusableType2EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType3() {
        if (reusableType3EEnum == null) {
            reusableType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(139);
        }
        return reusableType3EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType4() {
        if (reusableType4EEnum == null) {
            reusableType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(140);
        }
        return reusableType4EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType5() {
        if (reusableType5EEnum == null) {
            reusableType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(141);
        }
        return reusableType5EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREUSABLEType6() {
        if (reusableType6EEnum == null) {
            reusableType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(142);
        }
        return reusableType6EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getREVERSEASSIGNMENTType() {
        if (reverseassignmentTypeEEnum == null) {
            reverseassignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(150);
        }
        return reverseassignmentTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRUNFOREVERType() {
        if (runforeverTypeEEnum == null) {
            runforeverTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(152);
        }
        return runforeverTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRUNONCEType() {
        if (runonceTypeEEnum == null) {
            runonceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(154);
        }
        return runonceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSCHEDULETYPEType() {
        if (scheduletypeTypeEEnum == null) {
            scheduletypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(174);
        }
        return scheduletypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSCHEDULETYPEType1() {
        if (scheduletypeType1EEnum == null) {
            scheduletypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(175);
        }
        return scheduletypeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSHAREDType() {
        if (sharedTypeEEnum == null) {
            sharedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(188);
        }
        return sharedTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSORTDIRECTIONType() {
        if (sortdirectionTypeEEnum == null) {
            sortdirectionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(191);
        }
        return sortdirectionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSTAGEFILEPERSISTType() {
        if (stagefilepersistTypeEEnum == null) {
            stagefilepersistTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(195);
        }
        return stagefilepersistTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSTAGEFILEREINITType() {
        if (stagefilereinitTypeEEnum == null) {
            stagefilereinitTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(197);
        }
        return stagefilereinitTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSUBTYPEType() {
        if (subtypeTypeEEnum == null) {
            subtypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(200);
        }
        return subtypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSUBTYPEType1() {
        if (subtypeType1EEnum == null) {
            subtypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(201);
        }
        return subtypeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSUSPENDONERRORType() {
        if (suspendonerrorTypeEEnum == null) {
            suspendonerrorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(204);
        }
        return suspendonerrorTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTASKSMUSTRUNONSERVERType() {
        if (tasksmustrunonserverTypeEEnum == null) {
            tasksmustrunonserverTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(213);
        }
        return tasksmustrunonserverTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTIMERTYPEType() {
        if (timertypeTypeEEnum == null) {
            timertypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(217);
        }
        return timertypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTREATINPUTLINKASANDType() {
        if (treatinputlinkasandTypeEEnum == null) {
            treatinputlinkasandTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(224);
        }
        return treatinputlinkasandTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType() {
        if (typeTypeEEnum == null) {
            typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(226);
        }
        return typeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType1() {
        if (typeType1EEnum == null) {
            typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(227);
        }
        return typeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType2() {
        if (typeType2EEnum == null) {
            typeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(228);
        }
        return typeType2EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType3() {
        if (typeType3EEnum == null) {
            typeType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(229);
        }
        return typeType3EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType4() {
        if (typeType4EEnum == null) {
            typeType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(230);
        }
        return typeType4EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType5() {
        if (typeType5EEnum == null) {
            typeType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(231);
        }
        return typeType5EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType6() {
        if (typeType6EEnum == null) {
            typeType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(232);
        }
        return typeType6EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType7() {
        if (typeType7EEnum == null) {
            typeType7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(233);
        }
        return typeType7EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTYPEType8() {
        if (typeType8EEnum == null) {
            typeType8EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(234);
        }
        return typeType8EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUSERDEFINEDType() {
        if (userdefinedTypeEEnum == null) {
            userdefinedTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(244);
        }
        return userdefinedTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUSERDEFINEDType1() {
        if (userdefinedType1EEnum == null) {
            userdefinedType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(245);
        }
        return userdefinedType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVALUETYPEType() {
        if (valuetypeTypeEEnum == null) {
            valuetypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(249);
        }
        return valuetypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVALUETYPEType1() {
        if (valuetypeType1EEnum == null) {
            valuetypeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(250);
        }
        return valuetypeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getVALUETYPEType2() {
        if (valuetypeType2EEnum == null) {
            valuetypeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(251);
        }
        return valuetypeType2EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAGGFUNCTIONTypeObject() {
        if (aggfunctionTypeObjectEDataType == null) {
            aggfunctionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(1);
        }
        return aggfunctionTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDATATYPETypeObject() {
        if (datatypeTypeObjectEDataType == null) {
            datatypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(12);
        }
        return datatypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDAYTypeObject() {
        if (dayTypeObjectEDataType == null) {
            dayTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(14);
        }
        return dayTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getENDTYPETypeObject() {
        if (endtypeTypeObjectEDataType == null) {
            endtypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(18);
        }
        return endtypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFAILPARENTIFINSTANCEDIDNOTRUNTypeObject() {
        if (failparentifinstancedidnotrunTypeObjectEDataType == null) {
            failparentifinstancedidnotrunTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(24);
        }
        return failparentifinstancedidnotrunTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFAILPARENTIFINSTANCEFAILSTypeObject() {
        if (failparentifinstancefailsTypeObjectEDataType == null) {
            failparentifinstancefailsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(26);
        }
        return failparentifinstancefailsTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIGNOREINCOMPARETypeObject() {
        if (ignoreincompareTypeObjectEDataType == null) {
            ignoreincompareTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(36);
        }
        return ignoreincompareTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIGNORENULLINPUTSTypeObject() {
        if (ignorenullinputsTypeObjectEDataType == null) {
            ignorenullinputsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(38);
        }
        return ignorenullinputsTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISCLIENTEDITABLETypeObject() {
        if (isclienteditableTypeObjectEDataType == null) {
            isclienteditableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(42);
        }
        return isclienteditableTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISCLIENTVISIBLETypeObject() {
        if (isclientvisibleTypeObjectEDataType == null) {
            isclientvisibleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(44);
        }
        return isclientvisibleTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISDEFAULTTypeObject() {
        if (isdefaultTypeObjectEDataType == null) {
            isdefaultTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(46);
        }
        return isdefaultTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISENABLEDTypeObject() {
        if (isenabledTypeObjectEDataType == null) {
            isenabledTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(49);
        }
        return isenabledTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISENABLEDTypeObject1() {
        if (isenabledTypeObject1EDataType == null) {
            isenabledTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(50);
        }
        return isenabledTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISEXPRESSIONVARIABLETypeObject() {
        if (isexpressionvariableTypeObjectEDataType == null) {
            isexpressionvariableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(52);
        }
        return isexpressionvariableTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISFILENAMEFIELDTypeObject() {
        if (isfilenamefieldTypeObjectEDataType == null) {
            isfilenamefieldTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(54);
        }
        return isfilenamefieldTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISNONETypeObject() {
        if (isnoneTypeObjectEDataType == null) {
            isnoneTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(56);
        }
        return isnoneTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISNULLTypeObject() {
        if (isnullTypeObjectEDataType == null) {
            isnullTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(58);
        }
        return isnullTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISOPTIONALTypeObject() {
        if (isoptionalTypeObjectEDataType == null) {
            isoptionalTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(61);
        }
        return isoptionalTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISOPTIONALTypeObject1() {
        if (isoptionalTypeObject1EDataType == null) {
            isoptionalTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(62);
        }
        return isoptionalTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISOUTPUTPORTTypeObject() {
        if (isoutputportTypeObjectEDataType == null) {
            isoutputportTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(64);
        }
        return isoutputportTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISPARAMTypeObject() {
        if (isparamTypeObjectEDataType == null) {
            isparamTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(66);
        }
        return isparamTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISPERSISTENTTypeObject() {
        if (ispersistentTypeObjectEDataType == null) {
            ispersistentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(68);
        }
        return ispersistentTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISPROFILEMAPPINGTypeObject() {
        if (isprofilemappingTypeObjectEDataType == null) {
            isprofilemappingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(70);
        }
        return isprofilemappingTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISREFERENCETypeObject() {
        if (isreferenceTypeObjectEDataType == null) {
            isreferenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(72);
        }
        return isreferenceTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISREPARTITIONPOINTTypeObject() {
        if (isrepartitionpointTypeObjectEDataType == null) {
            isrepartitionpointTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(74);
        }
        return isrepartitionpointTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISREUSABLETypeObject() {
        if (isreusableTypeObjectEDataType == null) {
            isreusableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(76);
        }
        return isreusableTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISRUNNABLESERVICETypeObject() {
        if (isrunnableserviceTypeObjectEDataType == null) {
            isrunnableserviceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(78);
        }
        return isrunnableserviceTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISSERVICETypeObject() {
        if (isserviceTypeObjectEDataType == null) {
            isserviceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(80);
        }
        return isserviceTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISSHAREREADTypeObject() {
        if (issharereadTypeObjectEDataType == null) {
            issharereadTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(82);
        }
        return issharereadTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISSHAREWRITETypeObject() {
        if (issharewriteTypeObjectEDataType == null) {
            issharewriteTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(84);
        }
        return issharewriteTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISSORTKEYTypeObject() {
        if (issortkeyTypeObjectEDataType == null) {
            issortkeyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(86);
        }
        return issortkeyTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISVALIDTypeObject() {
        if (isvalidTypeObjectEDataType == null) {
            isvalidTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(91);
        }
        return isvalidTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISVALIDTypeObject1() {
        if (isvalidTypeObject1EDataType == null) {
            isvalidTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(92);
        }
        return isvalidTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISVALIDTypeObject2() {
        if (isvalidTypeObject2EDataType == null) {
            isvalidTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(93);
        }
        return isvalidTypeObject2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getISVALIDTypeObject3() {
        if (isvalidTypeObject3EDataType == null) {
            isvalidTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(94);
        }
        return isvalidTypeObject3EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMACROTYPETypeObject() {
        if (macrotypeTypeObjectEDataType == null) {
            macrotypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(100);
        }
        return macrotypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNULLABLETypeObject() {
        if (nullableTypeObjectEDataType == null) {
            nullableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(108);
        }
        return nullableTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNULLABLETypeObject1() {
        if (nullableTypeObject1EDataType == null) {
            nullableTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(109);
        }
        return nullableTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNULLCHARTYPETypeObject() {
        if (nullchartypeTypeObjectEDataType == null) {
            nullchartypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(111);
        }
        return nullchartypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getOBJECTTYPETypeObject() {
        if (objecttypeTypeObjectEDataType == null) {
            objecttypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(113);
        }
        return objecttypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getOCCURRENCETypeObject() {
        if (occurrenceTypeObjectEDataType == null) {
            occurrenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(115);
        }
        return occurrenceTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getOUTERJOINRELTypeObject() {
        if (outerjoinrelTypeObjectEDataType == null) {
            outerjoinrelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(117);
        }
        return outerjoinrelTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPARENTTYPETypeObject() {
        if (parenttypeTypeObjectEDataType == null) {
            parenttypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(122);
        }
        return parenttypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPARENTTYPETypeObject1() {
        if (parenttypeTypeObject1EDataType == null) {
            parenttypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(123);
        }
        return parenttypeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPARENTTYPETypeObject2() {
        if (parenttypeTypeObject2EDataType == null) {
            parenttypeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(124);
        }
        return parenttypeTypeObject2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPARENTTYPETypeObject3() {
        if (parenttypeTypeObject3EDataType == null) {
            parenttypeTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(125);
        }
        return parenttypeTypeObject3EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREFERENCETYPETypeObject() {
        if (referencetypeTypeObjectEDataType == null) {
            referencetypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(130);
        }
        return referencetypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLESCHEDULERTypeObject() {
        if (reusableschedulerTypeObjectEDataType == null) {
            reusableschedulerTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(135);
        }
        return reusableschedulerTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject() {
        if (reusableTypeObjectEDataType == null) {
            reusableTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(143);
        }
        return reusableTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject1() {
        if (reusableTypeObject1EDataType == null) {
            reusableTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(144);
        }
        return reusableTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject2() {
        if (reusableTypeObject2EDataType == null) {
            reusableTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(145);
        }
        return reusableTypeObject2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject3() {
        if (reusableTypeObject3EDataType == null) {
            reusableTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(146);
        }
        return reusableTypeObject3EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject4() {
        if (reusableTypeObject4EDataType == null) {
            reusableTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(147);
        }
        return reusableTypeObject4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject5() {
        if (reusableTypeObject5EDataType == null) {
            reusableTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(148);
        }
        return reusableTypeObject5EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREUSABLETypeObject6() {
        if (reusableTypeObject6EDataType == null) {
            reusableTypeObject6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(149);
        }
        return reusableTypeObject6EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getREVERSEASSIGNMENTTypeObject() {
        if (reverseassignmentTypeObjectEDataType == null) {
            reverseassignmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(151);
        }
        return reverseassignmentTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRUNFOREVERTypeObject() {
        if (runforeverTypeObjectEDataType == null) {
            runforeverTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(153);
        }
        return runforeverTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRUNONCETypeObject() {
        if (runonceTypeObjectEDataType == null) {
            runonceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(155);
        }
        return runonceTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSCHEDULETYPETypeObject() {
        if (scheduletypeTypeObjectEDataType == null) {
            scheduletypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(176);
        }
        return scheduletypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSCHEDULETYPETypeObject1() {
        if (scheduletypeTypeObject1EDataType == null) {
            scheduletypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(177);
        }
        return scheduletypeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSHAREDTypeObject() {
        if (sharedTypeObjectEDataType == null) {
            sharedTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(189);
        }
        return sharedTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSORTDIRECTIONTypeObject() {
        if (sortdirectionTypeObjectEDataType == null) {
            sortdirectionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(192);
        }
        return sortdirectionTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSTAGEFILEPERSISTTypeObject() {
        if (stagefilepersistTypeObjectEDataType == null) {
            stagefilepersistTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(196);
        }
        return stagefilepersistTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSTAGEFILEREINITTypeObject() {
        if (stagefilereinitTypeObjectEDataType == null) {
            stagefilereinitTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(198);
        }
        return stagefilereinitTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSUBTYPETypeObject() {
        if (subtypeTypeObjectEDataType == null) {
            subtypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(202);
        }
        return subtypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSUBTYPETypeObject1() {
        if (subtypeTypeObject1EDataType == null) {
            subtypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(203);
        }
        return subtypeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSUSPENDONERRORTypeObject() {
        if (suspendonerrorTypeObjectEDataType == null) {
            suspendonerrorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(205);
        }
        return suspendonerrorTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTASKSMUSTRUNONSERVERTypeObject() {
        if (tasksmustrunonserverTypeObjectEDataType == null) {
            tasksmustrunonserverTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(214);
        }
        return tasksmustrunonserverTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTIMERTYPETypeObject() {
        if (timertypeTypeObjectEDataType == null) {
            timertypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(218);
        }
        return timertypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTREATINPUTLINKASANDTypeObject() {
        if (treatinputlinkasandTypeObjectEDataType == null) {
            treatinputlinkasandTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(225);
        }
        return treatinputlinkasandTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject() {
        if (typeTypeObjectEDataType == null) {
            typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(235);
        }
        return typeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject1() {
        if (typeTypeObject1EDataType == null) {
            typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(236);
        }
        return typeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject2() {
        if (typeTypeObject2EDataType == null) {
            typeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(237);
        }
        return typeTypeObject2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject3() {
        if (typeTypeObject3EDataType == null) {
            typeTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(238);
        }
        return typeTypeObject3EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject4() {
        if (typeTypeObject4EDataType == null) {
            typeTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(239);
        }
        return typeTypeObject4EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject5() {
        if (typeTypeObject5EDataType == null) {
            typeTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(240);
        }
        return typeTypeObject5EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject6() {
        if (typeTypeObject6EDataType == null) {
            typeTypeObject6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(241);
        }
        return typeTypeObject6EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject7() {
        if (typeTypeObject7EDataType == null) {
            typeTypeObject7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(242);
        }
        return typeTypeObject7EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTYPETypeObject8() {
        if (typeTypeObject8EDataType == null) {
            typeTypeObject8EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(243);
        }
        return typeTypeObject8EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUSERDEFINEDTypeObject() {
        if (userdefinedTypeObjectEDataType == null) {
            userdefinedTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(246);
        }
        return userdefinedTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUSERDEFINEDTypeObject1() {
        if (userdefinedTypeObject1EDataType == null) {
            userdefinedTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(247);
        }
        return userdefinedTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getVALUETYPETypeObject() {
        if (valuetypeTypeObjectEDataType == null) {
            valuetypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(252);
        }
        return valuetypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getVALUETYPETypeObject1() {
        if (valuetypeTypeObject1EDataType == null) {
            valuetypeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(253);
        }
        return valuetypeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getVALUETYPETypeObject2() {
        if (valuetypeTypeObject2EDataType == null) {
            valuetypeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(PowrmartPackage.eNS_URI).getEClassifiers().get(254);
        }
        return valuetypeTypeObject2EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowrmartFactory getPowrmartFactory() {
        return (PowrmartFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isLoaded = false;

    /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("Powrmart." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //PowrmartPackageImpl
