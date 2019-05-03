
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileContactInfoModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileContactInfoModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15}CustomerProfileContactInfoModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoModRespType", propOrder = {
    "customerProfileContactInfoModResult"
})
public class CustomerProfileContactInfoModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileContactInfoModResult")
    protected CustomerProfileContactInfoModResultType customerProfileContactInfoModResult;

    /**
     * Gets the value of the customerProfileContactInfoModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoModResultType }
     *     
     */
    public CustomerProfileContactInfoModResultType getCustomerProfileContactInfoModResult() {
        return customerProfileContactInfoModResult;
    }

    /**
     * Sets the value of the customerProfileContactInfoModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoModResultType }
     *     
     */
    public void setCustomerProfileContactInfoModResult(CustomerProfileContactInfoModResultType value) {
        this.customerProfileContactInfoModResult = value;
    }

}
