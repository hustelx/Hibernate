
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CountryType;


/**
 * <p>Java class for ForeignBankCountriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignBankCountriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignBankCountry" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CountryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignBankCountriesType", propOrder = {
    "foreignBankCountry"
})
public class ForeignBankCountriesType {

    @XmlElement(name = "ForeignBankCountry")
    protected List<CountryType> foreignBankCountry;

    /**
     * Gets the value of the foreignBankCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignBankCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignBankCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getForeignBankCountry() {
        if (foreignBankCountry == null) {
            foreignBankCountry = new ArrayList<CountryType>();
        }
        return this.foreignBankCountry;
    }

}
