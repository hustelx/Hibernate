
package com.bangkokbank.schema.entity.botgroup._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOTGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOTGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOTGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BOTGroupNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BOTGroupNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOTGroupType", propOrder = {
    "botGroupCode",
    "botGroupNameTH",
    "botGroupNameEN"
})
public class BOTGroupType {

    @XmlElement(name = "BOTGroupCode", required = true)
    protected String botGroupCode;
    @XmlElement(name = "BOTGroupNameTH")
    protected String botGroupNameTH;
    @XmlElement(name = "BOTGroupNameEN")
    protected String botGroupNameEN;

    /**
     * Gets the value of the botGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTGroupCode() {
        return botGroupCode;
    }

    /**
     * Sets the value of the botGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTGroupCode(String value) {
        this.botGroupCode = value;
    }

    /**
     * Gets the value of the botGroupNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTGroupNameTH() {
        return botGroupNameTH;
    }

    /**
     * Sets the value of the botGroupNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTGroupNameTH(String value) {
        this.botGroupNameTH = value;
    }

    /**
     * Gets the value of the botGroupNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTGroupNameEN() {
        return botGroupNameEN;
    }

    /**
     * Sets the value of the botGroupNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTGroupNameEN(String value) {
        this.botGroupNameEN = value;
    }

}
