
package com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * <p>Java class for GenerateTempAcctOpRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateTempAcctOpRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="GenerateTempAcctOpResult" type="{http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15}GenerateTempAcctOpResultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateTempAcctOpRespType", propOrder = {
    "generateTempAcctOpResult"
})
public class GenerateTempAcctOpRespType
    extends BaseContractRespType
{

    @XmlElement(name = "GenerateTempAcctOpResult")
    protected GenerateTempAcctOpResultType generateTempAcctOpResult;

    /**
     * Gets the value of the generateTempAcctOpResult property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateTempAcctOpResultType }
     *     
     */
    public GenerateTempAcctOpResultType getGenerateTempAcctOpResult() {
        return generateTempAcctOpResult;
    }

    /**
     * Sets the value of the generateTempAcctOpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateTempAcctOpResultType }
     *     
     */
    public void setGenerateTempAcctOpResult(GenerateTempAcctOpResultType value) {
        this.generateTempAcctOpResult = value;
    }

}
