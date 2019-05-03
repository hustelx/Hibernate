
package com.bangkokbank.schema.entity.customer.group.corelib;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.customer._2011._01._15.MaritalStatusType;


/**
 * <p>Java class for CreditMemberRelProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMemberRelProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditMemberProfiles" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CreditMemberProfilesType" minOccurs="0"/>
 *         &lt;element name="RelationType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="PercentShare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}MaritalStatusType" minOccurs="0"/>
 *         &lt;element name="OfficialSignatoryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMemberRelProfileType", propOrder = {
    "creditMemberProfiles",
    "relationType",
    "percentShare",
    "nationalityCode",
    "maritalStatus",
    "officialSignatoryFlag"
})
public class CreditMemberRelProfileType {

    @XmlElement(name = "CreditMemberProfiles")
    protected CreditMemberProfilesType creditMemberProfiles;
    @XmlElement(name = "RelationType")
    protected CodeDescType relationType;
    @XmlElement(name = "PercentShare")
    protected BigDecimal percentShare;
    @XmlElement(name = "NationalityCode")
    protected String nationalityCode;
    @XmlElement(name = "MaritalStatus")
    protected MaritalStatusType maritalStatus;
    @XmlElement(name = "OfficialSignatoryFlag")
    protected Boolean officialSignatoryFlag;

    /**
     * Gets the value of the creditMemberProfiles property.
     * 
     * @return
     *     possible object is
     *     {@link CreditMemberProfilesType }
     *     
     */
    public CreditMemberProfilesType getCreditMemberProfiles() {
        return creditMemberProfiles;
    }

    /**
     * Sets the value of the creditMemberProfiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditMemberProfilesType }
     *     
     */
    public void setCreditMemberProfiles(CreditMemberProfilesType value) {
        this.creditMemberProfiles = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setRelationType(CodeDescType value) {
        this.relationType = value;
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
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusType }
     *     
     */
    public MaritalStatusType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusType }
     *     
     */
    public void setMaritalStatus(MaritalStatusType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the officialSignatoryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficialSignatoryFlag() {
        return officialSignatoryFlag;
    }

    /**
     * Sets the value of the officialSignatoryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficialSignatoryFlag(Boolean value) {
        this.officialSignatoryFlag = value;
    }

}
