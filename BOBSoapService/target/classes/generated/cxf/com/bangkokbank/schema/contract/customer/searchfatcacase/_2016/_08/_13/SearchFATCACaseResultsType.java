
package com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCACaseDetailType;


/**
 * <p>Java class for SearchFATCACaseResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFATCACaseResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FATCACase" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFATCACaseResultsType", propOrder = {
    "fatcaCase"
})
public class SearchFATCACaseResultsType {

    @XmlElement(name = "FATCACase")
    protected FATCACaseDetailType fatcaCase;

    /**
     * Gets the value of the fatcaCase property.
     * 
     * @return
     *     possible object is
     *     {@link FATCACaseDetailType }
     *     
     */
    public FATCACaseDetailType getFATCACase() {
        return fatcaCase;
    }

    /**
     * Sets the value of the fatcaCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCACaseDetailType }
     *     
     */
    public void setFATCACase(FATCACaseDetailType value) {
        this.fatcaCase = value;
    }

}
