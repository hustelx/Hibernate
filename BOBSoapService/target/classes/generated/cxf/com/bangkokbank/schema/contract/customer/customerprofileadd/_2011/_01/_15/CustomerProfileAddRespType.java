
package com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15}CustomerProfileAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddRespType", propOrder = {
    "customerProfileAddResult"
})
public class CustomerProfileAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileAddResult")
    protected CustomerProfileAddResultType customerProfileAddResult;

    /**
     * Gets the value of the customerProfileAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileAddResultType }
     *     
     */
    public CustomerProfileAddResultType getCustomerProfileAddResult() {
        return customerProfileAddResult;
    }

    /**
     * Sets the value of the customerProfileAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileAddResultType }
     *     
     */
    public void setCustomerProfileAddResult(CustomerProfileAddResultType value) {
        this.customerProfileAddResult = value;
    }

}
