
package com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerProfileRelAddRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileRelAddRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileRelAddResult" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15}CustomerProfileRelAddResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileRelAddRespType", propOrder = {
    "customerProfileRelAddResult"
})
public class CustomerProfileRelAddRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerProfileRelAddResult")
    protected CustomerProfileRelAddResultType customerProfileRelAddResult;

    /**
     * Gets the value of the customerProfileRelAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileRelAddResultType }
     *     
     */
    public CustomerProfileRelAddResultType getCustomerProfileRelAddResult() {
        return customerProfileRelAddResult;
    }

    /**
     * Sets the value of the customerProfileRelAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileRelAddResultType }
     *     
     */
    public void setCustomerProfileRelAddResult(CustomerProfileRelAddResultType value) {
        this.customerProfileRelAddResult = value;
    }

}
