
package com.bangkokbank.schema.contract.contractcorelib._2016._01._31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.PostAddressType;


/**
 * <p>Java class for RMPostAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RMPostAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PostAddressType">
 *       &lt;sequence>
 *         &lt;element name="SeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RMPostAddressType", propOrder = {
    "seqNum"
})
public class RMPostAddressType
    extends PostAddressType
{

    @XmlElement(name = "SeqNum")
    protected String seqNum;

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNum(String value) {
        this.seqNum = value;
    }

}
