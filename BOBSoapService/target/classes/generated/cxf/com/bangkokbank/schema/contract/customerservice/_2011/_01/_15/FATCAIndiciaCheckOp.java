
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13.FATCAIndiciaCheckOpReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13}FATCAIndiciaCheckOpReq"/>
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
    "fatcaIndiciaCheckOpReq"
})
@XmlRootElement(name = "FATCAIndiciaCheckOp")
public class FATCAIndiciaCheckOp {

    @XmlElement(name = "FATCAIndiciaCheckOpReq", namespace = "http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13", required = true)
    protected FATCAIndiciaCheckOpReqType fatcaIndiciaCheckOpReq;

    /**
     * Gets the value of the fatcaIndiciaCheckOpReq property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAIndiciaCheckOpReqType }
     *     
     */
    public FATCAIndiciaCheckOpReqType getFATCAIndiciaCheckOpReq() {
        return fatcaIndiciaCheckOpReq;
    }

    /**
     * Sets the value of the fatcaIndiciaCheckOpReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAIndiciaCheckOpReqType }
     *     
     */
    public void setFATCAIndiciaCheckOpReq(FATCAIndiciaCheckOpReqType value) {
        this.fatcaIndiciaCheckOpReq = value;
    }

}
