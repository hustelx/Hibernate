
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CABasicInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABasicInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CAFFacilityInfos" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CAFFacilityInfosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABasicInfoType", propOrder = {
    "ccisid",
    "cafFacilityInfos"
})
public class CABasicInfoType {

    @XmlElement(name = "CCISID", required = true)
    protected String ccisid;
    @XmlElement(name = "CAFFacilityInfos")
    protected CAFFacilityInfosType cafFacilityInfos;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

    /**
     * Gets the value of the cafFacilityInfos property.
     * 
     * @return
     *     possible object is
     *     {@link CAFFacilityInfosType }
     *     
     */
    public CAFFacilityInfosType getCAFFacilityInfos() {
        return cafFacilityInfos;
    }

    /**
     * Sets the value of the cafFacilityInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAFFacilityInfosType }
     *     
     */
    public void setCAFFacilityInfos(CAFFacilityInfosType value) {
        this.cafFacilityInfos = value;
    }

}
