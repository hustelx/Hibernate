
package com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CustomerIndiciaCheckInq Service Request
 * 
 * <p>Java class for CustomerIndiciaCheckInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIndiciaCheckInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIndiciaCheckInqCriteria" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13}CustomerIndiciaCheckInqCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIndiciaCheckInqReqType", propOrder = {
    "customerIndiciaCheckInqCriteria"
})
public class CustomerIndiciaCheckInqReqType {

    @XmlElement(name = "CustomerIndiciaCheckInqCriteria", required = true)
    protected CustomerIndiciaCheckInqCriteriaType customerIndiciaCheckInqCriteria;

    /**
     * Gets the value of the customerIndiciaCheckInqCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIndiciaCheckInqCriteriaType }
     *     
     */
    public CustomerIndiciaCheckInqCriteriaType getCustomerIndiciaCheckInqCriteria() {
        return customerIndiciaCheckInqCriteria;
    }

    /**
     * Sets the value of the customerIndiciaCheckInqCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIndiciaCheckInqCriteriaType }
     *     
     */
    public void setCustomerIndiciaCheckInqCriteria(CustomerIndiciaCheckInqCriteriaType value) {
        this.customerIndiciaCheckInqCriteria = value;
    }

}
