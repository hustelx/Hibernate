
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a 4 component control structure that stores control codes
 * 
 * <p>Java class for AccountControlCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountControlCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ctl1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ctl2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ctl3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ctl4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountControlCodeType", propOrder = {
    "ctl1",
    "ctl2",
    "ctl3",
    "ctl4"
})
public class AccountControlCodeType {

    @XmlElement(name = "Ctl1")
    protected int ctl1;
    @XmlElement(name = "Ctl2")
    protected int ctl2;
    @XmlElement(name = "Ctl3")
    protected int ctl3;
    @XmlElement(name = "Ctl4")
    protected int ctl4;

    /**
     * Gets the value of the ctl1 property.
     * 
     */
    public int getCtl1() {
        return ctl1;
    }

    /**
     * Sets the value of the ctl1 property.
     * 
     */
    public void setCtl1(int value) {
        this.ctl1 = value;
    }

    /**
     * Gets the value of the ctl2 property.
     * 
     */
    public int getCtl2() {
        return ctl2;
    }

    /**
     * Sets the value of the ctl2 property.
     * 
     */
    public void setCtl2(int value) {
        this.ctl2 = value;
    }

    /**
     * Gets the value of the ctl3 property.
     * 
     */
    public int getCtl3() {
        return ctl3;
    }

    /**
     * Sets the value of the ctl3 property.
     * 
     */
    public void setCtl3(int value) {
        this.ctl3 = value;
    }

    /**
     * Gets the value of the ctl4 property.
     * 
     */
    public int getCtl4() {
        return ctl4;
    }

    /**
     * Sets the value of the ctl4 property.
     * 
     */
    public void setCtl4(int value) {
        this.ctl4 = value;
    }

}
