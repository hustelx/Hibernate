
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for AccountDefaultInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDefaultInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustAcctNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctProductGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverDueDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OpenDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="TFForeignCurrencyAmount" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TFTerm" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TFLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDefaultInfoType", propOrder = {
    "applicationCode",
    "custAcctNum",
    "acctNum",
    "acctProductCode",
    "acctProductGroup",
    "creditLineAmount",
    "balance",
    "overDueDay",
    "openDate",
    "maturityDate",
    "tfForeignCurrencyAmount",
    "tfTerm",
    "tfLiability"
})
public class AccountDefaultInfoType {

    @XmlElement(name = "ApplicationCode", required = true)
    protected String applicationCode;
    @XmlElement(name = "CustAcctNum", required = true)
    protected String custAcctNum;
    @XmlElement(name = "AcctNum", required = true)
    protected String acctNum;
    @XmlElement(name = "AcctProductCode", required = true)
    protected String acctProductCode;
    @XmlElement(name = "AcctProductGroup")
    protected String acctProductGroup;
    @XmlElement(name = "CreditLineAmount")
    protected BigDecimal creditLineAmount;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "OverDueDay")
    protected BigInteger overDueDay;
    @XmlElement(name = "OpenDate")
    protected DateType openDate;
    @XmlElement(name = "MaturityDate")
    protected DateType maturityDate;
    @XmlElement(name = "TFForeignCurrencyAmount")
    protected CurrAmtType tfForeignCurrencyAmount;
    @XmlElement(name = "TFTerm")
    protected BigInteger tfTerm;
    @XmlElement(name = "TFLiability")
    protected String tfLiability;

    /**
     * Gets the value of the applicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationCode() {
        return applicationCode;
    }

    /**
     * Sets the value of the applicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationCode(String value) {
        this.applicationCode = value;
    }

    /**
     * Gets the value of the custAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctNum() {
        return custAcctNum;
    }

    /**
     * Sets the value of the custAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctNum(String value) {
        this.custAcctNum = value;
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
     * Gets the value of the acctProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctProductCode() {
        return acctProductCode;
    }

    /**
     * Sets the value of the acctProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctProductCode(String value) {
        this.acctProductCode = value;
    }

    /**
     * Gets the value of the acctProductGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctProductGroup() {
        return acctProductGroup;
    }

    /**
     * Sets the value of the acctProductGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctProductGroup(String value) {
        this.acctProductGroup = value;
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
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the overDueDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverDueDay() {
        return overDueDay;
    }

    /**
     * Sets the value of the overDueDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverDueDay(BigInteger value) {
        this.overDueDay = value;
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
     * Gets the value of the tfForeignCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTFForeignCurrencyAmount() {
        return tfForeignCurrencyAmount;
    }

    /**
     * Sets the value of the tfForeignCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTFForeignCurrencyAmount(CurrAmtType value) {
        this.tfForeignCurrencyAmount = value;
    }

    /**
     * Gets the value of the tfTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTFTerm() {
        return tfTerm;
    }

    /**
     * Sets the value of the tfTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTFTerm(BigInteger value) {
        this.tfTerm = value;
    }

    /**
     * Gets the value of the tfLiability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFLiability() {
        return tfLiability;
    }

    /**
     * Sets the value of the tfLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFLiability(String value) {
        this.tfLiability = value;
    }

}
