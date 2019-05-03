
package com.bangkokbank.schema.contract.customerprofileinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileInqResult" type="{http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15}CustomerProfileInqResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileInqRespType", propOrder = {
    "customerProfileInqResult"
})
public class CustomerProfileInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileInqResult")
    protected CustomerProfileInqResultType customerProfileInqResult;

    /**
     * Gets the value of the customerProfileInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileInqResultType }
     *     
     */
    public CustomerProfileInqResultType getCustomerProfileInqResult() {
        return customerProfileInqResult;
    }

    /**
     * Sets the value of the customerProfileInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileInqResultType }
     *     
     */
    public void setCustomerProfileInqResult(CustomerProfileInqResultType value) {
        this.customerProfileInqResult = value;
    }

}
