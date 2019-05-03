
package com.bangkokbank.schema.contract.financialnewsinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;
import com.bangkokbank.schema.entity.blacklist._2011._01._15.CustomerFinancialNewsType;


/**
 * <p>Java class for FinancialNewsInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialNewsInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="FinancialNewsInqResults" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerFinancialNews" type="{http://www.bangkokbank.com/schema/entity/Blacklist/2011/01/15}CustomerFinancialNewsType"/>
 *                   &lt;element name="nextKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "FinancialNewsInqRespType", propOrder = {
    "financialNewsInqResults"
})
public class FinancialNewsInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "FinancialNewsInqResults")
    protected FinancialNewsInqRespType.FinancialNewsInqResults financialNewsInqResults;

    /**
     * Gets the value of the financialNewsInqResults property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialNewsInqRespType.FinancialNewsInqResults }
     *     
     */
    public FinancialNewsInqRespType.FinancialNewsInqResults getFinancialNewsInqResults() {
        return financialNewsInqResults;
    }

    /**
     * Sets the value of the financialNewsInqResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialNewsInqRespType.FinancialNewsInqResults }
     *     
     */
    public void setFinancialNewsInqResults(FinancialNewsInqRespType.FinancialNewsInqResults value) {
        this.financialNewsInqResults = value;
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
     *         &lt;element name="CustomerFinancialNews" type="{http://www.bangkokbank.com/schema/entity/Blacklist/2011/01/15}CustomerFinancialNewsType"/>
     *         &lt;element name="nextKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "customerFinancialNews",
        "nextKey"
    })
    public static class FinancialNewsInqResults {

        @XmlElement(name = "CustomerFinancialNews", required = true)
        protected CustomerFinancialNewsType customerFinancialNews;
        protected String nextKey;

        /**
         * Gets the value of the customerFinancialNews property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerFinancialNewsType }
         *     
         */
        public CustomerFinancialNewsType getCustomerFinancialNews() {
            return customerFinancialNews;
        }

        /**
         * Sets the value of the customerFinancialNews property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerFinancialNewsType }
         *     
         */
        public void setCustomerFinancialNews(CustomerFinancialNewsType value) {
            this.customerFinancialNews = value;
        }

        /**
         * Gets the value of the nextKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextKey() {
            return nextKey;
        }

        /**
         * Sets the value of the nextKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNextKey(String value) {
            this.nextKey = value;
        }

    }

}
