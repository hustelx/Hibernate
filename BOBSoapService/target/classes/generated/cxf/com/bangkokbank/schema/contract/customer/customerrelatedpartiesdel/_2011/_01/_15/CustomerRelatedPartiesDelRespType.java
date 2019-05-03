
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesdel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerRelatedPartiesDelRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesDelRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedPartiesDelResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15}CustomerRelatedPartiesDelResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesDelRespType", propOrder = {
    "customerRelatedPartiesDelResult"
})
public class CustomerRelatedPartiesDelRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerRelatedPartiesDelResult")
    protected CustomerRelatedPartiesDelResultType customerRelatedPartiesDelResult;

    /**
     * Gets the value of the customerRelatedPartiesDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesDelResultType }
     *     
     */
    public CustomerRelatedPartiesDelResultType getCustomerRelatedPartiesDelResult() {
        return customerRelatedPartiesDelResult;
    }

    /**
     * Sets the value of the customerRelatedPartiesDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesDelResultType }
     *     
     */
    public void setCustomerRelatedPartiesDelResult(CustomerRelatedPartiesDelResultType value) {
        this.customerRelatedPartiesDelResult = value;
    }

}
