
package com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;
import com.bangkokbank.schema.entity.creditcardblockflaginfo._2011._01._15.CreditCardBlockFlagInfosType;


/**
 * <p>Java class for CreditCardBlockFlagInqRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardBlockFlagInqRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardBlockFlagInqResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
 *                   &lt;element name="CreditCardBlockFlagInfos" type="{http://www.bangkokbank.com/schema/entity/CreditCardBlockFlagInfo/2011/01/15}CreditCardBlockFlagInfosType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardBlockFlagInqRespType", propOrder = {
    "creditCardBlockFlagInqResult"
})
public class CreditCardBlockFlagInqRespType
    extends BaseContractRespType
{

    @XmlElement(name = "CreditCardBlockFlagInqResult")
    protected CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult creditCardBlockFlagInqResult;

    /**
     * Gets the value of the creditCardBlockFlagInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult }
     *     
     */
    public CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult getCreditCardBlockFlagInqResult() {
        return creditCardBlockFlagInqResult;
    }

    /**
     * Sets the value of the creditCardBlockFlagInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult }
     *     
     */
    public void setCreditCardBlockFlagInqResult(CreditCardBlockFlagInqRespType.CreditCardBlockFlagInqResult value) {
        this.creditCardBlockFlagInqResult = value;
    }


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
     *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
     *         &lt;element name="CreditCardBlockFlagInfos" type="{http://www.bangkokbank.com/schema/entity/CreditCardBlockFlagInfo/2011/01/15}CreditCardBlockFlagInfosType"/>
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
        "rmNum",
        "creditCardBlockFlagInfos"
    })
    public static class CreditCardBlockFlagInqResult {

        @XmlElement(name = "RMNum", required = true)
        protected String rmNum;
        @XmlElement(name = "CreditCardBlockFlagInfos", required = true)
        protected CreditCardBlockFlagInfosType creditCardBlockFlagInfos;

        /**
         * Gets the value of the rmNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRMNum() {
            return rmNum;
        }

        /**
         * Sets the value of the rmNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRMNum(String value) {
            this.rmNum = value;
        }

        /**
         * Gets the value of the creditCardBlockFlagInfos property.
         * 
         * @return
         *     possible object is
         *     {@link CreditCardBlockFlagInfosType }
         *     
         */
        public CreditCardBlockFlagInfosType getCreditCardBlockFlagInfos() {
            return creditCardBlockFlagInfos;
        }

        /**
         * Sets the value of the creditCardBlockFlagInfos property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreditCardBlockFlagInfosType }
         *     
         */
        public void setCreditCardBlockFlagInfos(CreditCardBlockFlagInfosType value) {
            this.creditCardBlockFlagInfos = value;
        }

    }

}
