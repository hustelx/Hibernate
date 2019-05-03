
package com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignTaxIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignTaxIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignTaxIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignTaxIDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignTaxIDType", propOrder = {
    "foreignTaxIDType",
    "foreignTaxIDNum"
})
public class ForeignTaxIDType {

    @XmlElement(name = "ForeignTaxIDType")
    protected String foreignTaxIDType;
    @XmlElement(name = "ForeignTaxIDNum")
    protected String foreignTaxIDNum;

    /**
     * Gets the value of the foreignTaxIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTaxIDType() {
        return foreignTaxIDType;
    }

    /**
     * Sets the value of the foreignTaxIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTaxIDType(String value) {
        this.foreignTaxIDType = value;
    }

    /**
     * Gets the value of the foreignTaxIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTaxIDNum() {
        return foreignTaxIDNum;
    }

    /**
     * Sets the value of the foreignTaxIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTaxIDNum(String value) {
        this.foreignTaxIDNum = value;
    }

}
