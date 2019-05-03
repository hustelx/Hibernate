
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15.CustomerProfileEmploymentInfoInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15}CustomerProfileEmploymentInfoInqReq"/>
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
    "customerProfileEmploymentInfoInqReq"
})
@XmlRootElement(name = "CustomerProfileEmploymentInfoInq")
public class CustomerProfileEmploymentInfoInq {

    @XmlElement(name = "CustomerProfileEmploymentInfoInqReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", required = true)
    protected CustomerProfileEmploymentInfoInqReqType customerProfileEmploymentInfoInqReq;

    /**
     * Gets the value of the customerProfileEmploymentInfoInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoInqReqType }
     *     
     */
    public CustomerProfileEmploymentInfoInqReqType getCustomerProfileEmploymentInfoInqReq() {
        return customerProfileEmploymentInfoInqReq;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoInqReqType }
     *     
     */
    public void setCustomerProfileEmploymentInfoInqReq(CustomerProfileEmploymentInfoInqReqType value) {
        this.customerProfileEmploymentInfoInqReq = value;
    }

}
