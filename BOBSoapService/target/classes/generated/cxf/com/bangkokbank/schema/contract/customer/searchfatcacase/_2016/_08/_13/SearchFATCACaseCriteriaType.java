
package com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.branch._2011._01._15.BranchCodeNameType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;


/**
 * <p>Java class for SearchFATCACaseCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchFATCACaseCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType"/>
 *         &lt;element name="Branch" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFATCACaseCriteriaType", propOrder = {
    "customerRef",
    "branch"
})
public class SearchFATCACaseCriteriaType {

    @XmlElement(name = "CustomerRef", required = true)
    protected CustomerInfoRefType customerRef;
    @XmlElement(name = "Branch")
    protected BranchCodeNameType branch;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerRef(CustomerInfoRefType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setBranch(BranchCodeNameType value) {
        this.branch = value;
    }

}
