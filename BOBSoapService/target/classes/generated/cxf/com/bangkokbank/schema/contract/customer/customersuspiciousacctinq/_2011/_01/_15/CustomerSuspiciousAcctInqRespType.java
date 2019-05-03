
package com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerSuspiciousAcctInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSuspiciousAcctInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15}CustomerSuspiciousAcctInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctInqRespType", propOrder = {
    "customerSuspiciousAcctInqResult"
})
public class CustomerSuspiciousAcctInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerSuspiciousAcctInqResult")
    protected CustomerSuspiciousAcctInqResultType customerSuspiciousAcctInqResult;

    /**
     * Gets the value of the customerSuspiciousAcctInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctInqResultType }
     *     
     */
    public CustomerSuspiciousAcctInqResultType getCustomerSuspiciousAcctInqResult() {
        return customerSuspiciousAcctInqResult;
    }

    /**
     * Sets the value of the customerSuspiciousAcctInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctInqResultType }
     *     
     */
    public void setCustomerSuspiciousAcctInqResult(CustomerSuspiciousAcctInqResultType value) {
        this.customerSuspiciousAcctInqResult = value;
    }

}
