
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChequeClearingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChequeClearingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ClearToday"/>
 *     &lt;enumeration value="ClearNextBizDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChequeClearingTypeType")
@XmlEnum
public enum ChequeClearingTypeType {


    /**
     * 
     * 			  AKA CB
     * 			  
     * 
     */
    @XmlEnumValue("ClearToday")
    CLEAR_TODAY("ClearToday"),

    /**
     * 
     * 			  AKA CL
     * 			  
     * 
     */
    @XmlEnumValue("ClearNextBizDay")
    CLEAR_NEXT_BIZ_DAY("ClearNextBizDay");
    private final String value;

    ChequeClearingTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChequeClearingTypeType fromValue(String v) {
        for (ChequeClearingTypeType c: ChequeClearingTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
