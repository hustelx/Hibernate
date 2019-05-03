
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;


/**
 * <p>Java class for BBLProjectRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BBLProjectRefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BBLProjectRef" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BBLProjectRefsType", propOrder = {
    "bblProjectRef"
})
public class BBLProjectRefsType {

    @XmlElement(name = "BBLProjectRef")
    protected List<CodeDescType> bblProjectRef;

    /**
     * Gets the value of the bblProjectRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bblProjectRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBBLProjectRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescType }
     * 
     * 
     */
    public List<CodeDescType> getBBLProjectRef() {
        if (bblProjectRef == null) {
            bblProjectRef = new ArrayList<CodeDescType>();
        }
        return this.bblProjectRef;
    }

}
