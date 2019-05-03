
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressesType;


/**
 * <p>Java class for ShareHolderInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolderInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrioritySeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressesType" minOccurs="0"/>
 *         &lt;element name="PercentShare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="USTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FillingDocBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevelReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GoodGuyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolderInfoType", propOrder = {
    "prioritySeqNum",
    "refNum",
    "ctCode",
    "nationality",
    "addresses",
    "percentShare",
    "usTaxID",
    "fillingDocBranch",
    "riskLevel",
    "riskLevelReasonCode",
    "goodGuyFlag"
})
public class ShareHolderInfoType {

    @XmlElement(name = "PrioritySeqNum")
    protected Integer prioritySeqNum;
    @XmlElement(name = "RefNum")
    protected String refNum;
    @XmlElement(name = "CTCode")
    protected String ctCode;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "Addresses")
    protected PostAddressesType addresses;
    @XmlElement(name = "PercentShare")
    protected BigDecimal percentShare;
    @XmlElement(name = "USTaxID")
    protected String usTaxID;
    @XmlElement(name = "FillingDocBranch")
    protected BranchCodeNameType fillingDocBranch;
    @XmlElement(name = "RiskLevel")
    protected String riskLevel;
    @XmlElement(name = "RiskLevelReasonCode")
    protected String riskLevelReasonCode;
    @XmlElement(name = "GoodGuyFlag")
    protected Boolean goodGuyFlag;

    /**
     * Gets the value of the prioritySeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioritySeqNum() {
        return prioritySeqNum;
    }

    /**
     * Sets the value of the prioritySeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioritySeqNum(Integer value) {
        this.prioritySeqNum = value;
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
     * Gets the value of the ctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTCode() {
        return ctCode;
    }

    /**
     * Sets the value of the ctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTCode(String value) {
        this.ctCode = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressesType }
     *     
     */
    public PostAddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressesType }
     *     
     */
    public void setAddresses(PostAddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the percentShare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentShare() {
        return percentShare;
    }

    /**
     * Sets the value of the percentShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentShare(BigDecimal value) {
        this.percentShare = value;
    }

    /**
     * Gets the value of the usTaxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSTaxID() {
        return usTaxID;
    }

    /**
     * Sets the value of the usTaxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSTaxID(String value) {
        this.usTaxID = value;
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
     * Gets the value of the riskLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * Sets the value of the riskLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevel(String value) {
        this.riskLevel = value;
    }

    /**
     * Gets the value of the riskLevelReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLevelReasonCode() {
        return riskLevelReasonCode;
    }

    /**
     * Sets the value of the riskLevelReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLevelReasonCode(String value) {
        this.riskLevelReasonCode = value;
    }

    /**
     * Gets the value of the goodGuyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodGuyFlag() {
        return goodGuyFlag;
    }

    /**
     * Sets the value of the goodGuyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodGuyFlag(Boolean value) {
        this.goodGuyFlag = value;
    }

}
