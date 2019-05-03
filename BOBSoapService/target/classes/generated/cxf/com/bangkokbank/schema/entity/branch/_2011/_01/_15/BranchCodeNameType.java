
package com.bangkokbank.schema.entity.branch._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				'Name' field contains Branch Name
 * 				'Code' field contains Branch Code
 * 		
 * 
 * <p>Java class for BranchCodeNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchCodeNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BranchCode" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeType" minOccurs="0"/>
 *         &lt;element name="BranchNameTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchNameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchCodeNameType", propOrder = {
    "branchCode",
    "branchNameTH",
    "branchNameEN",
    "branchName"
})
public class BranchCodeNameType {

    @XmlElement(name = "BranchCode")
    protected String branchCode;
    @XmlElement(name = "BranchNameTH")
    protected String branchNameTH;
    @XmlElement(name = "BranchNameEN")
    protected String branchNameEN;
    @XmlElement(name = "BranchName")
    protected String branchName;

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchNameTH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNameTH() {
        return branchNameTH;
    }

    /**
     * Sets the value of the branchNameTH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNameTH(String value) {
        this.branchNameTH = value;
    }

    /**
     * Gets the value of the branchNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchNameEN() {
        return branchNameEN;
    }

    /**
     * Sets the value of the branchNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchNameEN(String value) {
        this.branchNameEN = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

}
