
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.businesscenter._2011._01._15.BusinessCenterType;
import com.bangkokbank.schema.entity.businessdivision._2011._01._15.BusinessDivisionType;


/**
 * <p>Java class for UserAllocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAllocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllocationCode" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationCodeType"/>
 *         &lt;element name="OfficePhoneNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessCenter" type="{http://www.bangkokbank.com/schema/entity/BusinessCenter/2011/01/15}BusinessCenterType" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.bangkokbank.com/schema/entity/BusinessDivision/2011/01/15}BusinessDivisionType" minOccurs="0"/>
 *         &lt;element name="UserProfileHierarchy" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserProfileHierarchyType" minOccurs="0"/>
 *         &lt;element name="FloorNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUCode" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}BUCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAllocationType", propOrder = {
    "allocationCode",
    "officePhoneNum",
    "building",
    "businessCenter",
    "division",
    "userProfileHierarchy",
    "floorNum",
    "buCode"
})
public class UserAllocationType {

    @XmlElement(name = "AllocationCode", required = true)
    protected String allocationCode;
    @XmlElement(name = "OfficePhoneNum")
    protected String officePhoneNum;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "BusinessCenter")
    protected BusinessCenterType businessCenter;
    @XmlElement(name = "Division")
    protected BusinessDivisionType division;
    @XmlElement(name = "UserProfileHierarchy")
    protected UserProfileHierarchyType userProfileHierarchy;
    @XmlElement(name = "FloorNum")
    protected String floorNum;
    @XmlElement(name = "BUCode", required = true)
    protected String buCode;

    /**
     * Gets the value of the allocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationCode() {
        return allocationCode;
    }

    /**
     * Sets the value of the allocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationCode(String value) {
        this.allocationCode = value;
    }

    /**
     * Gets the value of the officePhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhoneNum() {
        return officePhoneNum;
    }

    /**
     * Sets the value of the officePhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhoneNum(String value) {
        this.officePhoneNum = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the businessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterType }
     *     
     */
    public BusinessCenterType getBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterType }
     *     
     */
    public void setBusinessCenter(BusinessCenterType value) {
        this.businessCenter = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDivisionType }
     *     
     */
    public BusinessDivisionType getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDivisionType }
     *     
     */
    public void setDivision(BusinessDivisionType value) {
        this.division = value;
    }

    /**
     * Gets the value of the userProfileHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link UserProfileHierarchyType }
     *     
     */
    public UserProfileHierarchyType getUserProfileHierarchy() {
        return userProfileHierarchy;
    }

    /**
     * Sets the value of the userProfileHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfileHierarchyType }
     *     
     */
    public void setUserProfileHierarchy(UserProfileHierarchyType value) {
        this.userProfileHierarchy = value;
    }

    /**
     * Gets the value of the floorNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNum() {
        return floorNum;
    }

    /**
     * Sets the value of the floorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNum(String value) {
        this.floorNum = value;
    }

    /**
     * Gets the value of the buCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUCode() {
        return buCode;
    }

    /**
     * Sets the value of the buCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUCode(String value) {
        this.buCode = value;
    }

}
