
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfileHierarchyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfileHierarchyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserProfileHierarchyDetails" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserProfileHierarchyDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileHierarchyType", propOrder = {
    "userProfileHierarchyDetails"
})
public class UserProfileHierarchyType {

    @XmlElement(name = "UserProfileHierarchyDetails")
    protected UserProfileHierarchyDetailsType userProfileHierarchyDetails;

    /**
     * Gets the value of the userProfileHierarchyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileHierarchyDetailsType }
     *     
     */
    public UserProfileHierarchyDetailsType getUserProfileHierarchyDetails() {
        return userProfileHierarchyDetails;
    }

    /**
     * Sets the value of the userProfileHierarchyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileHierarchyDetailsType }
     *     
     */
    public void setUserProfileHierarchyDetails(UserProfileHierarchyDetailsType value) {
        this.userProfileHierarchyDetails = value;
    }

}
