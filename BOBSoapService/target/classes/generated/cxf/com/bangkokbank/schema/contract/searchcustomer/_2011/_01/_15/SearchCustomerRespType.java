
package com.bangkokbank.schema.contract.searchcustomer._2011._01._15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerType;


/**
 * SearchCustomer Service Response
 * 
 * <p>Java class for SearchCustomerRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCustomerRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="SearchCustomerResults" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalRecordsFound" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CustomerRecords" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Customer" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCustomerRespType", propOrder = {
    "searchCustomerResults"
})
public class SearchCustomerRespType
    extends BaseContractRespType
{

    @XmlElement(name = "SearchCustomerResults")
    protected SearchCustomerRespType.SearchCustomerResults searchCustomerResults;

    /**
     * Gets the value of the searchCustomerResults property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomerRespType.SearchCustomerResults }
     *     
     */
    public SearchCustomerRespType.SearchCustomerResults getSearchCustomerResults() {
        return searchCustomerResults;
    }

    /**
     * Sets the value of the searchCustomerResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomerRespType.SearchCustomerResults }
     *     
     */
    public void setSearchCustomerResults(SearchCustomerRespType.SearchCustomerResults value) {
        this.searchCustomerResults = value;
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
     *         &lt;element name="totalRecordsFound" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="CustomerRecords" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Customer" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerType" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "totalRecordsFound",
        "customerRecords"
    })
    public static class SearchCustomerResults {

        @XmlElement(required = true)
        protected BigInteger totalRecordsFound;
        @XmlElement(name = "CustomerRecords")
        protected SearchCustomerRespType.SearchCustomerResults.CustomerRecords customerRecords;

        /**
         * Gets the value of the totalRecordsFound property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalRecordsFound() {
            return totalRecordsFound;
        }

        /**
         * Sets the value of the totalRecordsFound property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalRecordsFound(BigInteger value) {
            this.totalRecordsFound = value;
        }

        /**
         * Gets the value of the customerRecords property.
         * 
         * @return
         *     possible object is
         *     {@link SearchCustomerRespType.SearchCustomerResults.CustomerRecords }
         *     
         */
        public SearchCustomerRespType.SearchCustomerResults.CustomerRecords getCustomerRecords() {
            return customerRecords;
        }

        /**
         * Sets the value of the customerRecords property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchCustomerRespType.SearchCustomerResults.CustomerRecords }
         *     
         */
        public void setCustomerRecords(SearchCustomerRespType.SearchCustomerResults.CustomerRecords value) {
            this.customerRecords = value;
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
         *         &lt;element name="Customer" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerType" maxOccurs="unbounded"/>
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
            "customer"
        })
        public static class CustomerRecords {

            @XmlElement(name = "Customer", required = true)
            protected List<CustomerType> customer;

            /**
             * Gets the value of the customer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CustomerType }
             * 
             * 
             */
            public List<CustomerType> getCustomer() {
                if (customer == null) {
                    customer = new ArrayList<CustomerType>();
                }
                return this.customer;
            }

        }

    }

}
