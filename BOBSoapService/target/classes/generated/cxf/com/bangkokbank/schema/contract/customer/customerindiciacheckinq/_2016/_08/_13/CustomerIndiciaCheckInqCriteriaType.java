
package com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CountryType;
import com.bangkokbank.schema.entity.customer._2011._01._15.AdditionalCustomerProfileInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileType;


/**
 * <p>Java class for CustomerIndiciaCheckInqCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIndiciaCheckInqCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerToAccountRel" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Classification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="CustomerProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType" minOccurs="0"/>
 *         &lt;element name="AdditionalCustomerProfileInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}AdditionalCustomerProfileInfoType" minOccurs="0"/>
 *         &lt;element name="CountryOfBirth" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CountryType" minOccurs="0"/>
 *         &lt;element name="DocumentBranchFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OldSelfCertification" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIndiciaCheckInqCriteriaType", propOrder = {
    "customerToAccountRel",
    "classification",
    "customerProfile",
    "additionalCustomerProfileInfo",
    "countryOfBirth",
    "documentBranchFlag",
    "oldSelfCertification"
})
public class CustomerIndiciaCheckInqCriteriaType {

    @XmlElement(name = "CustomerToAccountRel")
    protected CodeDescType customerToAccountRel;
    @XmlElement(name = "Classification")
    protected CodeDescType classification;
    @XmlElement(name = "CustomerProfile")
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "AdditionalCustomerProfileInfo")
    protected AdditionalCustomerProfileInfoType additionalCustomerProfileInfo;
    @XmlElement(name = "CountryOfBirth")
    protected CountryType countryOfBirth;
    @XmlElement(name = "DocumentBranchFlag")
    protected Boolean documentBranchFlag;
    @XmlElement(name = "OldSelfCertification")
    protected CodeNamePairType oldSelfCertification;

    /**
     * Gets the value of the customerToAccountRel property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getCustomerToAccountRel() {
        return customerToAccountRel;
    }

    /**
     * Sets the value of the customerToAccountRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setCustomerToAccountRel(CodeDescType value) {
        this.customerToAccountRel = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setClassification(CodeDescType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the additionalCustomerProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public AdditionalCustomerProfileInfoType getAdditionalCustomerProfileInfo() {
        return additionalCustomerProfileInfo;
    }

    /**
     * Sets the value of the additionalCustomerProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalCustomerProfileInfoType }
     *     
     */
    public void setAdditionalCustomerProfileInfo(AdditionalCustomerProfileInfoType value) {
        this.additionalCustomerProfileInfo = value;
    }

    /**
     * Gets the value of the countryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfBirth() {
        return countryOfBirth;
    }

    /**
     * Sets the value of the countryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfBirth(CountryType value) {
        this.countryOfBirth = value;
    }

    /**
     * Gets the value of the documentBranchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentBranchFlag() {
        return documentBranchFlag;
    }

    /**
     * Sets the value of the documentBranchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentBranchFlag(Boolean value) {
        this.documentBranchFlag = value;
    }

    /**
     * Gets the value of the oldSelfCertification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getOldSelfCertification() {
        return oldSelfCertification;
    }

    /**
     * Sets the value of the oldSelfCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setOldSelfCertification(CodeNamePairType value) {
        this.oldSelfCertification = value;
    }

}
