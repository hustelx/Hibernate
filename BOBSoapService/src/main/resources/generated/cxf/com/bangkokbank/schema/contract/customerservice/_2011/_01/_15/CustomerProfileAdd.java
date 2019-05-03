
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15.CustomerProfileAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15}CustomerProfileAddReq"/>
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
    "customerProfileAddReq"
})
@XmlRootElement(name = "CustomerProfileAdd")
public class CustomerProfileAdd {

    @XmlElement(name = "CustomerProfileAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", required = true)
    protected CustomerProfileAddReqType customerProfileAddReq;

    /**
     * Gets the value of the customerProfileAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddReqType }
     *     
     */
    public CustomerProfileAddReqType getCustomerProfileAddReq() {
        return customerProfileAddReq;
    }

    /**
     * Sets the value of the customerProfileAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddReqType }
     *     
     */
    public void setCustomerProfileAddReq(CustomerProfileAddReqType value) {
        this.customerProfileAddReq = value;
    }

}
