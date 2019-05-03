
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameCurrAmtsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameCurrAmtsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameCurrAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}NameCurrAmtType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameCurrAmtsType", propOrder = {
    "nameCurrAmt"
})
public class NameCurrAmtsType {

    @XmlElement(name = "NameCurrAmt")
    protected List<NameCurrAmtType> nameCurrAmt;

    /**
     * Gets the value of the nameCurrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameCurrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameCurrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameCurrAmtType }
     * 
     * 
     */
    public List<NameCurrAmtType> getNameCurrAmt() {
        if (nameCurrAmt == null) {
            nameCurrAmt = new ArrayList<NameCurrAmtType>();
        }
        return this.nameCurrAmt;
    }

}
