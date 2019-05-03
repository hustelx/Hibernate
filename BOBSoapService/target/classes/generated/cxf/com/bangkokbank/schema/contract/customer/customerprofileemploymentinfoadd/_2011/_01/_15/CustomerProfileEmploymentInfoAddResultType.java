
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.respstatus._2013._01._01.RespStatusType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoAddResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoAddResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespStatus" type="{http://www.bangkokbank.com/schema/common/RespStatus/2013/01/01}RespStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoAddResultType", propOrder = {
    "respStatus"
})
public class CustomerProfileEmploymentInfoAddResultType {

    @XmlElement(name = "RespStatus")
    protected RespStatusType respStatus;

    /**
     * Gets the value of the respStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RespStatusType }
     *     
     */
    public RespStatusType getRespStatus() {
        return respStatus;
    }

    /**
     * Sets the value of the respStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespStatusType }
     *     
     */
    public void setRespStatus(RespStatusType value) {
        this.respStatus = value;
    }

}
