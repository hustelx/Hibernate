
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15.CustomerProfileAddressInfoInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15}CustomerProfileAddressInfoInqResp"/>
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
    "customerProfileAddressInfoInqResp"
})
@XmlRootElement(name = "CustomerProfileAddressInfoInqResponse")
public class CustomerProfileAddressInfoInqResponse {

    @XmlElement(name = "CustomerProfileAddressInfoInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15", required = true)
    protected CustomerProfileAddressInfoInqRespType customerProfileAddressInfoInqResp;

    /**
     * Gets the value of the customerProfileAddressInfoInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoInqRespType }
     *     
     */
    public CustomerProfileAddressInfoInqRespType getCustomerProfileAddressInfoInqResp() {
        return customerProfileAddressInfoInqResp;
    }

    /**
     * Sets the value of the customerProfileAddressInfoInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoInqRespType }
     *     
     */
    public void setCustomerProfileAddressInfoInqResp(CustomerProfileAddressInfoInqRespType value) {
        this.customerProfileAddressInfoInqResp = value;
    }

}
