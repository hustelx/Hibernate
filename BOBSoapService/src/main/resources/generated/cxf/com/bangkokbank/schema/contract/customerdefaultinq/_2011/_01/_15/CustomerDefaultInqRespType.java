
package com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerDefaultInfoType;


/**
 * 
 *           Basic Service Response Message Structure
 *     	  
 * 
 * <p>Java class for CustomerDefaultInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDefaultInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerDefaultInqResults" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
 *                   &lt;element name="CustomerHasDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="CustomerDefaultInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerDefaultInfoType" minOccurs="0"/>
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
@XmlType(name = "CustomerDefaultInqRespType", propOrder = {
    "customerDefaultInqResults"
})
public class CustomerDefaultInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerDefaultInqResults")
    protected CustomerDefaultInqRespType.CustomerDefaultInqResults customerDefaultInqResults;

    /**
     * Gets the value of the customerDefaultInqResults property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDefaultInqRespType.CustomerDefaultInqResults }
     *     
     */
    public CustomerDefaultInqRespType.CustomerDefaultInqResults getCustomerDefaultInqResults() {
        return customerDefaultInqResults;
    }

    /**
     * Sets the value of the customerDefaultInqResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDefaultInqRespType.CustomerDefaultInqResults }
     *     
     */
    public void setCustomerDefaultInqResults(CustomerDefaultInqRespType.CustomerDefaultInqResults value) {
        this.customerDefaultInqResults = value;
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
     *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
     *         &lt;element name="CustomerHasDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="CustomerDefaultInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerDefaultInfoType" minOccurs="0"/>
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
        "rmNum",
        "customerHasDefault",
        "customerDefaultInfo"
    })
    public static class CustomerDefaultInqResults {

        @XmlElement(name = "RMNum", required = true)
        protected String rmNum;
        @XmlElement(name = "CustomerHasDefault")
        protected boolean customerHasDefault;
        @XmlElement(name = "CustomerDefaultInfo")
        protected CustomerDefaultInfoType customerDefaultInfo;

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
         * Gets the value of the customerHasDefault property.
         * 
         */
        public boolean isCustomerHasDefault() {
            return customerHasDefault;
        }

        /**
         * Sets the value of the customerHasDefault property.
         * 
         */
        public void setCustomerHasDefault(boolean value) {
            this.customerHasDefault = value;
        }

        /**
         * Gets the value of the customerDefaultInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerDefaultInfoType }
         *     
         */
        public CustomerDefaultInfoType getCustomerDefaultInfo() {
            return customerDefaultInfo;
        }

        /**
         * Sets the value of the customerDefaultInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerDefaultInfoType }
         *     
         */
        public void setCustomerDefaultInfo(CustomerDefaultInfoType value) {
            this.customerDefaultInfo = value;
        }

    }

}
