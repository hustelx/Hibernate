
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateTimeType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.customer._2011._01._15.OwnersType;


/**
 * Represents an Account Balance Entity
 * 
 * <p>Java class for AccountBalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountProdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountProdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="AvailableBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="ODLimitAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="ODExpiryDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="CreditLineAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owners" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}OwnersType" minOccurs="0"/>
 *         &lt;element name="CTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountOpenedDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="AcctHoldFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FullHoldFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StopChequeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoldFundingAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="PartialHoldAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TodayFullHoldAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="YesterdayFullHoldAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="LastTransDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LastCalDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="BBLInterestReceived" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="BBLInterestPayable" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="AccountLinkFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountLinkNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BookBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="InsurancePremium" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountBalanceType", propOrder = {
    "accountName",
    "accountProdCode",
    "accountProdDesc",
    "branch",
    "availableBalance",
    "currentBalance",
    "odLimitAmount",
    "odExpiryDate",
    "creditLineAmount",
    "accountStatus",
    "owners",
    "ctCode",
    "accountShortName",
    "accountOpenedDate",
    "acctHoldFlag",
    "fullHoldFlag",
    "stopChequeFlag",
    "holdFundingAmt",
    "partialHoldAmt",
    "todayFullHoldAmt",
    "yesterdayFullHoldAmt",
    "lastTransDate",
    "lastCalDate",
    "bblInterestReceived",
    "bblInterestPayable",
    "accountLinkFlag",
    "accountLinkNum",
    "dateTime",
    "bookBalance",
    "insurancePremium"
})
public class AccountBalanceType {

    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountProdCode")
    protected String accountProdCode;
    @XmlElement(name = "AccountProdDesc")
    protected String accountProdDesc;
    @XmlElement(name = "Branch")
    protected BranchCodeNameType branch;
    @XmlElement(name = "AvailableBalance")
    protected CurrAmtType availableBalance;
    @XmlElement(name = "CurrentBalance")
    protected CurrAmtType currentBalance;
    @XmlElement(name = "ODLimitAmount")
    protected CurrAmtType odLimitAmount;
    @XmlElement(name = "ODExpiryDate")
    protected DateType odExpiryDate;
    @XmlElement(name = "CreditLineAmount")
    protected CurrAmtType creditLineAmount;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "Owners")
    protected OwnersType owners;
    @XmlElement(name = "CTCode")
    protected String ctCode;
    @XmlElement(name = "AccountShortName")
    protected String accountShortName;
    @XmlElement(name = "AccountOpenedDate")
    protected DateType accountOpenedDate;
    @XmlElement(name = "AcctHoldFlag")
    protected Boolean acctHoldFlag;
    @XmlElement(name = "FullHoldFlag")
    protected Boolean fullHoldFlag;
    @XmlElement(name = "StopChequeFlag")
    protected Boolean stopChequeFlag;
    @XmlElement(name = "HoldFundingAmt")
    protected CurrAmtType holdFundingAmt;
    @XmlElement(name = "PartialHoldAmt")
    protected CurrAmtType partialHoldAmt;
    @XmlElement(name = "TodayFullHoldAmt")
    protected CurrAmtType todayFullHoldAmt;
    @XmlElement(name = "YesterdayFullHoldAmt")
    protected CurrAmtType yesterdayFullHoldAmt;
    @XmlElement(name = "LastTransDate")
    protected DateType lastTransDate;
    @XmlElement(name = "LastCalDate")
    protected DateType lastCalDate;
    @XmlElement(name = "BBLInterestReceived")
    protected CurrAmtType bblInterestReceived;
    @XmlElement(name = "BBLInterestPayable")
    protected CurrAmtType bblInterestPayable;
    @XmlElement(name = "AccountLinkFlag")
    protected Boolean accountLinkFlag;
    @XmlElement(name = "AccountLinkNum")
    protected String accountLinkNum;
    @XmlElement(name = "DateTime")
    protected DateTimeType dateTime;
    @XmlElement(name = "BookBalance")
    protected CurrAmtType bookBalance;
    @XmlElement(name = "InsurancePremium")
    protected CurrAmtType insurancePremium;

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

    /**
     * Gets the value of the accountProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountProdCode() {
        return accountProdCode;
    }

    /**
     * Sets the value of the accountProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountProdCode(String value) {
        this.accountProdCode = value;
    }

    /**
     * Gets the value of the accountProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountProdDesc() {
        return accountProdDesc;
    }

    /**
     * Sets the value of the accountProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountProdDesc(String value) {
        this.accountProdDesc = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setBranch(BranchCodeNameType value) {
        this.branch = value;
    }

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setAvailableBalance(CurrAmtType value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setCurrentBalance(CurrAmtType value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the odLimitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getODLimitAmount() {
        return odLimitAmount;
    }

    /**
     * Sets the value of the odLimitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setODLimitAmount(CurrAmtType value) {
        this.odLimitAmount = value;
    }

    /**
     * Gets the value of the odExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getODExpiryDate() {
        return odExpiryDate;
    }

    /**
     * Sets the value of the odExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setODExpiryDate(DateType value) {
        this.odExpiryDate = value;
    }

    /**
     * Gets the value of the creditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getCreditLineAmount() {
        return creditLineAmount;
    }

    /**
     * Sets the value of the creditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setCreditLineAmount(CurrAmtType value) {
        this.creditLineAmount = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the owners property.
     * 
     * @return
     *     possible object is
     *     {@link OwnersType }
     *     
     */
    public OwnersType getOwners() {
        return owners;
    }

    /**
     * Sets the value of the owners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnersType }
     *     
     */
    public void setOwners(OwnersType value) {
        this.owners = value;
    }

    /**
     * Gets the value of the ctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTCode() {
        return ctCode;
    }

    /**
     * Sets the value of the ctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTCode(String value) {
        this.ctCode = value;
    }

    /**
     * Gets the value of the accountShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountShortName() {
        return accountShortName;
    }

    /**
     * Sets the value of the accountShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountShortName(String value) {
        this.accountShortName = value;
    }

    /**
     * Gets the value of the accountOpenedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAccountOpenedDate() {
        return accountOpenedDate;
    }

    /**
     * Sets the value of the accountOpenedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAccountOpenedDate(DateType value) {
        this.accountOpenedDate = value;
    }

    /**
     * Gets the value of the acctHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctHoldFlag() {
        return acctHoldFlag;
    }

    /**
     * Sets the value of the acctHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcctHoldFlag(Boolean value) {
        this.acctHoldFlag = value;
    }

    /**
     * Gets the value of the fullHoldFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullHoldFlag() {
        return fullHoldFlag;
    }

    /**
     * Sets the value of the fullHoldFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullHoldFlag(Boolean value) {
        this.fullHoldFlag = value;
    }

    /**
     * Gets the value of the stopChequeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopChequeFlag() {
        return stopChequeFlag;
    }

    /**
     * Sets the value of the stopChequeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopChequeFlag(Boolean value) {
        this.stopChequeFlag = value;
    }

    /**
     * Gets the value of the holdFundingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getHoldFundingAmt() {
        return holdFundingAmt;
    }

    /**
     * Sets the value of the holdFundingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setHoldFundingAmt(CurrAmtType value) {
        this.holdFundingAmt = value;
    }

    /**
     * Gets the value of the partialHoldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getPartialHoldAmt() {
        return partialHoldAmt;
    }

    /**
     * Sets the value of the partialHoldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setPartialHoldAmt(CurrAmtType value) {
        this.partialHoldAmt = value;
    }

    /**
     * Gets the value of the todayFullHoldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTodayFullHoldAmt() {
        return todayFullHoldAmt;
    }

    /**
     * Sets the value of the todayFullHoldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTodayFullHoldAmt(CurrAmtType value) {
        this.todayFullHoldAmt = value;
    }

    /**
     * Gets the value of the yesterdayFullHoldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getYesterdayFullHoldAmt() {
        return yesterdayFullHoldAmt;
    }

    /**
     * Sets the value of the yesterdayFullHoldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setYesterdayFullHoldAmt(CurrAmtType value) {
        this.yesterdayFullHoldAmt = value;
    }

    /**
     * Gets the value of the lastTransDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastTransDate() {
        return lastTransDate;
    }

    /**
     * Sets the value of the lastTransDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastTransDate(DateType value) {
        this.lastTransDate = value;
    }

    /**
     * Gets the value of the lastCalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastCalDate() {
        return lastCalDate;
    }

    /**
     * Sets the value of the lastCalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastCalDate(DateType value) {
        this.lastCalDate = value;
    }

    /**
     * Gets the value of the bblInterestReceived property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getBBLInterestReceived() {
        return bblInterestReceived;
    }

    /**
     * Sets the value of the bblInterestReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setBBLInterestReceived(CurrAmtType value) {
        this.bblInterestReceived = value;
    }

    /**
     * Gets the value of the bblInterestPayable property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getBBLInterestPayable() {
        return bblInterestPayable;
    }

    /**
     * Sets the value of the bblInterestPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setBBLInterestPayable(CurrAmtType value) {
        this.bblInterestPayable = value;
    }

    /**
     * Gets the value of the accountLinkFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountLinkFlag() {
        return accountLinkFlag;
    }

    /**
     * Sets the value of the accountLinkFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountLinkFlag(Boolean value) {
        this.accountLinkFlag = value;
    }

    /**
     * Gets the value of the accountLinkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountLinkNum() {
        return accountLinkNum;
    }

    /**
     * Sets the value of the accountLinkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountLinkNum(String value) {
        this.accountLinkNum = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the bookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getBookBalance() {
        return bookBalance;
    }

    /**
     * Sets the value of the bookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setBookBalance(CurrAmtType value) {
        this.bookBalance = value;
    }

    /**
     * Gets the value of the insurancePremium property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getInsurancePremium() {
        return insurancePremium;
    }

    /**
     * Sets the value of the insurancePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setInsurancePremium(CurrAmtType value) {
        this.insurancePremium = value;
    }

}
