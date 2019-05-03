
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for ODDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AcctNumType"/>
 *         &lt;element name="OutstandingAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="IsClearingLine" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsClearingLineAmt" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="IsClearingLineExpiryDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="ProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ODTierInfos" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}ODTierInfosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODDetailType", propOrder = {
    "imNum",
    "outstandingAmt",
    "isClearingLine",
    "isClearingLineAmt",
    "isClearingLineExpiryDate",
    "projectCode",
    "assetCode",
    "odTierInfos"
})
public class ODDetailType {

    @XmlElement(name = "IMNum", required = true)
    protected String imNum;
    @XmlElement(name = "OutstandingAmt")
    protected CurrAmtType outstandingAmt;
    @XmlElement(name = "IsClearingLine")
    protected Boolean isClearingLine;
    @XmlElement(name = "IsClearingLineAmt")
    protected CurrAmtType isClearingLineAmt;
    @XmlElement(name = "IsClearingLineExpiryDate")
    protected DateType isClearingLineExpiryDate;
    @XmlElement(name = "ProjectCode")
    protected String projectCode;
    @XmlElement(name = "AssetCode")
    protected String assetCode;
    @XmlElement(name = "ODTierInfos")
    protected ODTierInfosType odTierInfos;

    /**
     * Gets the value of the imNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMNum() {
        return imNum;
    }

    /**
     * Sets the value of the imNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMNum(String value) {
        this.imNum = value;
    }

    /**
     * Gets the value of the outstandingAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getOutstandingAmt() {
        return outstandingAmt;
    }

    /**
     * Sets the value of the outstandingAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setOutstandingAmt(CurrAmtType value) {
        this.outstandingAmt = value;
    }

    /**
     * Gets the value of the isClearingLine property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsClearingLine() {
        return isClearingLine;
    }

    /**
     * Sets the value of the isClearingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClearingLine(Boolean value) {
        this.isClearingLine = value;
    }

    /**
     * Gets the value of the isClearingLineAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getIsClearingLineAmt() {
        return isClearingLineAmt;
    }

    /**
     * Sets the value of the isClearingLineAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setIsClearingLineAmt(CurrAmtType value) {
        this.isClearingLineAmt = value;
    }

    /**
     * Gets the value of the isClearingLineExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getIsClearingLineExpiryDate() {
        return isClearingLineExpiryDate;
    }

    /**
     * Sets the value of the isClearingLineExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setIsClearingLineExpiryDate(DateType value) {
        this.isClearingLineExpiryDate = value;
    }

    /**
     * Gets the value of the projectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * Sets the value of the projectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * Gets the value of the assetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCode() {
        return assetCode;
    }

    /**
     * Sets the value of the assetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCode(String value) {
        this.assetCode = value;
    }

    /**
     * Gets the value of the odTierInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ODTierInfosType }
     *     
     */
    public ODTierInfosType getODTierInfos() {
        return odTierInfos;
    }

    /**
     * Sets the value of the odTierInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODTierInfosType }
     *     
     */
    public void setODTierInfos(ODTierInfosType value) {
        this.odTierInfos = value;
    }

}
