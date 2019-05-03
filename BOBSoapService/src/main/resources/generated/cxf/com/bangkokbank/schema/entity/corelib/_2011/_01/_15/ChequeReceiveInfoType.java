
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeReceiveInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeReceiveInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Issuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChequeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="Branch" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="ChequeDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="LocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectingBranch" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="PrincipalAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="DiscountAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="BalanceAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeReceiveInfoType", propOrder = {
    "itemNum",
    "refNum",
    "issuer",
    "chequeNum",
    "bank",
    "branch",
    "chequeDate",
    "locationCode",
    "collectingBranch",
    "principalAmt",
    "discountAmt",
    "balanceAmt"
})
public class ChequeReceiveInfoType {

    @XmlElement(name = "ItemNum")
    protected BigInteger itemNum;
    @XmlElement(name = "RefNum")
    protected String refNum;
    @XmlElement(name = "Issuer")
    protected String issuer;
    @XmlElement(name = "ChequeNum")
    protected String chequeNum;
    @XmlElement(name = "Bank")
    protected CodeNamePairType bank;
    @XmlElement(name = "Branch")
    protected CodeNamePairType branch;
    @XmlElement(name = "ChequeDate")
    protected DateType chequeDate;
    @XmlElement(name = "LocationCode")
    protected String locationCode;
    @XmlElement(name = "CollectingBranch")
    protected CodeNamePairType collectingBranch;
    @XmlElement(name = "PrincipalAmt")
    protected CurrAmtType principalAmt;
    @XmlElement(name = "DiscountAmt")
    protected CurrAmtType discountAmt;
    @XmlElement(name = "BalanceAmt")
    protected CurrAmtType balanceAmt;

    /**
     * Gets the value of the itemNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNum() {
        return itemNum;
    }

    /**
     * Sets the value of the itemNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNum(BigInteger value) {
        this.itemNum = value;
    }

    /**
     * Gets the value of the refNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * Sets the value of the refNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum(String value) {
        this.refNum = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuer(String value) {
        this.issuer = value;
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
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the collectingBranch property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getCollectingBranch() {
        return collectingBranch;
    }

    /**
     * Sets the value of the collectingBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setCollectingBranch(CodeNamePairType value) {
        this.collectingBranch = value;
    }

    /**
     * Gets the value of the principalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getPrincipalAmt() {
        return principalAmt;
    }

    /**
     * Sets the value of the principalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setPrincipalAmt(CurrAmtType value) {
        this.principalAmt = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setDiscountAmt(CurrAmtType value) {
        this.discountAmt = value;
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

}
