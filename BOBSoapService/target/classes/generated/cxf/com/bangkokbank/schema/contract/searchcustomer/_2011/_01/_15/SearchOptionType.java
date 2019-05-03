
package com.bangkokbank.schema.contract.searchcustomer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchByPortfolio" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptionType", propOrder = {
    "searchByPortfolio"
})
public class SearchOptionType {

    @XmlElement(name = "SearchByPortfolio")
    protected String searchByPortfolio;

    /**
     * Gets the value of the searchByPortfolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchByPortfolio() {
        return searchByPortfolio;
    }

    /**
     * Sets the value of the searchByPortfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchByPortfolio(String value) {
        this.searchByPortfolio = value;
    }

}
