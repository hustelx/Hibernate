
package com.bangkokbank.bbl.soap.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESBFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESBFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultFlowName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="faultNodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESBFaultType", propOrder = {
    "messageID",
    "faultString",
    "faultFlowName",
    "faultNodeName"
})
public class ESBFaultType {

    @XmlElement(name = "MessageID", required = true)
    protected String messageID;
    @XmlElement(required = true)
    protected String faultString;
    @XmlElement(required = true)
    protected String faultFlowName;
    @XmlElement(required = true)
    protected String faultNodeName;

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the faultString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultString() {
        return faultString;
    }

    /**
     * Sets the value of the faultString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultString(String value) {
        this.faultString = value;
    }

    /**
     * Gets the value of the faultFlowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultFlowName() {
        return faultFlowName;
    }

    /**
     * Sets the value of the faultFlowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultFlowName(String value) {
        this.faultFlowName = value;
    }

    /**
     * Gets the value of the faultNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultNodeName() {
        return faultNodeName;
    }

    /**
     * Sets the value of the faultNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultNodeName(String value) {
        this.faultNodeName = value;
    }

}
