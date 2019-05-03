
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Used for specifying Field Validation options.
 * 					Type and RegexPatterns are for the future.
 * 					All fields are optional to accomodate the condition where validation is required.
 * 					For example, if MinLenght is not used, then there is no minimum length.
 * 			
 * 
 * <p>Java class for FieldValidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldValidationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MinLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RegexPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValidationType")
public class FieldValidationType {

    @XmlAttribute(name = "MinLength")
    protected BigInteger minLength;
    @XmlAttribute(name = "MaxLength")
    protected BigInteger maxLength;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "RegexPattern")
    protected String regexPattern;

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinLength(BigInteger value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the regexPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegexPattern() {
        return regexPattern;
    }

    /**
     * Sets the value of the regexPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegexPattern(String value) {
        this.regexPattern = value;
    }

}
