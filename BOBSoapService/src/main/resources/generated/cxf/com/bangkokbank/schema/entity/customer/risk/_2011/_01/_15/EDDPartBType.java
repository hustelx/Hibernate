
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDDPartBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDDPartBType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}EDDPartAType">
 *       &lt;sequence>
 *         &lt;element name="IDDocumentChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MailingAddressChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PhoneNumChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OccupationChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BeneficialOwnerAuthorizedChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessTypeChangedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuspiciousPersonFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HighRiskSanctionListFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TxnsNotInLineWithObjectiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDDPartBType", propOrder = {
    "idDocumentChangedFlag",
    "mailingAddressChangedFlag",
    "phoneNumChangedFlag",
    "emailChangedFlag",
    "occupationChangedFlag",
    "beneficialOwnerAuthorizedChangedFlag",
    "businessTypeChangedFlag",
    "suspiciousPersonFlag",
    "highRiskSanctionListFlag",
    "txnsNotInLineWithObjectiveFlag"
})
public class EDDPartBType
    extends EDDPartAType
{

    @XmlElement(name = "IDDocumentChangedFlag")
    protected Boolean idDocumentChangedFlag;
    @XmlElement(name = "MailingAddressChangedFlag")
    protected Boolean mailingAddressChangedFlag;
    @XmlElement(name = "PhoneNumChangedFlag")
    protected Boolean phoneNumChangedFlag;
    @XmlElement(name = "EmailChangedFlag")
    protected Boolean emailChangedFlag;
    @XmlElement(name = "OccupationChangedFlag")
    protected Boolean occupationChangedFlag;
    @XmlElement(name = "BeneficialOwnerAuthorizedChangedFlag")
    protected Boolean beneficialOwnerAuthorizedChangedFlag;
    @XmlElement(name = "BusinessTypeChangedFlag")
    protected Boolean businessTypeChangedFlag;
    @XmlElement(name = "SuspiciousPersonFlag")
    protected Boolean suspiciousPersonFlag;
    @XmlElement(name = "HighRiskSanctionListFlag")
    protected Boolean highRiskSanctionListFlag;
    @XmlElement(name = "TxnsNotInLineWithObjectiveFlag")
    protected Boolean txnsNotInLineWithObjectiveFlag;

    /**
     * Gets the value of the idDocumentChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDDocumentChangedFlag() {
        return idDocumentChangedFlag;
    }

    /**
     * Sets the value of the idDocumentChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDDocumentChangedFlag(Boolean value) {
        this.idDocumentChangedFlag = value;
    }

    /**
     * Gets the value of the mailingAddressChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailingAddressChangedFlag() {
        return mailingAddressChangedFlag;
    }

    /**
     * Sets the value of the mailingAddressChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailingAddressChangedFlag(Boolean value) {
        this.mailingAddressChangedFlag = value;
    }

    /**
     * Gets the value of the phoneNumChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhoneNumChangedFlag() {
        return phoneNumChangedFlag;
    }

    /**
     * Sets the value of the phoneNumChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhoneNumChangedFlag(Boolean value) {
        this.phoneNumChangedFlag = value;
    }

    /**
     * Gets the value of the emailChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailChangedFlag() {
        return emailChangedFlag;
    }

    /**
     * Sets the value of the emailChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailChangedFlag(Boolean value) {
        this.emailChangedFlag = value;
    }

    /**
     * Gets the value of the occupationChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOccupationChangedFlag() {
        return occupationChangedFlag;
    }

    /**
     * Sets the value of the occupationChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOccupationChangedFlag(Boolean value) {
        this.occupationChangedFlag = value;
    }

    /**
     * Gets the value of the beneficialOwnerAuthorizedChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficialOwnerAuthorizedChangedFlag() {
        return beneficialOwnerAuthorizedChangedFlag;
    }

    /**
     * Sets the value of the beneficialOwnerAuthorizedChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficialOwnerAuthorizedChangedFlag(Boolean value) {
        this.beneficialOwnerAuthorizedChangedFlag = value;
    }

    /**
     * Gets the value of the businessTypeChangedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessTypeChangedFlag() {
        return businessTypeChangedFlag;
    }

    /**
     * Sets the value of the businessTypeChangedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessTypeChangedFlag(Boolean value) {
        this.businessTypeChangedFlag = value;
    }

    /**
     * Gets the value of the suspiciousPersonFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspiciousPersonFlag() {
        return suspiciousPersonFlag;
    }

    /**
     * Sets the value of the suspiciousPersonFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspiciousPersonFlag(Boolean value) {
        this.suspiciousPersonFlag = value;
    }

    /**
     * Gets the value of the highRiskSanctionListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighRiskSanctionListFlag() {
        return highRiskSanctionListFlag;
    }

    /**
     * Sets the value of the highRiskSanctionListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighRiskSanctionListFlag(Boolean value) {
        this.highRiskSanctionListFlag = value;
    }

    /**
     * Gets the value of the txnsNotInLineWithObjectiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxnsNotInLineWithObjectiveFlag() {
        return txnsNotInLineWithObjectiveFlag;
    }

    /**
     * Sets the value of the txnsNotInLineWithObjectiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxnsNotInLineWithObjectiveFlag(Boolean value) {
        this.txnsNotInLineWithObjectiveFlag = value;
    }

}
