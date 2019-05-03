
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.ReferencesType;


/**
 * <p>Java class for FacilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALControlCode" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountControlCodeType" minOccurs="0"/>
 *         &lt;element name="ALNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ALNumType"/>
 *         &lt;element name="AllocationCode" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationCodeType" minOccurs="0"/>
 *         &lt;element name="LoanProduct" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}LoanProductType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrangementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OutstandingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvailabilityAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ALSCustomerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ALSCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="AccountOpeningDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LastDrawdownDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="StopAdvanceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StopAdvanceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TotalIncome" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalInterest" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="AccruedInterest" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="InterestHold" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TotalInterestOverDue" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="LastCalculationDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ValueDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="NoteBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="PastDueAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="CommissionDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="CommissionAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TDRMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="RelationshipType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="ShareCreditLineFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="References" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ReferencesType" minOccurs="0"/>
 *         &lt;element name="CommitmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentInfo" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}CommitmentInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityInfoType", propOrder = {
    "alControlCode",
    "alNum",
    "allocationCode",
    "loanProduct",
    "accountType",
    "legalStatus",
    "processStatus",
    "isicCode",
    "arrangementType",
    "accountStatus",
    "processType",
    "creditLineAmount",
    "outstandingAmount",
    "availabilityAmount",
    "alsCustomerNum",
    "alsCustomerName",
    "contractNum",
    "contractDate",
    "accountOpeningDate",
    "maturityDate",
    "lastDrawdownDate",
    "stopAdvanceReason",
    "stopAdvanceIndicator",
    "accountBalance",
    "totalIncome",
    "interestRate",
    "totalInterest",
    "accruedInterest",
    "interestHold",
    "totalInterestOverDue",
    "lastCalculationDate",
    "valueDate",
    "noteBalance",
    "pastDueAmount",
    "commissionDate",
    "commissionAmount",
    "tdrMethod",
    "loanType",
    "relationshipType",
    "shareCreditLineFlag",
    "references",
    "commitmentNum",
    "commitmentInfo"
})
public class FacilityInfoType {

    @XmlElement(name = "ALControlCode")
    protected AccountControlCodeType alControlCode;
    @XmlElement(name = "ALNum", required = true)
    protected String alNum;
    @XmlElement(name = "AllocationCode")
    protected String allocationCode;
    @XmlElement(name = "LoanProduct")
    protected LoanProductType loanProduct;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "ProcessStatus")
    protected String processStatus;
    @XmlElement(name = "ISICCode")
    protected String isicCode;
    @XmlElement(name = "ArrangementType")
    protected String arrangementType;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "ProcessType")
    protected String processType;
    @XmlElement(name = "CreditLineAmount")
    protected BigDecimal creditLineAmount;
    @XmlElement(name = "OutstandingAmount")
    protected BigDecimal outstandingAmount;
    @XmlElement(name = "AvailabilityAmount")
    protected BigDecimal availabilityAmount;
    @XmlElement(name = "ALSCustomerNum")
    protected String alsCustomerNum;
    @XmlElement(name = "ALSCustomerName")
    protected String alsCustomerName;
    @XmlElement(name = "ContractNum")
    protected String contractNum;
    @XmlElement(name = "ContractDate")
    protected DateType contractDate;
    @XmlElement(name = "AccountOpeningDate")
    protected DateType accountOpeningDate;
    @XmlElement(name = "MaturityDate")
    protected DateType maturityDate;
    @XmlElement(name = "LastDrawdownDate")
    protected DateType lastDrawdownDate;
    @XmlElement(name = "StopAdvanceReason")
    protected String stopAdvanceReason;
    @XmlElement(name = "StopAdvanceIndicator")
    protected Boolean stopAdvanceIndicator;
    @XmlElement(name = "AccountBalance")
    protected CurrAmtType accountBalance;
    @XmlElement(name = "TotalIncome")
    protected CurrAmtType totalIncome;
    @XmlElement(name = "InterestRate")
    protected BigDecimal interestRate;
    @XmlElement(name = "TotalInterest")
    protected CurrAmtType totalInterest;
    @XmlElement(name = "AccruedInterest")
    protected CurrAmtType accruedInterest;
    @XmlElement(name = "InterestHold")
    protected CurrAmtType interestHold;
    @XmlElement(name = "TotalInterestOverDue")
    protected CurrAmtType totalInterestOverDue;
    @XmlElement(name = "LastCalculationDate")
    protected DateType lastCalculationDate;
    @XmlElement(name = "ValueDate")
    protected DateType valueDate;
    @XmlElement(name = "NoteBalance")
    protected CurrAmtType noteBalance;
    @XmlElement(name = "PastDueAmount")
    protected CurrAmtType pastDueAmount;
    @XmlElement(name = "CommissionDate")
    protected DateType commissionDate;
    @XmlElement(name = "CommissionAmount")
    protected CurrAmtType commissionAmount;
    @XmlElement(name = "TDRMethod")
    protected String tdrMethod;
    @XmlElement(name = "LoanType")
    protected CodeDescType loanType;
    @XmlElement(name = "RelationshipType")
    protected CodeDescType relationshipType;
    @XmlElement(name = "ShareCreditLineFlag")
    protected Boolean shareCreditLineFlag;
    @XmlElement(name = "References")
    protected ReferencesType references;
    @XmlElement(name = "CommitmentNum")
    protected String commitmentNum;
    @XmlElement(name = "CommitmentInfo")
    protected CommitmentInfoType commitmentInfo;

    /**
     * Gets the value of the alControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountControlCodeType }
     *     
     */
    public AccountControlCodeType getALControlCode() {
        return alControlCode;
    }

    /**
     * Sets the value of the alControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountControlCodeType }
     *     
     */
    public void setALControlCode(AccountControlCodeType value) {
        this.alControlCode = value;
    }

    /**
     * Gets the value of the alNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALNum() {
        return alNum;
    }

    /**
     * Sets the value of the alNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALNum(String value) {
        this.alNum = value;
    }

    /**
     * Gets the value of the allocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationCode() {
        return allocationCode;
    }

    /**
     * Sets the value of the allocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationCode(String value) {
        this.allocationCode = value;
    }

    /**
     * Gets the value of the loanProduct property.
     * 
     * @return
     *     possible object is
     *     {@link LoanProductType }
     *     
     */
    public LoanProductType getLoanProduct() {
        return loanProduct;
    }

    /**
     * Sets the value of the loanProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanProductType }
     *     
     */
    public void setLoanProduct(LoanProductType value) {
        this.loanProduct = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the processStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the value of the processStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessStatus(String value) {
        this.processStatus = value;
    }

    /**
     * Gets the value of the isicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISICCode() {
        return isicCode;
    }

    /**
     * Sets the value of the isicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISICCode(String value) {
        this.isicCode = value;
    }

    /**
     * Gets the value of the arrangementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrangementType() {
        return arrangementType;
    }

    /**
     * Sets the value of the arrangementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrangementType(String value) {
        this.arrangementType = value;
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
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Gets the value of the creditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLineAmount() {
        return creditLineAmount;
    }

    /**
     * Sets the value of the creditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLineAmount(BigDecimal value) {
        this.creditLineAmount = value;
    }

    /**
     * Gets the value of the outstandingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    /**
     * Sets the value of the outstandingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingAmount(BigDecimal value) {
        this.outstandingAmount = value;
    }

    /**
     * Gets the value of the availabilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailabilityAmount() {
        return availabilityAmount;
    }

    /**
     * Sets the value of the availabilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailabilityAmount(BigDecimal value) {
        this.availabilityAmount = value;
    }

    /**
     * Gets the value of the alsCustomerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALSCustomerNum() {
        return alsCustomerNum;
    }

    /**
     * Sets the value of the alsCustomerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALSCustomerNum(String value) {
        this.alsCustomerNum = value;
    }

    /**
     * Gets the value of the alsCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALSCustomerName() {
        return alsCustomerName;
    }

    /**
     * Sets the value of the alsCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALSCustomerName(String value) {
        this.alsCustomerName = value;
    }

    /**
     * Gets the value of the contractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * Sets the value of the contractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNum(String value) {
        this.contractNum = value;
    }

    /**
     * Gets the value of the contractDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setContractDate(DateType value) {
        this.contractDate = value;
    }

    /**
     * Gets the value of the accountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAccountOpeningDate() {
        return accountOpeningDate;
    }

    /**
     * Sets the value of the accountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAccountOpeningDate(DateType value) {
        this.accountOpeningDate = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setMaturityDate(DateType value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the lastDrawdownDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastDrawdownDate() {
        return lastDrawdownDate;
    }

    /**
     * Sets the value of the lastDrawdownDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastDrawdownDate(DateType value) {
        this.lastDrawdownDate = value;
    }

    /**
     * Gets the value of the stopAdvanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopAdvanceReason() {
        return stopAdvanceReason;
    }

    /**
     * Sets the value of the stopAdvanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopAdvanceReason(String value) {
        this.stopAdvanceReason = value;
    }

    /**
     * Gets the value of the stopAdvanceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopAdvanceIndicator() {
        return stopAdvanceIndicator;
    }

    /**
     * Sets the value of the stopAdvanceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopAdvanceIndicator(Boolean value) {
        this.stopAdvanceIndicator = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setAccountBalance(CurrAmtType value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the totalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the value of the totalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTotalIncome(CurrAmtType value) {
        this.totalIncome = value;
    }

    /**
     * Gets the value of the interestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Gets the value of the totalInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTotalInterest() {
        return totalInterest;
    }

    /**
     * Sets the value of the totalInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTotalInterest(CurrAmtType value) {
        this.totalInterest = value;
    }

    /**
     * Gets the value of the accruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getAccruedInterest() {
        return accruedInterest;
    }

    /**
     * Sets the value of the accruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setAccruedInterest(CurrAmtType value) {
        this.accruedInterest = value;
    }

    /**
     * Gets the value of the interestHold property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getInterestHold() {
        return interestHold;
    }

    /**
     * Sets the value of the interestHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setInterestHold(CurrAmtType value) {
        this.interestHold = value;
    }

    /**
     * Gets the value of the totalInterestOverDue property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTotalInterestOverDue() {
        return totalInterestOverDue;
    }

    /**
     * Sets the value of the totalInterestOverDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTotalInterestOverDue(CurrAmtType value) {
        this.totalInterestOverDue = value;
    }

    /**
     * Gets the value of the lastCalculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastCalculationDate() {
        return lastCalculationDate;
    }

    /**
     * Sets the value of the lastCalculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastCalculationDate(DateType value) {
        this.lastCalculationDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setValueDate(DateType value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the noteBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getNoteBalance() {
        return noteBalance;
    }

    /**
     * Sets the value of the noteBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setNoteBalance(CurrAmtType value) {
        this.noteBalance = value;
    }

    /**
     * Gets the value of the pastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getPastDueAmount() {
        return pastDueAmount;
    }

    /**
     * Sets the value of the pastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setPastDueAmount(CurrAmtType value) {
        this.pastDueAmount = value;
    }

    /**
     * Gets the value of the commissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getCommissionDate() {
        return commissionDate;
    }

    /**
     * Sets the value of the commissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setCommissionDate(DateType value) {
        this.commissionDate = value;
    }

    /**
     * Gets the value of the commissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getCommissionAmount() {
        return commissionAmount;
    }

    /**
     * Sets the value of the commissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setCommissionAmount(CurrAmtType value) {
        this.commissionAmount = value;
    }

    /**
     * Gets the value of the tdrMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDRMethod() {
        return tdrMethod;
    }

    /**
     * Sets the value of the tdrMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDRMethod(String value) {
        this.tdrMethod = value;
    }

    /**
     * Gets the value of the loanType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getLoanType() {
        return loanType;
    }

    /**
     * Sets the value of the loanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setLoanType(CodeDescType value) {
        this.loanType = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRelationshipType(CodeDescType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the shareCreditLineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareCreditLineFlag() {
        return shareCreditLineFlag;
    }

    /**
     * Sets the value of the shareCreditLineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareCreditLineFlag(Boolean value) {
        this.shareCreditLineFlag = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesType }
     *     
     */
    public ReferencesType getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesType }
     *     
     */
    public void setReferences(ReferencesType value) {
        this.references = value;
    }

    /**
     * Gets the value of the commitmentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentNum() {
        return commitmentNum;
    }

    /**
     * Sets the value of the commitmentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentNum(String value) {
        this.commitmentNum = value;
    }

    /**
     * Gets the value of the commitmentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentInfoType }
     *     
     */
    public CommitmentInfoType getCommitmentInfo() {
        return commitmentInfo;
    }

    /**
     * Sets the value of the commitmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentInfoType }
     *     
     */
    public void setCommitmentInfo(CommitmentInfoType value) {
        this.commitmentInfo = value;
    }

}
