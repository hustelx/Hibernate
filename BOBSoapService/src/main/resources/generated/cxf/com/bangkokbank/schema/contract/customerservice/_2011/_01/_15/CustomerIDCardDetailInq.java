
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15.CustomerIDCardDetailInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15}CustomerIDCardDetailInqReq"/>
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
    "customerIDCardDetailInqReq"
})
@XmlRootElement(name = "CustomerIDCardDetailInq")
public class CustomerIDCardDetailInq {

    @XmlElement(name = "CustomerIDCardDetailInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", required = true)
    protected CustomerIDCardDetailInqReqType customerIDCardDetailInqReq;

    /**
     * Gets the value of the customerIDCardDetailInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIDCardDetailInqReqType }
     *     
     */
    public CustomerIDCardDetailInqReqType getCustomerIDCardDetailInqReq() {
        return customerIDCardDetailInqReq;
    }

    /**
     * Sets the value of the customerIDCardDetailInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIDCardDetailInqReqType }
     *     
     */
    public void setCustomerIDCardDetailInqReq(CustomerIDCardDetailInqReqType value) {
        this.customerIDCardDetailInqReq = value;
    }

}
