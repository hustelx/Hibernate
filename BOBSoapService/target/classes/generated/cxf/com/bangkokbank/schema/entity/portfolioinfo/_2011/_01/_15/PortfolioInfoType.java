
package com.bangkokbank.schema.entity.portfolioinfo._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnerUserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerAllocationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerUserNameTH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerUserNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwnerTelephoneNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *         &lt;element name="RMAllocationCode" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationCodeType"/>
 *         &lt;element name="RMUserNameTH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RMUserNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RMTelephoneNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioInfoType", propOrder = {
    "ownerUserID",
    "ownerAllocationCode",
    "ownerUserNameTH",
    "ownerUserNameEN",
    "ownerTelephoneNum",
    "rmAllocationCode",
    "rmUserNameTH",
    "rmUserNameEN",
    "rmTelephoneNum"
})
public class PortfolioInfoType {

    @XmlElement(name = "OwnerUserID", required = true)
    protected String ownerUserID;
    @XmlElement(name = "OwnerAllocationCode", required = true)
    protected String ownerAllocationCode;
    @XmlElement(name = "OwnerUserNameTH", required = true)
    protected String ownerUserNameTH;
    @XmlElement(name = "OwnerUserNameEN", required = true)
    protected String ownerUserNameEN;
    @XmlElement(name = "OwnerTelephoneNum")
    protected String ownerTelephoneNum;
    @XmlElement(name = "RMAllocationCode", required = true)
    protected String rmAllocationCode;
    @XmlElement(name = "RMUserNameTH", required = true)
    protected String rmUserNameTH;
    @XmlElement(name = "RMUserNameEN", required = true)
    protected String rmUserNameEN;
    @XmlElement(name = "RMTelephoneNum")
    protected String rmTelephoneNum;

    /**
     * Gets the value of the ownerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserID() {
        return ownerUserID;
    }

    /**
     * Sets the value of the ownerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserID(String value) {
        this.ownerUserID = value;
    }

    /**
     * Gets the value of the ownerAllocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerAllocationCode() {
        return ownerAllocationCode;
    }

    /**
     * Sets the value of the ownerAllocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerAllocationCode(String value) {
        this.ownerAllocationCode = value;
    }

    /**
     * Gets the value of the ownerUserNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserNameTH() {
        return ownerUserNameTH;
    }

    /**
     * Sets the value of the ownerUserNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserNameTH(String value) {
        this.ownerUserNameTH = value;
    }

    /**
     * Gets the value of the ownerUserNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserNameEN() {
        return ownerUserNameEN;
    }

    /**
     * Sets the value of the ownerUserNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserNameEN(String value) {
        this.ownerUserNameEN = value;
    }

    /**
     * Gets the value of the ownerTelephoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerTelephoneNum() {
        return ownerTelephoneNum;
    }

    /**
     * Sets the value of the ownerTelephoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerTelephoneNum(String value) {
        this.ownerTelephoneNum = value;
    }

    /**
     * Gets the value of the rmAllocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMAllocationCode() {
        return rmAllocationCode;
    }

    /**
     * Sets the value of the rmAllocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMAllocationCode(String value) {
        this.rmAllocationCode = value;
    }

    /**
     * Gets the value of the rmUserNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMUserNameTH() {
        return rmUserNameTH;
    }

    /**
     * Sets the value of the rmUserNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMUserNameTH(String value) {
        this.rmUserNameTH = value;
    }

    /**
     * Gets the value of the rmUserNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMUserNameEN() {
        return rmUserNameEN;
    }

    /**
     * Sets the value of the rmUserNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMUserNameEN(String value) {
        this.rmUserNameEN = value;
    }

    /**
     * Gets the value of the rmTelephoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMTelephoneNum() {
        return rmTelephoneNum;
    }

    /**
     * Sets the value of the rmTelephoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMTelephoneNum(String value) {
        this.rmTelephoneNum = value;
    }

}
