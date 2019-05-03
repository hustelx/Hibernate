
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.account._2011._01._15.AccountDefaultInfosType;


/**
 * <p>Java class for CustomerDefaultInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDefaultInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountDefaultInfos" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountDefaultInfosType" minOccurs="0"/>
 *         &lt;element name="CreditCardDefaultInfos" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CreditCardDefaultInfosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDefaultInfoType", propOrder = {
    "accountDefaultInfos",
    "creditCardDefaultInfos"
})
public class CustomerDefaultInfoType {

    @XmlElement(name = "AccountDefaultInfos")
    protected AccountDefaultInfosType accountDefaultInfos;
    @XmlElement(name = "CreditCardDefaultInfos")
    protected CreditCardDefaultInfosType creditCardDefaultInfos;

    /**
     * Gets the value of the accountDefaultInfos property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDefaultInfosType }
     *     
     */
    public AccountDefaultInfosType getAccountDefaultInfos() {
        return accountDefaultInfos;
    }

    /**
     * Sets the value of the accountDefaultInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDefaultInfosType }
     *     
     */
    public void setAccountDefaultInfos(AccountDefaultInfosType value) {
        this.accountDefaultInfos = value;
    }

    /**
     * Gets the value of the creditCardDefaultInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDefaultInfosType }
     *     
     */
    public CreditCardDefaultInfosType getCreditCardDefaultInfos() {
        return creditCardDefaultInfos;
    }

    /**
     * Sets the value of the creditCardDefaultInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDefaultInfosType }
     *     
     */
    public void setCreditCardDefaultInfos(CreditCardDefaultInfosType value) {
        this.creditCardDefaultInfos = value;
    }

}
