
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15.CustomerProfileShareHolderInfoModReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15}CustomerProfileShareHolderInfoModReq"/>
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
    "customerProfileShareHolderInfoModReq"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoMod")
public class CustomerProfileShareHolderInfoMod {

    @XmlElement(name = "CustomerProfileShareHolderInfoModReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoModReqType customerProfileShareHolderInfoModReq;

    /**
     * Gets the value of the customerProfileShareHolderInfoModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoModReqType }
     *     
     */
    public CustomerProfileShareHolderInfoModReqType getCustomerProfileShareHolderInfoModReq() {
        return customerProfileShareHolderInfoModReq;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoModReqType }
     *     
     */
    public void setCustomerProfileShareHolderInfoModReq(CustomerProfileShareHolderInfoModReqType value) {
        this.customerProfileShareHolderInfoModReq = value;
    }

}
