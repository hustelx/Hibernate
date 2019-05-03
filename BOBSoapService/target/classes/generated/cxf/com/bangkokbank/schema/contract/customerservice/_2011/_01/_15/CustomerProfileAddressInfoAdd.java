
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15.CustomerProfileAddressInfoAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15}CustomerProfileAddressInfoAddReq"/>
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
    "customerProfileAddressInfoAddReq"
})
@XmlRootElement(name = "CustomerProfileAddressInfoAdd")
public class CustomerProfileAddressInfoAdd {

    @XmlElement(name = "CustomerProfileAddressInfoAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15", required = true)
    protected CustomerProfileAddressInfoAddReqType customerProfileAddressInfoAddReq;

    /**
     * Gets the value of the customerProfileAddressInfoAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoAddReqType }
     *     
     */
    public CustomerProfileAddressInfoAddReqType getCustomerProfileAddressInfoAddReq() {
        return customerProfileAddressInfoAddReq;
    }

    /**
     * Sets the value of the customerProfileAddressInfoAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoAddReqType }
     *     
     */
    public void setCustomerProfileAddressInfoAddReq(CustomerProfileAddressInfoAddReqType value) {
        this.customerProfileAddressInfoAddReq = value;
    }

}
