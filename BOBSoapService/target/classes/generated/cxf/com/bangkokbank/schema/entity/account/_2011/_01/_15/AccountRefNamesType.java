
package com.bangkokbank.schema.entity.account._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRefNamesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRefNamesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountRef" type="{http://www.bangkokbank.com/schema/entity/Account/2011/01/15}AccountRefNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRefNamesType", propOrder = {
    "accountRef"
})
public class AccountRefNamesType {

    @XmlElement(name = "AccountRef")
    protected List<AccountRefNameType> accountRef;

    /**
     * Gets the value of the accountRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountRefNameType }
     * 
     * 
     */
    public List<AccountRefNameType> getAccountRef() {
        if (accountRef == null) {
            accountRef = new ArrayList<AccountRefNameType>();
        }
        return this.accountRef;
    }

}
