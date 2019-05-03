
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13.SearchFATCACaseRespType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13}SearchFATCACaseResp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchFATCACaseResp"
})
@XmlRootElement(name = "SearchFATCACaseResponse")
public class SearchFATCACaseResponse {

    @XmlElement(name = "SearchFATCACaseResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13", required = true)
    protected SearchFATCACaseRespType searchFATCACaseResp;

    /**
     * Gets the value of the searchFATCACaseResp property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFATCACaseRespType }
     *     
     */
    public SearchFATCACaseRespType getSearchFATCACaseResp() {
        return searchFATCACaseResp;
    }

    /**
     * Sets the value of the searchFATCACaseResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFATCACaseRespType }
     *     
     */
    public void setSearchFATCACaseResp(SearchFATCACaseRespType value) {
        this.searchFATCACaseResp = value;
    }

}
