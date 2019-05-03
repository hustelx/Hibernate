
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType"/>
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ext" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AddressContactNumRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactNumType", propOrder = {
    "countryCode",
    "contactNum",
    "contactType",
    "ext",
    "addressContactNumRef"
})
public class ContactNumType {

    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "ContactNum", required = true)
    protected String contactNum;
    @XmlElement(name = "ContactType", required = true)
    protected String contactType;
    @XmlElement(name = "Ext")
    protected String ext;
    @XmlElement(name = "AddressContactNumRef", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String addressContactNumRef;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
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
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt() {
        return ext;
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt(String value) {
        this.ext = value;
    }

    /**
     * This is used to refer to an address, if it is available. This
     * 						must be aligned with the PostAddressType 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressContactNumRef() {
        return addressContactNumRef;
    }

    /**
     * Sets the value of the addressContactNumRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressContactNumRef(String value) {
        this.addressContactNumRef = value;
    }

}
