
package com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.MsgLinesType;


/**
 * <p>Java class for CustomerIndiciaCheckInqResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIndiciaCheckInqResultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplayWarningFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WarningMsgs" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}MsgLinesType" minOccurs="0"/>
 *         &lt;element name="EntityShareHolder" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType" minOccurs="0"/>
 *         &lt;element name="SpecifyUSFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="USPNotHitIndiciaFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIndiciaCheckInqResultsType", propOrder = {
    "resultCode",
    "displayWarningFlag",
    "warningMsgs",
    "entityShareHolder",
    "entityType",
    "specifyUSFlag",
    "uspNotHitIndiciaFlag"
})
public class CustomerIndiciaCheckInqResultsType {

    @XmlElement(name = "ResultCode")
    protected Boolean resultCode;
    @XmlElement(name = "DisplayWarningFlag")
    protected Boolean displayWarningFlag;
    @XmlElement(name = "WarningMsgs")
    protected MsgLinesType warningMsgs;
    @XmlElement(name = "EntityShareHolder")
    protected CodeNamePairType entityShareHolder;
    @XmlElement(name = "EntityType")
    protected CodeNamePairType entityType;
    @XmlElement(name = "SpecifyUSFlag")
    protected Boolean specifyUSFlag;
    @XmlElement(name = "USPNotHitIndiciaFlag")
    protected Boolean uspNotHitIndiciaFlag;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResultCode(Boolean value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the displayWarningFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayWarningFlag() {
        return displayWarningFlag;
    }

    /**
     * Sets the value of the displayWarningFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayWarningFlag(Boolean value) {
        this.displayWarningFlag = value;
    }

    /**
     * Gets the value of the warningMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link MsgLinesType }
     *     
     */
    public MsgLinesType getWarningMsgs() {
        return warningMsgs;
    }

    /**
     * Sets the value of the warningMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgLinesType }
     *     
     */
    public void setWarningMsgs(MsgLinesType value) {
        this.warningMsgs = value;
    }

    /**
     * Gets the value of the entityShareHolder property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getEntityShareHolder() {
        return entityShareHolder;
    }

    /**
     * Sets the value of the entityShareHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setEntityShareHolder(CodeNamePairType value) {
        this.entityShareHolder = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNamePairType }
     *     
     */
    public CodeNamePairType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNamePairType }
     *     
     */
    public void setEntityType(CodeNamePairType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the specifyUSFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecifyUSFlag() {
        return specifyUSFlag;
    }

    /**
     * Sets the value of the specifyUSFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecifyUSFlag(Boolean value) {
        this.specifyUSFlag = value;
    }

    /**
     * Gets the value of the uspNotHitIndiciaFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUSPNotHitIndiciaFlag() {
        return uspNotHitIndiciaFlag;
    }

    /**
     * Sets the value of the uspNotHitIndiciaFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUSPNotHitIndiciaFlag(Boolean value) {
        this.uspNotHitIndiciaFlag = value;
    }

}
