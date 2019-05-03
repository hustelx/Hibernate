
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoAddReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoAddReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="NewEmploymentInfos" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15}EmploymentInfosAddType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoAddReqType", propOrder = {
    "rmNum",
    "newEmploymentInfos"
})
public class CustomerProfileEmploymentInfoAddReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "NewEmploymentInfos", required = true)
    protected EmploymentInfosAddType newEmploymentInfos;

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
     * Gets the value of the newEmploymentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentInfosAddType }
     *     
     */
    public EmploymentInfosAddType getNewEmploymentInfos() {
        return newEmploymentInfos;
    }

    /**
     * Sets the value of the newEmploymentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentInfosAddType }
     *     
     */
    public void setNewEmploymentInfos(EmploymentInfosAddType value) {
        this.newEmploymentInfos = value;
    }

}
