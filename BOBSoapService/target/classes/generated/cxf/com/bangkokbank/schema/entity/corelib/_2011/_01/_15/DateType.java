
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Day" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DayType" minOccurs="0"/>
 *         &lt;element name="Month" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}MonthType" minOccurs="0"/>
 *         &lt;element name="Year" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}YearType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", propOrder = {
    "day",
    "month",
    "year"
})
public class DateType {

    @XmlElement(name = "Day")
    protected Integer day;
    @XmlElement(name = "Month")
    protected Integer month;
    @XmlElement(name = "Year")
    protected Integer year;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDay(Integer value) {
        this.day = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

}
