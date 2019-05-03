
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCACuringFormsRequiredType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCAIndiciaCheckFlagsType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.FATCAOnlineFlagsType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.IndiciaMessageType;


/**
 * <p>Java class for FATCAIndiciaCheckOpResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAIndiciaCheckOpResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseID" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACaseIDType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAOnlineFlags"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCACuringForms"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}EntitySelfCertification" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAFinalClassification" minOccurs="0"/>
 *         &lt;element name="FATCAIndiciaCheckFlags" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}FATCAIndiciaCheckFlagsType" minOccurs="0"/>
 *         &lt;element name="LockFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IndiciaMessage" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}IndiciaMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAIndiciaCheckOpResultsType", propOrder = {
    "caseID",
    "fatcaOnlineFlags",
    "fatcaCuringForms",
    "entitySelfCertification",
    "fatcaFinalClassification",
    "fatcaIndiciaCheckFlags",
    "lockFlag",
    "indiciaMessage"
})
public class FATCAIndiciaCheckOpResultsType {

    @XmlElement(name = "CaseID")
    protected String caseID;
    @XmlElement(name = "FATCAOnlineFlags", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", required = true)
    protected FATCAOnlineFlagsType fatcaOnlineFlags;
    @XmlElement(name = "FATCACuringForms", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", required = true)
    protected FATCACuringFormsRequiredType fatcaCuringForms;
    @XmlElement(name = "EntitySelfCertification", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected CodeDescType entitySelfCertification;
    @XmlElement(name = "FATCAFinalClassification", namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15")
    protected CodeDescType fatcaFinalClassification;
    @XmlElement(name = "FATCAIndiciaCheckFlags")
    protected FATCAIndiciaCheckFlagsType fatcaIndiciaCheckFlags;
    @XmlElement(name = "LockFlag")
    protected Boolean lockFlag;
    @XmlElement(name = "IndiciaMessage")
    protected IndiciaMessageType indiciaMessage;

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
     * Gets the value of the fatcaOnlineFlags property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAOnlineFlagsType }
     *     
     */
    public FATCAOnlineFlagsType getFATCAOnlineFlags() {
        return fatcaOnlineFlags;
    }

    /**
     * Sets the value of the fatcaOnlineFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAOnlineFlagsType }
     *     
     */
    public void setFATCAOnlineFlags(FATCAOnlineFlagsType value) {
        this.fatcaOnlineFlags = value;
    }

    /**
     * Gets the value of the fatcaCuringForms property.
     * 
     * @return
     *     possible object is
     *     {@link FATCACuringFormsRequiredType }
     *     
     */
    public FATCACuringFormsRequiredType getFATCACuringForms() {
        return fatcaCuringForms;
    }

    /**
     * Sets the value of the fatcaCuringForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCACuringFormsRequiredType }
     *     
     */
    public void setFATCACuringForms(FATCACuringFormsRequiredType value) {
        this.fatcaCuringForms = value;
    }

    /**
     * Gets the value of the entitySelfCertification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getEntitySelfCertification() {
        return entitySelfCertification;
    }

    /**
     * Sets the value of the entitySelfCertification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setEntitySelfCertification(CodeDescType value) {
        this.entitySelfCertification = value;
    }

    /**
     * Gets the value of the fatcaFinalClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getFATCAFinalClassification() {
        return fatcaFinalClassification;
    }

    /**
     * Sets the value of the fatcaFinalClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setFATCAFinalClassification(CodeDescType value) {
        this.fatcaFinalClassification = value;
    }

    /**
     * Gets the value of the fatcaIndiciaCheckFlags property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAIndiciaCheckFlagsType }
     *     
     */
    public FATCAIndiciaCheckFlagsType getFATCAIndiciaCheckFlags() {
        return fatcaIndiciaCheckFlags;
    }

    /**
     * Sets the value of the fatcaIndiciaCheckFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAIndiciaCheckFlagsType }
     *     
     */
    public void setFATCAIndiciaCheckFlags(FATCAIndiciaCheckFlagsType value) {
        this.fatcaIndiciaCheckFlags = value;
    }

    /**
     * Gets the value of the lockFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLockFlag(Boolean value) {
        this.lockFlag = value;
    }

    /**
     * Gets the value of the indiciaMessage property.
     * 
     * @return
     *     possible object is
     *     {@link IndiciaMessageType }
     *     
     */
    public IndiciaMessageType getIndiciaMessage() {
        return indiciaMessage;
    }

    /**
     * Sets the value of the indiciaMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndiciaMessageType }
     *     
     */
    public void setIndiciaMessage(IndiciaMessageType value) {
        this.indiciaMessage = value;
    }

}
