
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15.CustomerRelatedPartiesKYCModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15}CustomerRelatedPartiesKYCModReq"/>
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
    "customerRelatedPartiesKYCModReq"
})
@XmlRootElement(name = "CustomerRelatedPartiesKYCMod")
public class CustomerRelatedPartiesKYCMod {

    @XmlElement(name = "CustomerRelatedPartiesKYCModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", required = true)
    protected CustomerRelatedPartiesKYCModReqType customerRelatedPartiesKYCModReq;

    /**
     * Gets the value of the customerRelatedPartiesKYCModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesKYCModReqType }
     *     
     */
    public CustomerRelatedPartiesKYCModReqType getCustomerRelatedPartiesKYCModReq() {
        return customerRelatedPartiesKYCModReq;
    }

    /**
     * Sets the value of the customerRelatedPartiesKYCModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesKYCModReqType }
     *     
     */
    public void setCustomerRelatedPartiesKYCModReq(CustomerRelatedPartiesKYCModReqType value) {
        this.customerRelatedPartiesKYCModReq = value;
    }

}
