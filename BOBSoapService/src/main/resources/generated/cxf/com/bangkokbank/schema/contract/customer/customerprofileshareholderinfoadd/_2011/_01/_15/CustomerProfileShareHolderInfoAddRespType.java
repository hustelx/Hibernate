
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileShareHolderInfoAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15}CustomerProfileShareHolderInfoAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoAddRespType", propOrder = {
    "customerProfileShareHolderInfoAddResult"
})
public class CustomerProfileShareHolderInfoAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileShareHolderInfoAddResult")
    protected CustomerProfileShareHolderInfoAddResultType customerProfileShareHolderInfoAddResult;

    /**
     * Gets the value of the customerProfileShareHolderInfoAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoAddResultType }
     *     
     */
    public CustomerProfileShareHolderInfoAddResultType getCustomerProfileShareHolderInfoAddResult() {
        return customerProfileShareHolderInfoAddResult;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoAddResultType }
     *     
     */
    public void setCustomerProfileShareHolderInfoAddResult(CustomerProfileShareHolderInfoAddResultType value) {
        this.customerProfileShareHolderInfoAddResult = value;
    }

}
