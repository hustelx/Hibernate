
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15.GenerateTempAcctOpReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15}GenerateTempAcctOpReq"/>
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
    "generateTempAcctOpReq"
})
@XmlRootElement(name = "GenerateTempAcctOp")
public class GenerateTempAcctOp {

    @XmlElement(name = "GenerateTempAcctOpReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15", required = true)
    protected GenerateTempAcctOpReqType generateTempAcctOpReq;

    /**
     * Gets the value of the generateTempAcctOpReq property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateTempAcctOpReqType }
     *     
     */
    public GenerateTempAcctOpReqType getGenerateTempAcctOpReq() {
        return generateTempAcctOpReq;
    }

    /**
     * Sets the value of the generateTempAcctOpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateTempAcctOpReqType }
     *     
     */
    public void setGenerateTempAcctOpReq(GenerateTempAcctOpReqType value) {
        this.generateTempAcctOpReq = value;
    }

}
