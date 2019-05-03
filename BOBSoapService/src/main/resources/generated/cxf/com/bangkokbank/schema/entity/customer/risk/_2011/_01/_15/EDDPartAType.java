
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for EDDPartAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDDPartAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignBankCountries" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}ForeignBankCountriesType" minOccurs="0"/>
 *         &lt;element name="NegativeNewsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelatedPEPs" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="EDDDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDDPartAType", propOrder = {
    "foreignBankCountries",
    "negativeNewsFlag",
    "relatedPEPs",
    "eddDate"
})
@XmlSeeAlso({
    EDDPartBType.class
})
public class EDDPartAType {

    @XmlElement(name = "ForeignBankCountries")
    protected ForeignBankCountriesType foreignBankCountries;
    @XmlElement(name = "NegativeNewsFlag")
    protected Boolean negativeNewsFlag;
    @XmlElement(name = "RelatedPEPs")
    protected CodeDescType relatedPEPs;
    @XmlElement(name = "EDDDate")
    protected DateType eddDate;

    /**
     * Gets the value of the foreignBankCountries property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignBankCountriesType }
     *     
     */
    public ForeignBankCountriesType getForeignBankCountries() {
        return foreignBankCountries;
    }

    /**
     * Sets the value of the foreignBankCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignBankCountriesType }
     *     
     */
    public void setForeignBankCountries(ForeignBankCountriesType value) {
        this.foreignBankCountries = value;
    }

    /**
     * Gets the value of the negativeNewsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegativeNewsFlag() {
        return negativeNewsFlag;
    }

    /**
     * Sets the value of the negativeNewsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegativeNewsFlag(Boolean value) {
        this.negativeNewsFlag = value;
    }

    /**
     * Gets the value of the relatedPEPs property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRelatedPEPs() {
        return relatedPEPs;
    }

    /**
     * Sets the value of the relatedPEPs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRelatedPEPs(CodeDescType value) {
        this.relatedPEPs = value;
    }

    /**
     * Gets the value of the eddDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEDDDate() {
        return eddDate;
    }

    /**
     * Sets the value of the eddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEDDDate(DateType value) {
        this.eddDate = value;
    }

}
