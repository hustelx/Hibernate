
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.ContactNumsType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.EmailContactInfosType;


/**
 * <p>Java class for CustomerContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactNumbers" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ContactNumsType" minOccurs="0"/>
 *         &lt;element name="MainContact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *                   &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ContactNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
 *                   &lt;element name="EmailAddress" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}EmailAddressType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Emails" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}EmailContactInfosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContactInfoType", propOrder = {
    "contactNumbers",
    "mainContact",
    "emails"
})
public class CustomerContactInfoType {

    @XmlElement(name = "ContactNumbers")
    protected ContactNumsType contactNumbers;
    @XmlElement(name = "MainContact")
    protected CustomerContactInfoType.MainContact mainContact;
    @XmlElement(name = "Emails")
    protected EmailContactInfosType emails;

    /**
     * Gets the value of the contactNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ContactNumsType }
     *     
     */
    public ContactNumsType getContactNumbers() {
        return contactNumbers;
    }

    /**
     * Sets the value of the contactNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactNumsType }
     *     
     */
    public void setContactNumbers(ContactNumsType value) {
        this.contactNumbers = value;
    }

    /**
     * Gets the value of the mainContact property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactInfoType.MainContact }
     *     
     */
    public CustomerContactInfoType.MainContact getMainContact() {
        return mainContact;
    }

    /**
     * Sets the value of the mainContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactInfoType.MainContact }
     *     
     */
    public void setMainContact(CustomerContactInfoType.MainContact value) {
        this.mainContact = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link EmailContactInfosType }
     *     
     */
    public EmailContactInfosType getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailContactInfosType }
     *     
     */
    public void setEmails(EmailContactInfosType value) {
        this.emails = value;
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
     *         &lt;element name="Name" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
     *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ContactNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PhoneNumType" minOccurs="0"/>
     *         &lt;element name="EmailAddress" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}EmailAddressType" minOccurs="0"/>
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
        "name",
        "position",
        "contactNum",
        "emailAddress"
    })
    public static class MainContact {

        @XmlElement(name = "Name")
        protected CustomerNameType name;
        @XmlElement(name = "Position")
        protected String position;
        @XmlElement(name = "ContactNum")
        protected String contactNum;
        @XmlElement(name = "EmailAddress")
        protected String emailAddress;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerNameType }
         *     
         */
        public CustomerNameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerNameType }
         *     
         */
        public void setName(CustomerNameType value) {
            this.name = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
        }

        /**
         * Gets the value of the contactNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactNum() {
            return contactNum;
        }

        /**
         * Sets the value of the contactNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactNum(String value) {
            this.contactNum = value;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

    }

}
