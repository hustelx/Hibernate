
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.searchblacklist._2011._01._15.SearchBlacklistReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15}SearchBlacklistReq"/>
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
    "searchBlacklistReq"
})
@XmlRootElement(name = "SearchBlacklist")
public class SearchBlacklist {

    @XmlElement(name = "SearchBlacklistReq", namespace = "http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", required = true)
    protected SearchBlacklistReqType searchBlacklistReq;

    /**
     * Gets the value of the searchBlacklistReq property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBlacklistReqType }
     *     
     */
    public SearchBlacklistReqType getSearchBlacklistReq() {
        return searchBlacklistReq;
    }

    /**
     * Sets the value of the searchBlacklistReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBlacklistReqType }
     *     
     */
    public void setSearchBlacklistReq(SearchBlacklistReqType value) {
        this.searchBlacklistReq = value;
    }

}
