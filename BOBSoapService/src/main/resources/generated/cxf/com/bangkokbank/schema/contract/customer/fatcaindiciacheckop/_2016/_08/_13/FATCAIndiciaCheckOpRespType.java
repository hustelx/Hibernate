
package com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.basecontract._2011._01._15.BaseContractRespType;


/**
 * FATCAIndiciaCheckOp Service Response
 * 
 * <p>Java class for FATCAIndiciaCheckOpRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FATCAIndiciaCheckOpRespType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/common/BaseContract/2011/01/15}BaseContractRespType">
 *       &lt;sequence>
 *         &lt;element name="FATCAIndiciaCheckOpResults" type="{http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13}FATCAIndiciaCheckOpResultsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FATCAIndiciaCheckOpRespType", propOrder = {
    "fatcaIndiciaCheckOpResults"
})
public class FATCAIndiciaCheckOpRespType
    extends BaseContractRespType
{

    @XmlElement(name = "FATCAIndiciaCheckOpResults")
    protected FATCAIndiciaCheckOpResultsType fatcaIndiciaCheckOpResults;

    /**
     * Gets the value of the fatcaIndiciaCheckOpResults property.
     * 
     * @return
     *     possible object is
     *     {@link FATCAIndiciaCheckOpResultsType }
     *     
     */
    public FATCAIndiciaCheckOpResultsType getFATCAIndiciaCheckOpResults() {
        return fatcaIndiciaCheckOpResults;
    }

    /**
     * Sets the value of the fatcaIndiciaCheckOpResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link FATCAIndiciaCheckOpResultsType }
     *     
     */
    public void setFATCAIndiciaCheckOpResults(FATCAIndiciaCheckOpResultsType value) {
        this.fatcaIndiciaCheckOpResults = value;
    }

}
