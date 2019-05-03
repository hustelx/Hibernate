
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * 
 * 				LGLevelInfo Type has now been extended to be able to handle other Bill types
 * 				such as PN and CBD ( Type 12 ). Due to impact on changes, LGLevel tag is used for both
 * 			
 * 
 * <p>Java class for LGLevelInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LGLevelInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ALNumType"/>
 *         &lt;element name="LoanProduct" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}LoanProductType"/>
 *         &lt;element name="BeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LGAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType"/>
 *         &lt;element name="LGDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ContractDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndCollectionFeeDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="FeeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverdueFeeAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="AutoDebitIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DebitAccountNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AcctNumType" minOccurs="0"/>
 *         &lt;element name="CommitmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LGLevelInfoType", propOrder = {
    "lgNum",
    "loanProduct",
    "beneficiaryName",
    "lgAmount",
    "lgDate",
    "effectiveDate",
    "maturityDate",
    "contractDate",
    "contractNum",
    "endCollectionFeeDate",
    "feeRate",
    "overdueFeeAmount",
    "autoDebitIndicator",
    "debitAccountNum",
    "commitmentDesc"
})
public class LGLevelInfoType {

    @XmlElement(name = "LGNum", required = true)
    protected String lgNum;
    @XmlElement(name = "LoanProduct", required = true)
    protected LoanProductType loanProduct;
    @XmlElement(name = "BeneficiaryName", required = true)
    protected String beneficiaryName;
    @XmlElement(name = "LGAmount", required = true)
    protected CurrAmtType lgAmount;
    @XmlElement(name = "LGDate")
    protected DateType lgDate;
    @XmlElement(name = "EffectiveDate")
    protected DateType effectiveDate;
    @XmlElement(name = "MaturityDate")
    protected DateType maturityDate;
    @XmlElement(name = "ContractDate")
    protected DateType contractDate;
    @XmlElement(name = "ContractNum")
    protected String contractNum;
    @XmlElement(name = "EndCollectionFeeDate")
    protected DateType endCollectionFeeDate;
    @XmlElement(name = "FeeRate")
    protected BigDecimal feeRate;
    @XmlElement(name = "OverdueFeeAmount")
    protected CurrAmtType overdueFeeAmount;
    @XmlElement(name = "AutoDebitIndicator")
    protected Boolean autoDebitIndicator;
    @XmlElement(name = "DebitAccountNum")
    protected String debitAccountNum;
    @XmlElement(name = "CommitmentDesc")
    protected String commitmentDesc;

    /**
     * Gets the value of the lgNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLGNum() {
        return lgNum;
    }

    /**
     * Sets the value of the lgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLGNum(String value) {
        this.lgNum = value;
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
     * Gets the value of the beneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the lgAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getLGAmount() {
        return lgAmount;
    }

    /**
     * Sets the value of the lgAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setLGAmount(CurrAmtType value) {
        this.lgAmount = value;
    }

    /**
     * Gets the value of the lgDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLGDate() {
        return lgDate;
    }

    /**
     * Sets the value of the lgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLGDate(DateType value) {
        this.lgDate = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEffectiveDate(DateType value) {
        this.effectiveDate = value;
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
     * Gets the value of the endCollectionFeeDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getEndCollectionFeeDate() {
        return endCollectionFeeDate;
    }

    /**
     * Sets the value of the endCollectionFeeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setEndCollectionFeeDate(DateType value) {
        this.endCollectionFeeDate = value;
    }

    /**
     * Gets the value of the feeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * Sets the value of the feeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeRate(BigDecimal value) {
        this.feeRate = value;
    }

    /**
     * Gets the value of the overdueFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getOverdueFeeAmount() {
        return overdueFeeAmount;
    }

    /**
     * Sets the value of the overdueFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setOverdueFeeAmount(CurrAmtType value) {
        this.overdueFeeAmount = value;
    }

    /**
     * Gets the value of the autoDebitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoDebitIndicator() {
        return autoDebitIndicator;
    }

    /**
     * Sets the value of the autoDebitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoDebitIndicator(Boolean value) {
        this.autoDebitIndicator = value;
    }

    /**
     * Gets the value of the debitAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccountNum() {
        return debitAccountNum;
    }

    /**
     * Sets the value of the debitAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccountNum(String value) {
        this.debitAccountNum = value;
    }

    /**
     * Gets the value of the commitmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentDesc() {
        return commitmentDesc;
    }

    /**
     * Sets the value of the commitmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentDesc(String value) {
        this.commitmentDesc = value;
    }

}
