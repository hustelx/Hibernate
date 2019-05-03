
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCACaseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCACaseDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseID" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseIDType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCACaseDetailType", propOrder = {
    "caseID",
    "fatcaCaseInfo"
})
public class FATCACaseDetailType {

    @XmlElement(name = "CaseID")
    protected String caseID;
    @XmlElement(name = "FATCACaseInfo", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected FATCACaseInfoType fatcaCaseInfo;

    /**
     * Gets the value of the caseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseID(String value) {
        this.caseID = value;
    }

    /**
     * Gets the value of the fatcaCaseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FATCACaseInfoType }
     *     
     */
    public FATCACaseInfoType getFATCACaseInfo() {
        return fatcaCaseInfo;
    }

    /**
     * Sets the value of the fatcaCaseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCACaseInfoType }
     *     
     */
    public void setFATCACaseInfo(FATCACaseInfoType value) {
        this.fatcaCaseInfo = value;
    }

}
