
package com.bangkokbank.schema.entity.customer._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.user._2011._01._15.AllocationCodePortOwnerType;


/**
 * <p>Java class for AllocationCodePortOwnersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationCodePortOwnersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Allocation" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}AllocationCodePortOwnerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationCodePortOwnersType", propOrder = {
    "allocation"
})
public class AllocationCodePortOwnersType {

    @XmlElement(name = "Allocation")
    protected List<AllocationCodePortOwnerType> allocation;

    /**
     * Gets the value of the allocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllocationCodePortOwnerType }
     * 
     * 
     */
    public List<AllocationCodePortOwnerType> getAllocation() {
        if (allocation == null) {
            allocation = new ArrayList<AllocationCodePortOwnerType>();
        }
        return this.allocation;
    }

}
