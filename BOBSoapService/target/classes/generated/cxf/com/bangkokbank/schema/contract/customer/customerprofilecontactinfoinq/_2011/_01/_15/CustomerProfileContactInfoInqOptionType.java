
package com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileContactInfoInqOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileContactInfoInqOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatestMobileNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType" minOccurs="0"/>
 *         &lt;element name="LatestEmail" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileContactInfoInqOptionType", propOrder = {
    "latestMobileNum",
    "latestEmail"
})
public class CustomerProfileContactInfoInqOptionType {

    @XmlElement(name = "LatestMobileNum")
    protected String latestMobileNum;
    @XmlElement(name = "LatestEmail")
    protected String latestEmail;

    /**
     * Gets the value of the latestMobileNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestMobileNum() {
        return latestMobileNum;
    }

    /**
     * Sets the value of the latestMobileNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestMobileNum(String value) {
        this.latestMobileNum = value;
    }

    /**
     * Gets the value of the latestEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestEmail() {
        return latestEmail;
    }

    /**
     * Sets the value of the latestEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestEmail(String value) {
        this.latestEmail = value;
    }

}
