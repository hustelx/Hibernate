
package com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerRelatedPartiesInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedPartiesInqResult" type="{http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15}CustomerRelatedPartiesInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesInqRespType", propOrder = {
    "customerRelatedPartiesInqResult"
})
public class CustomerRelatedPartiesInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerRelatedPartiesInqResult")
    protected CustomerRelatedPartiesInqResultType customerRelatedPartiesInqResult;

    /**
     * Gets the value of the customerRelatedPartiesInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesInqResultType }
     *     
     */
    public CustomerRelatedPartiesInqResultType getCustomerRelatedPartiesInqResult() {
        return customerRelatedPartiesInqResult;
    }

    /**
     * Sets the value of the customerRelatedPartiesInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesInqResultType }
     *     
     */
    public void setCustomerRelatedPartiesInqResult(CustomerRelatedPartiesInqResultType value) {
        this.customerRelatedPartiesInqResult = value;
    }

}
