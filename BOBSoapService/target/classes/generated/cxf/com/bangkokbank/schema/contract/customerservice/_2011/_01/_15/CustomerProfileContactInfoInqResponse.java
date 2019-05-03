
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15.CustomerProfileContactInfoInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15}CustomerProfileContactInfoInqResp"/>
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
    "customerProfileContactInfoInqResp"
})
@XmlRootElement(name = "CustomerProfileContactInfoInqResponse")
public class CustomerProfileContactInfoInqResponse {

    @XmlElement(name = "CustomerProfileContactInfoInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15", required = true)
    protected CustomerProfileContactInfoInqRespType customerProfileContactInfoInqResp;

    /**
     * Gets the value of the customerProfileContactInfoInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoInqRespType }
     *     
     */
    public CustomerProfileContactInfoInqRespType getCustomerProfileContactInfoInqResp() {
        return customerProfileContactInfoInqResp;
    }

    /**
     * Sets the value of the customerProfileContactInfoInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoInqRespType }
     *     
     */
    public void setCustomerProfileContactInfoInqResp(CustomerProfileContactInfoInqRespType value) {
        this.customerProfileContactInfoInqResp = value;
    }

}
