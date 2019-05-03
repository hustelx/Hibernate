
package com.bangkokbank.schema.entity.businessdivision._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDivisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDivisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DivCode" type="{http://www.bangkokbank.com/schema/entity/BusinessDivision/2011/01/15}BusinessDivisionCodeType" minOccurs="0"/>
 *         &lt;element name="DivNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DivNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDivisionType", propOrder = {
    "divCode",
    "divNameTH",
    "divNameEN"
})
public class BusinessDivisionType {

    @XmlElement(name = "DivCode")
    protected String divCode;
    @XmlElement(name = "DivNameTH")
    protected String divNameTH;
    @XmlElement(name = "DivNameEN")
    protected String divNameEN;

    /**
     * Gets the value of the divCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivCode() {
        return divCode;
    }

    /**
     * Sets the value of the divCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivCode(String value) {
        this.divCode = value;
    }

    /**
     * Gets the value of the divNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivNameTH() {
        return divNameTH;
    }

    /**
     * Sets the value of the divNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivNameTH(String value) {
        this.divNameTH = value;
    }

    /**
     * Gets the value of the divNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivNameEN() {
        return divNameEN;
    }

    /**
     * Sets the value of the divNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivNameEN(String value) {
        this.divNameEN = value;
    }

}
