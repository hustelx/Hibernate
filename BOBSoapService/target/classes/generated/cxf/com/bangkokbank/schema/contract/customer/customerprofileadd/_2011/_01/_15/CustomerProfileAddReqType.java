
package com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.AdditionalCustomerProfileInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileType;


/**
 * <p>Java class for CustomerProfileAddReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType" minOccurs="0"/>
 *         &lt;element name="AdditionalCustomerProfileInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}AdditionalCustomerProfileInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddReqType", propOrder = {
    "customerProfile",
    "additionalCustomerProfileInfo"
})
public class CustomerProfileAddReqType {

    @XmlElement(name = "CustomerProfile")
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "AdditionalCustomerProfileInfo")
    protected AdditionalCustomerProfileInfoType additionalCustomerProfileInfo;

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the additionalCustomerProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public AdditionalCustomerProfileInfoType getAdditionalCustomerProfileInfo() {
        return additionalCustomerProfileInfo;
    }

    /**
     * Sets the value of the additionalCustomerProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public void setAdditionalCustomerProfileInfo(AdditionalCustomerProfileInfoType value) {
        this.additionalCustomerProfileInfo = value;
    }

}
