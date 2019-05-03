
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerRelatedPartiesType;


/**
 * <p>Java class for CustomerRelatedPartiesModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedParties" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRelatedPartiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesModReqType", propOrder = {
    "customerRelatedParties"
})
public class CustomerRelatedPartiesModReqType {

    @XmlElement(name = "CustomerRelatedParties")
    protected CustomerRelatedPartiesType customerRelatedParties;

    /**
     * Gets the value of the customerRelatedParties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesType }
     *     
     */
    public CustomerRelatedPartiesType getCustomerRelatedParties() {
        return customerRelatedParties;
    }

    /**
     * Sets the value of the customerRelatedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesType }
     *     
     */
    public void setCustomerRelatedParties(CustomerRelatedPartiesType value) {
        this.customerRelatedParties = value;
    }

}
