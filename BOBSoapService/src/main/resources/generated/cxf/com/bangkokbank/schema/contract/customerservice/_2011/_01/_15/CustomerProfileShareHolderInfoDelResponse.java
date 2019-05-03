
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15.CustomerProfileShareHolderInfoDelRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15}CustomerProfileShareHolderInfoDelResp"/>
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
    "customerProfileShareHolderInfoDelResp"
})
@XmlRootElement(name = "CustomerProfileShareHolderInfoDelResponse")
public class CustomerProfileShareHolderInfoDelResponse {

    @XmlElement(name = "CustomerProfileShareHolderInfoDelResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15", required = true)
    protected CustomerProfileShareHolderInfoDelRespType customerProfileShareHolderInfoDelResp;

    /**
     * Gets the value of the customerProfileShareHolderInfoDelResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileShareHolderInfoDelRespType }
     *     
     */
    public CustomerProfileShareHolderInfoDelRespType getCustomerProfileShareHolderInfoDelResp() {
        return customerProfileShareHolderInfoDelResp;
    }

    /**
     * Sets the value of the customerProfileShareHolderInfoDelResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileShareHolderInfoDelRespType }
     *     
     */
    public void setCustomerProfileShareHolderInfoDelResp(CustomerProfileShareHolderInfoDelRespType value) {
        this.customerProfileShareHolderInfoDelResp = value;
    }

}
