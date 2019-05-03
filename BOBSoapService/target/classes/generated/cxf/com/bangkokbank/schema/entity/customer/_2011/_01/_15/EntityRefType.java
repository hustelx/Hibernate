
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		  Entity Ref type used to refer to entities.
 * 		
 * 
 * <p>Java class for EntityRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType"/>
 *         &lt;element name="Name" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityRefType", propOrder = {
    "identification",
    "name"
})
public class EntityRefType {

    @XmlElement(name = "Identification", required = true)
    protected CustomerIdentificationType identification;
    @XmlElement(name = "Name")
    protected CustomerNameType name;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setIdentification(CustomerIdentificationType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setName(CustomerNameType value) {
        this.name = value;
    }

}
