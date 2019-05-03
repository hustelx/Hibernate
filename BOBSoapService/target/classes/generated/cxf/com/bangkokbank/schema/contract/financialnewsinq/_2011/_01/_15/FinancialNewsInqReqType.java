
package com.bangkokbank.schema.contract.financialnewsinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerNameType;


/**
 * <p>Java class for FinancialNewsInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialNewsInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *         &lt;element name="nextKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialNewsInqReqType", propOrder = {
    "custName",
    "nextKey"
})
public class FinancialNewsInqReqType {

    @XmlElement(name = "CustName", required = true)
    protected CustomerNameType custName;
    protected String nextKey;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setCustName(CustomerNameType value) {
        this.custName = value;
    }

    /**
     * Gets the value of the nextKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextKey() {
        return nextKey;
    }

    /**
     * Sets the value of the nextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextKey(String value) {
        this.nextKey = value;
    }

}
