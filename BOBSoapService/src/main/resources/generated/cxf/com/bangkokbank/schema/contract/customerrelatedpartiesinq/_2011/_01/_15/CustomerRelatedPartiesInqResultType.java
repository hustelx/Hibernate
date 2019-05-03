
package com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerRelatedPartiesType;


/**
 * <p>Java class for CustomerRelatedPartiesInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRelatedParties" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRelatedPartiesType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}nextKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesInqResultType", propOrder = {
    "customerRelatedParties",
    "nextKey"
})
public class CustomerRelatedPartiesInqResultType {

    @XmlElement(name = "CustomerRelatedParties")
    protected CustomerRelatedPartiesType customerRelatedParties;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String nextKey;

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

    /**
     * 
     * 					nextKey element, if available, from the previous response.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextKey() {
        return nextKey;
    }

    /**
     * Sets the value of the nextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextKey(String value) {
        this.nextKey = value;
    }

}
