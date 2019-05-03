
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMLSanctionInfosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AMLSanctionInfosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AMLSanctionInfo" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}AMLSanctionInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AMLSanctionInfosType", propOrder = {
    "amlSanctionInfo"
})
public class AMLSanctionInfosType {

    @XmlElement(name = "AMLSanctionInfo")
    protected List<AMLSanctionInfoType> amlSanctionInfo;

    /**
     * Gets the value of the amlSanctionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amlSanctionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAMLSanctionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMLSanctionInfoType }
     * 
     * 
     */
    public List<AMLSanctionInfoType> getAMLSanctionInfo() {
        if (amlSanctionInfo == null) {
            amlSanctionInfo = new ArrayList<AMLSanctionInfoType>();
        }
        return this.amlSanctionInfo;
    }

}
