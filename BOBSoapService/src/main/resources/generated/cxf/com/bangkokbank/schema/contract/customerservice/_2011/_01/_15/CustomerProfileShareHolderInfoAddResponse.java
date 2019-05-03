
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15.CustomerProfileShareHolderInfoAddRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15}CustomerProfileShareHolderInfoAddResp"/>
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
    "customerProfileShareHolderInfoAddResp"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoAddResponse")
public class CustomerProfileShareHolderInfoAddResponse {

    @XmlElement(name = "CustomerProfileShareHolderInfoAddResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoAddRespType customerProfileShareHolderInfoAddResp;

    /**
     * Gets the value of the customerProfileShareHolderInfoAddResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoAddRespType }
     *     
     */
    public CustomerProfileShareHolderInfoAddRespType getCustomerProfileShareHolderInfoAddResp() {
        return customerProfileShareHolderInfoAddResp;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoAddResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoAddRespType }
     *     
     */
    public void setCustomerProfileShareHolderInfoAddResp(CustomerProfileShareHolderInfoAddRespType value) {
        this.customerProfileShareHolderInfoAddResp = value;
    }

}
