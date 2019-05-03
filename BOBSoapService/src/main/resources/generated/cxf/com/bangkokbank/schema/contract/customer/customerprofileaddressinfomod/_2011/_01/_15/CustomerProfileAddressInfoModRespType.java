
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileAddressInfoModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddressInfoModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileAddressInfoModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15}CustomerProfileAddressInfoModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddressInfoModRespType", propOrder = {
    "customerProfileAddressInfoModResult"
})
public class CustomerProfileAddressInfoModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileAddressInfoModResult")
    protected CustomerProfileAddressInfoModResultType customerProfileAddressInfoModResult;

    /**
     * Gets the value of the customerProfileAddressInfoModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoModResultType }
     *     
     */
    public CustomerProfileAddressInfoModResultType getCustomerProfileAddressInfoModResult() {
        return customerProfileAddressInfoModResult;
    }

    /**
     * Sets the value of the customerProfileAddressInfoModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoModResultType }
     *     
     */
    public void setCustomerProfileAddressInfoModResult(CustomerProfileAddressInfoModResultType value) {
        this.customerProfileAddressInfoModResult = value;
    }

}
