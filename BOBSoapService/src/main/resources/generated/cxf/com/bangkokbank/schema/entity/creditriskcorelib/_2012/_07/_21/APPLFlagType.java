
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APPLFlagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPLFlagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="APPLFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLFlagType", propOrder = {
    "feeRate",
    "applFlag"
})
public class APPLFlagType {

    @XmlElement(name = "FeeRate", required = true)
    protected BigDecimal feeRate;
    @XmlElement(name = "APPLFlag")
    protected boolean applFlag;

    /**
     * Gets the value of the feeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * Sets the value of the feeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeRate(BigDecimal value) {
        this.feeRate = value;
    }

    /**
     * Gets the value of the applFlag property.
     * 
     */
    public boolean isAPPLFlag() {
        return applFlag;
    }

    /**
     * Sets the value of the applFlag property.
     * 
     */
    public void setAPPLFlag(boolean value) {
        this.applFlag = value;
    }

}
