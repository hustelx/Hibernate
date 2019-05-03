
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppAcctRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppAcctRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustAcctNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppAcctRefType", propOrder = {
    "appID",
    "custAcctNum"
})
public class AppAcctRefType {

    @XmlElement(name = "AppID", required = true)
    protected String appID;
    @XmlElement(name = "CustAcctNum", required = true)
    protected String custAcctNum;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the custAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcctNum() {
        return custAcctNum;
    }

    /**
     * Sets the value of the custAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcctNum(String value) {
        this.custAcctNum = value;
    }

}
