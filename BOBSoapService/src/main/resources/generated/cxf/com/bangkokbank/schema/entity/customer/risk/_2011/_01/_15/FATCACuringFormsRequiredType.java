
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCACuringFormsRequiredType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCACuringFormsRequiredType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CuringForm" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACuringFormRequiredType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCACuringFormsRequiredType", propOrder = {
    "curingForm"
})
public class FATCACuringFormsRequiredType {

    @XmlElement(name = "CuringForm")
    protected List<FATCACuringFormRequiredType> curingForm;

    /**
     * Gets the value of the curingForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curingForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuringForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCACuringFormRequiredType }
     * 
     * 
     */
    public List<FATCACuringFormRequiredType> getCuringForm() {
        if (curingForm == null) {
            curingForm = new ArrayList<FATCACuringFormRequiredType>();
        }
        return this.curingForm;
    }

}
