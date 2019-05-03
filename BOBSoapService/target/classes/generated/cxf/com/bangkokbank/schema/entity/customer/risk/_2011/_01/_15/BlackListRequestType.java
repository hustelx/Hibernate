
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for BlackListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackListRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType"/>
 *         &lt;element name="RequestDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackListRequestType", propOrder = {
    "status",
    "requestDate"
})
public class BlackListRequestType {

    @XmlElement(name = "Status", required = true)
    protected CodeNamePairType status;
    @XmlElement(name = "RequestDate", required = true)
    protected DateType requestDate;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setStatus(CodeNamePairType value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setRequestDate(DateType value) {
        this.requestDate = value;
    }

}
