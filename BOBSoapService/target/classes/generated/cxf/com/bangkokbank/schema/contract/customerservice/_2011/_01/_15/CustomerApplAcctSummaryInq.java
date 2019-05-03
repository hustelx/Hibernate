
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15.CustomerApplAcctSummaryInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}CustomerApplAcctSummaryInqReq"/>
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
    "customerApplAcctSummaryInqReq"
})
@XmlRootElement(name = "CustomerApplAcctSummaryInq")
public class CustomerApplAcctSummaryInq {

    @XmlElement(name = "CustomerApplAcctSummaryInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", required = true)
    protected CustomerApplAcctSummaryInqReqType customerApplAcctSummaryInqReq;

    /**
     * Gets the value of the customerApplAcctSummaryInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerApplAcctSummaryInqReqType }
     *     
     */
    public CustomerApplAcctSummaryInqReqType getCustomerApplAcctSummaryInqReq() {
        return customerApplAcctSummaryInqReq;
    }

    /**
     * Sets the value of the customerApplAcctSummaryInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerApplAcctSummaryInqReqType }
     *     
     */
    public void setCustomerApplAcctSummaryInqReq(CustomerApplAcctSummaryInqReqType value) {
        this.customerApplAcctSummaryInqReq = value;
    }

}
