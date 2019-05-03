
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15.CustomerSuspiciousAcctModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15}CustomerSuspiciousAcctModResp"/>
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
    "customerSuspiciousAcctModResp"
})
@XmlRootElement(name = "CustomerSuspiciousAcctModResponse")
public class CustomerSuspiciousAcctModResponse {

    @XmlElement(name = "CustomerSuspiciousAcctModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", required = true)
    protected CustomerSuspiciousAcctModRespType customerSuspiciousAcctModResp;

    /**
     * Gets the value of the customerSuspiciousAcctModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctModRespType }
     *     
     */
    public CustomerSuspiciousAcctModRespType getCustomerSuspiciousAcctModResp() {
        return customerSuspiciousAcctModResp;
    }

    /**
     * Sets the value of the customerSuspiciousAcctModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctModRespType }
     *     
     */
    public void setCustomerSuspiciousAcctModResp(CustomerSuspiciousAcctModRespType value) {
        this.customerSuspiciousAcctModResp = value;
    }

}
