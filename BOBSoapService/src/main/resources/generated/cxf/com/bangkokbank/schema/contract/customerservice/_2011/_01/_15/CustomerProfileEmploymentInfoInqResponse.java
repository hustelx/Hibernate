
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15.CustomerProfileEmploymentInfoInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15}CustomerProfileEmploymentInfoInqResp"/>
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
    "customerProfileEmploymentInfoInqResp"
})
@XmlRootElement(name = "CustomerProfileEmploymentInfoInqResponse")
public class CustomerProfileEmploymentInfoInqResponse {

    @XmlElement(name = "CustomerProfileEmploymentInfoInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15", required = true)
    protected CustomerProfileEmploymentInfoInqRespType customerProfileEmploymentInfoInqResp;

    /**
     * Gets the value of the customerProfileEmploymentInfoInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoInqRespType }
     *     
     */
    public CustomerProfileEmploymentInfoInqRespType getCustomerProfileEmploymentInfoInqResp() {
        return customerProfileEmploymentInfoInqResp;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoInqRespType }
     *     
     */
    public void setCustomerProfileEmploymentInfoInqResp(CustomerProfileEmploymentInfoInqRespType value) {
        this.customerProfileEmploymentInfoInqResp = value;
    }

}
