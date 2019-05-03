
package com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.AppCustSysIDType;


/**
 * <p>Java class for CustomerAccessibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccessibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}appCustSysID" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccessibilityFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccessibilityType", propOrder = {
    "ccisid",
    "appCustSysID",
    "userID",
    "accessibilityFlag"
})
public class CustomerAccessibilityType {

    @XmlElement(name = "CCISID")
    protected String ccisid;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/Customer/2011/01/15")
    protected AppCustSysIDType appCustSysID;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "AccessibilityFlag")
    protected Boolean accessibilityFlag;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

    /**
     * 	Other app and customer system id types. Not used now but put here for
     * 						extensibility purposes.
     * 				
     * 
     * @return
     *     possible object is
     *     {@link AppCustSysIDType }
     *     
     */
    public AppCustSysIDType getAppCustSysID() {
        return appCustSysID;
    }

    /**
     * Sets the value of the appCustSysID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppCustSysIDType }
     *     
     */
    public void setAppCustSysID(AppCustSysIDType value) {
        this.appCustSysID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the accessibilityFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessibilityFlag() {
        return accessibilityFlag;
    }

    /**
     * Sets the value of the accessibilityFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessibilityFlag(Boolean value) {
        this.accessibilityFlag = value;
    }

}
