
package com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * SearchFATCACase Service Response
 * 
 * <p>Java class for SearchFATCACaseRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFATCACaseRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="SearchFATCACaseResults" type="{http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13}SearchFATCACaseResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFATCACaseRespType", propOrder = {
    "searchFATCACaseResults"
})
public class SearchFATCACaseRespType
    extends BaseContractRespType
{

    @XmlElement(name = "SearchFATCACaseResults")
    protected SearchFATCACaseResultsType searchFATCACaseResults;

    /**
     * Gets the value of the searchFATCACaseResults property.
     * 
     * @return
     *     possible object is
     *     {@link SearchFATCACaseResultsType }
     *     
     */
    public SearchFATCACaseResultsType getSearchFATCACaseResults() {
        return searchFATCACaseResults;
    }

    /**
     * Sets the value of the searchFATCACaseResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchFATCACaseResultsType }
     *     
     */
    public void setSearchFATCACaseResults(SearchFATCACaseResultsType value) {
        this.searchFATCACaseResults = value;
    }

}
