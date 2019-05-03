
package com.bangkokbank.schema.entity.user._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfileDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfileDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}BaseUserProfileDetailType">
 *       &lt;sequence>
 *         &lt;element name="UserAllocations" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserAllocationsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileDetailType", propOrder = {
    "userAllocations"
})
public class UserProfileDetailType
    extends BaseUserProfileDetailType
{

    @XmlElement(name = "UserAllocations", required = true)
    protected UserAllocationsType userAllocations;

    /**
     * Gets the value of the userAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link UserAllocationsType }
     *     
     */
    public UserAllocationsType getUserAllocations() {
        return userAllocations;
    }

    /**
     * Sets the value of the userAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAllocationsType }
     *     
     */
    public void setUserAllocations(UserAllocationsType value) {
        this.userAllocations = value;
    }

}
