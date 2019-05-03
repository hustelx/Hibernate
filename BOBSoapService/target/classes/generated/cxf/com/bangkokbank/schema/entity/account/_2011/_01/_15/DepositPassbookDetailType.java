
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PassbookInfoType;


/**
 * <p>Java class for DepositPassbookDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositPassbookDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountRef" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefType" minOccurs="0"/>
 *         &lt;element name="OwnerBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="PassbookInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PassbookInfoType" minOccurs="0"/>
 *         &lt;element name="IssueBranch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="TxnApprovalCondition" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositPassbookDetailType", propOrder = {
    "accountRef",
    "ownerBranch",
    "passbookInfo",
    "issueBranch",
    "txnApprovalCondition",
    "lastUpdateDate"
})
public class DepositPassbookDetailType {

    @XmlElement(name = "AccountRef")
    protected AccountRefType accountRef;
    @XmlElement(name = "OwnerBranch")
    protected BranchCodeNameType ownerBranch;
    @XmlElement(name = "PassbookInfo")
    protected PassbookInfoType passbookInfo;
    @XmlElement(name = "IssueBranch")
    protected BranchCodeNameType issueBranch;
    @XmlElement(name = "TxnApprovalCondition")
    protected CodeDescType txnApprovalCondition;
    @XmlElement(name = "LastUpdateDate")
    protected DateType lastUpdateDate;

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefType }
     *     
     */
    public AccountRefType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefType }
     *     
     */
    public void setAccountRef(AccountRefType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the ownerBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getOwnerBranch() {
        return ownerBranch;
    }

    /**
     * Sets the value of the ownerBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setOwnerBranch(BranchCodeNameType value) {
        this.ownerBranch = value;
    }

    /**
     * Gets the value of the passbookInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PassbookInfoType }
     *     
     */
    public PassbookInfoType getPassbookInfo() {
        return passbookInfo;
    }

    /**
     * Sets the value of the passbookInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassbookInfoType }
     *     
     */
    public void setPassbookInfo(PassbookInfoType value) {
        this.passbookInfo = value;
    }

    /**
     * Gets the value of the issueBranch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getIssueBranch() {
        return issueBranch;
    }

    /**
     * Sets the value of the issueBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setIssueBranch(BranchCodeNameType value) {
        this.issueBranch = value;
    }

    /**
     * Gets the value of the txnApprovalCondition property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getTxnApprovalCondition() {
        return txnApprovalCondition;
    }

    /**
     * Sets the value of the txnApprovalCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setTxnApprovalCondition(CodeDescType value) {
        this.txnApprovalCondition = value;
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

}
