
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FATCAIndiciaCheckOp Service Request
 * 
 * <p>Java class for FATCAIndiciaCheckOpReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAIndiciaCheckOpReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FATCAIndiciaCheckOpCriteria" type="{http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13}FATCAIndiciaCheckOpCriteriaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAIndiciaCheckOpReqType", propOrder = {
    "fatcaIndiciaCheckOpCriteria"
})
public class FATCAIndiciaCheckOpReqType {

    @XmlElement(name = "FATCAIndiciaCheckOpCriteria", required = true)
    protected FATCAIndiciaCheckOpCriteriaType fatcaIndiciaCheckOpCriteria;

    /**
     * Gets the value of the fatcaIndiciaCheckOpCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAIndiciaCheckOpCriteriaType }
     *     
     */
    public FATCAIndiciaCheckOpCriteriaType getFATCAIndiciaCheckOpCriteria() {
        return fatcaIndiciaCheckOpCriteria;
    }

    /**
     * Sets the value of the fatcaIndiciaCheckOpCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAIndiciaCheckOpCriteriaType }
     *     
     */
    public void setFATCAIndiciaCheckOpCriteria(FATCAIndiciaCheckOpCriteriaType value) {
        this.fatcaIndiciaCheckOpCriteria = value;
    }

}
