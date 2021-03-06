
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15.CustomerProfileRelDelReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15}CustomerProfileRelDelReq"/>
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
    "customerProfileRelDelReq"
})
@XmlRootElement(name = "CustomerProfileRelDel")
public class CustomerProfileRelDel {

    @XmlElement(name = "CustomerProfileRelDelReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15", required = true)
    protected CustomerProfileRelDelReqType customerProfileRelDelReq;

    /**
     * Gets the value of the customerProfileRelDelReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileRelDelReqType }
     *     
     */
    public CustomerProfileRelDelReqType getCustomerProfileRelDelReq() {
        return customerProfileRelDelReq;
    }

    /**
     * Sets the value of the customerProfileRelDelReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileRelDelReqType }
     *     
     */
    public void setCustomerProfileRelDelReq(CustomerProfileRelDelReqType value) {
        this.customerProfileRelDelReq = value;
    }

}
