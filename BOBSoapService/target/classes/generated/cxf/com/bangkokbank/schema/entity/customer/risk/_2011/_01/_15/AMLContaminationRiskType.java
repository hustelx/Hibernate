
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * <p>Java class for AMLContaminationRiskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLContaminationRiskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="CustomerRiskRatingType" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerRiskRatingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLContaminationRiskType", propOrder = {
    "relationshipType",
    "customerRiskRatingType"
})
public class AMLContaminationRiskType {

    @XmlElement(name = "RelationshipType")
    protected CodeNamePairType relationshipType;
    @XmlElement(name = "CustomerRiskRatingType")
    protected CustomerRiskRatingType customerRiskRatingType;

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
     * Gets the value of the customerRiskRatingType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRiskRatingType }
     *     
     */
    public CustomerRiskRatingType getCustomerRiskRatingType() {
        return customerRiskRatingType;
    }

    /**
     * Sets the value of the customerRiskRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRiskRatingType }
     *     
     */
    public void setCustomerRiskRatingType(CustomerRiskRatingType value) {
        this.customerRiskRatingType = value;
    }

}
