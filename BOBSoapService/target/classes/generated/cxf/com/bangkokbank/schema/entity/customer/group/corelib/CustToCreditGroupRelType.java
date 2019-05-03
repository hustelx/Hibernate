
package com.bangkokbank.schema.entity.customer.group.corelib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustToCreditGroupRelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustToCreditGroupRelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditGroupProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CreditGroupProfileType" minOccurs="0"/>
 *         &lt;element name="HeadOfGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BBLGroupMainFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustToCreditGroupRelType", propOrder = {
    "creditGroupProfile",
    "headOfGroupFlag",
    "bblGroupMainFlag"
})
public class CustToCreditGroupRelType {

    @XmlElement(name = "CreditGroupProfile")
    protected CreditGroupProfileType creditGroupProfile;
    @XmlElement(name = "HeadOfGroupFlag")
    protected Boolean headOfGroupFlag;
    @XmlElement(name = "BBLGroupMainFlag")
    protected Boolean bblGroupMainFlag;

    /**
     * Gets the value of the creditGroupProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CreditGroupProfileType }
     *     
     */
    public CreditGroupProfileType getCreditGroupProfile() {
        return creditGroupProfile;
    }

    /**
     * Sets the value of the creditGroupProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditGroupProfileType }
     *     
     */
    public void setCreditGroupProfile(CreditGroupProfileType value) {
        this.creditGroupProfile = value;
    }

    /**
     * Gets the value of the headOfGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadOfGroupFlag() {
        return headOfGroupFlag;
    }

    /**
     * Sets the value of the headOfGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadOfGroupFlag(Boolean value) {
        this.headOfGroupFlag = value;
    }

    /**
     * Gets the value of the bblGroupMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBBLGroupMainFlag() {
        return bblGroupMainFlag;
    }

    /**
     * Sets the value of the bblGroupMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBBLGroupMainFlag(Boolean value) {
        this.bblGroupMainFlag = value;
    }

}
