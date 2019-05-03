
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OTPVerifyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OTPVerifyInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}OTPTokenNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OTPVerifyInfoType", propOrder = {
    "refID",
    "otpTokenNum"
})
public class OTPVerifyInfoType {

    @XmlElement(name = "RefID", required = true)
    protected String refID;
    @XmlElement(name = "OTPTokenNum", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String otpTokenNum;

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the otpTokenNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTPTokenNum() {
        return otpTokenNum;
    }

    /**
     * Sets the value of the otpTokenNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTPTokenNum(String value) {
        this.otpTokenNum = value;
    }

}
