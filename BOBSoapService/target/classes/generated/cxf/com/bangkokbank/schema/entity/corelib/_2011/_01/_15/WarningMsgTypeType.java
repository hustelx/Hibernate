
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarningMsgTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WarningMsgTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="K"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WarningMsgTypeType")
@XmlEnum
public enum WarningMsgTypeType {


    /**
     * 
     * 			  Info, means that this warning is technically not a warning
     * 			  in which a response or next request is required.
     * 			
     * 
     */
    I,

    /**
     * 
     * 			  Override, means that override is required in the next message. Normally
     * 			  this includes sending, OverrideTellerID, Process Authorization and
     * 			  Process Authorization code. But in some cases, overwrite ID is not required.
     * 			  This is left to the back-end to handle the validation of overwriteTellerID requirement as
     * 			  this is done on a case by case basis.
     * 			
     * 
     */
    O,

    /**
     * 
     * 			  Confirm, means that the flags to which confirmation is sent by the host has to be
     * 			  re-confirmed in the next request. Set the flags to "True" to confirm acceptance. Confirmation
     * 			  does not require overrideTellerID.
     * 			
     * 
     */
    C,

    /**
     * 
     * 			  K for O.K. or rather OC. This is a combination of O and C, meaning that Override is required in addition
     * 			  to sending the confirmation to the flags that require confirmation.
     * 			
     * 
     */
    K;

    public String value() {
        return name();
    }

    public static WarningMsgTypeType fromValue(String v) {
        return valueOf(v);
    }

}
