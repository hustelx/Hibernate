
package com.bangkokbank.schema.entity.region._2013._01._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			    This entity represents the Region Code which is used for CustProfile 
 * 			    'Code' field contains Region Code
 * 				'RegionNameTH' field contains Region Name in TH
 * 				'RegionNameEN' field contains Region Name in EN
 * 		
 * 
 * <p>Java class for RegionCodeNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionCodeNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCodeNameType", propOrder = {
    "regionCode",
    "regionNameTH",
    "regionNameEN"
})
public class RegionCodeNameType {

    @XmlElement(name = "RegionCode")
    protected String regionCode;
    @XmlElement(name = "RegionNameTH")
    protected String regionNameTH;
    @XmlElement(name = "RegionNameEN")
    protected String regionNameEN;

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the regionNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNameTH() {
        return regionNameTH;
    }

    /**
     * Sets the value of the regionNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNameTH(String value) {
        this.regionNameTH = value;
    }

    /**
     * Gets the value of the regionNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNameEN() {
        return regionNameEN;
    }

    /**
     * Sets the value of the regionNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNameEN(String value) {
        this.regionNameEN = value;
    }

}
