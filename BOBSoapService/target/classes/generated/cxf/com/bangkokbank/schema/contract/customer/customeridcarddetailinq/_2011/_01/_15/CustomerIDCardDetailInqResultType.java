
package com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.TrackingInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerProfileType;


/**
 * <p>Java class for CustomerIDCardDetailInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIDCardDetailInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType" minOccurs="0"/>
 *         &lt;element name="AccessInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="TransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIDCardDetailInqResultType", propOrder = {
    "customerProfile",
    "accessInfo",
    "transactionTypeCode"
})
public class CustomerIDCardDetailInqResultType {

    @XmlElement(name = "CustomerProfile")
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "AccessInfo")
    protected TrackingInfoType accessInfo;
    @XmlElement(name = "TransactionTypeCode")
    protected String transactionTypeCode;

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
     * Gets the value of the accessInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getAccessInfo() {
        return accessInfo;
    }

    /**
     * Sets the value of the accessInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setAccessInfo(TrackingInfoType value) {
        this.accessInfo = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
    }

}
