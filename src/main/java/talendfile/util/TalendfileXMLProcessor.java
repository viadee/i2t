/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package talendfile.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import talendfile.TalendfilePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TalendfileXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TalendfileXMLProcessor() {
        super(new EPackageRegistryImpl(EPackage.Registry.INSTANCE));
        extendedMetaData.putPackage(null, TalendfilePackage.eINSTANCE);
    }
    
    /**
     * Register for "*" and "xml" file extensions the TalendfileResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new TalendfileResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new TalendfileResourceFactoryImpl());
        }
        return registrations;
    }

} //TalendfileXMLProcessor
