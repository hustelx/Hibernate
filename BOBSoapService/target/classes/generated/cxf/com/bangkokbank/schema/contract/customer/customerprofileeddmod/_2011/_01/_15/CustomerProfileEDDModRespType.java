
package com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileEDDModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEDDModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileEDDModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15}CustomerProfileEDDModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEDDModRespType", propOrder = {
    "customerProfileEDDModResult"
})
public class CustomerProfileEDDModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileEDDModResult")
    protected CustomerProfileEDDModResultType customerProfileEDDModResult;

    /**
     * Gets the value of the customerProfileEDDModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEDDModResultType }
     *     
     */
    public CustomerProfileEDDModResultType getCustomerProfileEDDModResult() {
        return customerProfileEDDModResult;
    }

    /**
     * Sets the value of the customerProfileEDDModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEDDModResultType }
     *     
     */
    public void setCustomerProfileEDDModResult(CustomerProfileEDDModResultType value) {
        this.customerProfileEDDModResult = value;
    }

}
