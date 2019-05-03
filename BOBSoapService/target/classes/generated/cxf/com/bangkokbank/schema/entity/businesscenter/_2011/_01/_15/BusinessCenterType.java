
package com.bangkokbank.schema.entity.businesscenter._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		'Code' field contains BC Code from CCIS
 * 		'Name' field contains BC Name from CCIS 
 * 		
 * 
 * <p>Java class for BusinessCenterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessCenterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BCCode" type="{http://www.bangkokbank.com/schema/entity/BusinessCenter/2011/01/15}BusinessCenterCodeType" minOccurs="0"/>
 *         &lt;element name="BCNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessCenterType", propOrder = {
    "bcCode",
    "bcNameTH",
    "bcNameEN"
})
public class BusinessCenterType {

    @XmlElement(name = "BCCode")
    protected String bcCode;
    @XmlElement(name = "BCNameTH")
    protected String bcNameTH;
    @XmlElement(name = "BCNameEN")
    protected String bcNameEN;

    /**
     * Gets the value of the bcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCCode() {
        return bcCode;
    }

    /**
     * Sets the value of the bcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCCode(String value) {
        this.bcCode = value;
    }

    /**
     * Gets the value of the bcNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCNameTH() {
        return bcNameTH;
    }

    /**
     * Sets the value of the bcNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCNameTH(String value) {
        this.bcNameTH = value;
    }

    /**
     * Gets the value of the bcNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCNameEN() {
        return bcNameEN;
    }

    /**
     * Sets the value of the bcNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCNameEN(String value) {
        this.bcNameEN = value;
    }

}
