
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15.CustomerProfileEmploymentInfoAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15}CustomerProfileEmploymentInfoAddResp"/>
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
    "customerProfileEmploymentInfoAddResp"
})
@XmlRootElement(name = "CustomerProfileEmploymentInfoAddResponse")
public class CustomerProfileEmploymentInfoAddResponse {

    @XmlElement(name = "CustomerProfileEmploymentInfoAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15", required = true)
    protected CustomerProfileEmploymentInfoAddRespType customerProfileEmploymentInfoAddResp;

    /**
     * Gets the value of the customerProfileEmploymentInfoAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileEmploymentInfoAddRespType }
     *     
     */
    public CustomerProfileEmploymentInfoAddRespType getCustomerProfileEmploymentInfoAddResp() {
        return customerProfileEmploymentInfoAddResp;
    }

    /**
     * Sets the value of the customerProfileEmploymentInfoAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileEmploymentInfoAddRespType }
     *     
     */
    public void setCustomerProfileEmploymentInfoAddResp(CustomerProfileEmploymentInfoAddRespType value) {
        this.customerProfileEmploymentInfoAddResp = value;
    }

}
