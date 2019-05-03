
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommitmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCommitmentTierNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubCommitmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentRateIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentRateAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CollateralReviewCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DebitAccount" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefType" minOccurs="0"/>
 *         &lt;element name="BBLProjectRefs" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}BBLProjectRefsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentInfoType", propOrder = {
    "commitmentDesc",
    "subCommitmentTierNum",
    "subCommitmentDesc",
    "commitmentRateIndex",
    "commitmentRateAction",
    "commitmentRateSpread",
    "collateralReviewCode",
    "debitAccount",
    "bblProjectRefs"
})
public class CommitmentInfoType {

    @XmlElement(name = "CommitmentDesc")
    protected String commitmentDesc;
    @XmlElement(name = "SubCommitmentTierNum")
    protected String subCommitmentTierNum;
    @XmlElement(name = "SubCommitmentDesc")
    protected String subCommitmentDesc;
    @XmlElement(name = "CommitmentRateIndex")
    protected String commitmentRateIndex;
    @XmlElement(name = "CommitmentRateAction")
    protected String commitmentRateAction;
    @XmlElement(name = "CommitmentRateSpread")
    protected BigDecimal commitmentRateSpread;
    @XmlElement(name = "CollateralReviewCode")
    protected String collateralReviewCode;
    @XmlElement(name = "DebitAccount")
    protected AccountRefType debitAccount;
    @XmlElement(name = "BBLProjectRefs")
    protected BBLProjectRefsType bblProjectRefs;

    /**
     * Gets the value of the commitmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentDesc() {
        return commitmentDesc;
    }

    /**
     * Sets the value of the commitmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentDesc(String value) {
        this.commitmentDesc = value;
    }

    /**
     * Gets the value of the subCommitmentTierNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCommitmentTierNum() {
        return subCommitmentTierNum;
    }

    /**
     * Sets the value of the subCommitmentTierNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCommitmentTierNum(String value) {
        this.subCommitmentTierNum = value;
    }

    /**
     * Gets the value of the subCommitmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCommitmentDesc() {
        return subCommitmentDesc;
    }

    /**
     * Sets the value of the subCommitmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCommitmentDesc(String value) {
        this.subCommitmentDesc = value;
    }

    /**
     * Gets the value of the commitmentRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentRateIndex() {
        return commitmentRateIndex;
    }

    /**
     * Sets the value of the commitmentRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentRateIndex(String value) {
        this.commitmentRateIndex = value;
    }

    /**
     * Gets the value of the commitmentRateAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentRateAction() {
        return commitmentRateAction;
    }

    /**
     * Sets the value of the commitmentRateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentRateAction(String value) {
        this.commitmentRateAction = value;
    }

    /**
     * Gets the value of the commitmentRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommitmentRateSpread() {
        return commitmentRateSpread;
    }

    /**
     * Sets the value of the commitmentRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommitmentRateSpread(BigDecimal value) {
        this.commitmentRateSpread = value;
    }

    /**
     * Gets the value of the collateralReviewCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollateralReviewCode() {
        return collateralReviewCode;
    }

    /**
     * Sets the value of the collateralReviewCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollateralReviewCode(String value) {
        this.collateralReviewCode = value;
    }

    /**
     * Gets the value of the debitAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefType }
     *     
     */
    public AccountRefType getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets the value of the debitAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefType }
     *     
     */
    public void setDebitAccount(AccountRefType value) {
        this.debitAccount = value;
    }

    /**
     * Gets the value of the bblProjectRefs property.
     * 
     * @return
     *     possible object is
     *     {@link BBLProjectRefsType }
     *     
     */
    public BBLProjectRefsType getBBLProjectRefs() {
        return bblProjectRefs;
    }

    /**
     * Sets the value of the bblProjectRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBLProjectRefsType }
     *     
     */
    public void setBBLProjectRefs(BBLProjectRefsType value) {
        this.bblProjectRefs = value;
    }

}
