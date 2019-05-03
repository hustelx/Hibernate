
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;


/**
 * <p>Java class for APPLDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPLDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LGInprocessAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="TotalOutstanding" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxCreditByType" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="MaxCreditPerTransaction" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="MaxLGTerm" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="MaxFeeTerm" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="AutoRenew" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="ReviewDate" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}APPLCheckResultType" minOccurs="0"/>
 *         &lt;element name="FeeRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLDetailType", propOrder = {
    "lgInprocessAmt",
    "totalOutstanding",
    "maxCreditByType",
    "maxCreditPerTransaction",
    "maxLGTerm",
    "maxFeeTerm",
    "autoRenew",
    "reviewDate",
    "feeRemark"
})
public class APPLDetailType {

    @XmlElement(name = "LGInprocessAmt")
    protected CurrAmtType lgInprocessAmt;
    @XmlElement(name = "TotalOutstanding")
    protected BigDecimal totalOutstanding;
    @XmlElement(name = "MaxCreditByType")
    protected APPLCheckResultType maxCreditByType;
    @XmlElement(name = "MaxCreditPerTransaction")
    protected APPLCheckResultType maxCreditPerTransaction;
    @XmlElement(name = "MaxLGTerm")
    protected APPLCheckResultType maxLGTerm;
    @XmlElement(name = "MaxFeeTerm")
    protected APPLCheckResultType maxFeeTerm;
    @XmlElement(name = "AutoRenew")
    protected APPLCheckResultType autoRenew;
    @XmlElement(name = "ReviewDate")
    protected APPLCheckResultType reviewDate;
    @XmlElement(name = "FeeRemark")
    protected String feeRemark;

    /**
     * Gets the value of the lgInprocessAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getLGInprocessAmt() {
        return lgInprocessAmt;
    }

    /**
     * Sets the value of the lgInprocessAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setLGInprocessAmt(CurrAmtType value) {
        this.lgInprocessAmt = value;
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
     * Gets the value of the maxCreditByType property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getMaxCreditByType() {
        return maxCreditByType;
    }

    /**
     * Sets the value of the maxCreditByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setMaxCreditByType(APPLCheckResultType value) {
        this.maxCreditByType = value;
    }

    /**
     * Gets the value of the maxCreditPerTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getMaxCreditPerTransaction() {
        return maxCreditPerTransaction;
    }

    /**
     * Sets the value of the maxCreditPerTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setMaxCreditPerTransaction(APPLCheckResultType value) {
        this.maxCreditPerTransaction = value;
    }

    /**
     * Gets the value of the maxLGTerm property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getMaxLGTerm() {
        return maxLGTerm;
    }

    /**
     * Sets the value of the maxLGTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setMaxLGTerm(APPLCheckResultType value) {
        this.maxLGTerm = value;
    }

    /**
     * Gets the value of the maxFeeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getMaxFeeTerm() {
        return maxFeeTerm;
    }

    /**
     * Sets the value of the maxFeeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setMaxFeeTerm(APPLCheckResultType value) {
        this.maxFeeTerm = value;
    }

    /**
     * Gets the value of the autoRenew property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getAutoRenew() {
        return autoRenew;
    }

    /**
     * Sets the value of the autoRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setAutoRenew(APPLCheckResultType value) {
        this.autoRenew = value;
    }

    /**
     * Gets the value of the reviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link APPLCheckResultType }
     *     
     */
    public APPLCheckResultType getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets the value of the reviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link APPLCheckResultType }
     *     
     */
    public void setReviewDate(APPLCheckResultType value) {
        this.reviewDate = value;
    }

    /**
     * Gets the value of the feeRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRemark() {
        return feeRemark;
    }

    /**
     * Sets the value of the feeRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRemark(String value) {
        this.feeRemark = value;
    }

}
