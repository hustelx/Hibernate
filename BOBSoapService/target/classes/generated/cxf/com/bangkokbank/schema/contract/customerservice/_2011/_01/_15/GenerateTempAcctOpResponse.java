
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15.GenerateTempAcctOpRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15}GenerateTempAcctOpResp"/>
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
    "generateTempAcctOpResp"
})
@XmlRootElement(name = "GenerateTempAcctOpResponse")
public class GenerateTempAcctOpResponse {

    @XmlElement(name = "GenerateTempAcctOpResp", namespace = "http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", required = true)
    protected GenerateTempAcctOpRespType generateTempAcctOpResp;

    /**
     * Gets the value of the generateTempAcctOpResp property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateTempAcctOpRespType }
     *     
     */
    public GenerateTempAcctOpRespType getGenerateTempAcctOpResp() {
        return generateTempAcctOpResp;
    }

    /**
     * Sets the value of the generateTempAcctOpResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateTempAcctOpRespType }
     *     
     */
    public void setGenerateTempAcctOpResp(GenerateTempAcctOpRespType value) {
        this.generateTempAcctOpResp = value;
    }

}
