
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15.CustomerSuspiciousAcctDelRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15}CustomerSuspiciousAcctDelResp"/>
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
    "customerSuspiciousAcctDelResp"
})
@XmlRootElement(name = "CustomerSuspiciousAcctDelResponse")
public class CustomerSuspiciousAcctDelResponse {

    @XmlElement(name = "CustomerSuspiciousAcctDelResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15", required = true)
    protected CustomerSuspiciousAcctDelRespType customerSuspiciousAcctDelResp;

    /**
     * Gets the value of the customerSuspiciousAcctDelResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctDelRespType }
     *     
     */
    public CustomerSuspiciousAcctDelRespType getCustomerSuspiciousAcctDelResp() {
        return customerSuspiciousAcctDelResp;
    }

    /**
     * Sets the value of the customerSuspiciousAcctDelResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctDelRespType }
     *     
     */
    public void setCustomerSuspiciousAcctDelResp(CustomerSuspiciousAcctDelRespType value) {
        this.customerSuspiciousAcctDelResp = value;
    }

}
