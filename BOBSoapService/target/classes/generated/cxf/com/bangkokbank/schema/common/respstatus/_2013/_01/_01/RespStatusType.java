
package com.bangkokbank.schema.common.respstatus._2013._01._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for RespStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="RespTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="InfoMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespStatusType", propOrder = {
    "respDate",
    "respTime",
    "infoMessage",
    "errorMessage",
    "messageID",
    "respCode",
    "respDesc"
})
public class RespStatusType {

    @XmlElement(name = "RespDate")
    protected DateType respDate;
    @XmlElement(name = "RespTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar respTime;
    @XmlElement(name = "InfoMessage")
    protected String infoMessage;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "MessageID")
    protected String messageID;
    @XmlElement(name = "RespCode")
    protected String respCode;
    @XmlElement(name = "RespDesc")
    protected String respDesc;

    /**
     * Gets the value of the respDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRespDate() {
        return respDate;
    }

    /**
     * Sets the value of the respDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRespDate(DateType value) {
        this.respDate = value;
    }

    /**
     * Gets the value of the respTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRespTime() {
        return respTime;
    }

    /**
     * Sets the value of the respTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRespTime(XMLGregorianCalendar value) {
        this.respTime = value;
    }

    /**
     * Gets the value of the infoMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoMessage() {
        return infoMessage;
    }

    /**
     * Sets the value of the infoMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoMessage(String value) {
        this.infoMessage = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

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
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the respDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespDesc() {
        return respDesc;
    }

    /**
     * Sets the value of the respDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespDesc(String value) {
        this.respDesc = value;
    }

}
