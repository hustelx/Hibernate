
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerIrregularityOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerIrregularityOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FilterOption" type="{http://www.bangkokbank.com/schema/entity/CreditRiskCoreLib/2012/07/21}FilterOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIrregularityOptionType", propOrder = {
    "groupFlag",
    "filterOption"
})
public class CustomerIrregularityOptionType {

    @XmlElement(name = "GroupFlag")
    protected Boolean groupFlag;
    @XmlElement(name = "FilterOption")
    protected FilterOptionType filterOption;

    /**
     * Gets the value of the groupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupFlag() {
        return groupFlag;
    }

    /**
     * Sets the value of the groupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupFlag(Boolean value) {
        this.groupFlag = value;
    }

    /**
     * Gets the value of the filterOption property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOptionType }
     *     
     */
    public FilterOptionType getFilterOption() {
        return filterOption;
    }

    /**
     * Sets the value of the filterOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOptionType }
     *     
     */
    public void setFilterOption(FilterOptionType value) {
        this.filterOption = value;
    }

}
