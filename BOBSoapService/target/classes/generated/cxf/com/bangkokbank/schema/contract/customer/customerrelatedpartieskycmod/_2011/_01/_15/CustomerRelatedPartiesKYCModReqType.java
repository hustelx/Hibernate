
package com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.ShareHolderKYCDetailsType;


/**
 * <p>Java class for CustomerRelatedPartiesKYCModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesKYCModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="ShareHolderKYCDetails" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}ShareHolderKYCDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRelatedPartiesKYCModReqType", propOrder = {
    "customerInfoRef",
    "shareHolderKYCDetails"
})
public class CustomerRelatedPartiesKYCModReqType {

    @XmlElement(name = "CustomerInfoRef", required = true)
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(name = "ShareHolderKYCDetails")
    protected ShareHolderKYCDetailsType shareHolderKYCDetails;

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
     * Gets the value of the shareHolderKYCDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHolderKYCDetailsType }
     *     
     */
    public ShareHolderKYCDetailsType getShareHolderKYCDetails() {
        return shareHolderKYCDetails;
    }

    /**
     * Sets the value of the shareHolderKYCDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderKYCDetailsType }
     *     
     */
    public void setShareHolderKYCDetails(ShareHolderKYCDetailsType value) {
        this.shareHolderKYCDetails = value;
    }

}
