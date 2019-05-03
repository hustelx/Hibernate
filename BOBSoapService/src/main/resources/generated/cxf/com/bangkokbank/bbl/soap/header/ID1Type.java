
package com.bangkokbank.bbl.soap.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ID1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ID1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequesterInfo" type="{http://www.bangkokbank.com/bbl/soap/header/}RequesterInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ID1Type", propOrder = {
    "requesterInfo"
})
public class ID1Type {

    @XmlElement(name = "RequesterInfo", required = true)
    protected RequesterInfoType requesterInfo;

    /**
     * Gets the value of the requesterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequesterInfoType }
     *     
     */
    public RequesterInfoType getRequesterInfo() {
        return requesterInfo;
    }

    /**
     * Sets the value of the requesterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequesterInfoType }
     *     
     */
    public void setRequesterInfo(RequesterInfoType value) {
        this.requesterInfo = value;
    }

}
