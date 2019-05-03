
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type allows different message objects to be specified. This mirrors the 
 * 				types of message objects returned by the CustomerProfileInq service.
 * 			
 * 
 * <p>Java class for CustomerProfileMaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileMaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Portfolio" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType" minOccurs="0"/>
 *         &lt;element name="JointCustomers" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}emptyElementType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileMaskType", propOrder = {

})
public class CustomerProfileMaskType {

    @XmlElement(name = "Portfolio")
    protected String portfolio;
    @XmlElement(name = "JointCustomers")
    protected String jointCustomers;

    /**
     * Gets the value of the portfolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolio() {
        return portfolio;
    }

    /**
     * Sets the value of the portfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolio(String value) {
        this.portfolio = value;
    }

    /**
     * Gets the value of the jointCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointCustomers() {
        return jointCustomers;
    }

    /**
     * Sets the value of the jointCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointCustomers(String value) {
        this.jointCustomers = value;
    }

}
