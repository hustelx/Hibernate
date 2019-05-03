
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.bblgroup._2011._01._15.BBLGroupsType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CustomerStatusType;


/**
 * Represents a Customer Entity as represented in CCIS
 * 
 * <p>Java class for CustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType"/>
 *         &lt;element name="OwnerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameEN" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *         &lt;element name="NameTH" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *         &lt;element name="RegistrationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AllocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BBLGroups" type="{http://www.bangkokbank.com/schema/entity/BBLGroup/2011/01/15}BBLGroupsType"/>
 *         &lt;element name="SegmentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CustomerStatusType"/>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="PilotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "ccisid",
    "contactNum",
    "ownerName",
    "nameEN",
    "nameTH",
    "registrationID",
    "allocationCode",
    "bblGroups",
    "segmentCode",
    "status",
    "rmNum",
    "pilotCode"
})
public class CustomerType {

    @XmlElement(name = "CCISID")
    protected String ccisid;
    @XmlElement(name = "ContactNum", required = true)
    protected String contactNum;
    @XmlElement(name = "OwnerName", required = true)
    protected String ownerName;
    @XmlElement(name = "NameEN", required = true)
    protected CustomerNameType nameEN;
    @XmlElement(name = "NameTH", required = true)
    protected CustomerNameType nameTH;
    @XmlElement(name = "RegistrationID", required = true)
    protected String registrationID;
    @XmlElement(name = "AllocationCode", required = true)
    protected String allocationCode;
    @XmlElement(name = "BBLGroups", required = true)
    protected BBLGroupsType bblGroups;
    @XmlElement(name = "SegmentCode", required = true)
    protected String segmentCode;
    @XmlElement(name = "Status", required = true)
    protected CustomerStatusType status;
    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "PilotCode")
    protected String pilotCode;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

    /**
     * Gets the value of the contactNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNum() {
        return contactNum;
    }

    /**
     * Sets the value of the contactNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNum(String value) {
        this.contactNum = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the nameEN property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getNameEN() {
        return nameEN;
    }

    /**
     * Sets the value of the nameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setNameEN(CustomerNameType value) {
        this.nameEN = value;
    }

    /**
     * Gets the value of the nameTH property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getNameTH() {
        return nameTH;
    }

    /**
     * Sets the value of the nameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setNameTH(CustomerNameType value) {
        this.nameTH = value;
    }

    /**
     * Gets the value of the registrationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationID(String value) {
        this.registrationID = value;
    }

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
     * Gets the value of the bblGroups property.
     * 
     * @return
     *     possible object is
     *     {@link BBLGroupsType }
     *     
     */
    public BBLGroupsType getBBLGroups() {
        return bblGroups;
    }

    /**
     * Sets the value of the bblGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBLGroupsType }
     *     
     */
    public void setBBLGroups(BBLGroupsType value) {
        this.bblGroups = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentCode(String value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerStatusType }
     *     
     */
    public CustomerStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerStatusType }
     *     
     */
    public void setStatus(CustomerStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

    /**
     * Gets the value of the pilotCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilotCode() {
        return pilotCode;
    }

    /**
     * Sets the value of the pilotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilotCode(String value) {
        this.pilotCode = value;
    }

}
