
package com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15}CustomerProfileModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileModRespType", propOrder = {
    "customerProfileModResult"
})
public class CustomerProfileModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileModResult")
    protected CustomerProfileModResultType customerProfileModResult;

    /**
     * Gets the value of the customerProfileModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileModResultType }
     *     
     */
    public CustomerProfileModResultType getCustomerProfileModResult() {
        return customerProfileModResult;
    }

    /**
     * Sets the value of the customerProfileModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileModResultType }
     *     
     */
    public void setCustomerProfileModResult(CustomerProfileModResultType value) {
        this.customerProfileModResult = value;
    }

}
