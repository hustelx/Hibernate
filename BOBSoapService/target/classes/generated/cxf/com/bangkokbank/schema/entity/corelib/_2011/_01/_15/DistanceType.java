
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	      Distance Type with units Distance value and Unit elements
 * 	    
 * 
 * <p>Java class for DistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}LengthUnitType" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceType", propOrder = {
    "unit",
    "distance"
})
public class DistanceType {

    @XmlElement(name = "Unit")
    protected LengthUnitType unit;
    @XmlElement(name = "Distance", required = true)
    protected BigDecimal distance;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link LengthUnitType }
     *     
     */
    public LengthUnitType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthUnitType }
     *     
     */
    public void setUnit(LengthUnitType value) {
        this.unit = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

}
