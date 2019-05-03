
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMLRiskResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLRiskResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentRiskRatingFiltering" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}RiskRatingFilteringType" minOccurs="0"/>
 *         &lt;element name="InvestigatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighestRiskRatingFiltering" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}RiskRatingFilteringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLRiskResultType", propOrder = {
    "currentRiskRatingFiltering",
    "investigatedFlag",
    "highestRiskRatingFiltering"
})
public class AMLRiskResultType {

    @XmlElement(name = "CurrentRiskRatingFiltering")
    protected RiskRatingFilteringType currentRiskRatingFiltering;
    @XmlElement(name = "InvestigatedFlag")
    protected Boolean investigatedFlag;
    @XmlElement(name = "HighestRiskRatingFiltering")
    protected RiskRatingFilteringType highestRiskRatingFiltering;

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
     * Gets the value of the investigatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvestigatedFlag() {
        return investigatedFlag;
    }

    /**
     * Sets the value of the investigatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvestigatedFlag(Boolean value) {
        this.investigatedFlag = value;
    }

    /**
     * Gets the value of the highestRiskRatingFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link RiskRatingFilteringType }
     *     
     */
    public RiskRatingFilteringType getHighestRiskRatingFiltering() {
        return highestRiskRatingFiltering;
    }

    /**
     * Sets the value of the highestRiskRatingFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskRatingFilteringType }
     *     
     */
    public void setHighestRiskRatingFiltering(RiskRatingFilteringType value) {
        this.highestRiskRatingFiltering = value;
    }

}
