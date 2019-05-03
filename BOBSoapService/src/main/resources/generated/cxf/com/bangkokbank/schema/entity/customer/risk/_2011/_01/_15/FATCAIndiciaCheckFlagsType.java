
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAIndiciaCheckFlagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAIndiciaCheckFlagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareHolderRequiredFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InCareOrHoldMailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAIndiciaCheckFlagsType", propOrder = {
    "shareHolderRequiredFlag",
    "inCareOrHoldMailFlag"
})
public class FATCAIndiciaCheckFlagsType {

    @XmlElement(name = "ShareHolderRequiredFlag")
    protected Boolean shareHolderRequiredFlag;
    @XmlElement(name = "InCareOrHoldMailFlag")
    protected Boolean inCareOrHoldMailFlag;

    /**
     * Gets the value of the shareHolderRequiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareHolderRequiredFlag() {
        return shareHolderRequiredFlag;
    }

    /**
     * Sets the value of the shareHolderRequiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareHolderRequiredFlag(Boolean value) {
        this.shareHolderRequiredFlag = value;
    }

    /**
     * Gets the value of the inCareOrHoldMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInCareOrHoldMailFlag() {
        return inCareOrHoldMailFlag;
    }

    /**
     * Sets the value of the inCareOrHoldMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInCareOrHoldMailFlag(Boolean value) {
        this.inCareOrHoldMailFlag = value;
    }

}
