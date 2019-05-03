
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfileHierarchyDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfileHierarchyDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}BaseUserProfileDetailType">
 *       &lt;sequence>
 *         &lt;element name="AllocationCode" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationCodeType"/>
 *         &lt;element name="CustomerAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileHierarchyDetailType", propOrder = {
    "allocationCode",
    "customerAccessCode"
})
public class UserProfileHierarchyDetailType
    extends BaseUserProfileDetailType
{

    @XmlElement(name = "AllocationCode", required = true)
    protected String allocationCode;
    @XmlElement(name = "CustomerAccessCode")
    protected String customerAccessCode;

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
     * Gets the value of the customerAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccessCode() {
        return customerAccessCode;
    }

    /**
     * Sets the value of the customerAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccessCode(String value) {
        this.customerAccessCode = value;
    }

}
