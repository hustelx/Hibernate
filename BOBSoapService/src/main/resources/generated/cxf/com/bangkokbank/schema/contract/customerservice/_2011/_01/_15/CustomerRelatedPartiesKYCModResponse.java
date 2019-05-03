
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15.CustomerRelatedPartiesKYCModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15}CustomerRelatedPartiesKYCModResp"/>
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
    "customerRelatedPartiesKYCModResp"
})
@XmlRootElement(name = "CustomerRelatedPartiesKYCModResponse")
public class CustomerRelatedPartiesKYCModResponse {

    @XmlElement(name = "CustomerRelatedPartiesKYCModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15", required = true)
    protected CustomerRelatedPartiesKYCModRespType customerRelatedPartiesKYCModResp;

    /**
     * Gets the value of the customerRelatedPartiesKYCModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesKYCModRespType }
     *     
     */
    public CustomerRelatedPartiesKYCModRespType getCustomerRelatedPartiesKYCModResp() {
        return customerRelatedPartiesKYCModResp;
    }

    /**
     * Sets the value of the customerRelatedPartiesKYCModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesKYCModRespType }
     *     
     */
    public void setCustomerRelatedPartiesKYCModResp(CustomerRelatedPartiesKYCModRespType value) {
        this.customerRelatedPartiesKYCModResp = value;
    }

}
