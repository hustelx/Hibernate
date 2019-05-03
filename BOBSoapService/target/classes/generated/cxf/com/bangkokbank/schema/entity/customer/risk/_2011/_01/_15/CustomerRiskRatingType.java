
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRiskRatingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRiskRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentRiskRatingFiltering" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}RiskRatingFilteringType"/>
 *         &lt;element name="GoodGuyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRiskRatingType", propOrder = {
    "currentRiskRatingFiltering",
    "goodGuyFlag"
})
public class CustomerRiskRatingType {

    @XmlElement(name = "CurrentRiskRatingFiltering", required = true)
    protected RiskRatingFilteringType currentRiskRatingFiltering;
    @XmlElement(name = "GoodGuyFlag")
    protected Boolean goodGuyFlag;

    /**
     * Gets the value of the currentRiskRatingFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRatingFilteringType }
     *     
     */
    public RiskRatingFilteringType getCurrentRiskRatingFiltering() {
        return currentRiskRatingFiltering;
    }

    /**
     * Sets the value of the currentRiskRatingFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRatingFilteringType }
     *     
     */
    public void setCurrentRiskRatingFiltering(RiskRatingFilteringType value) {
        this.currentRiskRatingFiltering = value;
    }

    /**
     * Gets the value of the goodGuyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodGuyFlag() {
        return goodGuyFlag;
    }

    /**
     * Sets the value of the goodGuyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodGuyFlag(Boolean value) {
        this.goodGuyFlag = value;
    }

}
