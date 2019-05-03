
package com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerApplAcctSummaryInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerApplAcctSummaryInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerApplAcctSummaryInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}CustomerApplAcctSummaryInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerApplAcctSummaryInqRespType", propOrder = {
    "customerApplAcctSummaryInqResult"
})
public class CustomerApplAcctSummaryInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerApplAcctSummaryInqResult")
    protected CustomerApplAcctSummaryInqResultType customerApplAcctSummaryInqResult;

    /**
     * Gets the value of the customerApplAcctSummaryInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerApplAcctSummaryInqResultType }
     *     
     */
    public CustomerApplAcctSummaryInqResultType getCustomerApplAcctSummaryInqResult() {
        return customerApplAcctSummaryInqResult;
    }

    /**
     * Sets the value of the customerApplAcctSummaryInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerApplAcctSummaryInqResultType }
     *     
     */
    public void setCustomerApplAcctSummaryInqResult(CustomerApplAcctSummaryInqResultType value) {
        this.customerApplAcctSummaryInqResult = value;
    }

}
