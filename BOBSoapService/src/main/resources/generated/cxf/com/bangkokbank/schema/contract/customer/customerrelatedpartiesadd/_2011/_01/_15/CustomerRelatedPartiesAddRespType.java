
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerRelatedPartiesAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedPartiesAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15}CustomerRelatedPartiesAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesAddRespType", propOrder = {
    "customerRelatedPartiesAddResult"
})
public class CustomerRelatedPartiesAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerRelatedPartiesAddResult")
    protected CustomerRelatedPartiesAddResultType customerRelatedPartiesAddResult;

    /**
     * Gets the value of the customerRelatedPartiesAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesAddResultType }
     *     
     */
    public CustomerRelatedPartiesAddResultType getCustomerRelatedPartiesAddResult() {
        return customerRelatedPartiesAddResult;
    }

    /**
     * Sets the value of the customerRelatedPartiesAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesAddResultType }
     *     
     */
    public void setCustomerRelatedPartiesAddResult(CustomerRelatedPartiesAddResultType value) {
        this.customerRelatedPartiesAddResult = value;
    }

}
