
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;


/**
 * <p>Java class for CommonFacilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonFacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AcctNumType"/>
 *         &lt;element name="ExistingLimit" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType"/>
 *         &lt;element name="Outstanding" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType"/>
 *         &lt;element name="LoanProduct" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}LoanProductType"/>
 *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODFacilityInfo" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}ODFacilityInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonFacilityInfoType", propOrder = {
    "accountNum",
    "existingLimit",
    "outstanding",
    "loanProduct",
    "accountType",
    "description",
    "odFacilityInfo"
})
public class CommonFacilityInfoType {

    @XmlElement(name = "AccountNum", required = true)
    protected String accountNum;
    @XmlElement(name = "ExistingLimit", required = true)
    protected CurrAmtType existingLimit;
    @XmlElement(name = "Outstanding", required = true)
    protected CurrAmtType outstanding;
    @XmlElement(name = "LoanProduct", required = true)
    protected LoanProductType loanProduct;
    @XmlElement(name = "AccountType", required = true)
    protected String accountType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ODFacilityInfo")
    protected ODFacilityInfoType odFacilityInfo;

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the existingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getExistingLimit() {
        return existingLimit;
    }

    /**
     * Sets the value of the existingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setExistingLimit(CurrAmtType value) {
        this.existingLimit = value;
    }

    /**
     * Gets the value of the outstanding property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getOutstanding() {
        return outstanding;
    }

    /**
     * Sets the value of the outstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setOutstanding(CurrAmtType value) {
        this.outstanding = value;
    }

    /**
     * Gets the value of the loanProduct property.
     * 
     * @return
     *     possible object is
     *     {@link LoanProductType }
     *     
     */
    public LoanProductType getLoanProduct() {
        return loanProduct;
    }

    /**
     * Sets the value of the loanProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanProductType }
     *     
     */
    public void setLoanProduct(LoanProductType value) {
        this.loanProduct = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the odFacilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ODFacilityInfoType }
     *     
     */
    public ODFacilityInfoType getODFacilityInfo() {
        return odFacilityInfo;
    }

    /**
     * Sets the value of the odFacilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODFacilityInfoType }
     *     
     */
    public void setODFacilityInfo(ODFacilityInfoType value) {
        this.odFacilityInfo = value;
    }

}
