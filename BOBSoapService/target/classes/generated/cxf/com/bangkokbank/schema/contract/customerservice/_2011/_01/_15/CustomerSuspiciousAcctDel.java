
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15.CustomerSuspiciousAcctDelReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15}CustomerSuspiciousAcctDelReq"/>
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
    "customerSuspiciousAcctDelReq"
})
@XmlRootElement(name = "CustomerSuspiciousAcctDel")
public class CustomerSuspiciousAcctDel {

    @XmlElement(name = "CustomerSuspiciousAcctDelReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", required = true)
    protected CustomerSuspiciousAcctDelReqType customerSuspiciousAcctDelReq;

    /**
     * Gets the value of the customerSuspiciousAcctDelReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctDelReqType }
     *     
     */
    public CustomerSuspiciousAcctDelReqType getCustomerSuspiciousAcctDelReq() {
        return customerSuspiciousAcctDelReq;
    }

    /**
     * Sets the value of the customerSuspiciousAcctDelReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctDelReqType }
     *     
     */
    public void setCustomerSuspiciousAcctDelReq(CustomerSuspiciousAcctDelReqType value) {
        this.customerSuspiciousAcctDelReq = value;
    }

}
