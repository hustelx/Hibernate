
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			1,2 = Paid
 * 			0,4 = Unpaid
 * 			
 * 
 * <p>Java class for ChequeProcessingStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChequeProcessingStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChequeStatus" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="PaidFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeProcessingStatusType", propOrder = {
    "chequeStatus",
    "paidFlag"
})
public class ChequeProcessingStatusType {

    @XmlElement(name = "ChequeStatus")
    protected CodeDescType chequeStatus;
    @XmlElement(name = "PaidFlag")
    protected Boolean paidFlag;

    /**
     * Gets the value of the chequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getChequeStatus() {
        return chequeStatus;
    }

    /**
     * Sets the value of the chequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setChequeStatus(CodeDescType value) {
        this.chequeStatus = value;
    }

    /**
     * Gets the value of the paidFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaidFlag() {
        return paidFlag;
    }

    /**
     * Sets the value of the paidFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaidFlag(Boolean value) {
        this.paidFlag = value;
    }

}
