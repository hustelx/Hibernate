
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassbookInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassbookInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}PassbookNum"/>
 *         &lt;element name="PassbookDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}SignatureTransferPaperRef" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassbookInfoType", propOrder = {
    "passbookNum",
    "passbookDate",
    "signatureTransferPaperRef",
    "status",
    "reason"
})
public class PassbookInfoType {

    @XmlElement(name = "PassbookNum", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", required = true)
    protected String passbookNum;
    @XmlElement(name = "PassbookDate")
    protected DateType passbookDate;
    @XmlElement(name = "SignatureTransferPaperRef", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String signatureTransferPaperRef;
    @XmlElement(name = "Status")
    protected CodeDescType status;
    @XmlElement(name = "Reason")
    protected CodeDescType reason;

    /**
     * 
     * 	          22/08/2016, Wykeen, UPDATE.
     * 	          Only found out that there could be a prefix. In the event this is used in the future, then
     * 	          consider adding PassbookPrefixNum to represent the first 4 digits for MFund, and PassbookSuffixNum or
     * 	          PassbookSeqNum for the last 6 digits. Please note that this is only for MFund.
     * 	        
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassbookNum() {
        return passbookNum;
    }

    /**
     * Sets the value of the passbookNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassbookNum(String value) {
        this.passbookNum = value;
    }

    /**
     * Gets the value of the passbookDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPassbookDate() {
        return passbookDate;
    }

    /**
     * Sets the value of the passbookDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPassbookDate(DateType value) {
        this.passbookDate = value;
    }

    /**
     * 
     * 			  Reference to the Signature Transfer Paper
     * 			
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureTransferPaperRef() {
        return signatureTransferPaperRef;
    }

    /**
     * Sets the value of the signatureTransferPaperRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureTransferPaperRef(String value) {
        this.signatureTransferPaperRef = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setStatus(CodeDescType value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescType }
     *     
     */
    public CodeDescType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescType }
     *     
     */
    public void setReason(CodeDescType value) {
        this.reason = value;
    }

}
