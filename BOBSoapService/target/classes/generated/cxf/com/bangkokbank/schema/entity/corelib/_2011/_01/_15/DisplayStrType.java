
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayStrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayStrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShortForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LongForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayStrType", propOrder = {
    "defaultForm",
    "shortForm",
    "longForm"
})
public class DisplayStrType {

    @XmlElement(name = "DefaultForm", required = true)
    protected String defaultForm;
    @XmlElement(name = "ShortForm", required = true)
    protected String shortForm;
    @XmlElement(name = "LongForm", required = true)
    protected String longForm;

    /**
     * Gets the value of the defaultForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultForm() {
        return defaultForm;
    }

    /**
     * Sets the value of the defaultForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultForm(String value) {
        this.defaultForm = value;
    }

    /**
     * Gets the value of the shortForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortForm() {
        return shortForm;
    }

    /**
     * Sets the value of the shortForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortForm(String value) {
        this.shortForm = value;
    }

    /**
     * Gets the value of the longForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongForm() {
        return longForm;
    }

    /**
     * Sets the value of the longForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongForm(String value) {
        this.longForm = value;
    }

}
