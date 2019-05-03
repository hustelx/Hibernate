
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CurrAmtType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for FixedDepositTransDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedDepositTransDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepositDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element name="DepositNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Term" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalBal" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CurrAmtType" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedDepositTransDetailType", propOrder = {
    "depositDate",
    "depositNum",
    "term",
    "principalBal",
    "maturityDate"
})
public class FixedDepositTransDetailType {

    @XmlElement(name = "DepositDate")
    protected DateType depositDate;
    @XmlElement(name = "DepositNum")
    protected String depositNum;
    @XmlElement(name = "Term")
    protected String term;
    @XmlElement(name = "PrincipalBal")
    protected CurrAmtType principalBal;
    @XmlElement(name = "MaturityDate")
    protected DateType maturityDate;

    /**
     * Gets the value of the depositDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDepositDate() {
        return depositDate;
    }

    /**
     * Sets the value of the depositDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDepositDate(DateType value) {
        this.depositDate = value;
    }

    /**
     * Gets the value of the depositNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositNum() {
        return depositNum;
    }

    /**
     * Sets the value of the depositNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositNum(String value) {
        this.depositNum = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the principalBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrAmtType }
     *     
     */
    public CurrAmtType getPrincipalBal() {
        return principalBal;
    }

    /**
     * Sets the value of the principalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrAmtType }
     *     
     */
    public void setPrincipalBal(CurrAmtType value) {
        this.principalBal = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setMaturityDate(DateType value) {
        this.maturityDate = value;
    }

}
