
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.TrackingInfoType;


/**
 * <p>Java class for FATCACaseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCACaseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseStatus" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseStatusType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAFinalClassification" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAReportableClassification" minOccurs="0"/>
 *         &lt;element name="EntitySelfCertification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="LockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryCaseSubject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecalcitrantFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="CreatedInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="PositiveIndiciaRefs" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}IndiciaRefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCACaseInfoType", propOrder = {
    "caseStatus",
    "fatcaFinalClassification",
    "fatcaReportableClassification",
    "entitySelfCertification",
    "lockFlag",
    "primaryCaseSubject",
    "recalcitrantFlag",
    "additionalRemarks",
    "updateInfo",
    "createdInfo",
    "positiveIndiciaRefs"
})
public class FATCACaseInfoType {

    @XmlElement(name = "CaseStatus")
    protected String caseStatus;
    @XmlElement(name = "FATCAFinalClassification", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected CodeDescType fatcaFinalClassification;
    @XmlElement(name = "FATCAReportableClassification", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected CodeDescType fatcaReportableClassification;
    @XmlElement(name = "EntitySelfCertification")
    protected CodeDescType entitySelfCertification;
    @XmlElement(name = "LockFlag")
    protected Boolean lockFlag;
    @XmlElement(name = "PrimaryCaseSubject")
    protected Boolean primaryCaseSubject;
    @XmlElement(name = "RecalcitrantFlag")
    protected Boolean recalcitrantFlag;
    @XmlElement(name = "AdditionalRemarks")
    protected String additionalRemarks;
    @XmlElement(name = "UpdateInfo")
    protected TrackingInfoType updateInfo;
    @XmlElement(name = "CreatedInfo")
    protected TrackingInfoType createdInfo;
    @XmlElement(name = "PositiveIndiciaRefs")
    protected IndiciaRefsType positiveIndiciaRefs;

    /**
     * Gets the value of the caseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * Sets the value of the caseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatus(String value) {
        this.caseStatus = value;
    }

    /**
     * Gets the value of the fatcaFinalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getFATCAFinalClassification() {
        return fatcaFinalClassification;
    }

    /**
     * Sets the value of the fatcaFinalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setFATCAFinalClassification(CodeDescType value) {
        this.fatcaFinalClassification = value;
    }

    /**
     * Gets the value of the fatcaReportableClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getFATCAReportableClassification() {
        return fatcaReportableClassification;
    }

    /**
     * Sets the value of the fatcaReportableClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setFATCAReportableClassification(CodeDescType value) {
        this.fatcaReportableClassification = value;
    }

    /**
     * Gets the value of the entitySelfCertification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getEntitySelfCertification() {
        return entitySelfCertification;
    }

    /**
     * Sets the value of the entitySelfCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setEntitySelfCertification(CodeDescType value) {
        this.entitySelfCertification = value;
    }

    /**
     * Gets the value of the lockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockFlag(Boolean value) {
        this.lockFlag = value;
    }

    /**
     * Gets the value of the primaryCaseSubject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryCaseSubject() {
        return primaryCaseSubject;
    }

    /**
     * Sets the value of the primaryCaseSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryCaseSubject(Boolean value) {
        this.primaryCaseSubject = value;
    }

    /**
     * Gets the value of the recalcitrantFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecalcitrantFlag() {
        return recalcitrantFlag;
    }

    /**
     * Sets the value of the recalcitrantFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecalcitrantFlag(Boolean value) {
        this.recalcitrantFlag = value;
    }

    /**
     * Gets the value of the additionalRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalRemarks() {
        return additionalRemarks;
    }

    /**
     * Sets the value of the additionalRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalRemarks(String value) {
        this.additionalRemarks = value;
    }

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setUpdateInfo(TrackingInfoType value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the createdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getCreatedInfo() {
        return createdInfo;
    }

    /**
     * Sets the value of the createdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setCreatedInfo(TrackingInfoType value) {
        this.createdInfo = value;
    }

    /**
     * Gets the value of the positiveIndiciaRefs property.
     * 
     * @return
     *     possible object is
     *     {@link IndiciaRefsType }
     *     
     */
    public IndiciaRefsType getPositiveIndiciaRefs() {
        return positiveIndiciaRefs;
    }

    /**
     * Sets the value of the positiveIndiciaRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndiciaRefsType }
     *     
     */
    public void setPositiveIndiciaRefs(IndiciaRefsType value) {
        this.positiveIndiciaRefs = value;
    }

}
