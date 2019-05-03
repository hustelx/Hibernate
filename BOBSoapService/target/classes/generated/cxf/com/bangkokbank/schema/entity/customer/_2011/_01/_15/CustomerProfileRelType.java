
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.account._2011._01._15.AccountRefType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.FromToType;


/**
 * <p>Java class for CustomerProfileRelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileRelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="RelationshipCode" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}FromToType" minOccurs="0"/>
 *         &lt;element name="AccountRef" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileRelType", propOrder = {
    "rmNum",
    "relationshipCode",
    "accountRef"
})
public class CustomerProfileRelType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "RelationshipCode")
    protected FromToType relationshipCode;
    @XmlElement(name = "AccountRef")
    protected AccountRefType accountRef;

    /**
     * Gets the value of the rmNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMNum() {
        return rmNum;
    }

    /**
     * Sets the value of the rmNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMNum(String value) {
        this.rmNum = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link FromToType }
     *     
     */
    public FromToType getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToType }
     *     
     */
    public void setRelationshipCode(FromToType value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRefType }
     *     
     */
    public AccountRefType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRefType }
     *     
     */
    public void setAccountRef(AccountRefType value) {
        this.accountRef = value;
    }

}
