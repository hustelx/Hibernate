
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15.CustomerProfileModReqType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15}CustomerProfileModReq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerProfileModReq"
})
@XmlRootElement(name = "CustomerProfileMod")
public class CustomerProfileMod {

    @XmlElement(name = "CustomerProfileModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15", required = true)
    protected CustomerProfileModReqType customerProfileModReq;

    /**
     * Gets the value of the customerProfileModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileModReqType }
     *     
     */
    public CustomerProfileModReqType getCustomerProfileModReq() {
        return customerProfileModReq;
    }

    /**
     * Sets the value of the customerProfileModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileModReqType }
     *     
     */
    public void setCustomerProfileModReq(CustomerProfileModReqType value) {
        this.customerProfileModReq = value;
    }

}
