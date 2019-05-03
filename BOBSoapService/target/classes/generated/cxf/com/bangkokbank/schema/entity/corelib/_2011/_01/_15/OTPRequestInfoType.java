
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTPRequestInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTPRequestInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OTPMaxFailCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTPExpiryPeriod" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PeriodType" minOccurs="0"/>
 *         &lt;element name="OTPLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTPRefIDRequiredFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTPRequestInfoType", propOrder = {
    "otpMaxFailCount",
    "otpExpiryPeriod",
    "otpLength",
    "otpRefIDRequiredFlag",
    "companyName"
})
public class OTPRequestInfoType {

    @XmlElement(name = "OTPMaxFailCount")
    protected Integer otpMaxFailCount;
    @XmlElement(name = "OTPExpiryPeriod")
    protected PeriodType otpExpiryPeriod;
    @XmlElement(name = "OTPLength")
    protected Integer otpLength;
    @XmlElement(name = "OTPRefIDRequiredFlag")
    protected Boolean otpRefIDRequiredFlag;
    @XmlElement(name = "CompanyName")
    protected String companyName;

    /**
     * Gets the value of the otpMaxFailCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTPMaxFailCount() {
        return otpMaxFailCount;
    }

    /**
     * Sets the value of the otpMaxFailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTPMaxFailCount(Integer value) {
        this.otpMaxFailCount = value;
    }

    /**
     * Gets the value of the otpExpiryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getOTPExpiryPeriod() {
        return otpExpiryPeriod;
    }

    /**
     * Sets the value of the otpExpiryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setOTPExpiryPeriod(PeriodType value) {
        this.otpExpiryPeriod = value;
    }

    /**
     * Gets the value of the otpLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTPLength() {
        return otpLength;
    }

    /**
     * Sets the value of the otpLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTPLength(Integer value) {
        this.otpLength = value;
    }

    /**
     * Gets the value of the otpRefIDRequiredFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOTPRefIDRequiredFlag() {
        return otpRefIDRequiredFlag;
    }

    /**
     * Sets the value of the otpRefIDRequiredFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOTPRefIDRequiredFlag(Boolean value) {
        this.otpRefIDRequiredFlag = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

}
