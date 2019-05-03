
package com.bangkokbank.schema.entity.blacklist._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.DateType;


/**
 * <p>Java class for NewsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewsDate" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DateType"/>
 *         &lt;element name="NewsTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewsDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsEntryType", propOrder = {
    "referenceNo",
    "newsDate",
    "newsTypeCode",
    "newsDetail"
})
public class NewsEntryType {

    @XmlElement(name = "ReferenceNo", required = true)
    protected String referenceNo;
    @XmlElement(name = "NewsDate", required = true)
    protected DateType newsDate;
    @XmlElement(name = "NewsTypeCode", required = true)
    protected String newsTypeCode;
    @XmlElement(name = "NewsDetail", required = true)
    protected String newsDetail;

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the newsDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getNewsDate() {
        return newsDate;
    }

    /**
     * Sets the value of the newsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setNewsDate(DateType value) {
        this.newsDate = value;
    }

    /**
     * Gets the value of the newsTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsTypeCode() {
        return newsTypeCode;
    }

    /**
     * Sets the value of the newsTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsTypeCode(String value) {
        this.newsTypeCode = value;
    }

    /**
     * Gets the value of the newsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsDetail() {
        return newsDetail;
    }

    /**
     * Sets the value of the newsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsDetail(String value) {
        this.newsDetail = value;
    }

}
