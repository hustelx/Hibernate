
package com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.TrackingInfoType;
import com.bangkokbank.schema.entity.customer._2011._01._15.CustomerEmploymentInfoType;


/**
 * <p>Java class for CustomerEmploymentInfoDelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerEmploymentInfoDelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/Customer/2011/01/15}CustomerEmploymentInfoType">
 *       &lt;sequence>
 *         &lt;element name="UpdateInfo" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}TrackingInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerEmploymentInfoDelType", propOrder = {
    "updateInfo"
})
public class CustomerEmploymentInfoDelType
    extends CustomerEmploymentInfoType
{

    @XmlElement(name = "UpdateInfo")
    protected TrackingInfoType updateInfo;

    /**
     * Gets the value of the updateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setUpdateInfo(TrackingInfoType value) {
        this.updateInfo = value;
    }

}
