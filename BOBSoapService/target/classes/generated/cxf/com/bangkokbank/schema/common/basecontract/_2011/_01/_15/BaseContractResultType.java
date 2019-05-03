
package com.bangkokbank.schema.common.basecontract._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.respstatus._2013._01._01.RespStatusesType;


/**
 * 
 *           Basic Service Result Message Structure
 *     	
 * 
 * <p>Java class for BaseContractResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseContractResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespStatuses" type="{http://www.bangkokbank.com/schema/common/RespStatus/2013/01/01}RespStatusesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseContractResultType", propOrder = {
    "respStatuses"
})
public class BaseContractResultType {

    @XmlElement(name = "RespStatuses")
    protected RespStatusesType respStatuses;

    /**
     * Gets the value of the respStatuses property.
     * 
     * @return
     *     possible object is
     *     {@link RespStatusesType }
     *     
     */
    public RespStatusesType getRespStatuses() {
        return respStatuses;
    }

    /**
     * Sets the value of the respStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespStatusesType }
     *     
     */
    public void setRespStatuses(RespStatusesType value) {
        this.respStatuses = value;
    }

}
