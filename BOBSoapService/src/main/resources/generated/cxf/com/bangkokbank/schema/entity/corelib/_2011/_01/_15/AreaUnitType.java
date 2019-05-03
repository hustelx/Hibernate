
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rai"/>
 *     &lt;enumeration value="Ngan"/>
 *     &lt;enumeration value="SquareWah"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AreaUnitType")
@XmlEnum
public enum AreaUnitType {

    @XmlEnumValue("Rai")
    RAI("Rai"),
    @XmlEnumValue("Ngan")
    NGAN("Ngan"),
    @XmlEnumValue("SquareWah")
    SQUARE_WAH("SquareWah");
    private final String value;

    AreaUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaUnitType fromValue(String v) {
        for (AreaUnitType c: AreaUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
