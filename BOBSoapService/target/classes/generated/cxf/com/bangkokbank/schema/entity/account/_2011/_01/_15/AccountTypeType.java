
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountTypeNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountTypeNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTypeType", propOrder = {
    "accountTypeCode",
    "accountTypeName",
    "accountTypeNameTH",
    "accountTypeNameEN"
})
public class AccountTypeType {

    @XmlElement(name = "AccountTypeCode")
    protected String accountTypeCode;
    @XmlElement(name = "AccountTypeName")
    protected String accountTypeName;
    @XmlElement(name = "AccountTypeNameTH")
    protected String accountTypeNameTH;
    @XmlElement(name = "AccountTypeNameEN")
    protected String accountTypeNameEN;

    /**
     * Gets the value of the accountTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Sets the value of the accountTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeCode(String value) {
        this.accountTypeCode = value;
    }

    /**
     * Gets the value of the accountTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeName() {
        return accountTypeName;
    }

    /**
     * Sets the value of the accountTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeName(String value) {
        this.accountTypeName = value;
    }

    /**
     * Gets the value of the accountTypeNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeNameTH() {
        return accountTypeNameTH;
    }

    /**
     * Sets the value of the accountTypeNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeNameTH(String value) {
        this.accountTypeNameTH = value;
    }

    /**
     * Gets the value of the accountTypeNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeNameEN() {
        return accountTypeNameEN;
    }

    /**
     * Sets the value of the accountTypeNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeNameEN(String value) {
        this.accountTypeNameEN = value;
    }

}
