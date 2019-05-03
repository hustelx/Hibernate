
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileEmploymentInfoInqResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15}CustomerProfileEmploymentInfoInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoInqRespType", propOrder = {
    "customerProfileEmploymentInfoInqResult"
})
public class CustomerProfileEmploymentInfoInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileEmploymentInfoInqResult")
    protected CustomerProfileEmploymentInfoInqResultType customerProfileEmploymentInfoInqResult;

    /**
     * Gets the value of the customerProfileEmploymentInfoInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoInqResultType }
     *     
     */
    public CustomerProfileEmploymentInfoInqResultType getCustomerProfileEmploymentInfoInqResult() {
        return customerProfileEmploymentInfoInqResult;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoInqResultType }
     *     
     */
    public void setCustomerProfileEmploymentInfoInqResult(CustomerProfileEmploymentInfoInqResultType value) {
        this.customerProfileEmploymentInfoInqResult = value;
    }

}
