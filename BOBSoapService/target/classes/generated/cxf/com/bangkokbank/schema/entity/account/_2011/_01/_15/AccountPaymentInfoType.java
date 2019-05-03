
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * <p>Java class for AccountPaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountPaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefNameType" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPaymentInfoType", propOrder = {
    "account",
    "bank",
    "branch"
})
public class AccountPaymentInfoType {

    @XmlElement(name = "Account")
    protected AccountRefNameType account;
    @XmlElement(name = "Bank")
    protected CodeNamePairType bank;
    @XmlElement(name = "Branch")
    protected CodeNamePairType branch;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefNameType }
     *     
     */
    public AccountRefNameType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefNameType }
     *     
     */
    public void setAccount(AccountRefNameType value) {
        this.account = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setBank(CodeNamePairType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setBranch(CodeNamePairType value) {
        this.branch = value;
    }

}
