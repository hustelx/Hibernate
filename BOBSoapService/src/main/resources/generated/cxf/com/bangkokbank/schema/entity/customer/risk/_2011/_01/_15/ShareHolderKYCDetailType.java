
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareHolderKYCDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolderKYCDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrioritySeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerKYCDetail" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerKYCDetailType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolderKYCDetailType", propOrder = {
    "prioritySeqNum",
    "refNum",
    "customerKYCDetail"
})
public class ShareHolderKYCDetailType {

    @XmlElement(name = "PrioritySeqNum")
    protected Integer prioritySeqNum;
    @XmlElement(name = "RefNum")
    protected String refNum;
    @XmlElement(name = "CustomerKYCDetail", required = true)
    protected CustomerKYCDetailType customerKYCDetail;

    /**
     * Gets the value of the prioritySeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioritySeqNum() {
        return prioritySeqNum;
    }

    /**
     * Sets the value of the prioritySeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioritySeqNum(Integer value) {
        this.prioritySeqNum = value;
    }

    /**
     * Gets the value of the refNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * Sets the value of the refNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum(String value) {
        this.refNum = value;
    }

    /**
     * Gets the value of the customerKYCDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKYCDetailType }
     *     
     */
    public CustomerKYCDetailType getCustomerKYCDetail() {
        return customerKYCDetail;
    }

    /**
     * Sets the value of the customerKYCDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKYCDetailType }
     *     
     */
    public void setCustomerKYCDetail(CustomerKYCDetailType value) {
        this.customerKYCDetail = value;
    }

}
