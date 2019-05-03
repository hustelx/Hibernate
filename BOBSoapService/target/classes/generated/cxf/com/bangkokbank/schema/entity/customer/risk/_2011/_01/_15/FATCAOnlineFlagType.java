
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FATCAOnlineFlagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAOnlineFlagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScenarioRefNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAOnlineFlagType", propOrder = {
    "scenarioRefNum",
    "result",
    "desc"
})
public class FATCAOnlineFlagType {

    @XmlElement(name = "ScenarioRefNum", required = true)
    protected String scenarioRefNum;
    @XmlElement(name = "Result")
    protected Boolean result;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the scenarioRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenarioRefNum() {
        return scenarioRefNum;
    }

    /**
     * Sets the value of the scenarioRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenarioRefNum(String value) {
        this.scenarioRefNum = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResult(Boolean value) {
        this.result = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
