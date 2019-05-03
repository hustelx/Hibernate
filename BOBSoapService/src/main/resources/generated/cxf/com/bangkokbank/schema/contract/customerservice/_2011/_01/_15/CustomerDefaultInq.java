
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15.CustomerDefaultInqReqType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15}CustomerDefaultInqReq"/>
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
    "customerDefaultInqReq"
})
@XmlRootElement(name = "CustomerDefaultInq")
public class CustomerDefaultInq {

    @XmlElement(name = "CustomerDefaultInqReq", namespace = "http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", required = true)
    protected CustomerDefaultInqReqType customerDefaultInqReq;

    /**
     * Gets the value of the customerDefaultInqReq property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDefaultInqReqType }
     *     
     */
    public CustomerDefaultInqReqType getCustomerDefaultInqReq() {
        return customerDefaultInqReq;
    }

    /**
     * Sets the value of the customerDefaultInqReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDefaultInqReqType }
     *     
     */
    public void setCustomerDefaultInqReq(CustomerDefaultInqReqType value) {
        this.customerDefaultInqReq = value;
    }

}
