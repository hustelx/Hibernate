
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15.CustomerProfileKYCModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15}CustomerProfileKYCModResp"/>
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
    "customerProfileKYCModResp"
})
@XmlRootElement(name = "CustomerProfileKYCModResponse")
public class CustomerProfileKYCModResponse {

    @XmlElement(name = "CustomerProfileKYCModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15", required = true)
    protected CustomerProfileKYCModRespType customerProfileKYCModResp;

    /**
     * Gets the value of the customerProfileKYCModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileKYCModRespType }
     *     
     */
    public CustomerProfileKYCModRespType getCustomerProfileKYCModResp() {
        return customerProfileKYCModResp;
    }

    /**
     * Sets the value of the customerProfileKYCModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileKYCModRespType }
     *     
     */
    public void setCustomerProfileKYCModResp(CustomerProfileKYCModRespType value) {
        this.customerProfileKYCModResp = value;
    }

}
