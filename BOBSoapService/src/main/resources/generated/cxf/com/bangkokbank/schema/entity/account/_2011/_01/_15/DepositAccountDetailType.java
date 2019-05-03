
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.AddressLines;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;


/**
 * <p>Java class for DepositAccountDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAccountDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountRefName" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefNameType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountTypeType" minOccurs="0"/>
 *         &lt;element name="DPAMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="OwnerBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="AddressLines" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AddressLines" minOccurs="0"/>
 *         &lt;element name="ODLimitAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="FixedDepositTransDetails" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}FixedDepositTransDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositAccountDetailType", propOrder = {
    "accountRefName",
    "accountType",
    "dpaMessage",
    "currency",
    "ownerBranch",
    "addressLines",
    "odLimitAmt",
    "fixedDepositTransDetails"
})
public class DepositAccountDetailType {

    @XmlElement(name = "AccountRefName")
    protected AccountRefNameType accountRefName;
    @XmlElement(name = "AccountType")
    protected AccountTypeType accountType;
    @XmlElement(name = "DPAMessage")
    protected String dpaMessage;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "OwnerBranch")
    protected BranchCodeNameType ownerBranch;
    @XmlElement(name = "AddressLines")
    protected AddressLines addressLines;
    @XmlElement(name = "ODLimitAmt")
    protected CurrAmtType odLimitAmt;
    @XmlElement(name = "FixedDepositTransDetails")
    protected FixedDepositTransDetailsType fixedDepositTransDetails;

    /**
     * Gets the value of the accountRefName property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefNameType }
     *     
     */
    public AccountRefNameType getAccountRefName() {
        return accountRefName;
    }

    /**
     * Sets the value of the accountRefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefNameType }
     *     
     */
    public void setAccountRefName(AccountRefNameType value) {
        this.accountRefName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeType }
     *     
     */
    public AccountTypeType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeType }
     *     
     */
    public void setAccountType(AccountTypeType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the dpaMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPAMessage() {
        return dpaMessage;
    }

    /**
     * Sets the value of the dpaMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPAMessage(String value) {
        this.dpaMessage = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the ownerBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getOwnerBranch() {
        return ownerBranch;
    }

    /**
     * Sets the value of the ownerBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setOwnerBranch(BranchCodeNameType value) {
        this.ownerBranch = value;
    }

    /**
     * Gets the value of the addressLines property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLines }
     *     
     */
    public AddressLines getAddressLines() {
        return addressLines;
    }

    /**
     * Sets the value of the addressLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLines }
     *     
     */
    public void setAddressLines(AddressLines value) {
        this.addressLines = value;
    }

    /**
     * Gets the value of the odLimitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getODLimitAmt() {
        return odLimitAmt;
    }

    /**
     * Sets the value of the odLimitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setODLimitAmt(CurrAmtType value) {
        this.odLimitAmt = value;
    }

    /**
     * Gets the value of the fixedDepositTransDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FixedDepositTransDetailsType }
     *     
     */
    public FixedDepositTransDetailsType getFixedDepositTransDetails() {
        return fixedDepositTransDetails;
    }

    /**
     * Sets the value of the fixedDepositTransDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedDepositTransDetailsType }
     *     
     */
    public void setFixedDepositTransDetails(FixedDepositTransDetailsType value) {
        this.fixedDepositTransDetails = value;
    }

}
