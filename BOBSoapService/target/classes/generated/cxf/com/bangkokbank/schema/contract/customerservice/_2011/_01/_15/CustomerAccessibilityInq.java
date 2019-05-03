
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15.CustomerAccessibilityType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15}CustomerAccessibilityInqReq"/>
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
    "customerAccessibilityInqReq"
})
@XmlRootElement(name = "CustomerAccessibilityInq")
public class CustomerAccessibilityInq {

    @XmlElement(name = "CustomerAccessibilityInqReq", namespace = "http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15", required = true)
    protected CustomerAccessibilityType customerAccessibilityInqReq;

    /**
     * Gets the value of the customerAccessibilityInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccessibilityType }
     *     
     */
    public CustomerAccessibilityType getCustomerAccessibilityInqReq() {
        return customerAccessibilityInqReq;
    }

    /**
     * Sets the value of the customerAccessibilityInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccessibilityType }
     *     
     */
    public void setCustomerAccessibilityInqReq(CustomerAccessibilityType value) {
        this.customerAccessibilityInqReq = value;
    }

}
