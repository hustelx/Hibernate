
package com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.IALInfoType;


/**
 * <p>Java class for CustomerProfileIALModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileIALModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="IALInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}IALInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileIALModReqType", propOrder = {
    "rmNum",
    "ialInfo"
})
public class CustomerProfileIALModReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "IALInfo")
    protected IALInfoType ialInfo;

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
     * Gets the value of the ialInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IALInfoType }
     *     
     */
    public IALInfoType getIALInfo() {
        return ialInfo;
    }

    /**
     * Sets the value of the ialInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IALInfoType }
     *     
     */
    public void setIALInfo(IALInfoType value) {
        this.ialInfo = value;
    }

}
