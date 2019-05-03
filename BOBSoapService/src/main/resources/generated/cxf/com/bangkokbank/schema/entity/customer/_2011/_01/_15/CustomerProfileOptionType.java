
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BasicCustomerProfileOnly" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType"/>
 *         &lt;element name="BasicCustomerProfileWithALSCustomerNums" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType"/>
 *         &lt;element name="Mask" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileMaskType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileOptionType", propOrder = {
    "basicCustomerProfileOnly",
    "basicCustomerProfileWithALSCustomerNums",
    "mask"
})
public class CustomerProfileOptionType {

    @XmlElement(name = "BasicCustomerProfileOnly")
    protected String basicCustomerProfileOnly;
    @XmlElement(name = "BasicCustomerProfileWithALSCustomerNums")
    protected String basicCustomerProfileWithALSCustomerNums;
    @XmlElement(name = "Mask")
    protected CustomerProfileMaskType mask;

    /**
     * Gets the value of the basicCustomerProfileOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicCustomerProfileOnly() {
        return basicCustomerProfileOnly;
    }

    /**
     * Sets the value of the basicCustomerProfileOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicCustomerProfileOnly(String value) {
        this.basicCustomerProfileOnly = value;
    }

    /**
     * Gets the value of the basicCustomerProfileWithALSCustomerNums property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicCustomerProfileWithALSCustomerNums() {
        return basicCustomerProfileWithALSCustomerNums;
    }

    /**
     * Sets the value of the basicCustomerProfileWithALSCustomerNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicCustomerProfileWithALSCustomerNums(String value) {
        this.basicCustomerProfileWithALSCustomerNums = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileMaskType }
     *     
     */
    public CustomerProfileMaskType getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileMaskType }
     *     
     */
    public void setMask(CustomerProfileMaskType value) {
        this.mask = value;
    }

}
