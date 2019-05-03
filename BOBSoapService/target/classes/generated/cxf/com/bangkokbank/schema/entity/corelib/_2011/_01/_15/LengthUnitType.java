
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="cm"/>
 *     &lt;enumeration value="mm"/>
 *     &lt;enumeration value="Mi"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="i"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthUnitType")
@XmlEnum
public enum LengthUnitType {

    KM("KM"),
    M("M"),
    @XmlEnumValue("cm")
    CM("cm"),
    @XmlEnumValue("mm")
    MM("mm"),
    @XmlEnumValue("Mi")
    MI("Mi"),
    Y("Y"),
    F("F"),
    @XmlEnumValue("i")
    I("i");
    private final String value;

    LengthUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LengthUnitType fromValue(String v) {
        for (LengthUnitType c: LengthUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
