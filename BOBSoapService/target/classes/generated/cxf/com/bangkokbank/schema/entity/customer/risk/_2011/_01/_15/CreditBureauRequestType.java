
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for CreditBureauRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditBureauRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType"/>
 *         &lt;element name="RequestDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *         &lt;element name="RequestObjective" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType"/>
 *         &lt;element name="ConsentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsentNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsentDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBureauRequestType", propOrder = {
    "status",
    "requestDate",
    "requestObjective",
    "consentType",
    "consentNum",
    "consentDate"
})
public class CreditBureauRequestType {

    @XmlElement(name = "Status", required = true)
    protected CodeNamePairType status;
    @XmlElement(name = "RequestDate", required = true)
    protected DateType requestDate;
    @XmlElement(name = "RequestObjective", required = true)
    protected CodeNamePairType requestObjective;
    @XmlElement(name = "ConsentType", required = true)
    protected String consentType;
    @XmlElement(name = "ConsentNum", required = true)
    protected String consentNum;
    @XmlElement(name = "ConsentDate", required = true)
    protected DateType consentDate;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setStatus(CodeNamePairType value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRequestDate(DateType value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requestObjective property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getRequestObjective() {
        return requestObjective;
    }

    /**
     * Sets the value of the requestObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setRequestObjective(CodeNamePairType value) {
        this.requestObjective = value;
    }

    /**
     * Gets the value of the consentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentType() {
        return consentType;
    }

    /**
     * Sets the value of the consentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentType(String value) {
        this.consentType = value;
    }

    /**
     * Gets the value of the consentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentNum() {
        return consentNum;
    }

    /**
     * Sets the value of the consentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentNum(String value) {
        this.consentNum = value;
    }

    /**
     * Gets the value of the consentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getConsentDate() {
        return consentDate;
    }

    /**
     * Sets the value of the consentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setConsentDate(DateType value) {
        this.consentDate = value;
    }

}
