
package com.bangkokbank.schema.entity.customer.group.corelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMemberRelProfilesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMemberRelProfilesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditMemberRelProfile" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CreditMemberRelProfileType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMemberRelProfilesType", propOrder = {
    "creditMemberRelProfile"
})
public class CreditMemberRelProfilesType {

    @XmlElement(name = "CreditMemberRelProfile")
    protected List<CreditMemberRelProfileType> creditMemberRelProfile;

    /**
     * Gets the value of the creditMemberRelProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditMemberRelProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditMemberRelProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditMemberRelProfileType }
     * 
     * 
     */
    public List<CreditMemberRelProfileType> getCreditMemberRelProfile() {
        if (creditMemberRelProfile == null) {
            creditMemberRelProfile = new ArrayList<CreditMemberRelProfileType>();
        }
        return this.creditMemberRelProfile;
    }

}
