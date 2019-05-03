
package com.bangkokbank.schema.entity.botgroup._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BOTGroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOTGroupsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOTGroup" type="{http://www.bangkokbank.com/schema/entity/BOTGroup/2011/01/15}BOTGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOTGroupsType", propOrder = {
    "botGroup"
})
public class BOTGroupsType {

    @XmlElement(name = "BOTGroup")
    protected List<BOTGroupType> botGroup;

    /**
     * Gets the value of the botGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the botGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOTGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOTGroupType }
     * 
     * 
     */
    public List<BOTGroupType> getBOTGroup() {
        if (botGroup == null) {
            botGroup = new ArrayList<BOTGroupType>();
        }
        return this.botGroup;
    }

}
