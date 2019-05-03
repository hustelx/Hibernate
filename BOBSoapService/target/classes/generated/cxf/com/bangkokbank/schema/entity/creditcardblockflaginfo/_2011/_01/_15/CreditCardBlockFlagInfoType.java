
package com.bangkokbank.schema.entity.creditcardblockflaginfo._2011._01._15;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardBlockFlagInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardBlockFlagInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CreditCardNumType"/>
 *         &lt;element name="CreditLineAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BlockFlag" type="{http://www.bangkokbank.com/schema/entity/CreditCardBlockFlagInfo/2011/01/15}CreditCardBlockFlagType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardBlockFlagInfoType", propOrder = {
    "creditCardNum",
    "creditLineAmount",
    "currentBalance",
    "blockFlag"
})
public class CreditCardBlockFlagInfoType {

    @XmlElement(name = "CreditCardNum", required = true)
    protected String creditCardNum;
    @XmlElement(name = "CreditLineAmount", required = true)
    protected BigDecimal creditLineAmount;
    @XmlElement(name = "CurrentBalance", required = true)
    protected BigDecimal currentBalance;
    @XmlElement(name = "BlockFlag", required = true)
    protected String blockFlag;

    /**
     * Gets the value of the creditCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNum() {
        return creditCardNum;
    }

    /**
     * Sets the value of the creditCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNum(String value) {
        this.creditCardNum = value;
    }

    /**
     * Gets the value of the creditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLineAmount() {
        return creditLineAmount;
    }

    /**
     * Sets the value of the creditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLineAmount(BigDecimal value) {
        this.creditLineAmount = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the blockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockFlag() {
        return blockFlag;
    }

    /**
     * Sets the value of the blockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockFlag(String value) {
        this.blockFlag = value;
    }

}
