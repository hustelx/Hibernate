
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAPrimaryAcctHolderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAPrimaryAcctHolderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountHolderRMID" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="AccountHolderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountHolderTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAPrimaryAcctHolderInfoType", propOrder = {
    "accountHolderName",
    "accountHolderRMID",
    "accountHolderCode",
    "accountHolderTypeCode"
})
public class FATCAPrimaryAcctHolderInfoType {

    @XmlElement(name = "AccountHolderName")
    protected String accountHolderName;
    @XmlElement(name = "AccountHolderRMID")
    protected String accountHolderRMID;
    @XmlElement(name = "AccountHolderCode")
    protected String accountHolderCode;
    @XmlElement(name = "AccountHolderTypeCode")
    protected String accountHolderTypeCode;

    /**
     * Gets the value of the accountHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Sets the value of the accountHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderName(String value) {
        this.accountHolderName = value;
    }

    /**
     * Gets the value of the accountHolderRMID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderRMID() {
        return accountHolderRMID;
    }

    /**
     * Sets the value of the accountHolderRMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderRMID(String value) {
        this.accountHolderRMID = value;
    }

    /**
     * Gets the value of the accountHolderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    /**
     * Sets the value of the accountHolderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderCode(String value) {
        this.accountHolderCode = value;
    }

    /**
     * Gets the value of the accountHolderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolderTypeCode() {
        return accountHolderTypeCode;
    }

    /**
     * Sets the value of the accountHolderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountHolderTypeCode(String value) {
        this.accountHolderTypeCode = value;
    }

}
