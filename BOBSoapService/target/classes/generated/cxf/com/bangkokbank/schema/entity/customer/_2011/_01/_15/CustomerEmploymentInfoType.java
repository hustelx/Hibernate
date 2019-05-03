
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15.CustomerEmploymentInfoAddType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15.CustomerEmploymentInfoDelType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15.CustomerEmploymentInfoInqType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;


/**
 * <p>Java class for CustomerEmploymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEmploymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEmploymentInfoType", propOrder = {
    "employerName",
    "occupation",
    "position"
})
@XmlSeeAlso({
    CustomerEmploymentInfoAddType.class,
    CustomerEmploymentInfoInqType.class,
    CustomerEmploymentInfoDelType.class
})
public class CustomerEmploymentInfoType {

    @XmlElement(name = "EmployerName")
    protected String employerName;
    @XmlElement(name = "Occupation")
    protected CodeDescType occupation;
    @XmlElement(name = "Position")
    protected CodeDescType position;

    /**
     * Gets the value of the employerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployerName() {
        return employerName;
    }

    /**
     * Sets the value of the employerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployerName(String value) {
        this.employerName = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setOccupation(CodeDescType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setPosition(CodeDescType value) {
        this.position = value;
    }

}
