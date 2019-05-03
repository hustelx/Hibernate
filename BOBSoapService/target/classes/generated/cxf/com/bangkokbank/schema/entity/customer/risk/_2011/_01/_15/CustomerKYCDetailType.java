
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CustomerKYCDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerKYCDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevelReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCUpdateInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerKYCUpdateInfoType" minOccurs="0"/>
 *         &lt;element name="SourceOfAsset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueOfAsset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}EarningFromCountries" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}RiskOccupations" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BualuangExclusiveCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BualuangExclusiveCustDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="GoodGuyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GoodGuyUpdateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodGuyUpdateDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerKYCDetailType", propOrder = {
    "rmNum",
    "riskLevel",
    "riskLevelReasonCode",
    "kycUpdateInfo",
    "sourceOfAsset",
    "valueOfAsset",
    "earningFromCountries",
    "riskOccupations",
    "nationality",
    "bualuangExclusiveCustStatus",
    "bualuangExclusiveCustDate",
    "goodGuyFlag",
    "goodGuyUpdateBy",
    "goodGuyUpdateDate"
})
public class CustomerKYCDetailType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "RiskLevel")
    protected String riskLevel;
    @XmlElement(name = "RiskLevelReasonCode")
    protected String riskLevelReasonCode;
    @XmlElement(name = "KYCUpdateInfo")
    protected CustomerKYCUpdateInfoType kycUpdateInfo;
    @XmlElement(name = "SourceOfAsset")
    protected String sourceOfAsset;
    @XmlElement(name = "ValueOfAsset")
    protected String valueOfAsset;
    @XmlElement(name = "EarningFromCountries", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected EarningFromCountriesType earningFromCountries;
    @XmlElement(name = "RiskOccupations", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected RiskOccupationsType riskOccupations;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "BualuangExclusiveCustStatus")
    protected String bualuangExclusiveCustStatus;
    @XmlElement(name = "BualuangExclusiveCustDate")
    protected DateType bualuangExclusiveCustDate;
    @XmlElement(name = "GoodGuyFlag")
    protected Boolean goodGuyFlag;
    @XmlElement(name = "GoodGuyUpdateBy")
    protected String goodGuyUpdateBy;
    @XmlElement(name = "GoodGuyUpdateDate")
    protected DateType goodGuyUpdateDate;

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
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the riskLevelReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevelReasonCode() {
        return riskLevelReasonCode;
    }

    /**
     * Sets the value of the riskLevelReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevelReasonCode(String value) {
        this.riskLevelReasonCode = value;
    }

    /**
     * Gets the value of the kycUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKYCUpdateInfoType }
     *     
     */
    public CustomerKYCUpdateInfoType getKYCUpdateInfo() {
        return kycUpdateInfo;
    }

    /**
     * Sets the value of the kycUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKYCUpdateInfoType }
     *     
     */
    public void setKYCUpdateInfo(CustomerKYCUpdateInfoType value) {
        this.kycUpdateInfo = value;
    }

    /**
     * Gets the value of the sourceOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfAsset() {
        return sourceOfAsset;
    }

    /**
     * Sets the value of the sourceOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfAsset(String value) {
        this.sourceOfAsset = value;
    }

    /**
     * Gets the value of the valueOfAsset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueOfAsset() {
        return valueOfAsset;
    }

    /**
     * Sets the value of the valueOfAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueOfAsset(String value) {
        this.valueOfAsset = value;
    }

    /**
     * Gets the value of the earningFromCountries property.
     * 
     * @return
     *     possible object is
     *     {@link EarningFromCountriesType }
     *     
     */
    public EarningFromCountriesType getEarningFromCountries() {
        return earningFromCountries;
    }

    /**
     * Sets the value of the earningFromCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarningFromCountriesType }
     *     
     */
    public void setEarningFromCountries(EarningFromCountriesType value) {
        this.earningFromCountries = value;
    }

    /**
     * Gets the value of the riskOccupations property.
     * 
     * @return
     *     possible object is
     *     {@link RiskOccupationsType }
     *     
     */
    public RiskOccupationsType getRiskOccupations() {
        return riskOccupations;
    }

    /**
     * Sets the value of the riskOccupations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskOccupationsType }
     *     
     */
    public void setRiskOccupations(RiskOccupationsType value) {
        this.riskOccupations = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the bualuangExclusiveCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBualuangExclusiveCustStatus() {
        return bualuangExclusiveCustStatus;
    }

    /**
     * Sets the value of the bualuangExclusiveCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBualuangExclusiveCustStatus(String value) {
        this.bualuangExclusiveCustStatus = value;
    }

    /**
     * Gets the value of the bualuangExclusiveCustDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBualuangExclusiveCustDate() {
        return bualuangExclusiveCustDate;
    }

    /**
     * Sets the value of the bualuangExclusiveCustDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBualuangExclusiveCustDate(DateType value) {
        this.bualuangExclusiveCustDate = value;
    }

    /**
     * Gets the value of the goodGuyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodGuyFlag() {
        return goodGuyFlag;
    }

    /**
     * Sets the value of the goodGuyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodGuyFlag(Boolean value) {
        this.goodGuyFlag = value;
    }

    /**
     * Gets the value of the goodGuyUpdateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodGuyUpdateBy() {
        return goodGuyUpdateBy;
    }

    /**
     * Sets the value of the goodGuyUpdateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodGuyUpdateBy(String value) {
        this.goodGuyUpdateBy = value;
    }

    /**
     * Gets the value of the goodGuyUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getGoodGuyUpdateDate() {
        return goodGuyUpdateDate;
    }

    /**
     * Sets the value of the goodGuyUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setGoodGuyUpdateDate(DateType value) {
        this.goodGuyUpdateDate = value;
    }

}
