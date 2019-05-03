
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileContactInfoInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileContactInfoInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15}CustomerProfileContactInfoInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoInqRespType", propOrder = {
    "customerProfileContactInfoInqResult"
})
public class CustomerProfileContactInfoInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileContactInfoInqResult")
    protected CustomerProfileContactInfoInqResultType customerProfileContactInfoInqResult;

    /**
     * Gets the value of the customerProfileContactInfoInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoInqResultType }
     *     
     */
    public CustomerProfileContactInfoInqResultType getCustomerProfileContactInfoInqResult() {
        return customerProfileContactInfoInqResult;
    }

    /**
     * Sets the value of the customerProfileContactInfoInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoInqResultType }
     *     
     */
    public void setCustomerProfileContactInfoInqResult(CustomerProfileContactInfoInqResultType value) {
        this.customerProfileContactInfoInqResult = value;
    }

}
