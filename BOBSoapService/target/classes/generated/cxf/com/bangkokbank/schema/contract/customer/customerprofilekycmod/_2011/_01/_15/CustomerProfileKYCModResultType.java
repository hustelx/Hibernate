
package com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateTimeType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerKYCUpdateInfosType;


/**
 * <p>Java class for CustomerProfileKYCModResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileKYCModResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateTimeType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerKYCUpdateInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileKYCModResultType", propOrder = {
    "dateTime",
    "customerKYCUpdateInfos"
})
public class CustomerProfileKYCModResultType {

    @XmlElement(name = "DateTime")
    protected DateTimeType dateTime;
    @XmlElement(name = "CustomerKYCUpdateInfos", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected CustomerKYCUpdateInfosType customerKYCUpdateInfos;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDateTime(DateTimeType value) {
        this.dateTime = value;
    }

    /**
     * 
     * 					If Risk Level or KYC or Risk levels are not changed, then the UpdateBy and LastUpdate are of the 
     * 					previous update. Otherwise, the update date would reflect the update date as specified in the request.
     * 					
     * 
     * @return
     *     possible object is
     *     {@link CustomerKYCUpdateInfosType }
     *     
     */
    public CustomerKYCUpdateInfosType getCustomerKYCUpdateInfos() {
        return customerKYCUpdateInfos;
    }

    /**
     * Sets the value of the customerKYCUpdateInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKYCUpdateInfosType }
     *     
     */
    public void setCustomerKYCUpdateInfos(CustomerKYCUpdateInfosType value) {
        this.customerKYCUpdateInfos = value;
    }

}
