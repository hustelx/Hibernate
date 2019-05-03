
package com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerIdentificationType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;


/**
 * <p>Java class for CustomerSuspiciousAcctAddReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerSuspiciousAcctAddReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIdentification" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSuspiciousAcctAddReqType", propOrder = {
    "customerIdentification",
    "customerName",
    "status"
})
public class CustomerSuspiciousAcctAddReqType {

    @XmlElement(name = "CustomerIdentification")
    protected CustomerIdentificationType customerIdentification;
    @XmlElement(name = "CustomerName")
    protected CustomerNameType customerName;
    @XmlElement(name = "Status")
    protected String status;

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

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setCustomerName(CustomerNameType value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
