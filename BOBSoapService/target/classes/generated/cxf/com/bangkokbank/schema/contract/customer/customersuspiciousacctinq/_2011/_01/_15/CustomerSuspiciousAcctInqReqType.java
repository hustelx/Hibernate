
package com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerIdentificationType;


/**
 * <p>Java class for CustomerSuspiciousAcctInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIdentification" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctInqReqType", propOrder = {
    "customerIdentification"
})
public class CustomerSuspiciousAcctInqReqType {

    @XmlElement(name = "CustomerIdentification")
    protected CustomerIdentificationType customerIdentification;

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setCustomerIdentification(CustomerIdentificationType value) {
        this.customerIdentification = value;
    }

}
