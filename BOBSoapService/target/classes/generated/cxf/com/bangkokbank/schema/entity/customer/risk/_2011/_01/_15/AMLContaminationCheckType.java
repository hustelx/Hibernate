
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * <p>Java class for AMLContaminationCheckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLContaminationCheckType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContaminationType" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}AMLContaminationRelTypeType"/>
 *         &lt;element name="RelationshipType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="RelatedContaminationRisk" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}AMLContaminationRisksType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLContaminationCheckType", propOrder = {
    "contaminationType",
    "relationshipType",
    "relatedContaminationRisk"
})
public class AMLContaminationCheckType {

    @XmlElement(name = "ContaminationType", required = true)
    protected AMLContaminationRelTypeType contaminationType;
    @XmlElement(name = "RelationshipType")
    protected CodeNamePairType relationshipType;
    @XmlElement(name = "RelatedContaminationRisk", required = true)
    protected AMLContaminationRisksType relatedContaminationRisk;

    /**
     * Gets the value of the contaminationType property.
     * 
     * @return
     *     possible object is
     *     {@link AMLContaminationRelTypeType }
     *     
     */
    public AMLContaminationRelTypeType getContaminationType() {
        return contaminationType;
    }

    /**
     * Sets the value of the contaminationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMLContaminationRelTypeType }
     *     
     */
    public void setContaminationType(AMLContaminationRelTypeType value) {
        this.contaminationType = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setRelationshipType(CodeNamePairType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relatedContaminationRisk property.
     * 
     * @return
     *     possible object is
     *     {@link AMLContaminationRisksType }
     *     
     */
    public AMLContaminationRisksType getRelatedContaminationRisk() {
        return relatedContaminationRisk;
    }

    /**
     * Sets the value of the relatedContaminationRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMLContaminationRisksType }
     *     
     */
    public void setRelatedContaminationRisk(AMLContaminationRisksType value) {
        this.relatedContaminationRisk = value;
    }

}
