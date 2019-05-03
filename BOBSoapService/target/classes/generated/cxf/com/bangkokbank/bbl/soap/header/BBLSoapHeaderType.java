
package com.bangkokbank.bbl.soap.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BBLSoapHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BBLSoapHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requester" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Branch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Teller" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID1" type="{http://www.bangkokbank.com/bbl/soap/header/}ID1Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BBLSoapHeaderType", propOrder = {
    "requester",
    "username",
    "password",
    "format",
    "version",
    "branch",
    "teller",
    "terminal",
    "id1"
})
public class BBLSoapHeaderType {

    @XmlElement(name = "Requester", required = true)
    protected String requester;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "Format", required = true)
    protected String format;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Branch")
    protected String branch;
    @XmlElement(name = "Teller")
    protected String teller;
    @XmlElement(name = "Terminal")
    protected String terminal;
    @XmlElement(name = "ID1", required = true)
    protected ID1Type id1;

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester(String value) {
        this.requester = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the teller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeller() {
        return teller;
    }

    /**
     * Sets the value of the teller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeller(String value) {
        this.teller = value;
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
     * Gets the value of the id1 property.
     * 
     * @return
     *     possible object is
     *     {@link ID1Type }
     *     
     */
    public ID1Type getID1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID1Type }
     *     
     */
    public void setID1(ID1Type value) {
        this.id1 = value;
    }

}
