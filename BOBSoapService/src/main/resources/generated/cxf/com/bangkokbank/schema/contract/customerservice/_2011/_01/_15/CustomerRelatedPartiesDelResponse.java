
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesdel._2011._01._15.CustomerRelatedPartiesDelRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15}CustomerRelatedPartiesDelResp"/>
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
    "customerRelatedPartiesDelResp"
})
@XmlRootElement(name = "CustomerRelatedPartiesDelResponse")
public class CustomerRelatedPartiesDelResponse {

    @XmlElement(name = "CustomerRelatedPartiesDelResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15", required = true)
    protected CustomerRelatedPartiesDelRespType customerRelatedPartiesDelResp;

    /**
     * Gets the value of the customerRelatedPartiesDelResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesDelRespType }
     *     
     */
    public CustomerRelatedPartiesDelRespType getCustomerRelatedPartiesDelResp() {
        return customerRelatedPartiesDelResp;
    }

    /**
     * Sets the value of the customerRelatedPartiesDelResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesDelRespType }
     *     
     */
    public void setCustomerRelatedPartiesDelResp(CustomerRelatedPartiesDelRespType value) {
        this.customerRelatedPartiesDelResp = value;
    }

}
