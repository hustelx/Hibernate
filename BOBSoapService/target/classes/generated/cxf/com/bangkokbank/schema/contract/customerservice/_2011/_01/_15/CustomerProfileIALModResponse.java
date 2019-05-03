
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15.CustomerProfileIALModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15}CustomerProfileIALModResp"/>
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
    "customerProfileIALModResp"
})
@XmlRootElement(name = "CustomerProfileIALModResponse")
public class CustomerProfileIALModResponse {

    @XmlElement(name = "CustomerProfileIALModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15", required = true)
    protected CustomerProfileIALModRespType customerProfileIALModResp;

    /**
     * Gets the value of the customerProfileIALModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileIALModRespType }
     *     
     */
    public CustomerProfileIALModRespType getCustomerProfileIALModResp() {
        return customerProfileIALModResp;
    }

    /**
     * Sets the value of the customerProfileIALModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileIALModRespType }
     *     
     */
    public void setCustomerProfileIALModResp(CustomerProfileIALModRespType value) {
        this.customerProfileIALModResp = value;
    }

}
