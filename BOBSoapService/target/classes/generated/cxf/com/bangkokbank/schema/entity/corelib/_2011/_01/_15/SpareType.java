
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	    Mixed type is used to cater for when there are no elements and the field itself has content.
 * 	    
 * 
 * <p>Java class for SpareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}XMLFreeFormatType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpareType", propOrder = {
    "content"
})
public class SpareType {

    @XmlElementRef(name = "Field", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;

    /**
     * 
     * 	    Mixed type is used to cater for when there are no elements and the field itself has content.
     * 	    Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLFreeFormatType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
