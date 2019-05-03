
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15.CustomerProfileContactInfoModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15}CustomerProfileContactInfoModReq"/>
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
    "customerProfileContactInfoModReq"
})
@XmlRootElement(name = "CustomerProfileContactInfoMod")
public class CustomerProfileContactInfoMod {

    @XmlElement(name = "CustomerProfileContactInfoModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15", required = true)
    protected CustomerProfileContactInfoModReqType customerProfileContactInfoModReq;

    /**
     * Gets the value of the customerProfileContactInfoModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoModReqType }
     *     
     */
    public CustomerProfileContactInfoModReqType getCustomerProfileContactInfoModReq() {
        return customerProfileContactInfoModReq;
    }

    /**
     * Sets the value of the customerProfileContactInfoModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoModReqType }
     *     
     */
    public void setCustomerProfileContactInfoModReq(CustomerProfileContactInfoModReqType value) {
        this.customerProfileContactInfoModReq = value;
    }

}
