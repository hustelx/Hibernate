
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileEmploymentInfoAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15}CustomerProfileEmploymentInfoAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoAddRespType", propOrder = {
    "customerProfileEmploymentInfoAddResult"
})
public class CustomerProfileEmploymentInfoAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileEmploymentInfoAddResult")
    protected CustomerProfileEmploymentInfoAddResultType customerProfileEmploymentInfoAddResult;

    /**
     * Gets the value of the customerProfileEmploymentInfoAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoAddResultType }
     *     
     */
    public CustomerProfileEmploymentInfoAddResultType getCustomerProfileEmploymentInfoAddResult() {
        return customerProfileEmploymentInfoAddResult;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoAddResultType }
     *     
     */
    public void setCustomerProfileEmploymentInfoAddResult(CustomerProfileEmploymentInfoAddResultType value) {
        this.customerProfileEmploymentInfoAddResult = value;
    }

}
