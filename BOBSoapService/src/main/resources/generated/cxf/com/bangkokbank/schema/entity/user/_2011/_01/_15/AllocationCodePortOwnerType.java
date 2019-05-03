
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationCodePortOwnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationCodePortOwnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllocationCode" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationCodeType"/>
 *         &lt;element name="PortOwnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationCodePortOwnerType", propOrder = {
    "allocationCode",
    "portOwnerFlag"
})
public class AllocationCodePortOwnerType {

    @XmlElement(name = "AllocationCode", required = true)
    protected String allocationCode;
    @XmlElement(name = "PortOwnerFlag")
    protected Boolean portOwnerFlag;

    /**
     * Gets the value of the allocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocationCode() {
        return allocationCode;
    }

    /**
     * Sets the value of the allocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocationCode(String value) {
        this.allocationCode = value;
    }

    /**
     * Gets the value of the portOwnerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPortOwnerFlag() {
        return portOwnerFlag;
    }

    /**
     * Sets the value of the portOwnerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPortOwnerFlag(Boolean value) {
        this.portOwnerFlag = value;
    }

}
