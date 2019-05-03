
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileAddressInfoAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddressInfoAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileAddressInfoAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15}CustomerProfileAddressInfoAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddressInfoAddRespType", propOrder = {
    "customerProfileAddressInfoAddResult"
})
public class CustomerProfileAddressInfoAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileAddressInfoAddResult")
    protected CustomerProfileAddressInfoAddResultType customerProfileAddressInfoAddResult;

    /**
     * Gets the value of the customerProfileAddressInfoAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddressInfoAddResultType }
     *     
     */
    public CustomerProfileAddressInfoAddResultType getCustomerProfileAddressInfoAddResult() {
        return customerProfileAddressInfoAddResult;
    }

    /**
     * Sets the value of the customerProfileAddressInfoAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddressInfoAddResultType }
     *     
     */
    public void setCustomerProfileAddressInfoAddResult(CustomerProfileAddressInfoAddResultType value) {
        this.customerProfileAddressInfoAddResult = value;
    }

}
