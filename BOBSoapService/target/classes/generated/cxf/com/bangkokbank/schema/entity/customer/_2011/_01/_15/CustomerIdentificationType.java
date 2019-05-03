
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CustomerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDTypeOtherDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="IDIssuedBy" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentificationType", propOrder = {
    "idType",
    "idNum",
    "idTypeOtherDesc",
    "idDate",
    "expiryDate",
    "idIssuedBy"
})
public class CustomerIdentificationType {

    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDNum", required = true)
    protected String idNum;
    @XmlElement(name = "IDTypeOtherDesc")
    protected String idTypeOtherDesc;
    @XmlElement(name = "IDDate")
    protected DateType idDate;
    @XmlElement(name = "ExpiryDate")
    protected DateType expiryDate;
    @XmlElement(name = "IDIssuedBy")
    protected CodeNamePairType idIssuedBy;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNum(String value) {
        this.idNum = value;
    }

    /**
     * Gets the value of the idTypeOtherDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTypeOtherDesc() {
        return idTypeOtherDesc;
    }

    /**
     * Sets the value of the idTypeOtherDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTypeOtherDesc(String value) {
        this.idTypeOtherDesc = value;
    }

    /**
     * Gets the value of the idDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getIDDate() {
        return idDate;
    }

    /**
     * Sets the value of the idDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setIDDate(DateType value) {
        this.idDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpiryDate(DateType value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the idIssuedBy property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getIDIssuedBy() {
        return idIssuedBy;
    }

    /**
     * Sets the value of the idIssuedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setIDIssuedBy(CodeNamePairType value) {
        this.idIssuedBy = value;
    }

}
