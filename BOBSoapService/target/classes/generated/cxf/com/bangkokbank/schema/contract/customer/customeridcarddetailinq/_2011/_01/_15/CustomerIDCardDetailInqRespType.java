
package com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerIDCardDetailInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIDCardDetailInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIDCardDetailInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15}CustomerIDCardDetailInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIDCardDetailInqRespType", propOrder = {
    "customerIDCardDetailInqResult"
})
public class CustomerIDCardDetailInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerIDCardDetailInqResult")
    protected CustomerIDCardDetailInqResultType customerIDCardDetailInqResult;

    /**
     * Gets the value of the customerIDCardDetailInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIDCardDetailInqResultType }
     *     
     */
    public CustomerIDCardDetailInqResultType getCustomerIDCardDetailInqResult() {
        return customerIDCardDetailInqResult;
    }

    /**
     * Sets the value of the customerIDCardDetailInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIDCardDetailInqResultType }
     *     
     */
    public void setCustomerIDCardDetailInqResult(CustomerIDCardDetailInqResultType value) {
        this.customerIDCardDetailInqResult = value;
    }

}
