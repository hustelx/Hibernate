
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRefNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRefNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRef" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRefNameType", propOrder = {
    "accountRef",
    "accountName"
})
public class AccountRefNameType {

    @XmlElement(name = "AccountRef", namespace = "http://www.bangkokbank.com/schema/entity/Account/2011/01/15")
    protected AccountRefType accountRef;
    @XmlElement(name = "AccountName")
    protected String accountName;

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefType }
     *     
     */
    public AccountRefType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefType }
     *     
     */
    public void setAccountRef(AccountRefType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

}
