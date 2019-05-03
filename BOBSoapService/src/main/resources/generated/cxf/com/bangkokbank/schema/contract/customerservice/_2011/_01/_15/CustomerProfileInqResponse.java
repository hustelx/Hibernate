
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customerprofileinq._2011._01._15.CustomerProfileInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15}CustomerProfileInqResp"/>
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
    "customerProfileInqResp"
})
@XmlRootElement(name = "CustomerProfileInqResponse")
public class CustomerProfileInqResponse {

    @XmlElement(name = "CustomerProfileInqResp", namespace = "http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15", required = true)
    protected CustomerProfileInqRespType customerProfileInqResp;

    /**
     * Gets the value of the customerProfileInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileInqRespType }
     *     
     */
    public CustomerProfileInqRespType getCustomerProfileInqResp() {
        return customerProfileInqResp;
    }

    /**
     * Sets the value of the customerProfileInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileInqRespType }
     *     
     */
    public void setCustomerProfileInqResp(CustomerProfileInqRespType value) {
        this.customerProfileInqResp = value;
    }

}
