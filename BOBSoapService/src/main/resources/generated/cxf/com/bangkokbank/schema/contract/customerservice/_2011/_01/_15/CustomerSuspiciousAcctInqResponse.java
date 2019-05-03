
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15.CustomerSuspiciousAcctInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15}CustomerSuspiciousAcctInqResp"/>
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
    "customerSuspiciousAcctInqResp"
})
@XmlRootElement(name = "CustomerSuspiciousAcctInqResponse")
public class CustomerSuspiciousAcctInqResponse {

    @XmlElement(name = "CustomerSuspiciousAcctInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15", required = true)
    protected CustomerSuspiciousAcctInqRespType customerSuspiciousAcctInqResp;

    /**
     * Gets the value of the customerSuspiciousAcctInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctInqRespType }
     *     
     */
    public CustomerSuspiciousAcctInqRespType getCustomerSuspiciousAcctInqResp() {
        return customerSuspiciousAcctInqResp;
    }

    /**
     * Sets the value of the customerSuspiciousAcctInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctInqRespType }
     *     
     */
    public void setCustomerSuspiciousAcctInqResp(CustomerSuspiciousAcctInqRespType value) {
        this.customerSuspiciousAcctInqResp = value;
    }

}
