
package com.bangkokbank.schema.contract.searchblacklist._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;


/**
 * SearchBlacklist Service Request
 * 
 * <p>Java class for SearchBlacklistReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBlacklistReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CustName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBlacklistReqType", propOrder = {
    "maxRecords",
    "custName"
})
public class SearchBlacklistReqType {

    protected BigInteger maxRecords;
    @XmlElement(name = "CustName", required = true)
    protected CustomerNameType custName;

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRecords(BigInteger value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setCustName(CustomerNameType value) {
        this.custName = value;
    }

}
