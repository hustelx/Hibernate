
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.account._2011._01._15.AccountProfileType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.customer._2011._01._15.AdditionalCustomerProfileInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCAIndiciaCheckFlagsType;


/**
 * <p>Java class for FATCAIndiciaCheckOpCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAIndiciaCheckOpCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountProfile" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountProfileType" minOccurs="0"/>
 *         &lt;element name="CustomerToAccountRel" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="CustomerProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType" minOccurs="0"/>
 *         &lt;element name="AdditionalCustomerProfileInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}AdditionalCustomerProfileInfoType" minOccurs="0"/>
 *         &lt;element name="FATCAIndiciaCheckFlags" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAIndiciaCheckFlagsType" minOccurs="0"/>
 *         &lt;element name="PrimaryAcctHolderInfo" type="{http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13}FATCAPrimaryAcctHolderInfoType" minOccurs="0"/>
 *         &lt;element name="RMFinalClassification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAIndiciaCheckOpCriteriaType", propOrder = {
    "accountProfile",
    "customerToAccountRel",
    "customerProfile",
    "additionalCustomerProfileInfo",
    "fatcaIndiciaCheckFlags",
    "primaryAcctHolderInfo",
    "rmFinalClassification"
})
public class FATCAIndiciaCheckOpCriteriaType {

    @XmlElement(name = "AccountProfile")
    protected AccountProfileType accountProfile;
    @XmlElement(name = "CustomerToAccountRel")
    protected CodeDescType customerToAccountRel;
    @XmlElement(name = "CustomerProfile")
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "AdditionalCustomerProfileInfo")
    protected AdditionalCustomerProfileInfoType additionalCustomerProfileInfo;
    @XmlElement(name = "FATCAIndiciaCheckFlags")
    protected FATCAIndiciaCheckFlagsType fatcaIndiciaCheckFlags;
    @XmlElement(name = "PrimaryAcctHolderInfo")
    protected FATCAPrimaryAcctHolderInfoType primaryAcctHolderInfo;
    @XmlElement(name = "RMFinalClassification")
    protected CodeDescType rmFinalClassification;

    /**
     * Gets the value of the accountProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AccountProfileType }
     *     
     */
    public AccountProfileType getAccountProfile() {
        return accountProfile;
    }

    /**
     * Sets the value of the accountProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProfileType }
     *     
     */
    public void setAccountProfile(AccountProfileType value) {
        this.accountProfile = value;
    }

    /**
     * Gets the value of the customerToAccountRel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getCustomerToAccountRel() {
        return customerToAccountRel;
    }

    /**
     * Sets the value of the customerToAccountRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setCustomerToAccountRel(CodeDescType value) {
        this.customerToAccountRel = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the additionalCustomerProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public AdditionalCustomerProfileInfoType getAdditionalCustomerProfileInfo() {
        return additionalCustomerProfileInfo;
    }

    /**
     * Sets the value of the additionalCustomerProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public void setAdditionalCustomerProfileInfo(AdditionalCustomerProfileInfoType value) {
        this.additionalCustomerProfileInfo = value;
    }

    /**
     * Gets the value of the fatcaIndiciaCheckFlags property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAIndiciaCheckFlagsType }
     *     
     */
    public FATCAIndiciaCheckFlagsType getFATCAIndiciaCheckFlags() {
        return fatcaIndiciaCheckFlags;
    }

    /**
     * Sets the value of the fatcaIndiciaCheckFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAIndiciaCheckFlagsType }
     *     
     */
    public void setFATCAIndiciaCheckFlags(FATCAIndiciaCheckFlagsType value) {
        this.fatcaIndiciaCheckFlags = value;
    }

    /**
     * Gets the value of the primaryAcctHolderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAPrimaryAcctHolderInfoType }
     *     
     */
    public FATCAPrimaryAcctHolderInfoType getPrimaryAcctHolderInfo() {
        return primaryAcctHolderInfo;
    }

    /**
     * Sets the value of the primaryAcctHolderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAPrimaryAcctHolderInfoType }
     *     
     */
    public void setPrimaryAcctHolderInfo(FATCAPrimaryAcctHolderInfoType value) {
        this.primaryAcctHolderInfo = value;
    }

    /**
     * Gets the value of the rmFinalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRMFinalClassification() {
        return rmFinalClassification;
    }

    /**
     * Sets the value of the rmFinalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRMFinalClassification(CodeDescType value) {
        this.rmFinalClassification = value;
    }

}
