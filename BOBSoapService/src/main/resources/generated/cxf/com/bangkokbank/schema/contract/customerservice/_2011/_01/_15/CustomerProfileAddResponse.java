
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15.CustomerProfileAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15}CustomerProfileAddResp"/>
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
    "customerProfileAddResp"
})
@XmlRootElement(name = "CustomerProfileAddResponse")
public class CustomerProfileAddResponse {

    @XmlElement(name = "CustomerProfileAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15", required = true)
    protected CustomerProfileAddRespType customerProfileAddResp;

    /**
     * Gets the value of the customerProfileAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddRespType }
     *     
     */
    public CustomerProfileAddRespType getCustomerProfileAddResp() {
        return customerProfileAddResp;
    }

    /**
     * Sets the value of the customerProfileAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddRespType }
     *     
     */
    public void setCustomerProfileAddResp(CustomerProfileAddRespType value) {
        this.customerProfileAddResp = value;
    }

}
