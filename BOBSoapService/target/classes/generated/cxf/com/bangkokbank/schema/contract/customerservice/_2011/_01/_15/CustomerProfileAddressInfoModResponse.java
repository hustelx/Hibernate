
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15.CustomerProfileAddressInfoModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15}CustomerProfileAddressInfoModResp"/>
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
    "customerProfileAddressInfoModResp"
})
@XmlRootElement(name = "CustomerProfileAddressInfoModResponse")
public class CustomerProfileAddressInfoModResponse {

    @XmlElement(name = "CustomerProfileAddressInfoModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15", required = true)
    protected CustomerProfileAddressInfoModRespType customerProfileAddressInfoModResp;

    /**
     * Gets the value of the customerProfileAddressInfoModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoModRespType }
     *     
     */
    public CustomerProfileAddressInfoModRespType getCustomerProfileAddressInfoModResp() {
        return customerProfileAddressInfoModResp;
    }

    /**
     * Sets the value of the customerProfileAddressInfoModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoModRespType }
     *     
     */
    public void setCustomerProfileAddressInfoModResp(CustomerProfileAddressInfoModRespType value) {
        this.customerProfileAddressInfoModResp = value;
    }

}
