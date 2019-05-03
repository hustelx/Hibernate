
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CBDMISType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CBDMISType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsOfDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ALSCustomerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CBDMISType", propOrder = {
    "asOfDate",
    "alsCustomerNum",
    "status"
})
public class CBDMISType {

    @XmlElement(name = "AsOfDate")
    protected DateType asOfDate;
    @XmlElement(name = "ALSCustomerNum")
    protected String alsCustomerNum;
    @XmlElement(name = "Status")
    protected Boolean status;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setAsOfDate(DateType value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the alsCustomerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALSCustomerNum() {
        return alsCustomerNum;
    }

    /**
     * Sets the value of the alsCustomerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALSCustomerNum(String value) {
        this.alsCustomerNum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

}
