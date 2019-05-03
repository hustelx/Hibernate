
package com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerIdentificationsType;
import com.bangkokbank.schema.entity.customer._2011._01._15.GIINGroupType;


/**
 * <p>Java class for CustomerProfilePreviousModType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfilePreviousModType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifications" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationsType" minOccurs="0"/>
 *         &lt;element name="TaxID" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15}TaxIDType" minOccurs="0"/>
 *         &lt;element name="ForeignTaxID" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15}ForeignTaxIDType" minOccurs="0"/>
 *         &lt;element name="GIINGroup" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}GIINGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfilePreviousModType", propOrder = {
    "identifications",
    "taxID",
    "foreignTaxID",
    "giinGroup"
})
public class CustomerProfilePreviousModType {

    @XmlElement(name = "Identifications")
    protected CustomerIdentificationsType identifications;
    @XmlElement(name = "TaxID")
    protected TaxIDType taxID;
    @XmlElement(name = "ForeignTaxID")
    protected ForeignTaxIDType foreignTaxID;
    @XmlElement(name = "GIINGroup")
    protected GIINGroupType giinGroup;

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
     * Gets the value of the taxID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIDType }
     *     
     */
    public TaxIDType getTaxID() {
        return taxID;
    }

    /**
     * Sets the value of the taxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIDType }
     *     
     */
    public void setTaxID(TaxIDType value) {
        this.taxID = value;
    }

    /**
     * Gets the value of the foreignTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignTaxIDType }
     *     
     */
    public ForeignTaxIDType getForeignTaxID() {
        return foreignTaxID;
    }

    /**
     * Sets the value of the foreignTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignTaxIDType }
     *     
     */
    public void setForeignTaxID(ForeignTaxIDType value) {
        this.foreignTaxID = value;
    }

    /**
     * Gets the value of the giinGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GIINGroupType }
     *     
     */
    public GIINGroupType getGIINGroup() {
        return giinGroup;
    }

    /**
     * Sets the value of the giinGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIINGroupType }
     *     
     */
    public void setGIINGroup(GIINGroupType value) {
        this.giinGroup = value;
    }

}
