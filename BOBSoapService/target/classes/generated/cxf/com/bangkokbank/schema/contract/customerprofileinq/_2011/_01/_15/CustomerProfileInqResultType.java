
package com.bangkokbank.schema.contract.customerprofileinq._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.StateTokenType;
import com.bangkokbank.schema.entity.customer._2011._01._15.AdditionalCustomerProfileInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CreditCustInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileType;
import com.bangkokbank.schema.entity.customer._2011._01._15.JointCustomerProfileType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerEnhancedDueDiligenceInfoType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerKYCDetailType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCACaseDetailType;
import com.bangkokbank.schema.entity.portfolioinfo._2011._01._15.PortfolioInfoType;


/**
 * <p>Java class for CustomerProfileInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType" minOccurs="0"/>
 *         &lt;element name="AdditionalCustomerProfileInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}AdditionalCustomerProfileInfoType" minOccurs="0"/>
 *         &lt;element name="CustomerKYCDetail" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerKYCDetailType" minOccurs="0"/>
 *         &lt;element name="PortfolioInfo" type="{http://www.bangkokbank.com/schema/entity/PortfolioInfo/2011/01/15}PortfolioInfoType" minOccurs="0"/>
 *         &lt;element name="JointCustomers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JointCustomerInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}JointCustomerProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomerEDDInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerEnhancedDueDiligenceInfoType" minOccurs="0"/>
 *         &lt;element name="FATCACase" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseDetailType" minOccurs="0"/>
 *         &lt;element name="CreditCustInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CreditCustInfoType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}stateToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileInqResultType", propOrder = {
    "customerProfile",
    "additionalCustomerProfileInfo",
    "customerKYCDetail",
    "portfolioInfo",
    "jointCustomers",
    "customerEDDInfo",
    "fatcaCase",
    "creditCustInfo",
    "stateToken"
})
public class CustomerProfileInqResultType {

    @XmlElement(name = "CustomerProfile")
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "AdditionalCustomerProfileInfo")
    protected AdditionalCustomerProfileInfoType additionalCustomerProfileInfo;
    @XmlElement(name = "CustomerKYCDetail")
    protected CustomerKYCDetailType customerKYCDetail;
    @XmlElement(name = "PortfolioInfo")
    protected PortfolioInfoType portfolioInfo;
    @XmlElement(name = "JointCustomers")
    protected CustomerProfileInqResultType.JointCustomers jointCustomers;
    @XmlElement(name = "CustomerEDDInfo")
    protected CustomerEnhancedDueDiligenceInfoType customerEDDInfo;
    @XmlElement(name = "FATCACase")
    protected FATCACaseDetailType fatcaCase;
    @XmlElement(name = "CreditCustInfo")
    protected CreditCustInfoType creditCustInfo;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected StateTokenType stateToken;

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
     * Gets the value of the customerKYCDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKYCDetailType }
     *     
     */
    public CustomerKYCDetailType getCustomerKYCDetail() {
        return customerKYCDetail;
    }

    /**
     * Sets the value of the customerKYCDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKYCDetailType }
     *     
     */
    public void setCustomerKYCDetail(CustomerKYCDetailType value) {
        this.customerKYCDetail = value;
    }

    /**
     * Gets the value of the portfolioInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioInfoType }
     *     
     */
    public PortfolioInfoType getPortfolioInfo() {
        return portfolioInfo;
    }

    /**
     * Sets the value of the portfolioInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioInfoType }
     *     
     */
    public void setPortfolioInfo(PortfolioInfoType value) {
        this.portfolioInfo = value;
    }

    /**
     * Gets the value of the jointCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileInqResultType.JointCustomers }
     *     
     */
    public CustomerProfileInqResultType.JointCustomers getJointCustomers() {
        return jointCustomers;
    }

    /**
     * Sets the value of the jointCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileInqResultType.JointCustomers }
     *     
     */
    public void setJointCustomers(CustomerProfileInqResultType.JointCustomers value) {
        this.jointCustomers = value;
    }

    /**
     * Gets the value of the customerEDDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnhancedDueDiligenceInfoType }
     *     
     */
    public CustomerEnhancedDueDiligenceInfoType getCustomerEDDInfo() {
        return customerEDDInfo;
    }

    /**
     * Sets the value of the customerEDDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnhancedDueDiligenceInfoType }
     *     
     */
    public void setCustomerEDDInfo(CustomerEnhancedDueDiligenceInfoType value) {
        this.customerEDDInfo = value;
    }

    /**
     * Gets the value of the fatcaCase property.
     * 
     * @return
     *     possible object is
     *     {@link FATCACaseDetailType }
     *     
     */
    public FATCACaseDetailType getFATCACase() {
        return fatcaCase;
    }

    /**
     * Sets the value of the fatcaCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCACaseDetailType }
     *     
     */
    public void setFATCACase(FATCACaseDetailType value) {
        this.fatcaCase = value;
    }

    /**
     * Gets the value of the creditCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCustInfoType }
     *     
     */
    public CreditCustInfoType getCreditCustInfo() {
        return creditCustInfo;
    }

    /**
     * Sets the value of the creditCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCustInfoType }
     *     
     */
    public void setCreditCustInfo(CreditCustInfoType value) {
        this.creditCustInfo = value;
    }

    /**
     * 
     * 										Currently this stores the EDDPartA pure image and ForeignBankFlagPARTB to be 
     * 										used in the CustomerProfileEDDMod service.
     * 										Can be extended to pack any other state information 
     * 										in the future without the service client knowing what this is.
     * 										
     * 										Concatenation value for:
     * 										EDDDatePARTA(or EDDDatePARTAStr);|ForeignBankFlagPARTA;|BankCountry1PARTA;|BankCountry2PARTA;|NegativeNewsPARTA;|RelatedwithPEPsPARTA;|ForeignBankFlagPARTB;|
     * 										
     * 
     * @return
     *     possible object is
     *     {@link StateTokenType }
     *     
     */
    public StateTokenType getStateToken() {
        return stateToken;
    }

    /**
     * Sets the value of the stateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTokenType }
     *     
     */
    public void setStateToken(StateTokenType value) {
        this.stateToken = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JointCustomerInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}JointCustomerProfileType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jointCustomerInfo"
    })
    public static class JointCustomers {

        @XmlElement(name = "JointCustomerInfo")
        protected List<JointCustomerProfileType> jointCustomerInfo;

        /**
         * Gets the value of the jointCustomerInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jointCustomerInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJointCustomerInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JointCustomerProfileType }
         * 
         * 
         */
        public List<JointCustomerProfileType> getJointCustomerInfo() {
            if (jointCustomerInfo == null) {
                jointCustomerInfo = new ArrayList<JointCustomerProfileType>();
            }
            return this.jointCustomerInfo;
        }

    }

}
