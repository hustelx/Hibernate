
package com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.contractcorelib._2016._01._31.RMPostAddressType;


/**
 * <p>Java class for CustomerProfileAddressInfoModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileAddressInfoModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType"/>
 *         &lt;element name="Address" type="{http://www.bangkokbank.com/schema/contract/ContractCoreLib/2016/01/31}RMPostAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileAddressInfoModReqType", propOrder = {
    "rmNum",
    "address"
})
public class CustomerProfileAddressInfoModReqType {

    @XmlElement(name = "RMNum", required = true)
    protected String rmNum;
    @XmlElement(name = "Address")
    protected RMPostAddressType address;

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link RMPostAddressType }
     *     
     */
    public RMPostAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMPostAddressType }
     *     
     */
    public void setAddress(RMPostAddressType value) {
        this.address = value;
    }

}
