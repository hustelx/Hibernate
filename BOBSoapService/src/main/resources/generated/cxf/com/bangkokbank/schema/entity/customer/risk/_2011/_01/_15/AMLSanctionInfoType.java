
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerIdentificationType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerRefType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerTypeType;
import com.bangkokbank.schema.entity.customer._2011._01._15.NationalitiesType;


/**
 * <p>Java class for AMLSanctionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLSanctionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRefType" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerTypeType" minOccurs="0"/>
 *         &lt;element name="PrimaryName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *         &lt;element name="CustomerNameEN" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}Nationalities" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="IDAddress" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressType" minOccurs="0"/>
 *         &lt;element name="CustomerRiskRating" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerRiskRatingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLSanctionInfoType", propOrder = {
    "customerRef",
    "type",
    "primaryName",
    "customerNameEN",
    "nationalities",
    "identification",
    "dateOfBirth",
    "idAddress",
    "customerRiskRating"
})
public class AMLSanctionInfoType {

    @XmlElement(name = "CustomerRef")
    protected CustomerRefType customerRef;
    @XmlElement(name = "Type")
    protected CustomerTypeType type;
    @XmlElement(name = "PrimaryName")
    protected CustomerNameType primaryName;
    @XmlElement(name = "CustomerNameEN")
    protected CustomerNameType customerNameEN;
    @XmlElement(name = "Nationalities", namespace = "http://www.bangkokbank.com/schema/entity/Customer/2011/01/15")
    protected NationalitiesType nationalities;
    @XmlElement(name = "Identification")
    protected CustomerIdentificationType identification;
    @XmlElement(name = "DateOfBirth")
    protected DateType dateOfBirth;
    @XmlElement(name = "IDAddress")
    protected PostAddressType idAddress;
    @XmlElement(name = "CustomerRiskRating")
    protected CustomerRiskRatingType customerRiskRating;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRefType }
     *     
     */
    public CustomerRefType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRefType }
     *     
     */
    public void setCustomerRef(CustomerRefType value) {
        this.customerRef = value;
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
     * Gets the value of the primaryName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getPrimaryName() {
        return primaryName;
    }

    /**
     * Sets the value of the primaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setPrimaryName(CustomerNameType value) {
        this.primaryName = value;
    }

    /**
     * Gets the value of the customerNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getCustomerNameEN() {
        return customerNameEN;
    }

    /**
     * Sets the value of the customerNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setCustomerNameEN(CustomerNameType value) {
        this.customerNameEN = value;
    }

    /**
     * Gets the value of the nationalities property.
     * 
     * @return
     *     possible object is
     *     {@link NationalitiesType }
     *     
     */
    public NationalitiesType getNationalities() {
        return nationalities;
    }

    /**
     * Sets the value of the nationalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalitiesType }
     *     
     */
    public void setNationalities(NationalitiesType value) {
        this.nationalities = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setIdentification(CustomerIdentificationType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDateOfBirth(DateType value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the idAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressType }
     *     
     */
    public PostAddressType getIDAddress() {
        return idAddress;
    }

    /**
     * Sets the value of the idAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressType }
     *     
     */
    public void setIDAddress(PostAddressType value) {
        this.idAddress = value;
    }

    /**
     * Gets the value of the customerRiskRating property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRiskRatingType }
     *     
     */
    public CustomerRiskRatingType getCustomerRiskRating() {
        return customerRiskRating;
    }

    /**
     * Sets the value of the customerRiskRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRiskRatingType }
     *     
     */
    public void setCustomerRiskRating(CustomerRiskRatingType value) {
        this.customerRiskRating = value;
    }

}
