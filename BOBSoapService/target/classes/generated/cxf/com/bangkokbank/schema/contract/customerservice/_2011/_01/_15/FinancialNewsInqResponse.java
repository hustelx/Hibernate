
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.financialnewsinq._2011._01._15.FinancialNewsInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15}FinancialNewsInqResp"/>
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
    "financialNewsInqResp"
})
@XmlRootElement(name = "FinancialNewsInqResponse")
public class FinancialNewsInqResponse {

    @XmlElement(name = "FinancialNewsInqResp", namespace = "http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15", required = true)
    protected FinancialNewsInqRespType financialNewsInqResp;

    /**
     * Gets the value of the financialNewsInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialNewsInqRespType }
     *     
     */
    public FinancialNewsInqRespType getFinancialNewsInqResp() {
        return financialNewsInqResp;
    }

    /**
     * Sets the value of the financialNewsInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialNewsInqRespType }
     *     
     */
    public void setFinancialNewsInqResp(FinancialNewsInqRespType value) {
        this.financialNewsInqResp = value;
    }

}
