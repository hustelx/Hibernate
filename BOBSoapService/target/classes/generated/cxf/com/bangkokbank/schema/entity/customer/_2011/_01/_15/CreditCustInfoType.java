
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.bblgroup._2011._01._15.BBLGroupsType;
import com.bangkokbank.schema.entity.botgroup._2011._01._15.BOTGroupsType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CreditCustInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCustInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BBLGroups" type="{http://www.bangkokbank.com/schema/entity/BBLGroup/2011/01/15}BBLGroupsType" minOccurs="0"/>
 *         &lt;element name="BOTGroups" type="{http://www.bangkokbank.com/schema/entity/BOTGroup/2011/01/15}BOTGroupsType" minOccurs="0"/>
 *         &lt;element name="AssociationType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="BOSEntityType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="AssignUnAssignType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="BusinessDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisterCapital" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="RegisterCapitalDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="CapitalPaidUp" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="CapitalPaidUpDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="NumOfEmployee" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumOfEmployeeDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="FSDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="TotalAsset" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="FixAssetSize" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="LandValue" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="CSU" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="NonRegisterMaritalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BURegisterInDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="RMUpdateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMAsOfDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="PilotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCustInfoType", propOrder = {
    "bblGroups",
    "botGroups",
    "associationType",
    "bosEntityType",
    "assignUnAssignType",
    "businessDesc",
    "registerCapital",
    "registerCapitalDate",
    "capitalPaidUp",
    "capitalPaidUpDate",
    "numOfEmployee",
    "numOfEmployeeDate",
    "fsDate",
    "totalAsset",
    "fixAssetSize",
    "landValue",
    "csu",
    "nonRegisterMaritalFlag",
    "buRegisterInDate",
    "rmUpdateCode",
    "rmAsOfDate",
    "pilotCode"
})
public class CreditCustInfoType {

    @XmlElement(name = "BBLGroups")
    protected BBLGroupsType bblGroups;
    @XmlElement(name = "BOTGroups")
    protected BOTGroupsType botGroups;
    @XmlElement(name = "AssociationType")
    protected CodeDescType associationType;
    @XmlElement(name = "BOSEntityType")
    protected CodeDescType bosEntityType;
    @XmlElement(name = "AssignUnAssignType")
    protected CodeDescType assignUnAssignType;
    @XmlElement(name = "BusinessDesc")
    protected String businessDesc;
    @XmlElement(name = "RegisterCapital")
    protected CurrAmtType registerCapital;
    @XmlElement(name = "RegisterCapitalDate")
    protected DateType registerCapitalDate;
    @XmlElement(name = "CapitalPaidUp")
    protected CurrAmtType capitalPaidUp;
    @XmlElement(name = "CapitalPaidUpDate")
    protected DateType capitalPaidUpDate;
    @XmlElement(name = "NumOfEmployee")
    protected BigInteger numOfEmployee;
    @XmlElement(name = "NumOfEmployeeDate")
    protected DateType numOfEmployeeDate;
    @XmlElement(name = "FSDate")
    protected DateType fsDate;
    @XmlElement(name = "TotalAsset")
    protected CurrAmtType totalAsset;
    @XmlElement(name = "FixAssetSize")
    protected CurrAmtType fixAssetSize;
    @XmlElement(name = "LandValue")
    protected CurrAmtType landValue;
    @XmlElement(name = "CSU")
    protected CodeDescType csu;
    @XmlElement(name = "NonRegisterMaritalFlag")
    protected Boolean nonRegisterMaritalFlag;
    @XmlElement(name = "BURegisterInDate")
    protected DateType buRegisterInDate;
    @XmlElement(name = "RMUpdateCode")
    protected String rmUpdateCode;
    @XmlElement(name = "RMAsOfDate")
    protected DateType rmAsOfDate;
    @XmlElement(name = "PilotCode")
    protected String pilotCode;

    /**
     * Gets the value of the bblGroups property.
     * 
     * @return
     *     possible object is
     *     {@link BBLGroupsType }
     *     
     */
    public BBLGroupsType getBBLGroups() {
        return bblGroups;
    }

    /**
     * Sets the value of the bblGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBLGroupsType }
     *     
     */
    public void setBBLGroups(BBLGroupsType value) {
        this.bblGroups = value;
    }

    /**
     * Gets the value of the botGroups property.
     * 
     * @return
     *     possible object is
     *     {@link BOTGroupsType }
     *     
     */
    public BOTGroupsType getBOTGroups() {
        return botGroups;
    }

    /**
     * Sets the value of the botGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOTGroupsType }
     *     
     */
    public void setBOTGroups(BOTGroupsType value) {
        this.botGroups = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setAssociationType(CodeDescType value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the bosEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getBOSEntityType() {
        return bosEntityType;
    }

    /**
     * Sets the value of the bosEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setBOSEntityType(CodeDescType value) {
        this.bosEntityType = value;
    }

    /**
     * Gets the value of the assignUnAssignType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getAssignUnAssignType() {
        return assignUnAssignType;
    }

    /**
     * Sets the value of the assignUnAssignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setAssignUnAssignType(CodeDescType value) {
        this.assignUnAssignType = value;
    }

    /**
     * Gets the value of the businessDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDesc() {
        return businessDesc;
    }

    /**
     * Sets the value of the businessDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDesc(String value) {
        this.businessDesc = value;
    }

    /**
     * Gets the value of the registerCapital property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getRegisterCapital() {
        return registerCapital;
    }

    /**
     * Sets the value of the registerCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setRegisterCapital(CurrAmtType value) {
        this.registerCapital = value;
    }

    /**
     * Gets the value of the registerCapitalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRegisterCapitalDate() {
        return registerCapitalDate;
    }

    /**
     * Sets the value of the registerCapitalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRegisterCapitalDate(DateType value) {
        this.registerCapitalDate = value;
    }

    /**
     * Gets the value of the capitalPaidUp property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getCapitalPaidUp() {
        return capitalPaidUp;
    }

    /**
     * Sets the value of the capitalPaidUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setCapitalPaidUp(CurrAmtType value) {
        this.capitalPaidUp = value;
    }

    /**
     * Gets the value of the capitalPaidUpDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getCapitalPaidUpDate() {
        return capitalPaidUpDate;
    }

    /**
     * Sets the value of the capitalPaidUpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setCapitalPaidUpDate(DateType value) {
        this.capitalPaidUpDate = value;
    }

    /**
     * Gets the value of the numOfEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfEmployee() {
        return numOfEmployee;
    }

    /**
     * Sets the value of the numOfEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfEmployee(BigInteger value) {
        this.numOfEmployee = value;
    }

    /**
     * Gets the value of the numOfEmployeeDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getNumOfEmployeeDate() {
        return numOfEmployeeDate;
    }

    /**
     * Sets the value of the numOfEmployeeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setNumOfEmployeeDate(DateType value) {
        this.numOfEmployeeDate = value;
    }

    /**
     * Gets the value of the fsDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getFSDate() {
        return fsDate;
    }

    /**
     * Sets the value of the fsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setFSDate(DateType value) {
        this.fsDate = value;
    }

    /**
     * Gets the value of the totalAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTotalAsset() {
        return totalAsset;
    }

    /**
     * Sets the value of the totalAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTotalAsset(CurrAmtType value) {
        this.totalAsset = value;
    }

    /**
     * Gets the value of the fixAssetSize property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getFixAssetSize() {
        return fixAssetSize;
    }

    /**
     * Sets the value of the fixAssetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setFixAssetSize(CurrAmtType value) {
        this.fixAssetSize = value;
    }

    /**
     * Gets the value of the landValue property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getLandValue() {
        return landValue;
    }

    /**
     * Sets the value of the landValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setLandValue(CurrAmtType value) {
        this.landValue = value;
    }

    /**
     * Gets the value of the csu property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getCSU() {
        return csu;
    }

    /**
     * Sets the value of the csu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setCSU(CodeDescType value) {
        this.csu = value;
    }

    /**
     * Gets the value of the nonRegisterMaritalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRegisterMaritalFlag() {
        return nonRegisterMaritalFlag;
    }

    /**
     * Sets the value of the nonRegisterMaritalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRegisterMaritalFlag(Boolean value) {
        this.nonRegisterMaritalFlag = value;
    }

    /**
     * Gets the value of the buRegisterInDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBURegisterInDate() {
        return buRegisterInDate;
    }

    /**
     * Sets the value of the buRegisterInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBURegisterInDate(DateType value) {
        this.buRegisterInDate = value;
    }

    /**
     * Gets the value of the rmUpdateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMUpdateCode() {
        return rmUpdateCode;
    }

    /**
     * Sets the value of the rmUpdateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMUpdateCode(String value) {
        this.rmUpdateCode = value;
    }

    /**
     * Gets the value of the rmAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRMAsOfDate() {
        return rmAsOfDate;
    }

    /**
     * Sets the value of the rmAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRMAsOfDate(DateType value) {
        this.rmAsOfDate = value;
    }

    /**
     * Gets the value of the pilotCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilotCode() {
        return pilotCode;
    }

    /**
     * Sets the value of the pilotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilotCode(String value) {
        this.pilotCode = value;
    }

}
