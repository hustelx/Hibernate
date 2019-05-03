
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JointCustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JointCustomerProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PilotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JointCustomerProfileType", propOrder = {
    "primaryFlag",
    "pilotCode"
})
public class JointCustomerProfileType
    extends CustomerProfileType
{

    @XmlElement(name = "PrimaryFlag")
    protected Boolean primaryFlag;
    @XmlElement(name = "PilotCode")
    protected String pilotCode;

    /**
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryFlag(Boolean value) {
        this.primaryFlag = value;
    }

    /**
     * Gets the value of the pilotCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPilotCode() {
        return pilotCode;
    }

    /**
     * Sets the value of the pilotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPilotCode(String value) {
        this.pilotCode = value;
    }

}
