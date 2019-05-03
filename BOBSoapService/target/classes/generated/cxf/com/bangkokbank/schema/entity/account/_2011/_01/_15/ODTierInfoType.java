
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for ODTierInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODTierInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TierNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ODExistingLimit" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LimitAction" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}LimitActionType" minOccurs="0"/>
 *         &lt;element name="ContractNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODLimitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReviewDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODTierInfoType", propOrder = {
    "tierNum",
    "odExistingLimit",
    "effectiveDate",
    "expiryDate",
    "limitAction",
    "contractNum",
    "odLimitType",
    "reviewDate"
})
public class ODTierInfoType {

    @XmlElement(name = "TierNum", required = true)
    protected String tierNum;
    @XmlElement(name = "ODExistingLimit")
    protected CurrAmtType odExistingLimit;
    @XmlElement(name = "EffectiveDate")
    protected DateType effectiveDate;
    @XmlElement(name = "ExpiryDate")
    protected DateType expiryDate;
    @XmlElement(name = "LimitAction")
    protected String limitAction;
    @XmlElement(name = "ContractNum")
    protected String contractNum;
    @XmlElement(name = "ODLimitType")
    protected String odLimitType;
    @XmlElement(name = "ReviewDate")
    protected DateType reviewDate;

    /**
     * Gets the value of the tierNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierNum() {
        return tierNum;
    }

    /**
     * Sets the value of the tierNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierNum(String value) {
        this.tierNum = value;
    }

    /**
     * Gets the value of the odExistingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getODExistingLimit() {
        return odExistingLimit;
    }

    /**
     * Sets the value of the odExistingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setODExistingLimit(CurrAmtType value) {
        this.odExistingLimit = value;
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
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpiryDate(DateType value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the limitAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitAction() {
        return limitAction;
    }

    /**
     * Sets the value of the limitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitAction(String value) {
        this.limitAction = value;
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
     * Gets the value of the odLimitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODLimitType() {
        return odLimitType;
    }

    /**
     * Sets the value of the odLimitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODLimitType(String value) {
        this.odLimitType = value;
    }

    /**
     * Gets the value of the reviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets the value of the reviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setReviewDate(DateType value) {
        this.reviewDate = value;
    }

}
