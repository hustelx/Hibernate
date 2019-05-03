
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15.CustomerIDCardDetailInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15}CustomerIDCardDetailInqResp"/>
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
    "customerIDCardDetailInqResp"
})
@XmlRootElement(name = "CustomerIDCardDetailInqResponse")
public class CustomerIDCardDetailInqResponse {

    @XmlElement(name = "CustomerIDCardDetailInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15", required = true)
    protected CustomerIDCardDetailInqRespType customerIDCardDetailInqResp;

    /**
     * Gets the value of the customerIDCardDetailInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIDCardDetailInqRespType }
     *     
     */
    public CustomerIDCardDetailInqRespType getCustomerIDCardDetailInqResp() {
        return customerIDCardDetailInqResp;
    }

    /**
     * Sets the value of the customerIDCardDetailInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIDCardDetailInqRespType }
     *     
     */
    public void setCustomerIDCardDetailInqResp(CustomerIDCardDetailInqRespType value) {
        this.customerIDCardDetailInqResp = value;
    }

}
