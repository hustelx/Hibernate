
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerEnhancedDueDiligenceInfosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEnhancedDueDiligenceInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerEDDInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerEnhancedDueDiligenceInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEnhancedDueDiligenceInfosType", propOrder = {
    "customerEDDInfo"
})
public class CustomerEnhancedDueDiligenceInfosType {

    @XmlElement(name = "CustomerEDDInfo")
    protected CustomerEnhancedDueDiligenceInfoType customerEDDInfo;

    /**
     * Gets the value of the customerEDDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnhancedDueDiligenceInfoType }
     *     
     */
    public CustomerEnhancedDueDiligenceInfoType getCustomerEDDInfo() {
        return customerEDDInfo;
    }

    /**
     * Sets the value of the customerEDDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnhancedDueDiligenceInfoType }
     *     
     */
    public void setCustomerEDDInfo(CustomerEnhancedDueDiligenceInfoType value) {
        this.customerEDDInfo = value;
    }

}
