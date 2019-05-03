
package com.bangkokbank.schema.entity.customer.group.corelib;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.bblgroup._2011._01._15.BBLGroupType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CreditGroupProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditGroupProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditGroupRef" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CreditGroupRefType"/>
 *         &lt;element name="Allocation" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="GroupStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupBalance" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="NumOfMember" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SingleLendingLimitFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AsOfDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="BBLGroup" type="{http://www.bangkokbank.com/schema/entity/BBLGroup/2011/01/15}BBLGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditGroupProfileType", propOrder = {
    "creditGroupRef",
    "allocation",
    "groupStatus",
    "groupBalance",
    "numOfMember",
    "singleLendingLimitFlag",
    "asOfDate",
    "bblGroup"
})
public class CreditGroupProfileType {

    @XmlElement(name = "CreditGroupRef", required = true)
    protected CreditGroupRefType creditGroupRef;
    @XmlElement(name = "Allocation")
    protected CodeNamePairType allocation;
    @XmlElement(name = "GroupStatus")
    protected String groupStatus;
    @XmlElement(name = "GroupBalance")
    protected CurrAmtType groupBalance;
    @XmlElement(name = "NumOfMember")
    protected BigInteger numOfMember;
    @XmlElement(name = "SingleLendingLimitFlag")
    protected Boolean singleLendingLimitFlag;
    @XmlElement(name = "AsOfDate")
    protected DateType asOfDate;
    @XmlElement(name = "BBLGroup")
    protected BBLGroupType bblGroup;

    /**
     * Gets the value of the creditGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditGroupRefType }
     *     
     */
    public CreditGroupRefType getCreditGroupRef() {
        return creditGroupRef;
    }

    /**
     * Sets the value of the creditGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditGroupRefType }
     *     
     */
    public void setCreditGroupRef(CreditGroupRefType value) {
        this.creditGroupRef = value;
    }

    /**
     * Gets the value of the allocation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getAllocation() {
        return allocation;
    }

    /**
     * Sets the value of the allocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setAllocation(CodeNamePairType value) {
        this.allocation = value;
    }

    /**
     * Gets the value of the groupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupStatus() {
        return groupStatus;
    }

    /**
     * Sets the value of the groupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupStatus(String value) {
        this.groupStatus = value;
    }

    /**
     * Gets the value of the groupBalance property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getGroupBalance() {
        return groupBalance;
    }

    /**
     * Sets the value of the groupBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setGroupBalance(CurrAmtType value) {
        this.groupBalance = value;
    }

    /**
     * Gets the value of the numOfMember property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfMember() {
        return numOfMember;
    }

    /**
     * Sets the value of the numOfMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfMember(BigInteger value) {
        this.numOfMember = value;
    }

    /**
     * Gets the value of the singleLendingLimitFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSingleLendingLimitFlag() {
        return singleLendingLimitFlag;
    }

    /**
     * Sets the value of the singleLendingLimitFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleLendingLimitFlag(Boolean value) {
        this.singleLendingLimitFlag = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAsOfDate(DateType value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the bblGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BBLGroupType }
     *     
     */
    public BBLGroupType getBBLGroup() {
        return bblGroup;
    }

    /**
     * Sets the value of the bblGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BBLGroupType }
     *     
     */
    public void setBBLGroup(BBLGroupType value) {
        this.bblGroup = value;
    }

}
