
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PAccountRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PAccountRefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}P2PAccountRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PAccountRefsType", propOrder = {
    "p2PAccountRef"
})
public class P2PAccountRefsType {

    @XmlElement(name = "P2PAccountRef", namespace = "http://www.bangkokbank.com/schema/entity/Account/2011/01/15")
    protected List<P2PAccountRefType> p2PAccountRef;

    /**
     * Gets the value of the p2PAccountRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the p2PAccountRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getP2PAccountRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P2PAccountRefType }
     * 
     * 
     */
    public List<P2PAccountRefType> getP2PAccountRef() {
        if (p2PAccountRef == null) {
            p2PAccountRef = new ArrayList<P2PAccountRefType>();
        }
        return this.p2PAccountRef;
    }

}
