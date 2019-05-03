
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Minute" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Seconds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeType", propOrder = {
    "year",
    "month",
    "day",
    "minute",
    "seconds"
})
public class AgeType {

    @XmlElement(name = "Year")
    protected BigInteger year;
    @XmlElement(name = "Month")
    protected BigInteger month;
    @XmlElement(name = "Day")
    protected BigInteger day;
    @XmlElement(name = "Minute")
    protected BigInteger minute;
    @XmlElement(name = "Seconds")
    protected BigInteger seconds;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYear(BigInteger value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonth(BigInteger value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDay(BigInteger value) {
        this.day = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinute(BigInteger value) {
        this.minute = value;
    }

    /**
     * Gets the value of the seconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeconds() {
        return seconds;
    }

    /**
     * Sets the value of the seconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeconds(BigInteger value) {
        this.seconds = value;
    }

}
