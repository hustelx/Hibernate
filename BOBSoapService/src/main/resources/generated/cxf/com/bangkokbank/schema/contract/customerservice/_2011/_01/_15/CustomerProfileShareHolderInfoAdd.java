
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15.CustomerProfileShareHolderInfoAddReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15}CustomerProfileShareHolderInfoAddReq"/>
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
    "customerProfileShareHolderInfoAddReq"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoAdd")
public class CustomerProfileShareHolderInfoAdd {

    @XmlElement(name = "CustomerProfileShareHolderInfoAddReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoAddReqType customerProfileShareHolderInfoAddReq;

    /**
     * Gets the value of the customerProfileShareHolderInfoAddReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoAddReqType }
     *     
     */
    public CustomerProfileShareHolderInfoAddReqType getCustomerProfileShareHolderInfoAddReq() {
        return customerProfileShareHolderInfoAddReq;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoAddReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoAddReqType }
     *     
     */
    public void setCustomerProfileShareHolderInfoAddReq(CustomerProfileShareHolderInfoAddReqType value) {
        this.customerProfileShareHolderInfoAddReq = value;
    }

}
