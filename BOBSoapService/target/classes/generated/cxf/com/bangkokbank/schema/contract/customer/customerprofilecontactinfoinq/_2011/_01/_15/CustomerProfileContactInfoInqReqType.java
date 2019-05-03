
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileContactInfoInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="ContactInfoInqOption" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15}CustomerProfileContactInfoInqOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoInqReqType", propOrder = {
    "rmNum",
    "contactInfoInqOption"
})
public class CustomerProfileContactInfoInqReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "ContactInfoInqOption")
    protected CustomerProfileContactInfoInqOptionType contactInfoInqOption;

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
     * Gets the value of the contactInfoInqOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoInqOptionType }
     *     
     */
    public CustomerProfileContactInfoInqOptionType getContactInfoInqOption() {
        return contactInfoInqOption;
    }

    /**
     * Sets the value of the contactInfoInqOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoInqOptionType }
     *     
     */
    public void setContactInfoInqOption(CustomerProfileContactInfoInqOptionType value) {
        this.contactInfoInqOption = value;
    }

}
