
package com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerRelatedPartiesKYCModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesKYCModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedPartiesKYCModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15}CustomerRelatedPartiesKYCModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesKYCModRespType", propOrder = {
    "customerRelatedPartiesKYCModResult"
})
public class CustomerRelatedPartiesKYCModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerRelatedPartiesKYCModResult")
    protected CustomerRelatedPartiesKYCModResultType customerRelatedPartiesKYCModResult;

    /**
     * Gets the value of the customerRelatedPartiesKYCModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesKYCModResultType }
     *     
     */
    public CustomerRelatedPartiesKYCModResultType getCustomerRelatedPartiesKYCModResult() {
        return customerRelatedPartiesKYCModResult;
    }

    /**
     * Sets the value of the customerRelatedPartiesKYCModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesKYCModResultType }
     *     
     */
    public void setCustomerRelatedPartiesKYCModResult(CustomerRelatedPartiesKYCModResultType value) {
        this.customerRelatedPartiesKYCModResult = value;
    }

}
