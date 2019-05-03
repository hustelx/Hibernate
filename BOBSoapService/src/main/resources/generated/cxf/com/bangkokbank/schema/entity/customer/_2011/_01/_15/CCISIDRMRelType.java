
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents the relationship(s) of CCIS_ID to RMNum. For single account, CCIS id is the same as the CCISID field and should have only one CCIS For joint accounts, CCIS IDs of all customers in the 
 * 
 * <p>Java class for CCISIDRMRelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCISIDRMRelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISIDRel" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CCISIDRelType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCISIDRMRelType", propOrder = {
    "ccisidRel"
})
public class CCISIDRMRelType {

    @XmlElement(name = "CCISIDRel", required = true)
    protected List<CCISIDRelType> ccisidRel;

    /**
     * Gets the value of the ccisidRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccisidRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCISIDRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCISIDRelType }
     * 
     * 
     */
    public List<CCISIDRelType> getCCISIDRel() {
        if (ccisidRel == null) {
            ccisidRel = new ArrayList<CCISIDRelType>();
        }
        return this.ccisidRel;
    }

}
