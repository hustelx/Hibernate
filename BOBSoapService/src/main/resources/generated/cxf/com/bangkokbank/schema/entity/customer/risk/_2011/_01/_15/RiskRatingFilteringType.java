
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;


/**
 * <p>Java class for RiskRatingFilteringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RiskRatingFilteringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskRating" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="RiskFiltering" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskRatingFilteringType", propOrder = {
    "riskRating",
    "riskFiltering"
})
public class RiskRatingFilteringType {

    @XmlElement(name = "RiskRating")
    protected CodeDescType riskRating;
    @XmlElement(name = "RiskFiltering")
    protected CodeDescType riskFiltering;

    /**
     * Gets the value of the riskRating property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRiskRating() {
        return riskRating;
    }

    /**
     * Sets the value of the riskRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRiskRating(CodeDescType value) {
        this.riskRating = value;
    }

    /**
     * Gets the value of the riskFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRiskFiltering() {
        return riskFiltering;
    }

    /**
     * Sets the value of the riskFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRiskFiltering(CodeDescType value) {
        this.riskFiltering = value;
    }

}
