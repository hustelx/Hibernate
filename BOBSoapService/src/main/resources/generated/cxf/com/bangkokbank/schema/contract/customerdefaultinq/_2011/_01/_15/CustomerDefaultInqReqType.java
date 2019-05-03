
package com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21.CustomerIrregularityOptionType;


/**
 * <p>Java class for CustomerDefaultInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDefaultInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
 *         &lt;element name="CustomerIrregularityOption" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}CustomerIrregularityOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDefaultInqReqType", propOrder = {
    "rmNum",
    "customerIrregularityOption"
})
public class CustomerDefaultInqReqType {

    @XmlElement(name = "RMNum", required = true)
    protected String rmNum;
    @XmlElement(name = "CustomerIrregularityOption")
    protected CustomerIrregularityOptionType customerIrregularityOption;

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
     * Gets the value of the customerIrregularityOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIrregularityOptionType }
     *     
     */
    public CustomerIrregularityOptionType getCustomerIrregularityOption() {
        return customerIrregularityOption;
    }

    /**
     * Sets the value of the customerIrregularityOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIrregularityOptionType }
     *     
     */
    public void setCustomerIrregularityOption(CustomerIrregularityOptionType value) {
        this.customerIrregularityOption = value;
    }

}
