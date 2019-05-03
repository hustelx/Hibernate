
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15.CustomerRelatedPartiesModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15}CustomerRelatedPartiesModReq"/>
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
    "customerRelatedPartiesModReq"
})
@XmlRootElement(name = "CustomerRelatedPartiesMod")
public class CustomerRelatedPartiesMod {

    @XmlElement(name = "CustomerRelatedPartiesModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15", required = true)
    protected CustomerRelatedPartiesModReqType customerRelatedPartiesModReq;

    /**
     * Gets the value of the customerRelatedPartiesModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesModReqType }
     *     
     */
    public CustomerRelatedPartiesModReqType getCustomerRelatedPartiesModReq() {
        return customerRelatedPartiesModReq;
    }

    /**
     * Sets the value of the customerRelatedPartiesModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesModReqType }
     *     
     */
    public void setCustomerRelatedPartiesModReq(CustomerRelatedPartiesModReqType value) {
        this.customerRelatedPartiesModReq = value;
    }

}
