
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileContactInfoAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileContactInfoAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15}CustomerProfileContactInfoAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoAddRespType", propOrder = {
    "customerProfileContactInfoAddResult"
})
public class CustomerProfileContactInfoAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileContactInfoAddResult")
    protected CustomerProfileContactInfoAddResultType customerProfileContactInfoAddResult;

    /**
     * Gets the value of the customerProfileContactInfoAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileContactInfoAddResultType }
     *     
     */
    public CustomerProfileContactInfoAddResultType getCustomerProfileContactInfoAddResult() {
        return customerProfileContactInfoAddResult;
    }

    /**
     * Sets the value of the customerProfileContactInfoAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileContactInfoAddResultType }
     *     
     */
    public void setCustomerProfileContactInfoAddResult(CustomerProfileContactInfoAddResultType value) {
        this.customerProfileContactInfoAddResult = value;
    }

}
