
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DepositAcctTransDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositAcctTransDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepositAcctTransDetail" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}DepositAcctTransDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositAcctTransDetailsType", propOrder = {
    "depositAcctTransDetail"
})
public class DepositAcctTransDetailsType {

    @XmlElement(name = "DepositAcctTransDetail")
    protected List<DepositAcctTransDetailType> depositAcctTransDetail;

    /**
     * Gets the value of the depositAcctTransDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositAcctTransDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositAcctTransDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepositAcctTransDetailType }
     * 
     * 
     */
    public List<DepositAcctTransDetailType> getDepositAcctTransDetail() {
        if (depositAcctTransDetail == null) {
            depositAcctTransDetail = new ArrayList<DepositAcctTransDetailType>();
        }
        return this.depositAcctTransDetail;
    }

}
