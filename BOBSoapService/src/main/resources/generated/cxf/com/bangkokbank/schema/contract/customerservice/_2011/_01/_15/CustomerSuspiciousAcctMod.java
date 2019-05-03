
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15.CustomerSuspiciousAcctModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15}CustomerSuspiciousAcctModReq"/>
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
    "customerSuspiciousAcctModReq"
})
@XmlRootElement(name = "CustomerSuspiciousAcctMod")
public class CustomerSuspiciousAcctMod {

    @XmlElement(name = "CustomerSuspiciousAcctModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15", required = true)
    protected CustomerSuspiciousAcctModReqType customerSuspiciousAcctModReq;

    /**
     * Gets the value of the customerSuspiciousAcctModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctModReqType }
     *     
     */
    public CustomerSuspiciousAcctModReqType getCustomerSuspiciousAcctModReq() {
        return customerSuspiciousAcctModReq;
    }

    /**
     * Sets the value of the customerSuspiciousAcctModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctModReqType }
     *     
     */
    public void setCustomerSuspiciousAcctModReq(CustomerSuspiciousAcctModReqType value) {
        this.customerSuspiciousAcctModReq = value;
    }

}
