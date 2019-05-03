
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoDelRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoDelRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileEmploymentInfoDelResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15}CustomerProfileEmploymentInfoDelResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoDelRespType", propOrder = {
    "customerProfileEmploymentInfoDelResult"
})
public class CustomerProfileEmploymentInfoDelRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileEmploymentInfoDelResult")
    protected CustomerProfileEmploymentInfoDelResultType customerProfileEmploymentInfoDelResult;

    /**
     * Gets the value of the customerProfileEmploymentInfoDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoDelResultType }
     *     
     */
    public CustomerProfileEmploymentInfoDelResultType getCustomerProfileEmploymentInfoDelResult() {
        return customerProfileEmploymentInfoDelResult;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoDelResultType }
     *     
     */
    public void setCustomerProfileEmploymentInfoDelResult(CustomerProfileEmploymentInfoDelResultType value) {
        this.customerProfileEmploymentInfoDelResult = value;
    }

}
