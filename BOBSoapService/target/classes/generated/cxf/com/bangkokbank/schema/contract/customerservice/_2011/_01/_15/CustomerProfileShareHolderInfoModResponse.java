
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15.CustomerProfileShareHolderInfoModRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15}CustomerProfileShareHolderInfoModResp"/>
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
    "customerProfileShareHolderInfoModResp"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoModResponse")
public class CustomerProfileShareHolderInfoModResponse {

    @XmlElement(name = "CustomerProfileShareHolderInfoModResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoModRespType customerProfileShareHolderInfoModResp;

    /**
     * Gets the value of the customerProfileShareHolderInfoModResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoModRespType }
     *     
     */
    public CustomerProfileShareHolderInfoModRespType getCustomerProfileShareHolderInfoModResp() {
        return customerProfileShareHolderInfoModResp;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoModResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoModRespType }
     *     
     */
    public void setCustomerProfileShareHolderInfoModResp(CustomerProfileShareHolderInfoModRespType value) {
        this.customerProfileShareHolderInfoModResp = value;
    }

}
