
package com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileRelsType;


/**
 * <p>Java class for CustomerProfileRelAddReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileRelAddReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileRels" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileRelsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileRelAddReqType", propOrder = {
    "customerProfileRels"
})
public class CustomerProfileRelAddReqType {

    @XmlElement(name = "CustomerProfileRels")
    protected CustomerProfileRelsType customerProfileRels;

    /**
     * Gets the value of the customerProfileRels property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileRelsType }
     *     
     */
    public CustomerProfileRelsType getCustomerProfileRels() {
        return customerProfileRels;
    }

    /**
     * Sets the value of the customerProfileRels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileRelsType }
     *     
     */
    public void setCustomerProfileRels(CustomerProfileRelsType value) {
        this.customerProfileRels = value;
    }

}
