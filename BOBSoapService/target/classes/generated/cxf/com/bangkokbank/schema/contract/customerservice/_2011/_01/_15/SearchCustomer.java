
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.searchcustomer._2011._01._15.SearchCustomerReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15}SearchCustomerReq"/>
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
    "searchCustomerReq"
})
@XmlRootElement(name = "SearchCustomer")
public class SearchCustomer {

    @XmlElement(name = "SearchCustomerReq", namespace = "http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15", required = true)
    protected SearchCustomerReqType searchCustomerReq;

    /**
     * Gets the value of the searchCustomerReq property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomerReqType }
     *     
     */
    public SearchCustomerReqType getSearchCustomerReq() {
        return searchCustomerReq;
    }

    /**
     * Sets the value of the searchCustomerReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomerReqType }
     *     
     */
    public void setSearchCustomerReq(SearchCustomerReqType value) {
        this.searchCustomerReq = value;
    }

}
