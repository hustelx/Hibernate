
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15.CustomerProfileContactInfoAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15}CustomerProfileContactInfoAddResp"/>
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
    "customerProfileContactInfoAddResp"
})
@XmlRootElement(name = "CustomerProfileContactInfoAddResponse")
public class CustomerProfileContactInfoAddResponse {

    @XmlElement(name = "CustomerProfileContactInfoAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15", required = true)
    protected CustomerProfileContactInfoAddRespType customerProfileContactInfoAddResp;

    /**
     * Gets the value of the customerProfileContactInfoAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoAddRespType }
     *     
     */
    public CustomerProfileContactInfoAddRespType getCustomerProfileContactInfoAddResp() {
        return customerProfileContactInfoAddResp;
    }

    /**
     * Sets the value of the customerProfileContactInfoAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoAddRespType }
     *     
     */
    public void setCustomerProfileContactInfoAddResp(CustomerProfileContactInfoAddRespType value) {
        this.customerProfileContactInfoAddResp = value;
    }

}
