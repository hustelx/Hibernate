
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stateTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stateTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stateTokenID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stateTokenType", propOrder = {
    "endFlag",
    "stateTokenID"
})
public class StateTokenType {

    protected Boolean endFlag;
    @XmlElement(required = true)
    protected String stateTokenID;

    /**
     * Gets the value of the endFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndFlag() {
        return endFlag;
    }

    /**
     * Sets the value of the endFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndFlag(Boolean value) {
        this.endFlag = value;
    }

    /**
     * Gets the value of the stateTokenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateTokenID() {
        return stateTokenID;
    }

    /**
     * Sets the value of the stateTokenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateTokenID(String value) {
        this.stateTokenID = value;
    }

}
