
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains elements that references(i.e. the key) a specific account entity
 * 			
 * 
 * <p>Java class for AccountRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountControlCode" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountControlCodeType" minOccurs="0"/>
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AcctNumType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRefType", propOrder = {
    "accountControlCode",
    "appID",
    "accountNum"
})
public class AccountRefType {

    @XmlElement(name = "AccountControlCode")
    protected AccountControlCodeType accountControlCode;
    @XmlElement(name = "AppID")
    protected String appID;
    @XmlElement(name = "AccountNum", required = true)
    protected String accountNum;

    /**
     * Gets the value of the accountControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountControlCodeType }
     *     
     */
    public AccountControlCodeType getAccountControlCode() {
        return accountControlCode;
    }

    /**
     * Sets the value of the accountControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountControlCodeType }
     *     
     */
    public void setAccountControlCode(AccountControlCodeType value) {
        this.accountControlCode = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

}
