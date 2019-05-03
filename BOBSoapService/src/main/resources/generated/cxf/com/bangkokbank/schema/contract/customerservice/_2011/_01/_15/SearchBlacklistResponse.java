
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.searchblacklist._2011._01._15.SearchBlacklistRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15}SearchBlacklistResp"/>
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
    "searchBlacklistResp"
})
@XmlRootElement(name = "SearchBlacklistResponse")
public class SearchBlacklistResponse {

    @XmlElement(name = "SearchBlacklistResp", namespace = "http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", required = true)
    protected SearchBlacklistRespType searchBlacklistResp;

    /**
     * Gets the value of the searchBlacklistResp property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBlacklistRespType }
     *     
     */
    public SearchBlacklistRespType getSearchBlacklistResp() {
        return searchBlacklistResp;
    }

    /**
     * Sets the value of the searchBlacklistResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBlacklistRespType }
     *     
     */
    public void setSearchBlacklistResp(SearchBlacklistRespType value) {
        this.searchBlacklistResp = value;
    }

}
