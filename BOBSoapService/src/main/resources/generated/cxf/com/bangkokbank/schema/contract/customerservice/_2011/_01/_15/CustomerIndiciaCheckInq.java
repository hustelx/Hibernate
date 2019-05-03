
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13.CustomerIndiciaCheckInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13}CustomerIndiciaCheckInqReq"/>
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
    "customerIndiciaCheckInqReq"
})
@XmlRootElement(name = "CustomerIndiciaCheckInq")
public class CustomerIndiciaCheckInq {

    @XmlElement(name = "CustomerIndiciaCheckInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13", required = true)
    protected CustomerIndiciaCheckInqReqType customerIndiciaCheckInqReq;

    /**
     * Gets the value of the customerIndiciaCheckInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIndiciaCheckInqReqType }
     *     
     */
    public CustomerIndiciaCheckInqReqType getCustomerIndiciaCheckInqReq() {
        return customerIndiciaCheckInqReq;
    }

    /**
     * Sets the value of the customerIndiciaCheckInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIndiciaCheckInqReqType }
     *     
     */
    public void setCustomerIndiciaCheckInqReq(CustomerIndiciaCheckInqReqType value) {
        this.customerIndiciaCheckInqReq = value;
    }

}
