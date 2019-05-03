
package com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddOwnerFlagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOwnerFlagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddOwnerFlags" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOwnerFlagsType", propOrder = {
    "addOwnerFlags"
})
public class AddOwnerFlagsType {

    @XmlElement(name = "AddOwnerFlags", type = Boolean.class)
    protected List<Boolean> addOwnerFlags;

    /**
     * Gets the value of the addOwnerFlags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOwnerFlags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOwnerFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getAddOwnerFlags() {
        if (addOwnerFlags == null) {
            addOwnerFlags = new ArrayList<Boolean>();
        }
        return this.addOwnerFlags;
    }

}
