
package com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerApplAcctSummaryInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerApplAcctSummaryInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="ApplIDNotCheckDate" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}ApplIDsType" minOccurs="0"/>
 *         &lt;element name="ApplIDCheckDate" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}ApplIDsType" minOccurs="0"/>
 *         &lt;element name="CheckDateOption" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15}CheckingDateOptionType" minOccurs="0"/>
 *         &lt;element name="OverlimitNum" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerApplAcctSummaryInqReqType", propOrder = {
    "rmNum",
    "applIDNotCheckDate",
    "applIDCheckDate",
    "checkDateOption",
    "overlimitNum"
})
public class CustomerApplAcctSummaryInqReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "ApplIDNotCheckDate")
    protected ApplIDsType applIDNotCheckDate;
    @XmlElement(name = "ApplIDCheckDate")
    protected ApplIDsType applIDCheckDate;
    @XmlElement(name = "CheckDateOption")
    protected CheckingDateOptionType checkDateOption;
    @XmlElement(name = "OverlimitNum", required = true)
    protected BigInteger overlimitNum;

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
     *     {@link ApplIDsType }
     *     
     */
    public ApplIDsType getApplIDNotCheckDate() {
        return applIDNotCheckDate;
    }

    /**
     * Sets the value of the applIDNotCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplIDsType }
     *     
     */
    public void setApplIDNotCheckDate(ApplIDsType value) {
        this.applIDNotCheckDate = value;
    }

    /**
     * Gets the value of the applIDCheckDate property.
     * 
     * @return
     *     possible object is
     *     {@link ApplIDsType }
     *     
     */
    public ApplIDsType getApplIDCheckDate() {
        return applIDCheckDate;
    }

    /**
     * Sets the value of the applIDCheckDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplIDsType }
     *     
     */
    public void setApplIDCheckDate(ApplIDsType value) {
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
     * Gets the value of the overlimitNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverlimitNum() {
        return overlimitNum;
    }

    /**
     * Sets the value of the overlimitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverlimitNum(BigInteger value) {
        this.overlimitNum = value;
    }

}
