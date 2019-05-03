
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProfileEmploymentInfoDelReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEmploymentInfoDelReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="EmploymentInfos" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15}EmploymentInfosDelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEmploymentInfoDelReqType", propOrder = {
    "rmNum",
    "employmentInfos"
})
public class CustomerProfileEmploymentInfoDelReqType {

    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "EmploymentInfos", required = true)
    protected EmploymentInfosDelType employmentInfos;

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
     * Gets the value of the employmentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentInfosDelType }
     *     
     */
    public EmploymentInfosDelType getEmploymentInfos() {
        return employmentInfos;
    }

    /**
     * Sets the value of the employmentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentInfosDelType }
     *     
     */
    public void setEmploymentInfos(EmploymentInfosDelType value) {
        this.employmentInfos = value;
    }

}
