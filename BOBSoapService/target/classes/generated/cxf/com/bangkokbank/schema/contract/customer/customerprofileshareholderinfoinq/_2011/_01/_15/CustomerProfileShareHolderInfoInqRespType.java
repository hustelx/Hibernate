
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileShareHolderInfoInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15}CustomerProfileShareHolderInfoInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoInqRespType", propOrder = {
    "customerProfileShareHolderInfoInqResult"
})
public class CustomerProfileShareHolderInfoInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileShareHolderInfoInqResult")
    protected CustomerProfileShareHolderInfoInqResultType customerProfileShareHolderInfoInqResult;

    /**
     * Gets the value of the customerProfileShareHolderInfoInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoInqResultType }
     *     
     */
    public CustomerProfileShareHolderInfoInqResultType getCustomerProfileShareHolderInfoInqResult() {
        return customerProfileShareHolderInfoInqResult;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoInqResultType }
     *     
     */
    public void setCustomerProfileShareHolderInfoInqResult(CustomerProfileShareHolderInfoInqResultType value) {
        this.customerProfileShareHolderInfoInqResult = value;
    }

}
