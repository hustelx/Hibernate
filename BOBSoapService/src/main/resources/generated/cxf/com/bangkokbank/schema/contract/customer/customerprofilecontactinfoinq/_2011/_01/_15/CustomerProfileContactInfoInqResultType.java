
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerContactInfoType;


/**
 * <p>Java class for CustomerProfileContactInfoInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerContactInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerContactInfoType" minOccurs="0"/>
 *         &lt;element name="LatestMobileNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *         &lt;element name="SecondMobileNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *         &lt;element name="LatestEmail" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}EmailAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoInqResultType", propOrder = {
    "customerContactInfo",
    "latestMobileNum",
    "secondMobileNum",
    "latestEmail"
})
public class CustomerProfileContactInfoInqResultType {

    @XmlElement(name = "CustomerContactInfo")
    protected CustomerContactInfoType customerContactInfo;
    @XmlElement(name = "LatestMobileNum")
    protected String latestMobileNum;
    @XmlElement(name = "SecondMobileNum")
    protected String secondMobileNum;
    @XmlElement(name = "LatestEmail")
    protected String latestEmail;

    /**
     * Gets the value of the customerContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public CustomerContactInfoType getCustomerContactInfo() {
        return customerContactInfo;
    }

    /**
     * Sets the value of the customerContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public void setCustomerContactInfo(CustomerContactInfoType value) {
        this.customerContactInfo = value;
    }

    /**
     * Gets the value of the latestMobileNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestMobileNum() {
        return latestMobileNum;
    }

    /**
     * Sets the value of the latestMobileNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestMobileNum(String value) {
        this.latestMobileNum = value;
    }

    /**
     * Gets the value of the secondMobileNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondMobileNum() {
        return secondMobileNum;
    }

    /**
     * Sets the value of the secondMobileNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondMobileNum(String value) {
        this.secondMobileNum = value;
    }

    /**
     * Gets the value of the latestEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestEmail() {
        return latestEmail;
    }

    /**
     * Sets the value of the latestEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestEmail(String value) {
        this.latestEmail = value;
    }

}
