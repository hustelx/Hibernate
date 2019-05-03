
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;
import com.bangkokbank.schema.entity.customer._2011._01._15.ShareHolderDetailsType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoInqResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoInqResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="ShareHolderDetails" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}ShareHolderDetailsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}nextKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoInqResultType", propOrder = {
    "customerInfoRef",
    "shareHolderDetails",
    "nextKey"
})
public class CustomerProfileShareHolderInfoInqResultType {

    @XmlElement(name = "CustomerInfoRef", required = true)
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "ShareHolderDetails")
    protected ShareHolderDetailsType shareHolderDetails;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String nextKey;

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
     * Gets the value of the shareHolderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHolderDetailsType }
     *     
     */
    public ShareHolderDetailsType getShareHolderDetails() {
        return shareHolderDetails;
    }

    /**
     * Sets the value of the shareHolderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderDetailsType }
     *     
     */
    public void setShareHolderDetails(ShareHolderDetailsType value) {
        this.shareHolderDetails = value;
    }

    /**
     * Gets the value of the nextKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextKey() {
        return nextKey;
    }

    /**
     * Sets the value of the nextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextKey(String value) {
        this.nextKey = value;
    }

}
