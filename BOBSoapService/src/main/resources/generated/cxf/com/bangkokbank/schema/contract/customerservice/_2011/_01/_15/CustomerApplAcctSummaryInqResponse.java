
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15.CustomerApplAcctSummaryInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}CustomerApplAcctSummaryInqResp"/>
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
    "customerApplAcctSummaryInqResp"
})
@XmlRootElement(name = "CustomerApplAcctSummaryInqResponse")
public class CustomerApplAcctSummaryInqResponse {

    @XmlElement(name = "CustomerApplAcctSummaryInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15", required = true)
    protected CustomerApplAcctSummaryInqRespType customerApplAcctSummaryInqResp;

    /**
     * Gets the value of the customerApplAcctSummaryInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerApplAcctSummaryInqRespType }
     *     
     */
    public CustomerApplAcctSummaryInqRespType getCustomerApplAcctSummaryInqResp() {
        return customerApplAcctSummaryInqResp;
    }

    /**
     * Sets the value of the customerApplAcctSummaryInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerApplAcctSummaryInqRespType }
     *     
     */
    public void setCustomerApplAcctSummaryInqResp(CustomerApplAcctSummaryInqRespType value) {
        this.customerApplAcctSummaryInqResp = value;
    }

}
