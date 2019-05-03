
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15.CustomerProfileEmploymentInfoDelReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15}CustomerProfileEmploymentInfoDelReq"/>
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
    "customerProfileEmploymentInfoDelReq"
})
@XmlRootElement(name = "CustomerProfileEmploymentInfoDel")
public class CustomerProfileEmploymentInfoDel {

    @XmlElement(name = "CustomerProfileEmploymentInfoDelReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15", required = true)
    protected CustomerProfileEmploymentInfoDelReqType customerProfileEmploymentInfoDelReq;

    /**
     * Gets the value of the customerProfileEmploymentInfoDelReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoDelReqType }
     *     
     */
    public CustomerProfileEmploymentInfoDelReqType getCustomerProfileEmploymentInfoDelReq() {
        return customerProfileEmploymentInfoDelReq;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoDelReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoDelReqType }
     *     
     */
    public void setCustomerProfileEmploymentInfoDelReq(CustomerProfileEmploymentInfoDelReqType value) {
        this.customerProfileEmploymentInfoDelReq = value;
    }

}
