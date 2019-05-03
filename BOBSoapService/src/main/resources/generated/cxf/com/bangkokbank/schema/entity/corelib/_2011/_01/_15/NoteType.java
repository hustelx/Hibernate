
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Misc" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}MiscType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteType", propOrder = {
    "customerNote",
    "misc"
})
public class NoteType {

    @XmlElement(name = "CustomerNote")
    protected String customerNote;
    @XmlElement(name = "Misc")
    protected MiscType misc;

    /**
     * Gets the value of the customerNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNote() {
        return customerNote;
    }

    /**
     * Sets the value of the customerNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNote(String value) {
        this.customerNote = value;
    }

    /**
     * Gets the value of the misc property.
     * 
     * @return
     *     possible object is
     *     {@link MiscType }
     *     
     */
    public MiscType getMisc() {
        return misc;
    }

    /**
     * Sets the value of the misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscType }
     *     
     */
    public void setMisc(MiscType value) {
        this.misc = value;
    }

}
