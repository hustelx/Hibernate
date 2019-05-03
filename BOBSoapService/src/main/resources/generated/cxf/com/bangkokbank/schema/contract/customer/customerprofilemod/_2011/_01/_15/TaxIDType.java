
package com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTypeOfTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIDType", propOrder = {
    "taxNum",
    "idTypeOfTax"
})
public class TaxIDType {

    @XmlElement(name = "TaxNum")
    protected String taxNum;
    @XmlElement(name = "IDTypeOfTax")
    protected String idTypeOfTax;

    /**
     * Gets the value of the taxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNum() {
        return taxNum;
    }

    /**
     * Sets the value of the taxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNum(String value) {
        this.taxNum = value;
    }

    /**
     * Gets the value of the idTypeOfTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTypeOfTax() {
        return idTypeOfTax;
    }

    /**
     * Sets the value of the idTypeOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTypeOfTax(String value) {
        this.idTypeOfTax = value;
    }

}
