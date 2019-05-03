
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesdel._2011._01._15.CustomerRelatedPartiesDelReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15}CustomerRelatedPartiesDelReq"/>
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
    "customerRelatedPartiesDelReq"
})
@XmlRootElement(name = "CustomerRelatedPartiesDel")
public class CustomerRelatedPartiesDel {

    @XmlElement(name = "CustomerRelatedPartiesDelReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15", required = true)
    protected CustomerRelatedPartiesDelReqType customerRelatedPartiesDelReq;

    /**
     * Gets the value of the customerRelatedPartiesDelReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesDelReqType }
     *     
     */
    public CustomerRelatedPartiesDelReqType getCustomerRelatedPartiesDelReq() {
        return customerRelatedPartiesDelReq;
    }

    /**
     * Sets the value of the customerRelatedPartiesDelReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesDelReqType }
     *     
     */
    public void setCustomerRelatedPartiesDelReq(CustomerRelatedPartiesDelReqType value) {
        this.customerRelatedPartiesDelReq = value;
    }

}
