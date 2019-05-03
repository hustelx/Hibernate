
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoDelRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoDelRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileShareHolderInfoDelResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15}CustomerProfileShareHolderInfoDelResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoDelRespType", propOrder = {
    "customerProfileShareHolderInfoDelResult"
})
public class CustomerProfileShareHolderInfoDelRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileShareHolderInfoDelResult")
    protected CustomerProfileShareHolderInfoDelResultType customerProfileShareHolderInfoDelResult;

    /**
     * Gets the value of the customerProfileShareHolderInfoDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoDelResultType }
     *     
     */
    public CustomerProfileShareHolderInfoDelResultType getCustomerProfileShareHolderInfoDelResult() {
        return customerProfileShareHolderInfoDelResult;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoDelResultType }
     *     
     */
    public void setCustomerProfileShareHolderInfoDelResult(CustomerProfileShareHolderInfoDelResultType value) {
        this.customerProfileShareHolderInfoDelResult = value;
    }

}
