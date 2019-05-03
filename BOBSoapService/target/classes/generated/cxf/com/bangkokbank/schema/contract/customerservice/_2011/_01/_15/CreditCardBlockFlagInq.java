
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15.CreditCardBlockFlagInqReqType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15}CreditCardBlockFlagInqReq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditCardBlockFlagInqReq"
})
@XmlRootElement(name = "CreditCardBlockFlagInq")
public class CreditCardBlockFlagInq {

    @XmlElement(name = "CreditCardBlockFlagInqReq", namespace = "http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", required = true)
    protected CreditCardBlockFlagInqReqType creditCardBlockFlagInqReq;

    /**
     * Gets the value of the creditCardBlockFlagInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardBlockFlagInqReqType }
     *     
     */
    public CreditCardBlockFlagInqReqType getCreditCardBlockFlagInqReq() {
        return creditCardBlockFlagInqReq;
    }

    /**
     * Sets the value of the creditCardBlockFlagInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardBlockFlagInqReqType }
     *     
     */
    public void setCreditCardBlockFlagInqReq(CreditCardBlockFlagInqReqType value) {
        this.creditCardBlockFlagInqReq = value;
    }

}
