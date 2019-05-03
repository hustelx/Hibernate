
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A System and Customer ID type used as the key to reference 
 * 	    	a specific customer for a specific system. This structure is designed
 * 	    	for referencing specific customers in a specific system.
 * 	    
 * 
 * <p>Java class for appCustSysIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appCustSysIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}appSysID"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}custSysID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appCustSysIDType", propOrder = {
    "appSysID",
    "custSysID"
})
public class AppCustSysIDType {

    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", required = true)
    protected String appSysID;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/Customer/2011/01/15", required = true)
    protected String custSysID;

    /**
     * The System from which the Customer is required.
     * 	    		e.g. CBRM, CCIS, CMS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppSysID() {
        return appSysID;
    }

    /**
     * Sets the value of the appSysID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppSysID(String value) {
        this.appSysID = value;
    }

    /**
     * CustomerID from which the Customer is required.
     * 	    		e.g. RMNumber, Account Number
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSysID() {
        return custSysID;
    }

    /**
     * Sets the value of the custSysID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSysID(String value) {
        this.custSysID = value;
    }

}
