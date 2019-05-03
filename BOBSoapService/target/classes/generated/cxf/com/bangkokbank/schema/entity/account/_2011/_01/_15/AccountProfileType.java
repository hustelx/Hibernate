
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchDetailType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.AccountOpeningObjectiveType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.ContactNumsType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PeriodType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.SourceOfFundType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;


/**
 * <p>Java class for AccountProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountRef" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefType" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JointAcctFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpenDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="PassbookNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="AccountNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressType" minOccurs="0"/>
 *         &lt;element name="ContactNums" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ContactNumsType" minOccurs="0"/>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType" minOccurs="0"/>
 *         &lt;element name="CTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CitizenCode" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AccountOpeningObjective" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}SourceOfFund" minOccurs="0"/>
 *         &lt;element name="NumOfDepositTranPerMonth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="DepositTranAmtPerMonth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="NumOfWithdrawnTranPerMonth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="WithdrawnTranAmtPerMonth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PeriodType" minOccurs="0"/>
 *         &lt;element name="AcctDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsePassbookCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FixedMultiTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="BlockDBCardFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HoldAllFundFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PledgeFullBalanceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MainBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeType" minOccurs="0"/>
 *         &lt;element name="OwnerBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountProfileType", propOrder = {
    "accountRef",
    "productType",
    "accountStatus",
    "jointAcctFlag",
    "openDate",
    "passbookNum",
    "bookBalance",
    "accountNameTH",
    "accountNameEN",
    "shortName",
    "address",
    "contactNums",
    "customerInfoRef",
    "ctCode",
    "nationalityCode",
    "citizenCode",
    "accountOpeningObjective",
    "sourceOfFund",
    "numOfDepositTranPerMonth",
    "depositTranAmtPerMonth",
    "numOfWithdrawnTranPerMonth",
    "withdrawnTranAmtPerMonth",
    "period",
    "acctDescription",
    "usePassbookCode",
    "fixedMultiTerm",
    "currencyCode",
    "blockDBCardFlag",
    "holdAllFundFlag",
    "pledgeFullBalanceFlag",
    "mainBranch",
    "ownerBranch"
})
public class AccountProfileType {

    @XmlElement(name = "AccountRef")
    protected AccountRefType accountRef;
    @XmlElement(name = "ProductType")
    protected CodeDescType productType;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "JointAcctFlag")
    protected Boolean jointAcctFlag;
    @XmlElement(name = "OpenDate")
    protected DateType openDate;
    @XmlElement(name = "PassbookNum")
    protected String passbookNum;
    @XmlElement(name = "BookBalance")
    protected CurrAmtType bookBalance;
    @XmlElement(name = "AccountNameTH")
    protected String accountNameTH;
    @XmlElement(name = "AccountNameEN")
    protected String accountNameEN;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "Address")
    protected PostAddressType address;
    @XmlElement(name = "ContactNums")
    protected ContactNumsType contactNums;
    @XmlElement(name = "CustomerInfoRef")
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "CTCode")
    protected String ctCode;
    @XmlElement(name = "NationalityCode")
    protected String nationalityCode;
    @XmlElement(name = "CitizenCode")
    protected CodeDescType citizenCode;
    @XmlElement(name = "AccountOpeningObjective", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected AccountOpeningObjectiveType accountOpeningObjective;
    @XmlElement(name = "SourceOfFund", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected SourceOfFundType sourceOfFund;
    @XmlElement(name = "NumOfDepositTranPerMonth")
    protected CodeDescType numOfDepositTranPerMonth;
    @XmlElement(name = "DepositTranAmtPerMonth")
    protected CodeDescType depositTranAmtPerMonth;
    @XmlElement(name = "NumOfWithdrawnTranPerMonth")
    protected CodeDescType numOfWithdrawnTranPerMonth;
    @XmlElement(name = "WithdrawnTranAmtPerMonth")
    protected CodeDescType withdrawnTranAmtPerMonth;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "AcctDescription")
    protected String acctDescription;
    @XmlElement(name = "UsePassbookCode")
    protected String usePassbookCode;
    @XmlElement(name = "FixedMultiTerm")
    protected String fixedMultiTerm;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "BlockDBCardFlag")
    protected Boolean blockDBCardFlag;
    @XmlElement(name = "HoldAllFundFlag")
    protected Boolean holdAllFundFlag;
    @XmlElement(name = "PledgeFullBalanceFlag")
    protected Boolean pledgeFullBalanceFlag;
    @XmlElement(name = "MainBranch")
    protected String mainBranch;
    @XmlElement(name = "OwnerBranch")
    protected BranchDetailType ownerBranch;

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setProductType(CodeDescType value) {
        this.productType = value;
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
     * Gets the value of the jointAcctFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJointAcctFlag() {
        return jointAcctFlag;
    }

    /**
     * Sets the value of the jointAcctFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJointAcctFlag(Boolean value) {
        this.jointAcctFlag = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setOpenDate(DateType value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the passbookNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbookNum() {
        return passbookNum;
    }

    /**
     * Sets the value of the passbookNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbookNum(String value) {
        this.passbookNum = value;
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
     * Gets the value of the accountNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNameTH() {
        return accountNameTH;
    }

    /**
     * Sets the value of the accountNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNameTH(String value) {
        this.accountNameTH = value;
    }

    /**
     * Gets the value of the accountNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNameEN() {
        return accountNameEN;
    }

    /**
     * Sets the value of the accountNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNameEN(String value) {
        this.accountNameEN = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressType }
     *     
     */
    public PostAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressType }
     *     
     */
    public void setAddress(PostAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contactNums property.
     * 
     * @return
     *     possible object is
     *     {@link ContactNumsType }
     *     
     */
    public ContactNumsType getContactNums() {
        return contactNums;
    }

    /**
     * Sets the value of the contactNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactNumsType }
     *     
     */
    public void setContactNums(ContactNumsType value) {
        this.contactNums = value;
    }

    /**
     * Gets the value of the customerInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerInfoRef() {
        return customerInfoRef;
    }

    /**
     * Sets the value of the customerInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerInfoRef(CustomerInfoRefType value) {
        this.customerInfoRef = value;
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
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the citizenCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getCitizenCode() {
        return citizenCode;
    }

    /**
     * Sets the value of the citizenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setCitizenCode(CodeDescType value) {
        this.citizenCode = value;
    }

    /**
     * 
     * 	    			1 - \u0e2d\u0e2d\u0e21\u0e40\u0e07\u0e34\u0e19
     * 	    			2 - \u0e0a\u0e33\u0e23\u0e30\u0e40\u0e07\u0e34\u0e19\u0e01\u0e39\u0e49                
     * 	    			3 - \u0e01\u0e32\u0e23\u0e25\u0e07\u0e17\u0e38\u0e19\u0e43\u0e19\u0e18\u0e38\u0e23\u0e01\u0e34\u0e08                         
     * 	    			4 – \u0e1a\u0e31\u0e0d\u0e0a\u0e35\u0e40\u0e07\u0e34\u0e19\u0e40\u0e14\u0e37\u0e2d\u0e19
     * 	    			5 -  \u0e2d\u0e37\u0e48\u0e19\u0e46
     * 	    			
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningObjectiveType }
     *     
     */
    public AccountOpeningObjectiveType getAccountOpeningObjective() {
        return accountOpeningObjective;
    }

    /**
     * Sets the value of the accountOpeningObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningObjectiveType }
     *     
     */
    public void setAccountOpeningObjective(AccountOpeningObjectiveType value) {
        this.accountOpeningObjective = value;
    }

    /**
     * 
     * 	    			1 - \u0e40\u0e07\u0e34\u0e19\u0e2d\u0e2d\u0e21
     * 	    			2 - \u0e18\u0e38\u0e23\u0e01\u0e34\u0e08\u0e2a\u0e48\u0e27\u0e19\u0e15\u0e31\u0e27                
     * 	    			3 - \u0e23\u0e31\u0e1a\u0e08\u0e49\u0e32\u0e07                         
     * 	    			4 – \u0e21\u0e23\u0e14\u0e01/\u0e02\u0e2d\u0e07\u0e02\u0e27\u0e31\u0e0d
     * 	    			5 -  \u0e2d\u0e37\u0e48\u0e19\u0e46
     * 	    			
     * 
     * @return
     *     possible object is
     *     {@link SourceOfFundType }
     *     
     */
    public SourceOfFundType getSourceOfFund() {
        return sourceOfFund;
    }

    /**
     * Sets the value of the sourceOfFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceOfFundType }
     *     
     */
    public void setSourceOfFund(SourceOfFundType value) {
        this.sourceOfFund = value;
    }

    /**
     * Gets the value of the numOfDepositTranPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getNumOfDepositTranPerMonth() {
        return numOfDepositTranPerMonth;
    }

    /**
     * Sets the value of the numOfDepositTranPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setNumOfDepositTranPerMonth(CodeDescType value) {
        this.numOfDepositTranPerMonth = value;
    }

    /**
     * Gets the value of the depositTranAmtPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getDepositTranAmtPerMonth() {
        return depositTranAmtPerMonth;
    }

    /**
     * Sets the value of the depositTranAmtPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setDepositTranAmtPerMonth(CodeDescType value) {
        this.depositTranAmtPerMonth = value;
    }

    /**
     * Gets the value of the numOfWithdrawnTranPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getNumOfWithdrawnTranPerMonth() {
        return numOfWithdrawnTranPerMonth;
    }

    /**
     * Sets the value of the numOfWithdrawnTranPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setNumOfWithdrawnTranPerMonth(CodeDescType value) {
        this.numOfWithdrawnTranPerMonth = value;
    }

    /**
     * Gets the value of the withdrawnTranAmtPerMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getWithdrawnTranAmtPerMonth() {
        return withdrawnTranAmtPerMonth;
    }

    /**
     * Sets the value of the withdrawnTranAmtPerMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setWithdrawnTranAmtPerMonth(CodeDescType value) {
        this.withdrawnTranAmtPerMonth = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the acctDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDescription() {
        return acctDescription;
    }

    /**
     * Sets the value of the acctDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDescription(String value) {
        this.acctDescription = value;
    }

    /**
     * Gets the value of the usePassbookCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePassbookCode() {
        return usePassbookCode;
    }

    /**
     * Sets the value of the usePassbookCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePassbookCode(String value) {
        this.usePassbookCode = value;
    }

    /**
     * Gets the value of the fixedMultiTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedMultiTerm() {
        return fixedMultiTerm;
    }

    /**
     * Sets the value of the fixedMultiTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedMultiTerm(String value) {
        this.fixedMultiTerm = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the blockDBCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlockDBCardFlag() {
        return blockDBCardFlag;
    }

    /**
     * Sets the value of the blockDBCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlockDBCardFlag(Boolean value) {
        this.blockDBCardFlag = value;
    }

    /**
     * Gets the value of the holdAllFundFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldAllFundFlag() {
        return holdAllFundFlag;
    }

    /**
     * Sets the value of the holdAllFundFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldAllFundFlag(Boolean value) {
        this.holdAllFundFlag = value;
    }

    /**
     * Gets the value of the pledgeFullBalanceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPledgeFullBalanceFlag() {
        return pledgeFullBalanceFlag;
    }

    /**
     * Sets the value of the pledgeFullBalanceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPledgeFullBalanceFlag(Boolean value) {
        this.pledgeFullBalanceFlag = value;
    }

    /**
     * Gets the value of the mainBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainBranch() {
        return mainBranch;
    }

    /**
     * Sets the value of the mainBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainBranch(String value) {
        this.mainBranch = value;
    }

    /**
     * Gets the value of the ownerBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchDetailType }
     *     
     */
    public BranchDetailType getOwnerBranch() {
        return ownerBranch;
    }

    /**
     * Sets the value of the ownerBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchDetailType }
     *     
     */
    public void setOwnerBranch(BranchDetailType value) {
        this.ownerBranch = value;
    }

}
