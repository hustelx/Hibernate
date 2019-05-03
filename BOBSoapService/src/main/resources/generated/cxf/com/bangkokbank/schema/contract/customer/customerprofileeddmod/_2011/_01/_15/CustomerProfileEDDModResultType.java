
package com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateTimeType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerEnhancedDueDiligenceInfosType;


/**
 * <p>Java class for CustomerProfileEDDModResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEDDModResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateTimeType" minOccurs="0"/>
 *         &lt;element name="CustomerEDDDInfos" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerEnhancedDueDiligenceInfosType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEDDModResultType", propOrder = {
    "dateTime",
    "customerEDDDInfos"
})
public class CustomerProfileEDDModResultType {

    @XmlElement(name = "DateTime")
    protected DateTimeType dateTime;
    @XmlElement(name = "CustomerEDDDInfos", required = true)
    protected CustomerEnhancedDueDiligenceInfosType customerEDDDInfos;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the customerEDDDInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnhancedDueDiligenceInfosType }
     *     
     */
    public CustomerEnhancedDueDiligenceInfosType getCustomerEDDDInfos() {
        return customerEDDDInfos;
    }

    /**
     * Sets the value of the customerEDDDInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnhancedDueDiligenceInfosType }
     *     
     */
    public void setCustomerEDDDInfos(CustomerEnhancedDueDiligenceInfosType value) {
        this.customerEDDDInfos = value;
    }

}
