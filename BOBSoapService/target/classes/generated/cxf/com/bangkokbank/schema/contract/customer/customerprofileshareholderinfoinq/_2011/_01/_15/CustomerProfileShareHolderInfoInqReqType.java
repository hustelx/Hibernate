
package com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerIdentificationType;


/**
 * <p>Java class for CustomerProfileShareHolderInfoInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileShareHolderInfoInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JuristicID" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerIdentificationType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}maxNumOfTrans" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}nextKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileShareHolderInfoInqReqType", propOrder = {
    "juristicID",
    "maxNumOfTrans",
    "nextKey"
})
public class CustomerProfileShareHolderInfoInqReqType {

    @XmlElement(name = "JuristicID")
    protected CustomerIdentificationType juristicID;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected BigInteger maxNumOfTrans;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String nextKey;

    /**
     * Gets the value of the juristicID property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public CustomerIdentificationType getJuristicID() {
        return juristicID;
    }

    /**
     * Sets the value of the juristicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationType }
     *     
     */
    public void setJuristicID(CustomerIdentificationType value) {
        this.juristicID = value;
    }

    /**
     * 
     * 				  Maximum number of transactions. If not specified then existing
     * 				  numbers are 25 returned.
     * 				
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumOfTrans() {
        return maxNumOfTrans;
    }

    /**
     * Sets the value of the maxNumOfTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumOfTrans(BigInteger value) {
        this.maxNumOfTrans = value;
    }

    /**
     * 
     * 				  Used the nextKey returned for the next set of response.
     * 				
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextKey() {
        return nextKey;
    }

    /**
     * Sets the value of the nextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextKey(String value) {
        this.nextKey = value;
    }

}
