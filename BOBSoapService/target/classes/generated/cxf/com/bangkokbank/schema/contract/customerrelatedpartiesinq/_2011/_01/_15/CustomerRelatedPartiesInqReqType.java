
package com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerInfoRefType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerRelatedPartiesListFilterType;


/**
 * <p>Java class for CustomerRelatedPartiesInqReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRelatedPartiesInqReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCISID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMNum" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}RMNumType" minOccurs="0"/>
 *         &lt;element name="CustomerInfoRef" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerInfoRefType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}maxNumOfTrans" minOccurs="0"/>
 *         &lt;element name="ListOption" type="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerRelatedPartiesListFilterType" minOccurs="0"/>
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
@XmlType(name = "CustomerRelatedPartiesInqReqType", propOrder = {
    "ccisid",
    "rmNum",
    "customerInfoRef",
    "maxNumOfTrans",
    "listOption",
    "nextKey"
})
public class CustomerRelatedPartiesInqReqType {

    @XmlElement(name = "CCISID")
    protected String ccisid;
    @XmlElement(name = "RMNum")
    protected String rmNum;
    @XmlElement(name = "CustomerInfoRef")
    protected CustomerInfoRefType customerInfoRef;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected BigInteger maxNumOfTrans;
    @XmlElement(name = "ListOption")
    protected CustomerRelatedPartiesListFilterType listOption;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String nextKey;

    /**
     * Gets the value of the ccisid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCISID() {
        return ccisid;
    }

    /**
     * Sets the value of the ccisid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCISID(String value) {
        this.ccisid = value;
    }

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
     * Gets the value of the customerInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public CustomerInfoRefType getCustomerInfoRef() {
        return customerInfoRef;
    }

    /**
     * Sets the value of the customerInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoRefType }
     *     
     */
    public void setCustomerInfoRef(CustomerInfoRefType value) {
        this.customerInfoRef = value;
    }

    /**
     * 
     * 				  If not specified then maximum as dictated by the following formula:
     * 				  5 X orchestration for each time returned by the back-end system.
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
     * Gets the value of the listOption property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRelatedPartiesListFilterType }
     *     
     */
    public CustomerRelatedPartiesListFilterType getListOption() {
        return listOption;
    }

    /**
     * Sets the value of the listOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRelatedPartiesListFilterType }
     *     
     */
    public void setListOption(CustomerRelatedPartiesListFilterType value) {
        this.listOption = value;
    }

    /**
     * 
     * 					nextKey element, if available, from the previous response.
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
