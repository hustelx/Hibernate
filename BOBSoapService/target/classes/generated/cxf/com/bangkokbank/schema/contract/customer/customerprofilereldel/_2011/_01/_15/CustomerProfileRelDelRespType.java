
package com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileRelDelRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileRelDelRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileRelDelResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15}CustomerProfileRelDelResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileRelDelRespType", propOrder = {
    "customerProfileRelDelResult"
})
public class CustomerProfileRelDelRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileRelDelResult")
    protected CustomerProfileRelDelResultType customerProfileRelDelResult;

    /**
     * Gets the value of the customerProfileRelDelResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileRelDelResultType }
     *     
     */
    public CustomerProfileRelDelResultType getCustomerProfileRelDelResult() {
        return customerProfileRelDelResult;
    }

    /**
     * Sets the value of the customerProfileRelDelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileRelDelResultType }
     *     
     */
    public void setCustomerProfileRelDelResult(CustomerProfileRelDelResultType value) {
        this.customerProfileRelDelResult = value;
    }

}
