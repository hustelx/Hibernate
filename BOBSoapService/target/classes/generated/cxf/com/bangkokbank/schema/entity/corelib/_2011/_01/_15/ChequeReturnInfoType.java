
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeReturnInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeReturnInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChequePaymentInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ChequePaymentInfoType" minOccurs="0"/>
 *         &lt;element name="ChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeReturnInfoType", propOrder = {
    "chequePaymentInfo",
    "chequeStatus",
    "amt"
})
public class ChequeReturnInfoType {

    @XmlElement(name = "ChequePaymentInfo")
    protected ChequePaymentInfoType chequePaymentInfo;
    @XmlElement(name = "ChequeStatus")
    protected String chequeStatus;
    @XmlElement(name = "Amt")
    protected CurrAmtType amt;

    /**
     * Gets the value of the chequePaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChequePaymentInfoType }
     *     
     */
    public ChequePaymentInfoType getChequePaymentInfo() {
        return chequePaymentInfo;
    }

    /**
     * Sets the value of the chequePaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequePaymentInfoType }
     *     
     */
    public void setChequePaymentInfo(ChequePaymentInfoType value) {
        this.chequePaymentInfo = value;
    }

    /**
     * Gets the value of the chequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeStatus() {
        return chequeStatus;
    }

    /**
     * Sets the value of the chequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeStatus(String value) {
        this.chequeStatus = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setAmt(CurrAmtType value) {
        this.amt = value;
    }

}
