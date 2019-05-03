
package com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.StateTokenType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.CustomerEnhancedDueDiligenceDetailsType;


/**
 * <p>Java class for CustomerProfileEDDModReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileEDDModReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerEDDDetails" type="{http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15}CustomerEnhancedDueDiligenceDetailsType"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}stateToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProfileEDDModReqType", propOrder = {
    "customerEDDDetails",
    "stateToken"
})
public class CustomerProfileEDDModReqType {

    @XmlElement(name = "CustomerEDDDetails", required = true)
    protected CustomerEnhancedDueDiligenceDetailsType customerEDDDetails;
    @XmlElement(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected StateTokenType stateToken;

    /**
     * Gets the value of the customerEDDDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnhancedDueDiligenceDetailsType }
     *     
     */
    public CustomerEnhancedDueDiligenceDetailsType getCustomerEDDDetails() {
        return customerEDDDetails;
    }

    /**
     * Sets the value of the customerEDDDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnhancedDueDiligenceDetailsType }
     *     
     */
    public void setCustomerEDDDetails(CustomerEnhancedDueDiligenceDetailsType value) {
        this.customerEDDDetails = value;
    }

    /**
     * 
     * 			      If this is available, currently we use information in here to do
     * 			      some additional state-related handling. For now, we replace
     * 			      the EDDPartA with the information here in place of that submitted EDDPartAInfo 
     * 			      structure in the request. This is because RM have inconsistent data that
     * 			      cannot be standardized to enable deterministic mapping of empty elements, i.e.
     * 			      sometimes 0 and sometimes " " space.
     * 			    
     * 
     * @return
     *     possible object is
     *     {@link StateTokenType }
     *     
     */
    public StateTokenType getStateToken() {
        return stateToken;
    }

    /**
     * Sets the value of the stateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateTokenType }
     *     
     */
    public void setStateToken(StateTokenType value) {
        this.stateToken = value;
    }

}
