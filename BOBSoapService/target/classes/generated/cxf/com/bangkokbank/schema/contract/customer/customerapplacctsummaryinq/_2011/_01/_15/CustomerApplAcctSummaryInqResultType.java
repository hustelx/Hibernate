
package com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CustomerApplAcctSummaryInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerApplAcctSummaryInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="ApplIDNotCheckDate" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}ApplIDTotalNumsType" minOccurs="0"/>
 *         &lt;element name="ApplIDCheckDate" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}ApplIDTotalNumsType" minOccurs="0"/>
 *         &lt;element name="CheckDateOption" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}CheckingDateOptionType" minOccurs="0"/>
 *         &lt;element name="LastestOpeningDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LastestOpeningBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="OverLimitFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerApplAcctSummaryInqResultType", propOrder = {
    "rmNum",
    "applIDNotCheckDate",
    "applIDCheckDate",
    "checkDateOption",
    "lastestOpeningDate",
    "lastestOpeningBranch",
    "overLimitFlag"
})
public class CustomerApplAcctSummaryInqResultType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "ApplIDNotCheckDate")
    protected ApplIDTotalNumsType applIDNotCheckDate;
    @XmlElement(name = "ApplIDCheckDate")
    protected ApplIDTotalNumsType applIDCheckDate;
    @XmlElement(name = "CheckDateOption")
    protected CheckingDateOptionType checkDateOption;
    @XmlElement(name = "LastestOpeningDate")
    protected DateType lastestOpeningDate;
    @XmlElement(name = "LastestOpeningBranch")
    protected BranchCodeNameType lastestOpeningBranch;
    @XmlElement(name = "OverLimitFlag")
    protected Boolean overLimitFlag;

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
     * Gets the value of the applIDNotCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApplIDTotalNumsType }
     *     
     */
    public ApplIDTotalNumsType getApplIDNotCheckDate() {
        return applIDNotCheckDate;
    }

    /**
     * Sets the value of the applIDNotCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplIDTotalNumsType }
     *     
     */
    public void setApplIDNotCheckDate(ApplIDTotalNumsType value) {
        this.applIDNotCheckDate = value;
    }

    /**
     * Gets the value of the applIDCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApplIDTotalNumsType }
     *     
     */
    public ApplIDTotalNumsType getApplIDCheckDate() {
        return applIDCheckDate;
    }

    /**
     * Sets the value of the applIDCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplIDTotalNumsType }
     *     
     */
    public void setApplIDCheckDate(ApplIDTotalNumsType value) {
        this.applIDCheckDate = value;
    }

    /**
     * Gets the value of the checkDateOption property.
     * 
     * @return
     *     possible object is
     *     {@link CheckingDateOptionType }
     *     
     */
    public CheckingDateOptionType getCheckDateOption() {
        return checkDateOption;
    }

    /**
     * Sets the value of the checkDateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckingDateOptionType }
     *     
     */
    public void setCheckDateOption(CheckingDateOptionType value) {
        this.checkDateOption = value;
    }

    /**
     * Gets the value of the lastestOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastestOpeningDate() {
        return lastestOpeningDate;
    }

    /**
     * Sets the value of the lastestOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastestOpeningDate(DateType value) {
        this.lastestOpeningDate = value;
    }

    /**
     * Gets the value of the lastestOpeningBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getLastestOpeningBranch() {
        return lastestOpeningBranch;
    }

    /**
     * Sets the value of the lastestOpeningBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setLastestOpeningBranch(BranchCodeNameType value) {
        this.lastestOpeningBranch = value;
    }

    /**
     * Gets the value of the overLimitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverLimitFlag() {
        return overLimitFlag;
    }

    /**
     * Sets the value of the overLimitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverLimitFlag(Boolean value) {
        this.overLimitFlag = value;
    }

}
