
package com.bangkokbank.schema.entity.blacklist._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;


/**
 * <p>Java class for CustomerFinancialNewsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFinancialNewsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *         &lt;element name="NewsEntries" type="{http://www.bangkokbank.com/schema/entity/Blacklist/2011/01/15}NewsEntriesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFinancialNewsType", propOrder = {
    "custName",
    "newsEntries"
})
public class CustomerFinancialNewsType {

    @XmlElement(name = "CustName", required = true)
    protected CustomerNameType custName;
    @XmlElement(name = "NewsEntries", required = true)
    protected NewsEntriesType newsEntries;

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

    /**
     * Gets the value of the newsEntries property.
     * 
     * @return
     *     possible object is
     *     {@link NewsEntriesType }
     *     
     */
    public NewsEntriesType getNewsEntries() {
        return newsEntries;
    }

    /**
     * Sets the value of the newsEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsEntriesType }
     *     
     */
    public void setNewsEntries(NewsEntriesType value) {
        this.newsEntries = value;
    }

}
