
package com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileIALModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileIALModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileIALModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15}CustomerProfileIALModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileIALModRespType", propOrder = {
    "customerProfileIALModResult"
})
public class CustomerProfileIALModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileIALModResult")
    protected CustomerProfileIALModResultType customerProfileIALModResult;

    /**
     * Gets the value of the customerProfileIALModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileIALModResultType }
     *     
     */
    public CustomerProfileIALModResultType getCustomerProfileIALModResult() {
        return customerProfileIALModResult;
    }

    /**
     * Sets the value of the customerProfileIALModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileIALModResultType }
     *     
     */
    public void setCustomerProfileIALModResult(CustomerProfileIALModResultType value) {
        this.customerProfileIALModResult = value;
    }

}
