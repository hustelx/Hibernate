
package com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerSuspiciousAcctAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSuspiciousAcctAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15}CustomerSuspiciousAcctAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctAddRespType", propOrder = {
    "customerSuspiciousAcctAddResult"
})
public class CustomerSuspiciousAcctAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerSuspiciousAcctAddResult")
    protected CustomerSuspiciousAcctAddResultType customerSuspiciousAcctAddResult;

    /**
     * Gets the value of the customerSuspiciousAcctAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctAddResultType }
     *     
     */
    public CustomerSuspiciousAcctAddResultType getCustomerSuspiciousAcctAddResult() {
        return customerSuspiciousAcctAddResult;
    }

    /**
     * Sets the value of the customerSuspiciousAcctAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctAddResultType }
     *     
     */
    public void setCustomerSuspiciousAcctAddResult(CustomerSuspiciousAcctAddResultType value) {
        this.customerSuspiciousAcctAddResult = value;
    }

}
