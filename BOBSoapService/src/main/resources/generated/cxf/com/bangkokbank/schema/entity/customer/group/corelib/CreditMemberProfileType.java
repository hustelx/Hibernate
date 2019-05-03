
package com.bangkokbank.schema.entity.customer.group.corelib;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;


/**
 * <p>Java class for CreditMemberProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMemberProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditGroupRef" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CreditGroupRefType"/>
 *         &lt;element name="GroupRelDirection" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="UP"/>
 *               &lt;enumeration value="DOWN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="DSSNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeadOfGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMemberProfileType", propOrder = {
    "creditGroupRef",
    "groupRelDirection",
    "customerInfoRef",
    "dssNum",
    "headOfGroupFlag"
})
public class CreditMemberProfileType {

    @XmlElement(name = "CreditGroupRef", required = true)
    protected CreditGroupRefType creditGroupRef;
    @XmlElement(name = "GroupRelDirection")
    protected String groupRelDirection;
    @XmlElement(name = "CustomerInfoRef", required = true)
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "DSSNum")
    protected String dssNum;
    @XmlElement(name = "HeadOfGroupFlag")
    protected Boolean headOfGroupFlag;

    /**
     * Gets the value of the creditGroupRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditGroupRefType }
     *     
     */
    public CreditGroupRefType getCreditGroupRef() {
        return creditGroupRef;
    }

    /**
     * Sets the value of the creditGroupRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditGroupRefType }
     *     
     */
    public void setCreditGroupRef(CreditGroupRefType value) {
        this.creditGroupRef = value;
    }

    /**
     * Gets the value of the groupRelDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupRelDirection() {
        return groupRelDirection;
    }

    /**
     * Sets the value of the groupRelDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupRelDirection(String value) {
        this.groupRelDirection = value;
    }

    /**
     * Gets the value of the customerInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerInfoRef() {
        return customerInfoRef;
    }

    /**
     * Sets the value of the customerInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerInfoRef(CustomerInfoRefType value) {
        this.customerInfoRef = value;
    }

    /**
     * Gets the value of the dssNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSSNum() {
        return dssNum;
    }

    /**
     * Sets the value of the dssNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSSNum(String value) {
        this.dssNum = value;
    }

    /**
     * Gets the value of the headOfGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadOfGroupFlag() {
        return headOfGroupFlag;
    }

    /**
     * Sets the value of the headOfGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadOfGroupFlag(Boolean value) {
        this.headOfGroupFlag = value;
    }

}
