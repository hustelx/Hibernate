
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;


/**
 * <p>Java class for CAFFacilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAFFacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAFFacilityNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAFRequestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoanProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="LimitAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAFFacilityInfoType", propOrder = {
    "cafFacilityNum",
    "cafRequestType",
    "loanProductName",
    "requestAmt",
    "limitAmt"
})
public class CAFFacilityInfoType {

    @XmlElement(name = "CAFFacilityNum")
    protected String cafFacilityNum;
    @XmlElement(name = "CAFRequestType")
    protected String cafRequestType;
    @XmlElement(name = "LoanProductName")
    protected String loanProductName;
    @XmlElement(name = "RequestAmt")
    protected CurrAmtType requestAmt;
    @XmlElement(name = "LimitAmt")
    protected CurrAmtType limitAmt;

    /**
     * Gets the value of the cafFacilityNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFFacilityNum() {
        return cafFacilityNum;
    }

    /**
     * Sets the value of the cafFacilityNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFFacilityNum(String value) {
        this.cafFacilityNum = value;
    }

    /**
     * Gets the value of the cafRequestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAFRequestType() {
        return cafRequestType;
    }

    /**
     * Sets the value of the cafRequestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAFRequestType(String value) {
        this.cafRequestType = value;
    }

    /**
     * Gets the value of the loanProductName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanProductName() {
        return loanProductName;
    }

    /**
     * Sets the value of the loanProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanProductName(String value) {
        this.loanProductName = value;
    }

    /**
     * Gets the value of the requestAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getRequestAmt() {
        return requestAmt;
    }

    /**
     * Sets the value of the requestAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setRequestAmt(CurrAmtType value) {
        this.requestAmt = value;
    }

    /**
     * Gets the value of the limitAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getLimitAmt() {
        return limitAmt;
    }

    /**
     * Sets the value of the limitAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setLimitAmt(CurrAmtType value) {
        this.limitAmt = value;
    }

}
