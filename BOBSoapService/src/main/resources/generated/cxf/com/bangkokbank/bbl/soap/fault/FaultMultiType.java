
package com.bangkokbank.bbl.soap.fault;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultMultiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultMultiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaultDetail" type="{http://www.bangkokbank.com/bbl/soap/fault}FaultDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultMultiType", propOrder = {
    "faultDetail"
})
public class FaultMultiType {

    @XmlElement(name = "FaultDetail", required = true)
    protected List<FaultDetailType> faultDetail;

    /**
     * Gets the value of the faultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultDetailType }
     * 
     * 
     */
    public List<FaultDetailType> getFaultDetail() {
        if (faultDetail == null) {
            faultDetail = new ArrayList<FaultDetailType>();
        }
        return this.faultDetail;
    }

}
