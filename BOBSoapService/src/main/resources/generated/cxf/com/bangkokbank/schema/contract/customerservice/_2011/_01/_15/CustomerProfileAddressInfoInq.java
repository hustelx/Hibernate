
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15.CustomerProfileAddressInfoInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15}CustomerProfileAddressInfoInqReq"/>
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
    "customerProfileAddressInfoInqReq"
})
@XmlRootElement(name = "CustomerProfileAddressInfoInq")
public class CustomerProfileAddressInfoInq {

    @XmlElement(name = "CustomerProfileAddressInfoInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", required = true)
    protected CustomerProfileAddressInfoInqReqType customerProfileAddressInfoInqReq;

    /**
     * Gets the value of the customerProfileAddressInfoInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoInqReqType }
     *     
     */
    public CustomerProfileAddressInfoInqReqType getCustomerProfileAddressInfoInqReq() {
        return customerProfileAddressInfoInqReq;
    }

    /**
     * Sets the value of the customerProfileAddressInfoInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoInqReqType }
     *     
     */
    public void setCustomerProfileAddressInfoInqReq(CustomerProfileAddressInfoInqReqType value) {
        this.customerProfileAddressInfoInqReq = value;
    }

}
