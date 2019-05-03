
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15.CustomerProfileContactInfoModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15}CustomerProfileContactInfoModResp"/>
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
    "customerProfileContactInfoModResp"
})
@XmlRootElement(name = "CustomerProfileContactInfoModResponse")
public class CustomerProfileContactInfoModResponse {

    @XmlElement(name = "CustomerProfileContactInfoModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", required = true)
    protected CustomerProfileContactInfoModRespType customerProfileContactInfoModResp;

    /**
     * Gets the value of the customerProfileContactInfoModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoModRespType }
     *     
     */
    public CustomerProfileContactInfoModRespType getCustomerProfileContactInfoModResp() {
        return customerProfileContactInfoModResp;
    }

    /**
     * Sets the value of the customerProfileContactInfoModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoModRespType }
     *     
     */
    public void setCustomerProfileContactInfoModResp(CustomerProfileContactInfoModRespType value) {
        this.customerProfileContactInfoModResp = value;
    }

}
