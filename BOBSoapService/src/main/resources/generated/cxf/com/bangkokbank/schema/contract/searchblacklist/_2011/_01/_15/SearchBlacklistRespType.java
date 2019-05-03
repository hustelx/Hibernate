
package com.bangkokbank.schema.contract.searchblacklist._2011._01._15;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;
import com.bangkokbank.schema.entity.customer._2011._01._15.BlacklistCustomerDetailType;


/**
 * <p>Java class for SearchBlacklistRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBlacklistRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="SearchBlacklistResults" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalRecordsFound" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="CustomerDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CustomerDetail" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}BlacklistCustomerDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SearchBlacklistRespType", propOrder = {
    "searchBlacklistResults"
})
public class SearchBlacklistRespType
    extends BaseContractRespType
{

    @XmlElement(name = "SearchBlacklistResults")
    protected SearchBlacklistRespType.SearchBlacklistResults searchBlacklistResults;

    /**
     * Gets the value of the searchBlacklistResults property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBlacklistRespType.SearchBlacklistResults }
     *     
     */
    public SearchBlacklistRespType.SearchBlacklistResults getSearchBlacklistResults() {
        return searchBlacklistResults;
    }

    /**
     * Sets the value of the searchBlacklistResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBlacklistRespType.SearchBlacklistResults }
     *     
     */
    public void setSearchBlacklistResults(SearchBlacklistRespType.SearchBlacklistResults value) {
        this.searchBlacklistResults = value;
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
     *         &lt;element name="CustomerDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CustomerDetail" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}BlacklistCustomerDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
        "customerDetails"
    })
    public static class SearchBlacklistResults {

        @XmlElement(required = true)
        protected BigInteger totalRecordsFound;
        @XmlElement(name = "CustomerDetails", required = true)
        protected SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails customerDetails;

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
         * Gets the value of the customerDetails property.
         * 
         * @return
         *     possible object is
         *     {@link SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails }
         *     
         */
        public SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails getCustomerDetails() {
            return customerDetails;
        }

        /**
         * Sets the value of the customerDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails }
         *     
         */
        public void setCustomerDetails(SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails value) {
            this.customerDetails = value;
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
         *         &lt;element name="CustomerDetail" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}BlacklistCustomerDetailType" maxOccurs="unbounded" minOccurs="0"/>
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
            "customerDetail"
        })
        public static class CustomerDetails {

            @XmlElement(name = "CustomerDetail")
            protected List<BlacklistCustomerDetailType> customerDetail;

            /**
             * Gets the value of the customerDetail property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerDetail property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerDetail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BlacklistCustomerDetailType }
             * 
             * 
             */
            public List<BlacklistCustomerDetailType> getCustomerDetail() {
                if (customerDetail == null) {
                    customerDetail = new ArrayList<BlacklistCustomerDetailType>();
                }
                return this.customerDetail;
            }

        }

    }

}
