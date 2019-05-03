
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15.CustomerProfileShareHolderInfoInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15}CustomerProfileShareHolderInfoInqResp"/>
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
    "customerProfileShareHolderInfoInqResp"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoInqResponse")
public class CustomerProfileShareHolderInfoInqResponse {

    @XmlElement(name = "CustomerProfileShareHolderInfoInqResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoInqRespType customerProfileShareHolderInfoInqResp;

    /**
     * Gets the value of the customerProfileShareHolderInfoInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoInqRespType }
     *     
     */
    public CustomerProfileShareHolderInfoInqRespType getCustomerProfileShareHolderInfoInqResp() {
        return customerProfileShareHolderInfoInqResp;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoInqRespType }
     *     
     */
    public void setCustomerProfileShareHolderInfoInqResp(CustomerProfileShareHolderInfoInqRespType value) {
        this.customerProfileShareHolderInfoInqResp = value;
    }

}
