
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerRelatedPartiesModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedPartiesModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15}CustomerRelatedPartiesModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesModRespType", propOrder = {
    "customerRelatedPartiesModResult"
})
public class CustomerRelatedPartiesModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerRelatedPartiesModResult")
    protected CustomerRelatedPartiesModResultType customerRelatedPartiesModResult;

    /**
     * Gets the value of the customerRelatedPartiesModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesModResultType }
     *     
     */
    public CustomerRelatedPartiesModResultType getCustomerRelatedPartiesModResult() {
        return customerRelatedPartiesModResult;
    }

    /**
     * Sets the value of the customerRelatedPartiesModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesModResultType }
     *     
     */
    public void setCustomerRelatedPartiesModResult(CustomerRelatedPartiesModResultType value) {
        this.customerRelatedPartiesModResult = value;
    }

}
