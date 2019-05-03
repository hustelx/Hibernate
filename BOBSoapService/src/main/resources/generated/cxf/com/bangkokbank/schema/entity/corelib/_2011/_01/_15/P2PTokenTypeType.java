
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P2PTokenTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="P2PTokenTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IDCard"/>
 *     &lt;enumeration value="MobileNum"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="TaxID"/>
 *     &lt;enumeration value="EWalletID"/>
 *     &lt;enumeration value="BillerID"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "P2PTokenTypeType")
@XmlEnum
public enum P2PTokenTypeType {


    /**
     *  
     * 	          IDCard, meaning that the P2PTokenNumType is IDCard Num
     * 	        
     * 
     */
    @XmlEnumValue("IDCard")
    ID_CARD("IDCard"),

    /**
     *  
     * 	          At the moment, we only have MobileNum which is actually
     * 	          the phone number. In the future if we have other MobileNum,
     * 	          such as serial number, we can name other
     * 	          enumerations, MobileSerialNum for example.
     * 	        
     * 
     */
    @XmlEnumValue("MobileNum")
    MOBILE_NUM("MobileNum"),
    @XmlEnumValue("Email")
    EMAIL("Email"),

    /**
     * 
     * 	    		Tax ID number
     * 	    		
     * 
     */
    @XmlEnumValue("TaxID")
    TAX_ID("TaxID"),

    /**
     * 
     * 	    		E-Wallet ID number
     * 	    		
     * 
     */
    @XmlEnumValue("EWalletID")
    E_WALLET_ID("EWalletID"),

    /**
     * 
     * 	    		Biller ID number
     * 	    		
     * 
     */
    @XmlEnumValue("BillerID")
    BILLER_ID("BillerID"),

    /**
     * 
     * 		      A catch all type where the
     * 		      P2PRef 
     * 		    
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    P2PTokenTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static P2PTokenTypeType fromValue(String v) {
        for (P2PTokenTypeType c: P2PTokenTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
