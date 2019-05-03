
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Represents the Basic User Profile Detail Entity. Each User can have multiple User Allocations.
 *     	
 * 
 * <p>Java class for BaseUserProfileDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseUserProfileDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StaffID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserNameTH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserEmail" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}EmailAddrType"/>
 *         &lt;element name="UserRoles" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserRolesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseUserProfileDetailType", propOrder = {
    "userID",
    "staffID",
    "userNameTH",
    "userNameEN",
    "userEmail",
    "userRoles"
})
@XmlSeeAlso({
    UserProfileDetailType.class,
    UserProfileHierarchyDetailType.class
})
public class BaseUserProfileDetailType {

    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "StaffID", required = true)
    protected String staffID;
    @XmlElement(name = "UserNameTH", required = true)
    protected String userNameTH;
    @XmlElement(name = "UserNameEN", required = true)
    protected String userNameEN;
    @XmlElement(name = "UserEmail", required = true)
    protected String userEmail;
    @XmlElement(name = "UserRoles")
    protected UserRolesType userRoles;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the staffID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffID() {
        return staffID;
    }

    /**
     * Sets the value of the staffID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffID(String value) {
        this.staffID = value;
    }

    /**
     * Gets the value of the userNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameTH() {
        return userNameTH;
    }

    /**
     * Sets the value of the userNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameTH(String value) {
        this.userNameTH = value;
    }

    /**
     * Gets the value of the userNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNameEN() {
        return userNameEN;
    }

    /**
     * Sets the value of the userNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNameEN(String value) {
        this.userNameEN = value;
    }

    /**
     * Gets the value of the userEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Sets the value of the userEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Gets the value of the userRoles property.
     * 
     * @return
     *     possible object is
     *     {@link UserRolesType }
     *     
     */
    public UserRolesType getUserRoles() {
        return userRoles;
    }

    /**
     * Sets the value of the userRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRolesType }
     *     
     */
    public void setUserRoles(UserRolesType value) {
        this.userRoles = value;
    }

}
