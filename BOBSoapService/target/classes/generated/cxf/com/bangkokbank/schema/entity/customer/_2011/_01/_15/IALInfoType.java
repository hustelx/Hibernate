
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.TrackingInfoType;


/**
 * 
 * 			\u0e23\u0e30\u0e14\u0e31\u0e1a\u0e04\u0e27\u0e32\u0e21\u0e19\u0e48\u0e32\u0e40\u0e0a\u0e37\u0e48\u0e2d\u0e16\u0e37\u0e2d\u0e02\u0e2d\u0e07\u0e2d\u0e31\u0e15\u0e25\u0e31\u0e01\u0e29\u0e13\u0e4c(IAL) 
 * 			\u0e04\u0e37\u0e2d\u0e23\u0e30\u0e14\u0e31\u0e1a\u0e04\u0e27\u0e32\u0e21\u0e40\u0e02\u0e49\u0e21\u0e07\u0e27\u0e14\u0e43\u0e19\u0e01\u0e32\u0e23\u0e1e\u0e34\u0e2a\u0e39\u0e08\u0e19\u0e4c\u0e15\u0e31\u0e27\u0e15\u0e19\u0e02\u0e2d\u0e07\u0e1c\u0e39\u0e49\u0e2a\u0e21\u0e31\u0e04\u0e23 \u0e08\u0e30\u0e40\u0e1b\u0e47\u0e19\u0e2a\u0e34\u0e48\u0e07\u0e17\u0e35\u0e48\u0e43\u0e0a\u0e49\u0e23\u0e30\u0e1a\u0e38\u0e02\u0e49\u0e2d\u0e01\u0e32\u0e2b\u0e19\u0e14\u0e43\u0e19\u0e02\u0e31\u0e49\u0e19\u0e15\u0e2d\u0e19\u0e01\u0e32\u0e23\u0e25\u0e07\u0e17\u0e30\u0e40\u0e1a\u0e35\u0e22\u0e19
 * 			
 * 
 * <p>Java class for IALInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IALInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaceToFaceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BBLIALCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BBLUpdateInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="IDPIALCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *         &lt;element name="IDPOwnerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDPCustCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BualuangExclusiveAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IALInfoType", propOrder = {
    "faceToFaceFlag",
    "bblialCode",
    "bblUpdateInfo",
    "idpialCode",
    "updateInfo",
    "idpOwnerCode",
    "idpCustCreation",
    "bualuangExclusiveAllocation"
})
public class IALInfoType {

    @XmlElement(name = "FaceToFaceFlag")
    protected Boolean faceToFaceFlag;
    @XmlElement(name = "BBLIALCode")
    protected String bblialCode;
    @XmlElement(name = "BBLUpdateInfo")
    protected TrackingInfoType bblUpdateInfo;
    @XmlElement(name = "IDPIALCode")
    protected String idpialCode;
    @XmlElement(name = "UpdateInfo")
    protected TrackingInfoType updateInfo;
    @XmlElement(name = "IDPOwnerCode")
    protected String idpOwnerCode;
    @XmlElement(name = "IDPCustCreation")
    protected String idpCustCreation;
    @XmlElement(name = "BualuangExclusiveAllocation")
    protected String bualuangExclusiveAllocation;

    /**
     * Gets the value of the faceToFaceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaceToFaceFlag() {
        return faceToFaceFlag;
    }

    /**
     * Sets the value of the faceToFaceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaceToFaceFlag(Boolean value) {
        this.faceToFaceFlag = value;
    }

    /**
     * Gets the value of the bblialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBBLIALCode() {
        return bblialCode;
    }

    /**
     * Sets the value of the bblialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBBLIALCode(String value) {
        this.bblialCode = value;
    }

    /**
     * Gets the value of the bblUpdateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getBBLUpdateInfo() {
        return bblUpdateInfo;
    }

    /**
     * Sets the value of the bblUpdateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setBBLUpdateInfo(TrackingInfoType value) {
        this.bblUpdateInfo = value;
    }

    /**
     * Gets the value of the idpialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPIALCode() {
        return idpialCode;
    }

    /**
     * Sets the value of the idpialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPIALCode(String value) {
        this.idpialCode = value;
    }

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setUpdateInfo(TrackingInfoType value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the idpOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPOwnerCode() {
        return idpOwnerCode;
    }

    /**
     * Sets the value of the idpOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPOwnerCode(String value) {
        this.idpOwnerCode = value;
    }

    /**
     * Gets the value of the idpCustCreation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDPCustCreation() {
        return idpCustCreation;
    }

    /**
     * Sets the value of the idpCustCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDPCustCreation(String value) {
        this.idpCustCreation = value;
    }

    /**
     * Gets the value of the bualuangExclusiveAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBualuangExclusiveAllocation() {
        return bualuangExclusiveAllocation;
    }

    /**
     * Sets the value of the bualuangExclusiveAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBualuangExclusiveAllocation(String value) {
        this.bualuangExclusiveAllocation = value;
    }

}
