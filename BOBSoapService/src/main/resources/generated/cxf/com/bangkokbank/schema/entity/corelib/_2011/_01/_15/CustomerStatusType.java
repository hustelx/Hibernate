
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatusDescTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerStatusType", propOrder = {
    "statusCode",
    "statusDescTH",
    "statusDescEN"
})
public class CustomerStatusType {

    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusDescTH")
    protected String statusDescTH;
    @XmlElement(name = "StatusDescEN")
    protected String statusDescEN;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescTH() {
        return statusDescTH;
    }

    /**
     * Sets the value of the statusDescTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescTH(String value) {
        this.statusDescTH = value;
    }

    /**
     * Gets the value of the statusDescEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescEN() {
        return statusDescEN;
    }

    /**
     * Sets the value of the statusDescEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescEN(String value) {
        this.statusDescEN = value;
    }

}
