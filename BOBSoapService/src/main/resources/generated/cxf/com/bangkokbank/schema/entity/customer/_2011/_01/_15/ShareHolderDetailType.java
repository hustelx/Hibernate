
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareHolderDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHolderDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType" minOccurs="0"/>
 *         &lt;element name="ShareHolderInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}ShareHolderInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHolderDetailType", propOrder = {
    "customerInfoRef",
    "shareHolderInfo"
})
public class ShareHolderDetailType {

    @XmlElement(name = "CustomerInfoRef")
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "ShareHolderInfo")
    protected ShareHolderInfoType shareHolderInfo;

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
     * Gets the value of the shareHolderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHolderInfoType }
     *     
     */
    public ShareHolderInfoType getShareHolderInfo() {
        return shareHolderInfo;
    }

    /**
     * Sets the value of the shareHolderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderInfoType }
     *     
     */
    public void setShareHolderInfo(ShareHolderInfoType value) {
        this.shareHolderInfo = value;
    }

}
