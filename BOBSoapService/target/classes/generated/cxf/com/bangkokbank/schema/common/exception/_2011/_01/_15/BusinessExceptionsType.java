
package com.bangkokbank.schema.common.exception._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessExceptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessExceptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessException" type="{http://www.bangkokbank.com/schema/common/Exception/2011/01/15}BusinessExceptionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessExceptionsType", propOrder = {
    "businessException"
})
public class BusinessExceptionsType {

    @XmlElement(name = "BusinessException", required = true)
    protected List<BusinessExceptionType> businessException;

    /**
     * Gets the value of the businessException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessExceptionType }
     * 
     * 
     */
    public List<BusinessExceptionType> getBusinessException() {
        if (businessException == null) {
            businessException = new ArrayList<BusinessExceptionType>();
        }
        return this.businessException;
    }

}
