
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15.CustomerProfileEmploymentInfoAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15}CustomerProfileEmploymentInfoAddReq"/>
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
    "customerProfileEmploymentInfoAddReq"
})
@XmlRootElement(name = "CustomerProfileEmploymentInfoAdd")
public class CustomerProfileEmploymentInfoAdd {

    @XmlElement(name = "CustomerProfileEmploymentInfoAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", required = true)
    protected CustomerProfileEmploymentInfoAddReqType customerProfileEmploymentInfoAddReq;

    /**
     * Gets the value of the customerProfileEmploymentInfoAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoAddReqType }
     *     
     */
    public CustomerProfileEmploymentInfoAddReqType getCustomerProfileEmploymentInfoAddReq() {
        return customerProfileEmploymentInfoAddReq;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoAddReqType }
     *     
     */
    public void setCustomerProfileEmploymentInfoAddReq(CustomerProfileEmploymentInfoAddReqType value) {
        this.customerProfileEmploymentInfoAddReq = value;
    }

}
