
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CustomerInfoRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="NameTH" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *         &lt;element name="NameEN" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerTypeType" minOccurs="0"/>
 *         &lt;element name="TypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identifications" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationsType" minOccurs="0"/>
 *         &lt;element name="BirthBizRegDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoRefType", propOrder = {
    "ccisid",
    "rmNum",
    "nameTH",
    "nameEN",
    "type",
    "typeDesc",
    "identifications",
    "birthBizRegDate"
})
public class CustomerInfoRefType {

    @XmlElement(name = "CCISID")
    protected String ccisid;
    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "NameTH")
    protected CustomerNameType nameTH;
    @XmlElement(name = "NameEN")
    protected CustomerNameType nameEN;
    @XmlElement(name = "Type")
    protected CustomerTypeType type;
    @XmlElement(name = "TypeDesc")
    protected String typeDesc;
    @XmlElement(name = "Identifications")
    protected CustomerIdentificationsType identifications;
    @XmlElement(name = "BirthBizRegDate")
    protected DateType birthBizRegDate;

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

    /**
     * Gets the value of the nameTH property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getNameTH() {
        return nameTH;
    }

    /**
     * Sets the value of the nameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setNameTH(CustomerNameType value) {
        this.nameTH = value;
    }

    /**
     * Gets the value of the nameEN property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getNameEN() {
        return nameEN;
    }

    /**
     * Sets the value of the nameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setNameEN(CustomerNameType value) {
        this.nameEN = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeType }
     *     
     */
    public CustomerTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeType }
     *     
     */
    public void setType(CustomerTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * Sets the value of the typeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDesc(String value) {
        this.typeDesc = value;
    }

    /**
     * Gets the value of the identifications property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationsType }
     *     
     */
    public CustomerIdentificationsType getIdentifications() {
        return identifications;
    }

    /**
     * Sets the value of the identifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationsType }
     *     
     */
    public void setIdentifications(CustomerIdentificationsType value) {
        this.identifications = value;
    }

    /**
     * Gets the value of the birthBizRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthBizRegDate() {
        return birthBizRegDate;
    }

    /**
     * Sets the value of the birthBizRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthBizRegDate(DateType value) {
        this.birthBizRegDate = value;
    }

}
