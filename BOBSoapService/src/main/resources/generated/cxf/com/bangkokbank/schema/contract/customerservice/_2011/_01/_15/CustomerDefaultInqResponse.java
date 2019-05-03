
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15.CustomerDefaultInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15}CustomerDefaultInqResp"/>
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
    "customerDefaultInqResp"
})
@XmlRootElement(name = "CustomerDefaultInqResponse")
public class CustomerDefaultInqResponse {

    @XmlElement(name = "CustomerDefaultInqResp", namespace = "http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15", required = true)
    protected CustomerDefaultInqRespType customerDefaultInqResp;

    /**
     * Gets the value of the customerDefaultInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDefaultInqRespType }
     *     
     */
    public CustomerDefaultInqRespType getCustomerDefaultInqResp() {
        return customerDefaultInqResp;
    }

    /**
     * Sets the value of the customerDefaultInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDefaultInqRespType }
     *     
     */
    public void setCustomerDefaultInqResp(CustomerDefaultInqRespType value) {
        this.customerDefaultInqResp = value;
    }

}
