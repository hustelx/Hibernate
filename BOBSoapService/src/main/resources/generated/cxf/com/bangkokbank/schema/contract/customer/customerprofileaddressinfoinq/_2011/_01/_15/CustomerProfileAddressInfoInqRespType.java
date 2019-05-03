
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileAddressInfoInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddressInfoInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileAddressInfoInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15}CustomerProfileAddressInfoInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddressInfoInqRespType", propOrder = {
    "customerProfileAddressInfoInqResult"
})
public class CustomerProfileAddressInfoInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileAddressInfoInqResult")
    protected CustomerProfileAddressInfoInqResultType customerProfileAddressInfoInqResult;

    /**
     * Gets the value of the customerProfileAddressInfoInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoInqResultType }
     *     
     */
    public CustomerProfileAddressInfoInqResultType getCustomerProfileAddressInfoInqResult() {
        return customerProfileAddressInfoInqResult;
    }

    /**
     * Sets the value of the customerProfileAddressInfoInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoInqResultType }
     *     
     */
    public void setCustomerProfileAddressInfoInqResult(CustomerProfileAddressInfoInqResultType value) {
        this.customerProfileAddressInfoInqResult = value;
    }

}
