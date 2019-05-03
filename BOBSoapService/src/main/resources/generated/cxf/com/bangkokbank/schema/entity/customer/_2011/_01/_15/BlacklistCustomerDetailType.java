
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressType;


/**
 * <p>Java class for BlacklistCustomerDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlacklistCustomerDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerIdentification" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="CustomerName" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerNameType"/>
 *         &lt;element name="Address" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlacklistCustomerDetailType", propOrder = {
    "customerType",
    "customerIdentification",
    "birthDate",
    "customerName",
    "address"
})
public class BlacklistCustomerDetailType {

    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "CustomerIdentification")
    protected CustomerIdentificationType customerIdentification;
    @XmlElement(name = "BirthDate")
    protected DateType birthDate;
    @XmlElement(name = "CustomerName", required = true)
    protected CustomerNameType customerName;
    @XmlElement(name = "Address", required = true)
    protected PostAddressType address;

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setCustomerIdentification(CustomerIdentificationType value) {
        this.customerIdentification = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthDate(DateType value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNameType }
     *     
     */
    public CustomerNameType getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNameType }
     *     
     */
    public void setCustomerName(CustomerNameType value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressType }
     *     
     */
    public PostAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressType }
     *     
     */
    public void setAddress(PostAddressType value) {
        this.address = value;
    }

}
