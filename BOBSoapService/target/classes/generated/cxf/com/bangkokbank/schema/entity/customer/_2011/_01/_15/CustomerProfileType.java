
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.bblgroup._2011._01._15.BBLGroupType;
import com.bangkokbank.schema.entity.businesscenter._2011._01._15.BusinessCenterType;
import com.bangkokbank.schema.entity.businessdivision._2011._01._15.BusinessDivisionType;
import com.bangkokbank.schema.entity.businesstype._2011._01._15.BusinessType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CountryType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.GenderType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressesType;
import com.bangkokbank.schema.entity.region._2013._01._01.RegionCodeNameType;


/**
 * <p>Java class for CustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="ALSCustomerNums" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}ALSCustomerNumsType" minOccurs="0"/>
 *         &lt;element name="TFCCustomerNums" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}TFCCustomerNumsType" minOccurs="0"/>
 *         &lt;element name="CTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CT" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="BOTCTCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}GenderType" minOccurs="0"/>
 *         &lt;element name="CustomerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRegistrationType" minOccurs="0"/>
 *         &lt;element name="BBLGroup" type="{http://www.bangkokbank.com/schema/entity/BBLGroup/2011/01/15}BBLGroupType" minOccurs="0"/>
 *         &lt;element name="BOTGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndirectRiskCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessCenter" type="{http://www.bangkokbank.com/schema/entity/BusinessCenter/2011/01/15}BusinessCenterType" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.bangkokbank.com/schema/entity/BusinessDivision/2011/01/15}BusinessDivisionType" minOccurs="0"/>
 *         &lt;element name="SegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="BranchRegion" type="{http://www.bangkokbank.com/schema/entity/Region/2013/01/01}RegionCodeNameType" minOccurs="0"/>
 *         &lt;element name="CreditRegion" type="{http://www.bangkokbank.com/schema/entity/Region/2013/01/01}RegionCodeNameType" minOccurs="0"/>
 *         &lt;element name="Allocations" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}AllocationCodePortOwnersType" minOccurs="0"/>
 *         &lt;element name="Business" type="{http://www.bangkokbank.com/schema/entity/BusinessType/2011/01/15}BusinessType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressesType" minOccurs="0"/>
 *         &lt;element name="ContactInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerContactInfoType" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryOfResidence" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CountryType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}MaritalStatusType" minOccurs="0"/>
 *         &lt;element name="SpouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumOfChildren" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Income" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="TaxNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IALInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}IALInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileType", propOrder = {
    "customerRef",
    "alsCustomerNums",
    "tfcCustomerNums",
    "ctCode",
    "ct",
    "botctCode",
    "gender",
    "customerStatus",
    "registrationType",
    "bblGroup",
    "botGroupCode",
    "indirectRiskCountry",
    "businessCenter",
    "division",
    "segmentCode",
    "segment",
    "branchRegion",
    "creditRegion",
    "allocations",
    "business",
    "addresses",
    "contactInfo",
    "nationality",
    "countryOfResidence",
    "maritalStatus",
    "spouseName",
    "numOfChildren",
    "occupation",
    "income",
    "taxNum",
    "ialInfo"
})
@XmlSeeAlso({
    JointCustomerProfileType.class
})
public class CustomerProfileType {

    @XmlElement(name = "CustomerRef", required = true)
    protected CustomerInfoRefType customerRef;
    @XmlElement(name = "ALSCustomerNums")
    protected ALSCustomerNumsType alsCustomerNums;
    @XmlElement(name = "TFCCustomerNums")
    protected TFCCustomerNumsType tfcCustomerNums;
    @XmlElement(name = "CTCode")
    protected String ctCode;
    @XmlElement(name = "CT")
    protected CodeNamePairType ct;
    @XmlElement(name = "BOTCTCode")
    protected String botctCode;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "CustomerStatus")
    protected String customerStatus;
    @XmlElement(name = "RegistrationType")
    protected CustomerRegistrationType registrationType;
    @XmlElement(name = "BBLGroup")
    protected BBLGroupType bblGroup;
    @XmlElement(name = "BOTGroupCode")
    protected String botGroupCode;
    @XmlElement(name = "IndirectRiskCountry")
    protected String indirectRiskCountry;
    @XmlElement(name = "BusinessCenter")
    protected BusinessCenterType businessCenter;
    @XmlElement(name = "Division")
    protected BusinessDivisionType division;
    @XmlElement(name = "SegmentCode")
    protected String segmentCode;
    @XmlElement(name = "Segment")
    protected CodeNamePairType segment;
    @XmlElement(name = "BranchRegion")
    protected RegionCodeNameType branchRegion;
    @XmlElement(name = "CreditRegion")
    protected RegionCodeNameType creditRegion;
    @XmlElement(name = "Allocations")
    protected AllocationCodePortOwnersType allocations;
    @XmlElement(name = "Business")
    protected BusinessType business;
    @XmlElement(name = "Addresses")
    protected PostAddressesType addresses;
    @XmlElement(name = "ContactInfo")
    protected CustomerContactInfoType contactInfo;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "CountryOfResidence")
    protected CountryType countryOfResidence;
    @XmlElement(name = "MaritalStatus")
    protected MaritalStatusType maritalStatus;
    @XmlElement(name = "SpouseName")
    protected String spouseName;
    @XmlElement(name = "NumOfChildren")
    protected BigInteger numOfChildren;
    @XmlElement(name = "Occupation")
    protected CodeDescType occupation;
    @XmlElement(name = "Income")
    protected CodeDescType income;
    @XmlElement(name = "TaxNum")
    protected String taxNum;
    @XmlElement(name = "IALInfo")
    protected IALInfoType ialInfo;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerRef(CustomerInfoRefType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the alsCustomerNums property.
     * 
     * @return
     *     possible object is
     *     {@link ALSCustomerNumsType }
     *     
     */
    public ALSCustomerNumsType getALSCustomerNums() {
        return alsCustomerNums;
    }

    /**
     * Sets the value of the alsCustomerNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALSCustomerNumsType }
     *     
     */
    public void setALSCustomerNums(ALSCustomerNumsType value) {
        this.alsCustomerNums = value;
    }

    /**
     * Gets the value of the tfcCustomerNums property.
     * 
     * @return
     *     possible object is
     *     {@link TFCCustomerNumsType }
     *     
     */
    public TFCCustomerNumsType getTFCCustomerNums() {
        return tfcCustomerNums;
    }

    /**
     * Sets the value of the tfcCustomerNums property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFCCustomerNumsType }
     *     
     */
    public void setTFCCustomerNums(TFCCustomerNumsType value) {
        this.tfcCustomerNums = value;
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
     * Gets the value of the ct property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getCT() {
        return ct;
    }

    /**
     * Sets the value of the ct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setCT(CodeNamePairType value) {
        this.ct = value;
    }

    /**
     * Gets the value of the botctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTCTCode() {
        return botctCode;
    }

    /**
     * Sets the value of the botctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTCTCode(String value) {
        this.botctCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the customerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Sets the value of the customerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStatus(String value) {
        this.customerStatus = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRegistrationType }
     *     
     */
    public CustomerRegistrationType getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRegistrationType }
     *     
     */
    public void setRegistrationType(CustomerRegistrationType value) {
        this.registrationType = value;
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

    /**
     * Gets the value of the botGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOTGroupCode() {
        return botGroupCode;
    }

    /**
     * Sets the value of the botGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOTGroupCode(String value) {
        this.botGroupCode = value;
    }

    /**
     * Gets the value of the indirectRiskCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndirectRiskCountry() {
        return indirectRiskCountry;
    }

    /**
     * Sets the value of the indirectRiskCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndirectRiskCountry(String value) {
        this.indirectRiskCountry = value;
    }

    /**
     * Gets the value of the businessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterType }
     *     
     */
    public BusinessCenterType getBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterType }
     *     
     */
    public void setBusinessCenter(BusinessCenterType value) {
        this.businessCenter = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDivisionType }
     *     
     */
    public BusinessDivisionType getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDivisionType }
     *     
     */
    public void setDivision(BusinessDivisionType value) {
        this.division = value;
    }

    /**
     * Gets the value of the segmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentCode() {
        return segmentCode;
    }

    /**
     * Sets the value of the segmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentCode(String value) {
        this.segmentCode = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setSegment(CodeNamePairType value) {
        this.segment = value;
    }

    /**
     * Gets the value of the branchRegion property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeNameType }
     *     
     */
    public RegionCodeNameType getBranchRegion() {
        return branchRegion;
    }

    /**
     * Sets the value of the branchRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeNameType }
     *     
     */
    public void setBranchRegion(RegionCodeNameType value) {
        this.branchRegion = value;
    }

    /**
     * Gets the value of the creditRegion property.
     * 
     * @return
     *     possible object is
     *     {@link RegionCodeNameType }
     *     
     */
    public RegionCodeNameType getCreditRegion() {
        return creditRegion;
    }

    /**
     * Sets the value of the creditRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCodeNameType }
     *     
     */
    public void setCreditRegion(RegionCodeNameType value) {
        this.creditRegion = value;
    }

    /**
     * Gets the value of the allocations property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationCodePortOwnersType }
     *     
     */
    public AllocationCodePortOwnersType getAllocations() {
        return allocations;
    }

    /**
     * Sets the value of the allocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationCodePortOwnersType }
     *     
     */
    public void setAllocations(AllocationCodePortOwnersType value) {
        this.allocations = value;
    }

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessType }
     *     
     */
    public BusinessType getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessType }
     *     
     */
    public void setBusiness(BusinessType value) {
        this.business = value;
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
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public CustomerContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactInfoType }
     *     
     */
    public void setContactInfo(CustomerContactInfoType value) {
        this.contactInfo = value;
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
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfResidence(CountryType value) {
        this.countryOfResidence = value;
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
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

    /**
     * Gets the value of the numOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfChildren() {
        return numOfChildren;
    }

    /**
     * Sets the value of the numOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfChildren(BigInteger value) {
        this.numOfChildren = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setOccupation(CodeDescType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the income property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setIncome(CodeDescType value) {
        this.income = value;
    }

    /**
     * Gets the value of the taxNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNum() {
        return taxNum;
    }

    /**
     * Sets the value of the taxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNum(String value) {
        this.taxNum = value;
    }

    /**
     * Gets the value of the ialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IALInfoType }
     *     
     */
    public IALInfoType getIALInfo() {
        return ialInfo;
    }

    /**
     * Sets the value of the ialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IALInfoType }
     *     
     */
    public void setIALInfo(IALInfoType value) {
        this.ialInfo = value;
    }

}
