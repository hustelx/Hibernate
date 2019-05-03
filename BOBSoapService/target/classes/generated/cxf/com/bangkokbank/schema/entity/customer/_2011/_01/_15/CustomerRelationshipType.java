
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptionTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialSignatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelationshipType", propOrder = {
    "relationshipCode",
    "descriptionTH",
    "descriptionEN",
    "officialSignatoryFlag"
})
public class CustomerRelationshipType {

    @XmlElement(name = "RelationshipCode", required = true)
    protected String relationshipCode;
    @XmlElement(name = "DescriptionTH")
    protected String descriptionTH;
    @XmlElement(name = "DescriptionEN")
    protected String descriptionEN;
    @XmlElement(name = "OfficialSignatoryFlag")
    protected Boolean officialSignatoryFlag;

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipCode(String value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the descriptionTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionTH() {
        return descriptionTH;
    }

    /**
     * Sets the value of the descriptionTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionTH(String value) {
        this.descriptionTH = value;
    }

    /**
     * Gets the value of the descriptionEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionEN() {
        return descriptionEN;
    }

    /**
     * Sets the value of the descriptionEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionEN(String value) {
        this.descriptionEN = value;
    }

    /**
     * Gets the value of the officialSignatoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficialSignatoryFlag() {
        return officialSignatoryFlag;
    }

    /**
     * Sets the value of the officialSignatoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficialSignatoryFlag(Boolean value) {
        this.officialSignatoryFlag = value;
    }

}
