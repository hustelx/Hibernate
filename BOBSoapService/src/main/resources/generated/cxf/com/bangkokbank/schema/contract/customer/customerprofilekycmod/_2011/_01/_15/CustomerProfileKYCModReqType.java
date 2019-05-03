
package com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerKYCDetailsType;


/**
 * <p>Java class for CustomerProfileKYCModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileKYCModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKYCDetails" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerKYCDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileKYCModReqType", propOrder = {
    "customerKYCDetails"
})
public class CustomerProfileKYCModReqType {

    @XmlElement(name = "CustomerKYCDetails")
    protected CustomerKYCDetailsType customerKYCDetails;

    /**
     * Gets the value of the customerKYCDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKYCDetailsType }
     *     
     */
    public CustomerKYCDetailsType getCustomerKYCDetails() {
        return customerKYCDetails;
    }

    /**
     * Sets the value of the customerKYCDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKYCDetailsType }
     *     
     */
    public void setCustomerKYCDetails(CustomerKYCDetailsType value) {
        this.customerKYCDetails = value;
    }

}
