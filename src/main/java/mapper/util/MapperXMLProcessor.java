/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mapper.util;

import java.util.Map;

import mapper.MapperPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapperXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        MapperPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the MapperResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    @SuppressWarnings("unchecked")
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new MapperResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new MapperResourceFactoryImpl());
        }
        return registrations;
    }

} //MapperXMLProcessor
