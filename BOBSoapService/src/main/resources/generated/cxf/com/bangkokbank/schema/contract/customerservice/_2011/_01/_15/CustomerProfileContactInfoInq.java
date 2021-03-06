
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15.CustomerProfileContactInfoInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15}CustomerProfileContactInfoInqReq"/>
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
    "customerProfileContactInfoInqReq"
})
@XmlRootElement(name = "CustomerProfileContactInfoInq")
public class CustomerProfileContactInfoInq {

    @XmlElement(name = "CustomerProfileContactInfoInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", required = true)
    protected CustomerProfileContactInfoInqReqType customerProfileContactInfoInqReq;

    /**
     * Gets the value of the customerProfileContactInfoInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoInqReqType }
     *     
     */
    public CustomerProfileContactInfoInqReqType getCustomerProfileContactInfoInqReq() {
        return customerProfileContactInfoInqReq;
    }

    /**
     * Sets the value of the customerProfileContactInfoInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoInqReqType }
     *     
     */
    public void setCustomerProfileContactInfoInqReq(CustomerProfileContactInfoInqReqType value) {
        this.customerProfileContactInfoInqReq = value;
    }

}
