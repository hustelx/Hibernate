
package com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileKYCModRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileKYCModRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileKYCModResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15}CustomerProfileKYCModResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileKYCModRespType", propOrder = {
    "customerProfileKYCModResult"
})
public class CustomerProfileKYCModRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileKYCModResult")
    protected CustomerProfileKYCModResultType customerProfileKYCModResult;

    /**
     * Gets the value of the customerProfileKYCModResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileKYCModResultType }
     *     
     */
    public CustomerProfileKYCModResultType getCustomerProfileKYCModResult() {
        return customerProfileKYCModResult;
    }

    /**
     * Sets the value of the customerProfileKYCModResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileKYCModResultType }
     *     
     */
    public void setCustomerProfileKYCModResult(CustomerProfileKYCModResultType value) {
        this.customerProfileKYCModResult = value;
    }

}
