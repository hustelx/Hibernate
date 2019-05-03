
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileRelsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileRelsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProfileRelType" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerProfileRelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileRelsType", propOrder = {
    "customerProfileRelType"
})
public class CustomerProfileRelsType {

    @XmlElement(name = "CustomerProfileRelType")
    protected List<CustomerProfileRelType> customerProfileRelType;

    /**
     * Gets the value of the customerProfileRelType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerProfileRelType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerProfileRelType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileRelType }
     * 
     * 
     */
    public List<CustomerProfileRelType> getCustomerProfileRelType() {
        if (customerProfileRelType == null) {
            customerProfileRelType = new ArrayList<CustomerProfileRelType>();
        }
        return this.customerProfileRelType;
    }

}
