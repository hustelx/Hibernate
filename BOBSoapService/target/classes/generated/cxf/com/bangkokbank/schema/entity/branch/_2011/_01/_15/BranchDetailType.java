
package com.bangkokbank.schema.entity.branch._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressType;


/**
 * <p>Java class for BranchDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BranchCodeName" type="{http://www.bangkokbank.com/schema/entity/Branch/2011/01/15}BranchCodeNameType" minOccurs="0"/>
 *         &lt;element name="BranchAddr" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchDetailType", propOrder = {
    "branchCodeName",
    "branchAddr"
})
public class BranchDetailType {

    @XmlElement(name = "BranchCodeName")
    protected BranchCodeNameType branchCodeName;
    @XmlElement(name = "BranchAddr")
    protected PostAddressType branchAddr;

    /**
     * Gets the value of the branchCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link BranchCodeNameType }
     *     
     */
    public BranchCodeNameType getBranchCodeName() {
        return branchCodeName;
    }

    /**
     * Sets the value of the branchCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchCodeNameType }
     *     
     */
    public void setBranchCodeName(BranchCodeNameType value) {
        this.branchCodeName = value;
    }

    /**
     * Gets the value of the branchAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PostAddressType }
     *     
     */
    public PostAddressType getBranchAddr() {
        return branchAddr;
    }

    /**
     * Sets the value of the branchAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAddressType }
     *     
     */
    public void setBranchAddr(PostAddressType value) {
        this.branchAddr = value;
    }

}
