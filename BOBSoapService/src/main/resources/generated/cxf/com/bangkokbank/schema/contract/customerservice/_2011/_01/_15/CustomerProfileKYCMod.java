
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15.CustomerProfileKYCModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15}CustomerProfileKYCModReq"/>
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
    "customerProfileKYCModReq"
})
@XmlRootElement(name = "CustomerProfileKYCMod")
public class CustomerProfileKYCMod {

    @XmlElement(name = "CustomerProfileKYCModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", required = true)
    protected CustomerProfileKYCModReqType customerProfileKYCModReq;

    /**
     * Gets the value of the customerProfileKYCModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileKYCModReqType }
     *     
     */
    public CustomerProfileKYCModReqType getCustomerProfileKYCModReq() {
        return customerProfileKYCModReq;
    }

    /**
     * Sets the value of the customerProfileKYCModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileKYCModReqType }
     *     
     */
    public void setCustomerProfileKYCModReq(CustomerProfileKYCModReqType value) {
        this.customerProfileKYCModReq = value;
    }

}
