
package com.bangkokbank.schema.contract.searchcustomer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerTypeType;


/**
 * SearchCustomer Service Request
 * 
 * <p>Java class for SearchCustomerReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCustomerReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SearchCustomerCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserIDType" type="{http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15}UserIDTypeType" minOccurs="0"/>
 *                   &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CustomerName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *                   &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerType" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerTypeType" minOccurs="0"/>
 *                   &lt;element name="SearchOption" type="{http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15}SearchOptionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCustomerReqType", propOrder = {
    "maxRecords",
    "searchCustomerCriteria"
})
public class SearchCustomerReqType {

    protected Integer maxRecords;
    @XmlElement(name = "SearchCustomerCriteria", required = true)
    protected SearchCustomerReqType.SearchCustomerCriteria searchCustomerCriteria;

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRecords(Integer value) {
        this.maxRecords = value;
    }

    /**
     * Gets the value of the searchCustomerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomerReqType.SearchCustomerCriteria }
     *     
     */
    public SearchCustomerReqType.SearchCustomerCriteria getSearchCustomerCriteria() {
        return searchCustomerCriteria;
    }

    /**
     * Sets the value of the searchCustomerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomerReqType.SearchCustomerCriteria }
     *     
     */
    public void setSearchCustomerCriteria(SearchCustomerReqType.SearchCustomerCriteria value) {
        this.searchCustomerCriteria = value;
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
     *         &lt;element name="UserIDType" type="{http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15}UserIDTypeType" minOccurs="0"/>
     *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CustomerName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
     *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IDNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AccountNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerType" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerTypeType" minOccurs="0"/>
     *         &lt;element name="SearchOption" type="{http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15}SearchOptionType" minOccurs="0"/>
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
        "userIDType",
        "userID",
        "customerName",
        "groupCode",
        "groupName",
        "idType",
        "idNum",
        "accountType",
        "accountNum",
        "customerType",
        "searchOption"
    })
    public static class SearchCustomerCriteria {

        @XmlElement(name = "UserIDType")
        protected UserIDTypeType userIDType;
        @XmlElement(name = "UserID", required = true)
        protected String userID;
        @XmlElement(name = "CustomerName")
        protected CustomerNameType customerName;
        @XmlElement(name = "GroupCode")
        protected String groupCode;
        @XmlElement(name = "GroupName")
        protected String groupName;
        @XmlElement(name = "IDType")
        protected String idType;
        @XmlElement(name = "IDNum")
        protected String idNum;
        @XmlElement(name = "AccountType")
        protected String accountType;
        @XmlElement(name = "AccountNum")
        protected String accountNum;
        @XmlElement(name = "CustomerType")
        protected CustomerTypeType customerType;
        @XmlElement(name = "SearchOption")
        protected SearchOptionType searchOption;

        /**
         * Gets the value of the userIDType property.
         * 
         * @return
         *     possible object is
         *     {@link UserIDTypeType }
         *     
         */
        public UserIDTypeType getUserIDType() {
            return userIDType;
        }

        /**
         * Sets the value of the userIDType property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIDTypeType }
         *     
         */
        public void setUserIDType(UserIDTypeType value) {
            this.userIDType = value;
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
         * Gets the value of the customerName property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerNameType }
         *     
         */
        public CustomerNameType getCustomerName() {
            return customerName;
        }

        /**
         * Sets the value of the customerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerNameType }
         *     
         */
        public void setCustomerName(CustomerNameType value) {
            this.customerName = value;
        }

        /**
         * Gets the value of the groupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Sets the value of the groupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
        }

        /**
         * Gets the value of the groupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupName() {
            return groupName;
        }

        /**
         * Sets the value of the groupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupName(String value) {
            this.groupName = value;
        }

        /**
         * Gets the value of the idType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDType() {
            return idType;
        }

        /**
         * Sets the value of the idType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDType(String value) {
            this.idType = value;
        }

        /**
         * Gets the value of the idNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDNum() {
            return idNum;
        }

        /**
         * Sets the value of the idNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDNum(String value) {
            this.idNum = value;
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
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerTypeType }
         *     
         */
        public CustomerTypeType getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerTypeType }
         *     
         */
        public void setCustomerType(CustomerTypeType value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the searchOption property.
         * 
         * @return
         *     possible object is
         *     {@link SearchOptionType }
         *     
         */
        public SearchOptionType getSearchOption() {
            return searchOption;
        }

        /**
         * Sets the value of the searchOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchOptionType }
         *     
         */
        public void setSearchOption(SearchOptionType value) {
            this.searchOption = value;
        }

    }

}
