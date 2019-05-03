
package com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerIDCardDetailInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIDCardDetailInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIDCardDetailInqReqType", propOrder = {
    "idNum"
})
public class CustomerIDCardDetailInqReqType {

    @XmlElement(name = "IDNum", required = true)
    protected String idNum;

    /**
     * Gets the value of the idNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNum() {
        return idNum;
    }

    /**
     * Sets the value of the idNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNum(String value) {
        this.idNum = value;
    }

}
