
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15.CustomerSuspiciousAcctAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15}CustomerSuspiciousAcctAddResp"/>
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
    "customerSuspiciousAcctAddResp"
})
@XmlRootElement(name = "CustomerSuspiciousAcctAddResponse")
public class CustomerSuspiciousAcctAddResponse {

    @XmlElement(name = "CustomerSuspiciousAcctAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", required = true)
    protected CustomerSuspiciousAcctAddRespType customerSuspiciousAcctAddResp;

    /**
     * Gets the value of the customerSuspiciousAcctAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctAddRespType }
     *     
     */
    public CustomerSuspiciousAcctAddRespType getCustomerSuspiciousAcctAddResp() {
        return customerSuspiciousAcctAddResp;
    }

    /**
     * Sets the value of the customerSuspiciousAcctAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctAddRespType }
     *     
     */
    public void setCustomerSuspiciousAcctAddResp(CustomerSuspiciousAcctAddRespType value) {
        this.customerSuspiciousAcctAddResp = value;
    }

}
