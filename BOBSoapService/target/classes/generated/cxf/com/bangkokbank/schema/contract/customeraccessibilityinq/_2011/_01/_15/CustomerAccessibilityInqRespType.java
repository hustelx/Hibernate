
package com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for CustomerAccessibilityInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccessibilityInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccessibilityInqResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerAccessibility" type="{http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15}CustomerAccessibilityType"/>
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
@XmlType(name = "CustomerAccessibilityInqRespType", propOrder = {
    "customerAccessibilityInqResult"
})
public class CustomerAccessibilityInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CustomerAccessibilityInqResult")
    protected CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult customerAccessibilityInqResult;

    /**
     * Gets the value of the customerAccessibilityInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult }
     *     
     */
    public CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult getCustomerAccessibilityInqResult() {
        return customerAccessibilityInqResult;
    }

    /**
     * Sets the value of the customerAccessibilityInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult }
     *     
     */
    public void setCustomerAccessibilityInqResult(CustomerAccessibilityInqRespType.CustomerAccessibilityInqResult value) {
        this.customerAccessibilityInqResult = value;
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
     *         &lt;element name="CustomerAccessibility" type="{http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15}CustomerAccessibilityType"/>
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
        "customerAccessibility"
    })
    public static class CustomerAccessibilityInqResult {

        @XmlElement(name = "CustomerAccessibility", required = true)
        protected CustomerAccessibilityType customerAccessibility;

        /**
         * Gets the value of the customerAccessibility property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerAccessibilityType }
         *     
         */
        public CustomerAccessibilityType getCustomerAccessibility() {
            return customerAccessibility;
        }

        /**
         * Sets the value of the customerAccessibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerAccessibilityType }
         *     
         */
        public void setCustomerAccessibility(CustomerAccessibilityType value) {
            this.customerAccessibility = value;
        }

    }

}
