
package com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerSuspiciousAcctDelRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctDelRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSuspiciousAcctDelResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15}CustomerSuspiciousAcctDelResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctDelRespType", propOrder = {
    "customerSuspiciousAcctDelResult"
})
public class CustomerSuspiciousAcctDelRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerSuspiciousAcctDelResult")
    protected CustomerSuspiciousAcctDelResultType customerSuspiciousAcctDelResult;

    /**
     * Gets the value of the customerSuspiciousAcctDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSuspiciousAcctDelResultType }
     *     
     */
    public CustomerSuspiciousAcctDelResultType getCustomerSuspiciousAcctDelResult() {
        return customerSuspiciousAcctDelResult;
    }

    /**
     * Sets the value of the customerSuspiciousAcctDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSuspiciousAcctDelResultType }
     *     
     */
    public void setCustomerSuspiciousAcctDelResult(CustomerSuspiciousAcctDelResultType value) {
        this.customerSuspiciousAcctDelResult = value;
    }

}
