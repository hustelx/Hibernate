
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactNumsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactNumsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactNumber" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ContactNumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactNumsType", propOrder = {
    "contactNumber"
})
public class ContactNumsType {

    @XmlElement(name = "ContactNumber")
    protected List<ContactNumType> contactNumber;

    /**
     * Gets the value of the contactNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactNumType }
     * 
     * 
     */
    public List<ContactNumType> getContactNumber() {
        if (contactNumber == null) {
            contactNumber = new ArrayList<ContactNumType>();
        }
        return this.contactNumber;
    }

}
