
package com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerSuspiciousAcctModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSuspiciousAcctModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15}CustomerSuspiciousAcctModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctModRespType", propOrder = {
    "customerSuspiciousAcctModResult"
})
public class CustomerSuspiciousAcctModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerSuspiciousAcctModResult")
    protected CustomerSuspiciousAcctModResultType customerSuspiciousAcctModResult;

    /**
     * Gets the value of the customerSuspiciousAcctModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctModResultType }
     *     
     */
    public CustomerSuspiciousAcctModResultType getCustomerSuspiciousAcctModResult() {
        return customerSuspiciousAcctModResult;
    }

    /**
     * Sets the value of the customerSuspiciousAcctModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctModResultType }
     *     
     */
    public void setCustomerSuspiciousAcctModResult(CustomerSuspiciousAcctModResultType value) {
        this.customerSuspiciousAcctModResult = value;
    }

}
