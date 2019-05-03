
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a single CCISID to other data element relationship structure. In this current version there is only RM. However, this structure should be extensible to allow for other relationship pairs
 * 
 * <p>Java class for CCISIDRelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCISIDRelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RMNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCISIDRelType", propOrder = {
    "ccisid",
    "rmNum"
})
public class CCISIDRelType {

    @XmlElement(name = "CCISID", required = true)
    protected String ccisid;
    @XmlElement(name = "RMNum")
    protected String rmNum;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

}
