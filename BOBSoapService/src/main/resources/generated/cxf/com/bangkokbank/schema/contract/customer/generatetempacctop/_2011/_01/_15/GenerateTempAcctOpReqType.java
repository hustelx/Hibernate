
package com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.account._2011._01._15.AccountRefType;


/**
 * <p>Java class for GenerateTempAcctOpReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateTempAcctOpReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TempAccountNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AcctNumType"/>
 *         &lt;element name="NewAccountRef" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateTempAcctOpReqType", propOrder = {
    "tempAccountNum",
    "newAccountRef"
})
public class GenerateTempAcctOpReqType {

    @XmlElement(name = "TempAccountNum", required = true)
    protected String tempAccountNum;
    @XmlElement(name = "NewAccountRef")
    protected AccountRefType newAccountRef;

    /**
     * Gets the value of the tempAccountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempAccountNum() {
        return tempAccountNum;
    }

    /**
     * Sets the value of the tempAccountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempAccountNum(String value) {
        this.tempAccountNum = value;
    }

    /**
     * Gets the value of the newAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefType }
     *     
     */
    public AccountRefType getNewAccountRef() {
        return newAccountRef;
    }

    /**
     * Sets the value of the newAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefType }
     *     
     */
    public void setNewAccountRef(AccountRefType value) {
        this.newAccountRef = value;
    }

}
