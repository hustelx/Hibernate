
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MISDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MISDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MISDetail" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}MISDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MISDetailsType", propOrder = {
    "misDetail"
})
public class MISDetailsType {

    @XmlElement(name = "MISDetail")
    protected List<MISDetailType> misDetail;

    /**
     * Gets the value of the misDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMISDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MISDetailType }
     * 
     * 
     */
    public List<MISDetailType> getMISDetail() {
        if (misDetail == null) {
            misDetail = new ArrayList<MISDetailType>();
        }
        return this.misDetail;
    }

}
