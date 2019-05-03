
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15.CustomerRelatedPartiesAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15}CustomerRelatedPartiesAddReq"/>
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
    "customerRelatedPartiesAddReq"
})
@XmlRootElement(name = "CustomerRelatedPartiesAdd")
public class CustomerRelatedPartiesAdd {

    @XmlElement(name = "CustomerRelatedPartiesAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", required = true)
    protected CustomerRelatedPartiesAddReqType customerRelatedPartiesAddReq;

    /**
     * Gets the value of the customerRelatedPartiesAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesAddReqType }
     *     
     */
    public CustomerRelatedPartiesAddReqType getCustomerRelatedPartiesAddReq() {
        return customerRelatedPartiesAddReq;
    }

    /**
     * Sets the value of the customerRelatedPartiesAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesAddReqType }
     *     
     */
    public void setCustomerRelatedPartiesAddReq(CustomerRelatedPartiesAddReqType value) {
        this.customerRelatedPartiesAddReq = value;
    }

}
