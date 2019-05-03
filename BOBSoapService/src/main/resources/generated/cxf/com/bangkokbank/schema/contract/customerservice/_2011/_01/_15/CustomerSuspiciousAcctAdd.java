
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15.CustomerSuspiciousAcctAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15}CustomerSuspiciousAcctAddReq"/>
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
    "customerSuspiciousAcctAddReq"
})
@XmlRootElement(name = "CustomerSuspiciousAcctAdd")
public class CustomerSuspiciousAcctAdd {

    @XmlElement(name = "CustomerSuspiciousAcctAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15", required = true)
    protected CustomerSuspiciousAcctAddReqType customerSuspiciousAcctAddReq;

    /**
     * Gets the value of the customerSuspiciousAcctAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctAddReqType }
     *     
     */
    public CustomerSuspiciousAcctAddReqType getCustomerSuspiciousAcctAddReq() {
        return customerSuspiciousAcctAddReq;
    }

    /**
     * Sets the value of the customerSuspiciousAcctAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctAddReqType }
     *     
     */
    public void setCustomerSuspiciousAcctAddReq(CustomerSuspiciousAcctAddReqType value) {
        this.customerSuspiciousAcctAddReq = value;
    }

}
