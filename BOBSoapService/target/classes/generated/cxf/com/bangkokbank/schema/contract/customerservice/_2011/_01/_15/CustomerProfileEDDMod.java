
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15.CustomerProfileEDDModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15}CustomerProfileEDDModReq"/>
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
    "customerProfileEDDModReq"
})
@XmlRootElement(name = "CustomerProfileEDDMod")
public class CustomerProfileEDDMod {

    @XmlElement(name = "CustomerProfileEDDModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15", required = true)
    protected CustomerProfileEDDModReqType customerProfileEDDModReq;

    /**
     * Gets the value of the customerProfileEDDModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEDDModReqType }
     *     
     */
    public CustomerProfileEDDModReqType getCustomerProfileEDDModReq() {
        return customerProfileEDDModReq;
    }

    /**
     * Sets the value of the customerProfileEDDModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEDDModReqType }
     *     
     */
    public void setCustomerProfileEDDModReq(CustomerProfileEDDModReqType value) {
        this.customerProfileEDDModReq = value;
    }

}
