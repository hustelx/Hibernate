
package com.bangkokbank.bbl.soap.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequesterInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequesterInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="nonTerminal">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="DivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="SysCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequesterInfoType", propOrder = {
    "userID",
    "terminal",
    "nonTerminal",
    "position"
})
public class RequesterInfoType {

    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "Terminal")
    protected String terminal;
    protected RequesterInfoType.NonTerminal nonTerminal;
    @XmlElement(name = "Position", required = true)
    protected String position;

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
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the nonTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link RequesterInfoType.NonTerminal }
     *     
     */
    public RequesterInfoType.NonTerminal getNonTerminal() {
        return nonTerminal;
    }

    /**
     * Sets the value of the nonTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequesterInfoType.NonTerminal }
     *     
     */
    public void setNonTerminal(RequesterInfoType.NonTerminal value) {
        this.nonTerminal = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DivisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SysCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "divisionCode",
        "sysCode"
    })
    public static class NonTerminal {

        @XmlElement(name = "DivisionCode", required = true)
        protected String divisionCode;
        @XmlElement(name = "SysCode", required = true)
        protected String sysCode;

        /**
         * Gets the value of the divisionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDivisionCode() {
            return divisionCode;
        }

        /**
         * Sets the value of the divisionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDivisionCode(String value) {
            this.divisionCode = value;
        }

        /**
         * Gets the value of the sysCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSysCode() {
            return sysCode;
        }

        /**
         * Sets the value of the sysCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSysCode(String value) {
            this.sysCode = value;
        }

    }

}
