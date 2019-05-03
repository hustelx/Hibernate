
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13.CustomerIndiciaCheckInqRespType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13}CustomerIndiciaCheckInqResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerIndiciaCheckInqResp"
})
@XmlRootElement(name = "CustomerIndiciaCheckInqResponse")
public class CustomerIndiciaCheckInqResponse {

    @XmlElement(name = "CustomerIndiciaCheckInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", required = true)
    protected CustomerIndiciaCheckInqRespType customerIndiciaCheckInqResp;

    /**
     * Gets the value of the customerIndiciaCheckInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIndiciaCheckInqRespType }
     *     
     */
    public CustomerIndiciaCheckInqRespType getCustomerIndiciaCheckInqResp() {
        return customerIndiciaCheckInqResp;
    }

    /**
     * Sets the value of the customerIndiciaCheckInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIndiciaCheckInqRespType }
     *     
     */
    public void setCustomerIndiciaCheckInqResp(CustomerIndiciaCheckInqRespType value) {
        this.customerIndiciaCheckInqResp = value;
    }

}
