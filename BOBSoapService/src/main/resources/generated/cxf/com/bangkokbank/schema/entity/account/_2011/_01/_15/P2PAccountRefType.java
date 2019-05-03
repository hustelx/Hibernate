
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.P2PTokenTypeType;


/**
 * Contains elements that references(i.e. the key) a specific account entity
 * 			
 * 
 * <p>Java class for P2PAccountRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P2PAccountRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}P2PTokenType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}P2PTokenNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P2PAccountRefType", propOrder = {
    "p2PTokenType",
    "p2PTokenNum"
})
@XmlSeeAlso({
    AnyIDProxyRefType.class
})
public class P2PAccountRefType {

    @XmlElement(name = "P2PTokenType", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected P2PTokenTypeType p2PTokenType;
    @XmlElement(name = "P2PTokenNum", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String p2PTokenNum;

    /**
     * Gets the value of the p2PTokenType property.
     * 
     * @return
     *     possible object is
     *     {@link P2PTokenTypeType }
     *     
     */
    public P2PTokenTypeType getP2PTokenType() {
        return p2PTokenType;
    }

    /**
     * Sets the value of the p2PTokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link P2PTokenTypeType }
     *     
     */
    public void setP2PTokenType(P2PTokenTypeType value) {
        this.p2PTokenType = value;
    }

    /**
     * Gets the value of the p2PTokenNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2PTokenNum() {
        return p2PTokenNum;
    }

    /**
     * Sets the value of the p2PTokenNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2PTokenNum(String value) {
        this.p2PTokenNum = value;
    }

}
