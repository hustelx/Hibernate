
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeInventoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeInventoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumOfCheque" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumOfUsedCheque" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LastTransactionDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ChequeProcessingStatuses" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ChequeProcessingStatusesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeInventoryType", propOrder = {
    "startSerial",
    "endSerial",
    "numOfCheque",
    "numOfUsedCheque",
    "lastTransactionDate",
    "chequeProcessingStatuses"
})
public class ChequeInventoryType {

    @XmlElement(name = "StartSerial")
    protected String startSerial;
    @XmlElement(name = "EndSerial")
    protected String endSerial;
    @XmlElement(name = "NumOfCheque")
    protected BigInteger numOfCheque;
    @XmlElement(name = "NumOfUsedCheque")
    protected BigInteger numOfUsedCheque;
    @XmlElement(name = "LastTransactionDate")
    protected DateType lastTransactionDate;
    @XmlElement(name = "ChequeProcessingStatuses")
    protected ChequeProcessingStatusesType chequeProcessingStatuses;

    /**
     * Gets the value of the startSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSerial() {
        return startSerial;
    }

    /**
     * Sets the value of the startSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSerial(String value) {
        this.startSerial = value;
    }

    /**
     * Gets the value of the endSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSerial() {
        return endSerial;
    }

    /**
     * Sets the value of the endSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSerial(String value) {
        this.endSerial = value;
    }

    /**
     * Gets the value of the numOfCheque property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfCheque() {
        return numOfCheque;
    }

    /**
     * Sets the value of the numOfCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfCheque(BigInteger value) {
        this.numOfCheque = value;
    }

    /**
     * Gets the value of the numOfUsedCheque property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfUsedCheque() {
        return numOfUsedCheque;
    }

    /**
     * Sets the value of the numOfUsedCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfUsedCheque(BigInteger value) {
        this.numOfUsedCheque = value;
    }

    /**
     * Gets the value of the lastTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getLastTransactionDate() {
        return lastTransactionDate;
    }

    /**
     * Sets the value of the lastTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setLastTransactionDate(DateType value) {
        this.lastTransactionDate = value;
    }

    /**
     * Gets the value of the chequeProcessingStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeProcessingStatusesType }
     *     
     */
    public ChequeProcessingStatusesType getChequeProcessingStatuses() {
        return chequeProcessingStatuses;
    }

    /**
     * Sets the value of the chequeProcessingStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeProcessingStatusesType }
     *     
     */
    public void setChequeProcessingStatuses(ChequeProcessingStatusesType value) {
        this.chequeProcessingStatuses = value;
    }

}
