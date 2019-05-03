
package com.bangkokbank.schema.entity.customer.group.corelib;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustToCreditGroupRelsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustToCreditGroupRelsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustToCreditGroupRel" type="{http://www.bangkokbank.com/schema/entity/Customer/Group/CoreLib}CustToCreditGroupRelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustToCreditGroupRelsType", propOrder = {
    "custToCreditGroupRel"
})
public class CustToCreditGroupRelsType {

    @XmlElement(name = "CustToCreditGroupRel")
    protected List<CustToCreditGroupRelType> custToCreditGroupRel;

    /**
     * Gets the value of the custToCreditGroupRel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custToCreditGroupRel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustToCreditGroupRel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustToCreditGroupRelType }
     * 
     * 
     */
    public List<CustToCreditGroupRelType> getCustToCreditGroupRel() {
        if (custToCreditGroupRel == null) {
            custToCreditGroupRel = new ArrayList<CustToCreditGroupRelType>();
        }
        return this.custToCreditGroupRel;
    }

}
