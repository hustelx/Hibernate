
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequePaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequePaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChequeNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ChequeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChequeDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="ClearingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashierChequeFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequePaymentInfoType", propOrder = {
    "chequeNum",
    "chequeName",
    "chequeDate",
    "bank",
    "branch",
    "clearingStatus",
    "cashierChequeFlag"
})
public class ChequePaymentInfoType {

    @XmlElement(name = "ChequeNum", required = true)
    protected String chequeNum;
    @XmlElement(name = "ChequeName")
    protected String chequeName;
    @XmlElement(name = "ChequeDate")
    protected DateType chequeDate;
    @XmlElement(name = "Bank")
    protected CodeNamePairType bank;
    @XmlElement(name = "Branch")
    protected CodeNamePairType branch;
    @XmlElement(name = "ClearingStatus")
    protected String clearingStatus;
    @XmlElement(name = "CashierChequeFlag")
    protected Boolean cashierChequeFlag;

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
     * Gets the value of the chequeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeName() {
        return chequeName;
    }

    /**
     * Sets the value of the chequeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeName(String value) {
        this.chequeName = value;
    }

    /**
     * Gets the value of the chequeDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getChequeDate() {
        return chequeDate;
    }

    /**
     * Sets the value of the chequeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setChequeDate(DateType value) {
        this.chequeDate = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setBank(CodeNamePairType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setBranch(CodeNamePairType value) {
        this.branch = value;
    }

    /**
     * Gets the value of the clearingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingStatus() {
        return clearingStatus;
    }

    /**
     * Sets the value of the clearingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingStatus(String value) {
        this.clearingStatus = value;
    }

    /**
     * Gets the value of the cashierChequeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCashierChequeFlag() {
        return cashierChequeFlag;
    }

    /**
     * Sets the value of the cashierChequeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCashierChequeFlag(Boolean value) {
        this.cashierChequeFlag = value;
    }

}
