
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15.CreditCardBlockFlagInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15}CreditCardBlockFlagInqResp"/>
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
    "creditCardBlockFlagInqResp"
})
@XmlRootElement(name = "CreditCardBlockFlagInqResponse")
public class CreditCardBlockFlagInqResponse {

    @XmlElement(name = "CreditCardBlockFlagInqResp", namespace = "http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15", required = true)
    protected CreditCardBlockFlagInqRespType creditCardBlockFlagInqResp;

    /**
     * Gets the value of the creditCardBlockFlagInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardBlockFlagInqRespType }
     *     
     */
    public CreditCardBlockFlagInqRespType getCreditCardBlockFlagInqResp() {
        return creditCardBlockFlagInqResp;
    }

    /**
     * Sets the value of the creditCardBlockFlagInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardBlockFlagInqRespType }
     *     
     */
    public void setCreditCardBlockFlagInqResp(CreditCardBlockFlagInqRespType value) {
        this.creditCardBlockFlagInqResp = value;
    }

}
