
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRelatedPartiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="ComplexShareHolderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelatedParties" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRelatedPartiesDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesType", propOrder = {
    "customerInfoRef",
    "complexShareHolderFlag",
    "relatedParties"
})
public class CustomerRelatedPartiesType {

    @XmlElement(name = "CustomerInfoRef", required = true)
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "ComplexShareHolderFlag")
    protected Boolean complexShareHolderFlag;
    @XmlElement(name = "RelatedParties", required = true)
    protected CustomerRelatedPartiesDetailType relatedParties;

    /**
     * Gets the value of the customerInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerInfoRef() {
        return customerInfoRef;
    }

    /**
     * Sets the value of the customerInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerInfoRef(CustomerInfoRefType value) {
        this.customerInfoRef = value;
    }

    /**
     * Gets the value of the complexShareHolderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplexShareHolderFlag() {
        return complexShareHolderFlag;
    }

    /**
     * Sets the value of the complexShareHolderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplexShareHolderFlag(Boolean value) {
        this.complexShareHolderFlag = value;
    }

    /**
     * Gets the value of the relatedParties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesDetailType }
     *     
     */
    public CustomerRelatedPartiesDetailType getRelatedParties() {
        return relatedParties;
    }

    /**
     * Sets the value of the relatedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesDetailType }
     *     
     */
    public void setRelatedParties(CustomerRelatedPartiesDetailType value) {
        this.relatedParties = value;
    }

}
