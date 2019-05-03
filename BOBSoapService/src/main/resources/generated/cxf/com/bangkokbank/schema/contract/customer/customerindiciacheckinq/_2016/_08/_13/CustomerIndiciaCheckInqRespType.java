
package com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * CustomerIndiciaCheckInq Service Response
 * 
 * <p>Java class for CustomerIndiciaCheckInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIndiciaCheckInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIndiciaCheckInqResults" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13}CustomerIndiciaCheckInqResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIndiciaCheckInqRespType", propOrder = {
    "customerIndiciaCheckInqResults"
})
public class CustomerIndiciaCheckInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerIndiciaCheckInqResults")
    protected CustomerIndiciaCheckInqResultsType customerIndiciaCheckInqResults;

    /**
     * Gets the value of the customerIndiciaCheckInqResults property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIndiciaCheckInqResultsType }
     *     
     */
    public CustomerIndiciaCheckInqResultsType getCustomerIndiciaCheckInqResults() {
        return customerIndiciaCheckInqResults;
    }

    /**
     * Sets the value of the customerIndiciaCheckInqResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIndiciaCheckInqResultsType }
     *     
     */
    public void setCustomerIndiciaCheckInqResults(CustomerIndiciaCheckInqResultsType value) {
        this.customerIndiciaCheckInqResults = value;
    }

}
