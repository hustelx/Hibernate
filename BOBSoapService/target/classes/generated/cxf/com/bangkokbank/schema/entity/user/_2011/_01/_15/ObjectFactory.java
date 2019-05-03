
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.entity.user._2011._01._15 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UserAllocationCode_QNAME = new QName("http://www.bangkokbank.com/schema/entity/User/2011/01/15", "UserAllocationCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.entity.user._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllocationCodePortOwnerType }
     * 
     */
    public AllocationCodePortOwnerType createAllocationCodePortOwnerType() {
        return new AllocationCodePortOwnerType();
    }

    /**
     * Create an instance of {@link UserRolesType }
     * 
     */
    public UserRolesType createUserRolesType() {
        return new UserRolesType();
    }

    /**
     * Create an instance of {@link UserProfileHierarchyType }
     * 
     */
    public UserProfileHierarchyType createUserProfileHierarchyType() {
        return new UserProfileHierarchyType();
    }

    /**
     * Create an instance of {@link UserProfileHierarchyDetailsType }
     * 
     */
    public UserProfileHierarchyDetailsType createUserProfileHierarchyDetailsType() {
        return new UserProfileHierarchyDetailsType();
    }

    /**
     * Create an instance of {@link UserAllocationType }
     * 
     */
    public UserAllocationType createUserAllocationType() {
        return new UserAllocationType();
    }

    /**
     * Create an instance of {@link UserProfileHierarchyDetailType }
     * 
     */
    public UserProfileHierarchyDetailType createUserProfileHierarchyDetailType() {
        return new UserProfileHierarchyDetailType();
    }

    /**
     * Create an instance of {@link UserAllocationsType }
     * 
     */
    public UserAllocationsType createUserAllocationsType() {
        return new UserAllocationsType();
    }

    /**
     * Create an instance of {@link BaseUserProfileDetailType }
     * 
     */
    public BaseUserProfileDetailType createBaseUserProfileDetailType() {
        return new BaseUserProfileDetailType();
    }

    /**
     * Create an instance of {@link UserProfileDetailType }
     * 
     */
    public UserProfileDetailType createUserProfileDetailType() {
        return new UserProfileDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/User/2011/01/15", name = "UserAllocationCode")
    public JAXBElement<String> createUserAllocationCode(String value) {
        return new JAXBElement<String>(_UserAllocationCode_QNAME, String.class, null, value);
    }

}
