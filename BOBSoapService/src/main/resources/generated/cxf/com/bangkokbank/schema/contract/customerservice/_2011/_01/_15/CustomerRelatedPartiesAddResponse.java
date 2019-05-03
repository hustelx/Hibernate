
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15.CustomerRelatedPartiesAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15}CustomerRelatedPartiesAddResp"/>
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
    "customerRelatedPartiesAddResp"
})
@XmlRootElement(name = "CustomerRelatedPartiesAddResponse")
public class CustomerRelatedPartiesAddResponse {

    @XmlElement(name = "CustomerRelatedPartiesAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15", required = true)
    protected CustomerRelatedPartiesAddRespType customerRelatedPartiesAddResp;

    /**
     * Gets the value of the customerRelatedPartiesAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesAddRespType }
     *     
     */
    public CustomerRelatedPartiesAddRespType getCustomerRelatedPartiesAddResp() {
        return customerRelatedPartiesAddResp;
    }

    /**
     * Sets the value of the customerRelatedPartiesAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesAddRespType }
     *     
     */
    public void setCustomerRelatedPartiesAddResp(CustomerRelatedPartiesAddRespType value) {
        this.customerRelatedPartiesAddResp = value;
    }

}
