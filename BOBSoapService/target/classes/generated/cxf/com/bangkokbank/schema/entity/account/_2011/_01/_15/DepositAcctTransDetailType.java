
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for DepositAcctTransDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAcctTransDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ChequeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepositNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Particulars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransDirType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="BalanceAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="SourceID" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoreInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueEffectiveDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="SeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppGenTransInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillDetailCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InputBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTimeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserDataTranmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositAcctTransDetailType", propOrder = {
    "transactionDate",
    "chequeNum",
    "depositNum",
    "particulars",
    "transDirType",
    "transactionAmt",
    "balanceAmt",
    "sourceID",
    "location",
    "moreInfo",
    "valueEffectiveDate",
    "seqNum",
    "appGenTransInd",
    "transactionCode",
    "billDetailCode",
    "description",
    "inputBranch",
    "terminalNum",
    "transactionTimeFlag",
    "userDataTranmission"
})
public class DepositAcctTransDetailType {

    @XmlElement(name = "TransactionDate")
    protected DateType transactionDate;
    @XmlElement(name = "ChequeNum")
    protected String chequeNum;
    @XmlElement(name = "DepositNum")
    protected String depositNum;
    @XmlElement(name = "Particulars")
    protected String particulars;
    @XmlElement(name = "TransDirType")
    protected String transDirType;
    @XmlElement(name = "TransactionAmt")
    protected CurrAmtType transactionAmt;
    @XmlElement(name = "BalanceAmt")
    protected CurrAmtType balanceAmt;
    @XmlElement(name = "SourceID")
    protected CodeDescType sourceID;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "MoreInfo")
    protected String moreInfo;
    @XmlElement(name = "ValueEffectiveDate")
    protected DateType valueEffectiveDate;
    @XmlElement(name = "SeqNum")
    protected String seqNum;
    @XmlElement(name = "AppGenTransInd")
    protected String appGenTransInd;
    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "BillDetailCode")
    protected String billDetailCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "InputBranch")
    protected String inputBranch;
    @XmlElement(name = "TerminalNum")
    protected String terminalNum;
    @XmlElement(name = "TransactionTimeFlag")
    protected String transactionTimeFlag;
    @XmlElement(name = "UserDataTranmission")
    protected String userDataTranmission;

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setTransactionDate(DateType value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the chequeNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeNum() {
        return chequeNum;
    }

    /**
     * Sets the value of the chequeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeNum(String value) {
        this.chequeNum = value;
    }

    /**
     * Gets the value of the depositNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositNum() {
        return depositNum;
    }

    /**
     * Sets the value of the depositNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositNum(String value) {
        this.depositNum = value;
    }

    /**
     * Gets the value of the particulars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticulars() {
        return particulars;
    }

    /**
     * Sets the value of the particulars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticulars(String value) {
        this.particulars = value;
    }

    /**
     * Gets the value of the transDirType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDirType() {
        return transDirType;
    }

    /**
     * Sets the value of the transDirType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDirType(String value) {
        this.transDirType = value;
    }

    /**
     * Gets the value of the transactionAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getTransactionAmt() {
        return transactionAmt;
    }

    /**
     * Sets the value of the transactionAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setTransactionAmt(CurrAmtType value) {
        this.transactionAmt = value;
    }

    /**
     * Gets the value of the balanceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getBalanceAmt() {
        return balanceAmt;
    }

    /**
     * Sets the value of the balanceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setBalanceAmt(CurrAmtType value) {
        this.balanceAmt = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setSourceID(CodeDescType value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the moreInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreInfo() {
        return moreInfo;
    }

    /**
     * Sets the value of the moreInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreInfo(String value) {
        this.moreInfo = value;
    }

    /**
     * Gets the value of the valueEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getValueEffectiveDate() {
        return valueEffectiveDate;
    }

    /**
     * Sets the value of the valueEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setValueEffectiveDate(DateType value) {
        this.valueEffectiveDate = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNum(String value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the appGenTransInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppGenTransInd() {
        return appGenTransInd;
    }

    /**
     * Sets the value of the appGenTransInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppGenTransInd(String value) {
        this.appGenTransInd = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the billDetailCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillDetailCode() {
        return billDetailCode;
    }

    /**
     * Sets the value of the billDetailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillDetailCode(String value) {
        this.billDetailCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inputBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputBranch() {
        return inputBranch;
    }

    /**
     * Sets the value of the inputBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputBranch(String value) {
        this.inputBranch = value;
    }

    /**
     * Gets the value of the terminalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalNum() {
        return terminalNum;
    }

    /**
     * Sets the value of the terminalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalNum(String value) {
        this.terminalNum = value;
    }

    /**
     * Gets the value of the transactionTimeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTimeFlag() {
        return transactionTimeFlag;
    }

    /**
     * Sets the value of the transactionTimeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimeFlag(String value) {
        this.transactionTimeFlag = value;
    }

    /**
     * Gets the value of the userDataTranmission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDataTranmission() {
        return userDataTranmission;
    }

    /**
     * Sets the value of the userDataTranmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDataTranmission(String value) {
        this.userDataTranmission = value;
    }

}
