
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileShareHolderInfoModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15}CustomerProfileShareHolderInfoModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoModRespType", propOrder = {
    "customerProfileShareHolderInfoModResult"
})
public class CustomerProfileShareHolderInfoModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileShareHolderInfoModResult")
    protected CustomerProfileShareHolderInfoModResultType customerProfileShareHolderInfoModResult;

    /**
     * Gets the value of the customerProfileShareHolderInfoModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoModResultType }
     *     
     */
    public CustomerProfileShareHolderInfoModResultType getCustomerProfileShareHolderInfoModResult() {
        return customerProfileShareHolderInfoModResult;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoModResultType }
     *     
     */
    public void setCustomerProfileShareHolderInfoModResult(CustomerProfileShareHolderInfoModResultType value) {
        this.customerProfileShareHolderInfoModResult = value;
    }

}
