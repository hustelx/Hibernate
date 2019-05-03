
package com.bangkokbank.schema.entity.bblgroup._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BBLGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BBLGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BBLGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BBLGroupNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBLGroupNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BBLGroupType", propOrder = {
    "bblGroupCode",
    "bblGroupNameTH",
    "bblGroupNameEN",
    "mainGroupFlag"
})
public class BBLGroupType {

    @XmlElement(name = "BBLGroupCode", required = true)
    protected String bblGroupCode;
    @XmlElement(name = "BBLGroupNameTH")
    protected String bblGroupNameTH;
    @XmlElement(name = "BBLGroupNameEN")
    protected String bblGroupNameEN;
    @XmlElement(name = "MainGroupFlag")
    protected Boolean mainGroupFlag;

    /**
     * Gets the value of the bblGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBLGroupCode() {
        return bblGroupCode;
    }

    /**
     * Sets the value of the bblGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBLGroupCode(String value) {
        this.bblGroupCode = value;
    }

    /**
     * Gets the value of the bblGroupNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBLGroupNameTH() {
        return bblGroupNameTH;
    }

    /**
     * Sets the value of the bblGroupNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBLGroupNameTH(String value) {
        this.bblGroupNameTH = value;
    }

    /**
     * Gets the value of the bblGroupNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBLGroupNameEN() {
        return bblGroupNameEN;
    }

    /**
     * Sets the value of the bblGroupNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBLGroupNameEN(String value) {
        this.bblGroupNameEN = value;
    }

    /**
     * Gets the value of the mainGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMainGroupFlag() {
        return mainGroupFlag;
    }

    /**
     * Sets the value of the mainGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMainGroupFlag(Boolean value) {
        this.mainGroupFlag = value;
    }

}
