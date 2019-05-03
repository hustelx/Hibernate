
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="ModInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="DelInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkType", propOrder = {
    "name",
    "remark",
    "addInfo",
    "modInfo",
    "delInfo"
})
public class RemarkType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "AddInfo")
    protected TrackingInfoType addInfo;
    @XmlElement(name = "ModInfo")
    protected TrackingInfoType modInfo;
    @XmlElement(name = "DelInfo")
    protected TrackingInfoType delInfo;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setAddInfo(TrackingInfoType value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the modInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getModInfo() {
        return modInfo;
    }

    /**
     * Sets the value of the modInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setModInfo(TrackingInfoType value) {
        this.modInfo = value;
    }

    /**
     * Gets the value of the delInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getDelInfo() {
        return delInfo;
    }

    /**
     * Sets the value of the delInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setDelInfo(TrackingInfoType value) {
        this.delInfo = value;
    }

}
