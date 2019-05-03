
package com.bangkokbank.schema.contract.customerprofileinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileOptionType;
import com.bangkokbank.schema.entity.customer._2011._01._15.RMProfileOptionType;


/**
 * <p>Java class for CustomerProfileInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="RMProfileOption" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}RMProfileOptionType" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfileOption" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileOptionType" minOccurs="0"/>
 *         &lt;element name="FATCACheckFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileInqReqType", propOrder = {
    "ccisid",
    "rmNum",
    "rmProfileOption",
    "userID",
    "profileOption",
    "fatcaCheckFlag"
})
public class CustomerProfileInqReqType {

    @XmlElement(name = "CCISID")
    protected String ccisid;
    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "RMProfileOption")
    protected RMProfileOptionType rmProfileOption;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "ProfileOption")
    protected CustomerProfileOptionType profileOption;
    @XmlElement(name = "FATCACheckFlag")
    protected Boolean fatcaCheckFlag;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

    /**
     * Gets the value of the rmProfileOption property.
     * 
     * @return
     *     possible object is
     *     {@link RMProfileOptionType }
     *     
     */
    public RMProfileOptionType getRMProfileOption() {
        return rmProfileOption;
    }

    /**
     * Sets the value of the rmProfileOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMProfileOptionType }
     *     
     */
    public void setRMProfileOption(RMProfileOptionType value) {
        this.rmProfileOption = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the profileOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileOptionType }
     *     
     */
    public CustomerProfileOptionType getProfileOption() {
        return profileOption;
    }

    /**
     * Sets the value of the profileOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileOptionType }
     *     
     */
    public void setProfileOption(CustomerProfileOptionType value) {
        this.profileOption = value;
    }

    /**
     * Gets the value of the fatcaCheckFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFATCACheckFlag() {
        return fatcaCheckFlag;
    }

    /**
     * Sets the value of the fatcaCheckFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFATCACheckFlag(Boolean value) {
        this.fatcaCheckFlag = value;
    }

}
