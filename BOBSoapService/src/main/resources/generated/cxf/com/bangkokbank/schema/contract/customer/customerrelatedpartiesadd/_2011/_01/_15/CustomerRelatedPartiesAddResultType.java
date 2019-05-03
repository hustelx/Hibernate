
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.respstatus._2013._01._01.RespStatusType;


/**
 * <p>Java class for CustomerRelatedPartiesAddResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesAddResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespStatus" type="{http://www.bangkokbank.com/schema/common/RespStatus/2013/01/01}RespStatusType" minOccurs="0"/>
 *         &lt;element name="PrioritySeqNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesAddResultType", propOrder = {
    "respStatus",
    "prioritySeqNum",
    "refNum"
})
public class CustomerRelatedPartiesAddResultType {

    @XmlElement(name = "RespStatus")
    protected RespStatusType respStatus;
    @XmlElement(name = "PrioritySeqNum")
    protected Integer prioritySeqNum;
    @XmlElement(name = "RefNum")
    protected String refNum;

    /**
     * Gets the value of the respStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RespStatusType }
     *     
     */
    public RespStatusType getRespStatus() {
        return respStatus;
    }

    /**
     * Sets the value of the respStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespStatusType }
     *     
     */
    public void setRespStatus(RespStatusType value) {
        this.respStatus = value;
    }

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

}
