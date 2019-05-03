
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * <p>Java class for PEPInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PEPInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nationality" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RelatedPEPs" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PEPInfoType", propOrder = {
    "nationality",
    "position",
    "relatedPEPs"
})
public class PEPInfoType {

    @XmlElement(name = "Nationality")
    protected CodeNamePairType nationality;
    @XmlElement(name = "Position", required = true)
    protected String position;
    @XmlElement(name = "RelatedPEPs")
    protected CodeNamePairType relatedPEPs;

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setNationality(CodeNamePairType value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the relatedPEPs property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getRelatedPEPs() {
        return relatedPEPs;
    }

    /**
     * Sets the value of the relatedPEPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setRelatedPEPs(CodeNamePairType value) {
        this.relatedPEPs = value;
    }

}
