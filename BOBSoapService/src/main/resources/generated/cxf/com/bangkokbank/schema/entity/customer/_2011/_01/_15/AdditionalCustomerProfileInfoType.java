
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * 
 * 			This is an entity to collect all fields that are not in the current CustomerProfile
 * 			core type. At the moment, this is used for the CustomerProfileAdd service.
 * 	      
 * 			Any additional fields should be added here unless it is part of the Core.
 * 			
 * 
 * <p>Java class for AdditionalCustomerProfileInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalCustomerProfileInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OverrideFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDTypeOfTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Education" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="Employee" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="OfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubstantialIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GreenCardFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="USDeclarationFormFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="W9FormFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StandingInstructionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="ForeignTaxIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForeignTaxIDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConsentDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ConsentProcessingBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="SkipFATCAFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GIINGroup" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}GIINGroupType" minOccurs="0"/>
 *         &lt;element name="SelfCertification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="WomanMaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnglishNameSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlackListFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstContactDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="FirstContactBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LastUpdateOperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HighValueCustomerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PayrollStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BearerShareFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ComplexShareHolderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FillingDocBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="FillingDocDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalCustomerProfileInfoType", propOrder = {
    "overrideFlag",
    "overrideBy",
    "idTypeOfTax",
    "education",
    "employee",
    "officeName",
    "jobPosition",
    "nationality2",
    "nationality3",
    "placeOfBirth",
    "substantialIndicator",
    "greenCardFlag",
    "usDeclarationFormFlag",
    "w9FormFlag",
    "standingInstructionFlag",
    "classification",
    "foreignTaxIDType",
    "foreignTaxIDNum",
    "consentFlag",
    "consentDate",
    "consentProcessingBranch",
    "skipFATCAFlag",
    "giinGroup",
    "selfCertification",
    "womanMaidenName",
    "shortName",
    "englishNameSeqNum",
    "blackListFlag",
    "firstContactDate",
    "firstContactBranch",
    "lastUpdateDate",
    "lastUpdateOperatorID",
    "terminalID",
    "oed",
    "highValueCustomerStatus",
    "payrollStatus",
    "bearerShareFlag",
    "complexShareHolderFlag",
    "fillingDocBranch",
    "fillingDocDate"
})
public class AdditionalCustomerProfileInfoType {

    @XmlElement(name = "OverrideFlag")
    protected Boolean overrideFlag;
    @XmlElement(name = "OverrideBy")
    protected String overrideBy;
    @XmlElement(name = "IDTypeOfTax")
    protected String idTypeOfTax;
    @XmlElement(name = "Education")
    protected CodeNamePairType education;
    @XmlElement(name = "Employee")
    protected CodeNamePairType employee;
    @XmlElement(name = "OfficeName")
    protected String officeName;
    @XmlElement(name = "JobPosition")
    protected String jobPosition;
    @XmlElement(name = "Nationality2")
    protected String nationality2;
    @XmlElement(name = "Nationality3")
    protected String nationality3;
    @XmlElement(name = "PlaceOfBirth")
    protected String placeOfBirth;
    @XmlElement(name = "SubstantialIndicator")
    protected Boolean substantialIndicator;
    @XmlElement(name = "GreenCardFlag")
    protected Boolean greenCardFlag;
    @XmlElement(name = "USDeclarationFormFlag")
    protected Boolean usDeclarationFormFlag;
    @XmlElement(name = "W9FormFlag")
    protected Boolean w9FormFlag;
    @XmlElement(name = "StandingInstructionFlag")
    protected Boolean standingInstructionFlag;
    @XmlElement(name = "Classification")
    protected CodeNamePairType classification;
    @XmlElement(name = "ForeignTaxIDType")
    protected String foreignTaxIDType;
    @XmlElement(name = "ForeignTaxIDNum")
    protected String foreignTaxIDNum;
    @XmlElement(name = "ConsentFlag")
    protected Boolean consentFlag;
    @XmlElement(name = "ConsentDate")
    protected DateType consentDate;
    @XmlElement(name = "ConsentProcessingBranch")
    protected BranchCodeNameType consentProcessingBranch;
    @XmlElement(name = "SkipFATCAFlag")
    protected Boolean skipFATCAFlag;
    @XmlElement(name = "GIINGroup")
    protected GIINGroupType giinGroup;
    @XmlElement(name = "SelfCertification")
    protected CodeNamePairType selfCertification;
    @XmlElement(name = "WomanMaidenName")
    protected String womanMaidenName;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "EnglishNameSeqNum")
    protected String englishNameSeqNum;
    @XmlElement(name = "BlackListFlag")
    protected Boolean blackListFlag;
    @XmlElement(name = "FirstContactDate")
    protected DateType firstContactDate;
    @XmlElement(name = "FirstContactBranch")
    protected BranchCodeNameType firstContactBranch;
    @XmlElement(name = "LastUpdateDate")
    protected DateType lastUpdateDate;
    @XmlElement(name = "LastUpdateOperatorID")
    protected String lastUpdateOperatorID;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "OED")
    protected String oed;
    @XmlElement(name = "HighValueCustomerStatus")
    protected String highValueCustomerStatus;
    @XmlElement(name = "PayrollStatus")
    protected String payrollStatus;
    @XmlElement(name = "BearerShareFlag")
    protected Boolean bearerShareFlag;
    @XmlElement(name = "ComplexShareHolderFlag")
    protected Boolean complexShareHolderFlag;
    @XmlElement(name = "FillingDocBranch")
    protected BranchCodeNameType fillingDocBranch;
    @XmlElement(name = "FillingDocDate")
    protected DateType fillingDocDate;

    /**
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideFlag(Boolean value) {
        this.overrideFlag = value;
    }

    /**
     * Gets the value of the overrideBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideBy() {
        return overrideBy;
    }

    /**
     * Sets the value of the overrideBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideBy(String value) {
        this.overrideBy = value;
    }

    /**
     * Gets the value of the idTypeOfTax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDTypeOfTax() {
        return idTypeOfTax;
    }

    /**
     * Sets the value of the idTypeOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDTypeOfTax(String value) {
        this.idTypeOfTax = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setEducation(CodeNamePairType value) {
        this.education = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setEmployee(CodeNamePairType value) {
        this.employee = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the jobPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPosition() {
        return jobPosition;
    }

    /**
     * Sets the value of the jobPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPosition(String value) {
        this.jobPosition = value;
    }

    /**
     * Gets the value of the nationality2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality2() {
        return nationality2;
    }

    /**
     * Sets the value of the nationality2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality2(String value) {
        this.nationality2 = value;
    }

    /**
     * Gets the value of the nationality3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality3() {
        return nationality3;
    }

    /**
     * Sets the value of the nationality3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality3(String value) {
        this.nationality3 = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the substantialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstantialIndicator() {
        return substantialIndicator;
    }

    /**
     * Sets the value of the substantialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstantialIndicator(Boolean value) {
        this.substantialIndicator = value;
    }

    /**
     * Gets the value of the greenCardFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGreenCardFlag() {
        return greenCardFlag;
    }

    /**
     * Sets the value of the greenCardFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGreenCardFlag(Boolean value) {
        this.greenCardFlag = value;
    }

    /**
     * Gets the value of the usDeclarationFormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSDeclarationFormFlag() {
        return usDeclarationFormFlag;
    }

    /**
     * Sets the value of the usDeclarationFormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSDeclarationFormFlag(Boolean value) {
        this.usDeclarationFormFlag = value;
    }

    /**
     * Gets the value of the w9FormFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isW9FormFlag() {
        return w9FormFlag;
    }

    /**
     * Sets the value of the w9FormFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setW9FormFlag(Boolean value) {
        this.w9FormFlag = value;
    }

    /**
     * Gets the value of the standingInstructionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandingInstructionFlag() {
        return standingInstructionFlag;
    }

    /**
     * Sets the value of the standingInstructionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandingInstructionFlag(Boolean value) {
        this.standingInstructionFlag = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setClassification(CodeNamePairType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the foreignTaxIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTaxIDType() {
        return foreignTaxIDType;
    }

    /**
     * Sets the value of the foreignTaxIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTaxIDType(String value) {
        this.foreignTaxIDType = value;
    }

    /**
     * Gets the value of the foreignTaxIDNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignTaxIDNum() {
        return foreignTaxIDNum;
    }

    /**
     * Sets the value of the foreignTaxIDNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignTaxIDNum(String value) {
        this.foreignTaxIDNum = value;
    }

    /**
     * Gets the value of the consentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsentFlag() {
        return consentFlag;
    }

    /**
     * Sets the value of the consentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsentFlag(Boolean value) {
        this.consentFlag = value;
    }

    /**
     * Gets the value of the consentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getConsentDate() {
        return consentDate;
    }

    /**
     * Sets the value of the consentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setConsentDate(DateType value) {
        this.consentDate = value;
    }

    /**
     * Gets the value of the consentProcessingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getConsentProcessingBranch() {
        return consentProcessingBranch;
    }

    /**
     * Sets the value of the consentProcessingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setConsentProcessingBranch(BranchCodeNameType value) {
        this.consentProcessingBranch = value;
    }

    /**
     * Gets the value of the skipFATCAFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipFATCAFlag() {
        return skipFATCAFlag;
    }

    /**
     * Sets the value of the skipFATCAFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipFATCAFlag(Boolean value) {
        this.skipFATCAFlag = value;
    }

    /**
     * Gets the value of the giinGroup property.
     * 
     * @return
     *     possible object is
     *     {@link GIINGroupType }
     *     
     */
    public GIINGroupType getGIINGroup() {
        return giinGroup;
    }

    /**
     * Sets the value of the giinGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIINGroupType }
     *     
     */
    public void setGIINGroup(GIINGroupType value) {
        this.giinGroup = value;
    }

    /**
     * Gets the value of the selfCertification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getSelfCertification() {
        return selfCertification;
    }

    /**
     * Sets the value of the selfCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setSelfCertification(CodeNamePairType value) {
        this.selfCertification = value;
    }

    /**
     * Gets the value of the womanMaidenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWomanMaidenName() {
        return womanMaidenName;
    }

    /**
     * Sets the value of the womanMaidenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWomanMaidenName(String value) {
        this.womanMaidenName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the englishNameSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishNameSeqNum() {
        return englishNameSeqNum;
    }

    /**
     * Sets the value of the englishNameSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishNameSeqNum(String value) {
        this.englishNameSeqNum = value;
    }

    /**
     * Gets the value of the blackListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListFlag() {
        return blackListFlag;
    }

    /**
     * Sets the value of the blackListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackListFlag(Boolean value) {
        this.blackListFlag = value;
    }

    /**
     * Gets the value of the firstContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFirstContactDate() {
        return firstContactDate;
    }

    /**
     * Sets the value of the firstContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFirstContactDate(DateType value) {
        this.firstContactDate = value;
    }

    /**
     * Gets the value of the firstContactBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getFirstContactBranch() {
        return firstContactBranch;
    }

    /**
     * Sets the value of the firstContactBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setFirstContactBranch(BranchCodeNameType value) {
        this.firstContactBranch = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastUpdateDate(DateType value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdateOperatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateOperatorID() {
        return lastUpdateOperatorID;
    }

    /**
     * Sets the value of the lastUpdateOperatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateOperatorID(String value) {
        this.lastUpdateOperatorID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the oed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOED() {
        return oed;
    }

    /**
     * Sets the value of the oed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOED(String value) {
        this.oed = value;
    }

    /**
     * Gets the value of the highValueCustomerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighValueCustomerStatus() {
        return highValueCustomerStatus;
    }

    /**
     * Sets the value of the highValueCustomerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighValueCustomerStatus(String value) {
        this.highValueCustomerStatus = value;
    }

    /**
     * Gets the value of the payrollStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayrollStatus() {
        return payrollStatus;
    }

    /**
     * Sets the value of the payrollStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayrollStatus(String value) {
        this.payrollStatus = value;
    }

    /**
     * Gets the value of the bearerShareFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBearerShareFlag() {
        return bearerShareFlag;
    }

    /**
     * Sets the value of the bearerShareFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBearerShareFlag(Boolean value) {
        this.bearerShareFlag = value;
    }

    /**
     * Gets the value of the complexShareHolderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplexShareHolderFlag() {
        return complexShareHolderFlag;
    }

    /**
     * Sets the value of the complexShareHolderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplexShareHolderFlag(Boolean value) {
        this.complexShareHolderFlag = value;
    }

    /**
     * Gets the value of the fillingDocBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getFillingDocBranch() {
        return fillingDocBranch;
    }

    /**
     * Sets the value of the fillingDocBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setFillingDocBranch(BranchCodeNameType value) {
        this.fillingDocBranch = value;
    }

    /**
     * Gets the value of the fillingDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFillingDocDate() {
        return fillingDocDate;
    }

    /**
     * Sets the value of the fillingDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFillingDocDate(DateType value) {
        this.fillingDocDate = value;
    }

}
