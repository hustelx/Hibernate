
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JointCustsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JointCustsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}JointCust" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JointCustsType", propOrder = {
    "jointCust"
})
public class JointCustsType {

    @XmlElement(name = "JointCust", namespace = "http://www.bangkokbank.com/schema/entity/Customer/2011/01/15")
    protected List<CustomerProfileType> jointCust;

    /**
     * Gets the value of the jointCust property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jointCust property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJointCust().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProfileType }
     * 
     * 
     */
    public List<CustomerProfileType> getJointCust() {
        if (jointCust == null) {
            jointCust = new ArrayList<CustomerProfileType>();
        }
        return this.jointCust;
    }

}
