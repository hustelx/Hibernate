
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CustomerKYCUpdateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerKYCUpdateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiskLevelUpdateDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="RiskLevelUpdateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCUpdateDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="KYCUpdateBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KYCNextDueDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerKYCUpdateInfoType", propOrder = {
    "riskLevelUpdateDate",
    "riskLevelUpdateBy",
    "kycStatus",
    "kycUpdateDate",
    "kycUpdateBy",
    "kycNextDueDate"
})
public class CustomerKYCUpdateInfoType {

    @XmlElement(name = "RiskLevelUpdateDate")
    protected DateType riskLevelUpdateDate;
    @XmlElement(name = "RiskLevelUpdateBy")
    protected String riskLevelUpdateBy;
    @XmlElement(name = "KYCStatus")
    protected String kycStatus;
    @XmlElement(name = "KYCUpdateDate")
    protected DateType kycUpdateDate;
    @XmlElement(name = "KYCUpdateBy")
    protected String kycUpdateBy;
    @XmlElement(name = "KYCNextDueDate")
    protected DateType kycNextDueDate;

    /**
     * Gets the value of the riskLevelUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRiskLevelUpdateDate() {
        return riskLevelUpdateDate;
    }

    /**
     * Sets the value of the riskLevelUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRiskLevelUpdateDate(DateType value) {
        this.riskLevelUpdateDate = value;
    }

    /**
     * Gets the value of the riskLevelUpdateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevelUpdateBy() {
        return riskLevelUpdateBy;
    }

    /**
     * Sets the value of the riskLevelUpdateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevelUpdateBy(String value) {
        this.riskLevelUpdateBy = value;
    }

    /**
     * Gets the value of the kycStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCStatus() {
        return kycStatus;
    }

    /**
     * Sets the value of the kycStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCStatus(String value) {
        this.kycStatus = value;
    }

    /**
     * Gets the value of the kycUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getKYCUpdateDate() {
        return kycUpdateDate;
    }

    /**
     * Sets the value of the kycUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setKYCUpdateDate(DateType value) {
        this.kycUpdateDate = value;
    }

    /**
     * Gets the value of the kycUpdateBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKYCUpdateBy() {
        return kycUpdateBy;
    }

    /**
     * Sets the value of the kycUpdateBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKYCUpdateBy(String value) {
        this.kycUpdateBy = value;
    }

    /**
     * Gets the value of the kycNextDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getKYCNextDueDate() {
        return kycNextDueDate;
    }

    /**
     * Sets the value of the kycNextDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setKYCNextDueDate(DateType value) {
        this.kycNextDueDate = value;
    }

}
