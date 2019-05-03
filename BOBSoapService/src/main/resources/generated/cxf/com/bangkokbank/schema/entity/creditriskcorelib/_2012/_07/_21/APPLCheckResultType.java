
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * 
 *           This type encapsulates the flag and also the value for an APPL Check
 *         
 * 
 * <p>Java class for APPLCheckResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APPLCheckResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="strValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="intValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *           &lt;element name="decValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="dateValue" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPLCheckResultType", propOrder = {
    "flag",
    "strValue",
    "intValue",
    "decValue",
    "dateValue"
})
public class APPLCheckResultType {

    @XmlElement(name = "Flag")
    protected boolean flag;
    protected String strValue;
    protected BigInteger intValue;
    protected BigDecimal decValue;
    protected DateType dateValue;

    /**
     * Gets the value of the flag property.
     * 
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     */
    public void setFlag(boolean value) {
        this.flag = value;
    }

    /**
     * Gets the value of the strValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrValue() {
        return strValue;
    }

    /**
     * Sets the value of the strValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrValue(String value) {
        this.strValue = value;
    }

    /**
     * Gets the value of the intValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntValue() {
        return intValue;
    }

    /**
     * Sets the value of the intValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntValue(BigInteger value) {
        this.intValue = value;
    }

    /**
     * Gets the value of the decValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecValue() {
        return decValue;
    }

    /**
     * Sets the value of the decValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecValue(BigDecimal value) {
        this.decValue = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDateValue(DateType value) {
        this.dateValue = value;
    }

}
