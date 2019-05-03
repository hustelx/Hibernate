
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentInfos" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15}CustomerEmploymentInfosInqType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoInqResultType", propOrder = {
    "employmentInfos"
})
public class CustomerProfileEmploymentInfoInqResultType {

    @XmlElement(name = "EmploymentInfos")
    protected CustomerEmploymentInfosInqType employmentInfos;

    /**
     * Gets the value of the employmentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEmploymentInfosInqType }
     *     
     */
    public CustomerEmploymentInfosInqType getEmploymentInfos() {
        return employmentInfos;
    }

    /**
     * Sets the value of the employmentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEmploymentInfosInqType }
     *     
     */
    public void setEmploymentInfos(CustomerEmploymentInfosInqType value) {
        this.employmentInfos = value;
    }

}
