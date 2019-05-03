
package com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplIDTotalNumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplIDTotalNumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AsAtTotalNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplIDTotalNumType", propOrder = {
    "applID",
    "totalNum",
    "asAtTotalNum"
})
public class ApplIDTotalNumType {

    @XmlElement(name = "ApplID")
    protected String applID;
    @XmlElement(name = "TotalNum")
    protected BigInteger totalNum;
    @XmlElement(name = "AsAtTotalNum")
    protected BigInteger asAtTotalNum;

    /**
     * Gets the value of the applID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplID() {
        return applID;
    }

    /**
     * Sets the value of the applID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplID(String value) {
        this.applID = value;
    }

    /**
     * Gets the value of the totalNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNum() {
        return totalNum;
    }

    /**
     * Sets the value of the totalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNum(BigInteger value) {
        this.totalNum = value;
    }

    /**
     * Gets the value of the asAtTotalNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAsAtTotalNum() {
        return asAtTotalNum;
    }

    /**
     * Sets the value of the asAtTotalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAsAtTotalNum(BigInteger value) {
        this.asAtTotalNum = value;
    }

}
