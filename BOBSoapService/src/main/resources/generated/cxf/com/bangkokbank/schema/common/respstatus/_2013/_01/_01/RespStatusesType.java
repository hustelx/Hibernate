
package com.bangkokbank.schema.common.respstatus._2013._01._01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespStatusesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespStatusesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespStatus" type="{http://www.bangkokbank.com/schema/common/RespStatus/2013/01/01}RespStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespStatusesType", propOrder = {
    "respStatus"
})
public class RespStatusesType {

    @XmlElement(name = "RespStatus")
    protected List<RespStatusType> respStatus;

    /**
     * Gets the value of the respStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RespStatusType }
     * 
     * 
     */
    public List<RespStatusType> getRespStatus() {
        if (respStatus == null) {
            respStatus = new ArrayList<RespStatusType>();
        }
        return this.respStatus;
    }

}
