
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15.CustomerRelatedPartiesInqRespType;


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
 *         &lt;element ref="{http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15}CustomerRelatedPartiesInqResp"/>
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
    "customerRelatedPartiesInqResp"
})
@XmlRootElement(name = "CustomerRelatedPartiesInqResponse")
public class CustomerRelatedPartiesInqResponse {

    @XmlElement(name = "CustomerRelatedPartiesInqResp", namespace = "http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15", required = true)
    protected CustomerRelatedPartiesInqRespType customerRelatedPartiesInqResp;

    /**
     * Gets the value of the customerRelatedPartiesInqResp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesInqRespType }
     *     
     */
    public CustomerRelatedPartiesInqRespType getCustomerRelatedPartiesInqResp() {
        return customerRelatedPartiesInqResp;
    }

    /**
     * Sets the value of the customerRelatedPartiesInqResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesInqRespType }
     *     
     */
    public void setCustomerRelatedPartiesInqResp(CustomerRelatedPartiesInqRespType value) {
        this.customerRelatedPartiesInqResp = value;
    }

}
