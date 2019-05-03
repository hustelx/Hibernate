
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentInfosDelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmploymentInfosDelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmploymentInfo" type="{http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15}CustomerEmploymentInfoDelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentInfosDelType", propOrder = {
    "employmentInfo"
})
public class EmploymentInfosDelType {

    @XmlElement(name = "EmploymentInfo")
    protected List<CustomerEmploymentInfoDelType> employmentInfo;

    /**
     * Gets the value of the employmentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerEmploymentInfoDelType }
     * 
     * 
     */
    public List<CustomerEmploymentInfoDelType> getEmploymentInfo() {
        if (employmentInfo == null) {
            employmentInfo = new ArrayList<CustomerEmploymentInfoDelType>();
        }
        return this.employmentInfo;
    }

}
