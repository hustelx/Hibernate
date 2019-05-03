
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryType", propOrder = {
    "countryCode",
    "countryName",
    "countryNameTH",
    "countryNameEN"
})
public class CountryType {

    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "CountryNameTH")
    protected String countryNameTH;
    @XmlElement(name = "CountryNameEN")
    protected String countryNameEN;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameTH() {
        return countryNameTH;
    }

    /**
     * Sets the value of the countryNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameTH(String value) {
        this.countryNameTH = value;
    }

    /**
     * Gets the value of the countryNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryNameEN() {
        return countryNameEN;
    }

    /**
     * Sets the value of the countryNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryNameEN(String value) {
        this.countryNameEN = value;
    }

}
