
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerContactInfoType;


/**
 * <p>Java class for CustomerProfileContactInfoModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="PreviousContactInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerContactInfoType"/>
 *         &lt;element name="NewContactInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerContactInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoModReqType", propOrder = {
    "rmNum",
    "previousContactInfo",
    "newContactInfo"
})
public class CustomerProfileContactInfoModReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "PreviousContactInfo", required = true)
    protected CustomerContactInfoType previousContactInfo;
    @XmlElement(name = "NewContactInfo", required = true)
    protected CustomerContactInfoType newContactInfo;

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
     * Gets the value of the previousContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public CustomerContactInfoType getPreviousContactInfo() {
        return previousContactInfo;
    }

    /**
     * Sets the value of the previousContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public void setPreviousContactInfo(CustomerContactInfoType value) {
        this.previousContactInfo = value;
    }

    /**
     * Gets the value of the newContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public CustomerContactInfoType getNewContactInfo() {
        return newContactInfo;
    }

    /**
     * Sets the value of the newContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public void setNewContactInfo(CustomerContactInfoType value) {
        this.newContactInfo = value;
    }

}
