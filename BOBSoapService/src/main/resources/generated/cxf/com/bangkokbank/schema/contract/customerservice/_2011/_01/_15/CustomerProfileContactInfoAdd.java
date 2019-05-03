
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15.CustomerProfileContactInfoAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15}CustomerProfileContactInfoAddReq"/>
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
    "customerProfileContactInfoAddReq"
})
@XmlRootElement(name = "CustomerProfileContactInfoAdd")
public class CustomerProfileContactInfoAdd {

    @XmlElement(name = "CustomerProfileContactInfoAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", required = true)
    protected CustomerProfileContactInfoAddReqType customerProfileContactInfoAddReq;

    /**
     * Gets the value of the customerProfileContactInfoAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoAddReqType }
     *     
     */
    public CustomerProfileContactInfoAddReqType getCustomerProfileContactInfoAddReq() {
        return customerProfileContactInfoAddReq;
    }

    /**
     * Sets the value of the customerProfileContactInfoAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoAddReqType }
     *     
     */
    public void setCustomerProfileContactInfoAddReq(CustomerProfileContactInfoAddReqType value) {
        this.customerProfileContactInfoAddReq = value;
    }

}
