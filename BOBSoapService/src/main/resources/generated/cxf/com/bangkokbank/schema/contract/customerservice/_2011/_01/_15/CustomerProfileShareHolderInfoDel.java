
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15.CustomerProfileShareHolderInfoDelReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15}CustomerProfileShareHolderInfoDelReq"/>
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
    "customerProfileShareHolderInfoDelReq"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoDel")
public class CustomerProfileShareHolderInfoDel {

    @XmlElement(name = "CustomerProfileShareHolderInfoDelReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoDelReqType customerProfileShareHolderInfoDelReq;

    /**
     * Gets the value of the customerProfileShareHolderInfoDelReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoDelReqType }
     *     
     */
    public CustomerProfileShareHolderInfoDelReqType getCustomerProfileShareHolderInfoDelReq() {
        return customerProfileShareHolderInfoDelReq;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoDelReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoDelReqType }
     *     
     */
    public void setCustomerProfileShareHolderInfoDelReq(CustomerProfileShareHolderInfoDelReqType value) {
        this.customerProfileShareHolderInfoDelReq = value;
    }

}
