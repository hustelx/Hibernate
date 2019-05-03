
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.TrackingInfoType;


/**
 * <p>Java class for CustomerEnhancedDueDiligenceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEnhancedDueDiligenceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="EDDPartA" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}EDDPartAType" minOccurs="0"/>
 *         &lt;element name="EDDPartB" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}EDDPartBType" minOccurs="0"/>
 *         &lt;element name="EDDDueDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEnhancedDueDiligenceInfoType", propOrder = {
    "status",
    "updateInfo",
    "eddPartA",
    "eddPartB",
    "eddDueDate"
})
public class CustomerEnhancedDueDiligenceInfoType {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "UpdateInfo")
    protected TrackingInfoType updateInfo;
    @XmlElement(name = "EDDPartA")
    protected EDDPartAType eddPartA;
    @XmlElement(name = "EDDPartB")
    protected EDDPartBType eddPartB;
    @XmlElement(name = "EDDDueDate")
    protected DateType eddDueDate;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setUpdateInfo(TrackingInfoType value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the eddPartA property.
     * 
     * @return
     *     possible object is
     *     {@link EDDPartAType }
     *     
     */
    public EDDPartAType getEDDPartA() {
        return eddPartA;
    }

    /**
     * Sets the value of the eddPartA property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDDPartAType }
     *     
     */
    public void setEDDPartA(EDDPartAType value) {
        this.eddPartA = value;
    }

    /**
     * Gets the value of the eddPartB property.
     * 
     * @return
     *     possible object is
     *     {@link EDDPartBType }
     *     
     */
    public EDDPartBType getEDDPartB() {
        return eddPartB;
    }

    /**
     * Sets the value of the eddPartB property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDDPartBType }
     *     
     */
    public void setEDDPartB(EDDPartBType value) {
        this.eddPartB = value;
    }

    /**
     * Gets the value of the eddDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEDDDueDate() {
        return eddDueDate;
    }

    /**
     * Sets the value of the eddDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEDDDueDate(DateType value) {
        this.eddDueDate = value;
    }

}
