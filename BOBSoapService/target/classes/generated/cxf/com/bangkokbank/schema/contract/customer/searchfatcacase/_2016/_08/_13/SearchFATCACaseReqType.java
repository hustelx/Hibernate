
package com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SearchFATCACase Service Request
 * 
 * <p>Java class for SearchFATCACaseReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFATCACaseReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchFATCACaseCriteria" type="{http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13}SearchFATCACaseCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFATCACaseReqType", propOrder = {
    "searchFATCACaseCriteria"
})
public class SearchFATCACaseReqType {

    @XmlElement(name = "SearchFATCACaseCriteria", required = true)
    protected SearchFATCACaseCriteriaType searchFATCACaseCriteria;

    /**
     * Gets the value of the searchFATCACaseCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFATCACaseCriteriaType }
     *     
     */
    public SearchFATCACaseCriteriaType getSearchFATCACaseCriteria() {
        return searchFATCACaseCriteria;
    }

    /**
     * Sets the value of the searchFATCACaseCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFATCACaseCriteriaType }
     *     
     */
    public void setSearchFATCACaseCriteria(SearchFATCACaseCriteriaType value) {
        this.searchFATCACaseCriteria = value;
    }

}
