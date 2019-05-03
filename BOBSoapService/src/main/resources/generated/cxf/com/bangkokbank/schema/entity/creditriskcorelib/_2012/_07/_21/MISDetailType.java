
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.bblgroup._2011._01._15.BBLGroupType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for MISDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsOfDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="CustNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcctNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalOutstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverDueDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccruedAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BOTNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CFAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="IrregularityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AcctType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBLGroupCode" type="{http://www.bangkokbank.com/schema/entity/BBLGroup/2011/01/15}BBLGroupType" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="CommitmentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProcessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpenDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LGOverDueAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="InterestCFAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TFForeignAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TFTerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TFLiabilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MISDetailType", propOrder = {
    "asOfDate",
    "custNum",
    "acctNum",
    "systemName",
    "prodCode",
    "totalCredit",
    "totalOutstanding",
    "overDueDays",
    "accruedAmt",
    "totalCurrentBalance",
    "botNum",
    "cfAmt",
    "rmNum",
    "irregularityFlag",
    "acctType",
    "bblGroupCode",
    "branchCode",
    "currencyCode",
    "commitmentNum",
    "accountStatus",
    "legalStatus",
    "processStatus",
    "productType",
    "openDate",
    "maturityDate",
    "lgOverDueAmt",
    "interestCFAmt",
    "tfForeignAmt",
    "tfTerm",
    "tfLiabilityCode"
})
public class MISDetailType {

    @XmlElement(name = "AsOfDate")
    protected DateType asOfDate;
    @XmlElement(name = "CustNum")
    protected String custNum;
    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "SystemName")
    protected String systemName;
    @XmlElement(name = "ProdCode")
    protected String prodCode;
    @XmlElement(name = "TotalCredit")
    protected BigDecimal totalCredit;
    @XmlElement(name = "TotalOutstanding")
    protected BigDecimal totalOutstanding;
    @XmlElement(name = "OverDueDays")
    protected Integer overDueDays;
    @XmlElement(name = "AccruedAmt")
    protected CurrAmtType accruedAmt;
    @XmlElement(name = "TotalCurrentBalance")
    protected BigDecimal totalCurrentBalance;
    @XmlElement(name = "BOTNum")
    protected String botNum;
    @XmlElement(name = "CFAmt")
    protected CurrAmtType cfAmt;
    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "IrregularityFlag")
    protected Boolean irregularityFlag;
    @XmlElement(name = "AcctType")
    protected String acctType;
    @XmlElement(name = "BBLGroupCode")
    protected BBLGroupType bblGroupCode;
    @XmlElement(name = "BranchCode")
    protected BranchCodeNameType branchCode;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "CommitmentNum")
    protected String commitmentNum;
    @XmlElement(name = "AccountStatus")
    protected String accountStatus;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "ProcessStatus")
    protected String processStatus;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "OpenDate")
    protected DateType openDate;
    @XmlElement(name = "MaturityDate")
    protected DateType maturityDate;
    @XmlElement(name = "LGOverDueAmt")
    protected CurrAmtType lgOverDueAmt;
    @XmlElement(name = "InterestCFAmt")
    protected CurrAmtType interestCFAmt;
    @XmlElement(name = "TFForeignAmt")
    protected CurrAmtType tfForeignAmt;
    @XmlElement(name = "TFTerm")
    protected Integer tfTerm;
    @XmlElement(name = "TFLiabilityCode")
    protected String tfLiabilityCode;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAsOfDate(DateType value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the custNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustNum() {
        return custNum;
    }

    /**
     * Sets the value of the custNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustNum(String value) {
        this.custNum = value;
    }

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the systemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdCode(String value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the totalCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCredit() {
        return totalCredit;
    }

    /**
     * Sets the value of the totalCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCredit(BigDecimal value) {
        this.totalCredit = value;
    }

    /**
     * Gets the value of the totalOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalOutstanding() {
        return totalOutstanding;
    }

    /**
     * Sets the value of the totalOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalOutstanding(BigDecimal value) {
        this.totalOutstanding = value;
    }

    /**
     * Gets the value of the overDueDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverDueDays() {
        return overDueDays;
    }

    /**
     * Sets the value of the overDueDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverDueDays(Integer value) {
        this.overDueDays = value;
    }

    /**
     * Gets the value of the accruedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getAccruedAmt() {
        return accruedAmt;
    }

    /**
     * Sets the value of the accruedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setAccruedAmt(CurrAmtType value) {
        this.accruedAmt = value;
    }

    /**
     * Gets the value of the totalCurrentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentBalance() {
        return totalCurrentBalance;
    }

    /**
     * Sets the value of the totalCurrentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentBalance(BigDecimal value) {
        this.totalCurrentBalance = value;
    }

    /**
     * Gets the value of the botNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTNum() {
        return botNum;
    }

    /**
     * Sets the value of the botNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTNum(String value) {
        this.botNum = value;
    }

    /**
     * Gets the value of the cfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getCFAmt() {
        return cfAmt;
    }

    /**
     * Sets the value of the cfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setCFAmt(CurrAmtType value) {
        this.cfAmt = value;
    }

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

    /**
     * Gets the value of the irregularityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIrregularityFlag() {
        return irregularityFlag;
    }

    /**
     * Sets the value of the irregularityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIrregularityFlag(Boolean value) {
        this.irregularityFlag = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctType(String value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the bblGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link BBLGroupType }
     *     
     */
    public BBLGroupType getBBLGroupCode() {
        return bblGroupCode;
    }

    /**
     * Sets the value of the bblGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBLGroupType }
     *     
     */
    public void setBBLGroupCode(BBLGroupType value) {
        this.bblGroupCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setBranchCode(BranchCodeNameType value) {
        this.branchCode = value;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
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
     * Gets the value of the lgOverDueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getLGOverDueAmt() {
        return lgOverDueAmt;
    }

    /**
     * Sets the value of the lgOverDueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setLGOverDueAmt(CurrAmtType value) {
        this.lgOverDueAmt = value;
    }

    /**
     * Gets the value of the interestCFAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getInterestCFAmt() {
        return interestCFAmt;
    }

    /**
     * Sets the value of the interestCFAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setInterestCFAmt(CurrAmtType value) {
        this.interestCFAmt = value;
    }

    /**
     * Gets the value of the tfForeignAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTFForeignAmt() {
        return tfForeignAmt;
    }

    /**
     * Sets the value of the tfForeignAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTFForeignAmt(CurrAmtType value) {
        this.tfForeignAmt = value;
    }

    /**
     * Gets the value of the tfTerm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTFTerm() {
        return tfTerm;
    }

    /**
     * Sets the value of the tfTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTFTerm(Integer value) {
        this.tfTerm = value;
    }

    /**
     * Gets the value of the tfLiabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFLiabilityCode() {
        return tfLiabilityCode;
    }

    /**
     * Sets the value of the tfLiabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFLiabilityCode(String value) {
        this.tfLiabilityCode = value;
    }

}
