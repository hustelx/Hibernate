
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15.CustomerProfileRelAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15}CustomerProfileRelAddReq"/>
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
    "customerProfileRelAddReq"
})
@XmlRootElement(name = "CustomerProfileRelAdd")
public class CustomerProfileRelAdd {

    @XmlElement(name = "CustomerProfileRelAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15", required = true)
    protected CustomerProfileRelAddReqType customerProfileRelAddReq;

    /**
     * Gets the value of the customerProfileRelAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileRelAddReqType }
     *     
     */
    public CustomerProfileRelAddReqType getCustomerProfileRelAddReq() {
        return customerProfileRelAddReq;
    }

    /**
     * Sets the value of the customerProfileRelAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileRelAddReqType }
     *     
     */
    public void setCustomerProfileRelAddReq(CustomerProfileRelAddReqType value) {
        this.customerProfileRelAddReq = value;
    }

}
