
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for ODFacilityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODFacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TierNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExpiryDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *         &lt;element name="ClearingLineInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODFacilityInfoType", propOrder = {
    "tierNum",
    "expiryDate",
    "clearingLineInd"
})
public class ODFacilityInfoType {

    @XmlElement(name = "TierNum")
    protected int tierNum;
    @XmlElement(name = "ExpiryDate", required = true)
    protected DateType expiryDate;
    @XmlElement(name = "ClearingLineInd")
    protected boolean clearingLineInd;

    /**
     * Gets the value of the tierNum property.
     * 
     */
    public int getTierNum() {
        return tierNum;
    }

    /**
     * Sets the value of the tierNum property.
     * 
     */
    public void setTierNum(int value) {
        this.tierNum = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setExpiryDate(DateType value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the clearingLineInd property.
     * 
     */
    public boolean isClearingLineInd() {
        return clearingLineInd;
    }

    /**
     * Sets the value of the clearingLineInd property.
     * 
     */
    public void setClearingLineInd(boolean value) {
        this.clearingLineInd = value;
    }

}
