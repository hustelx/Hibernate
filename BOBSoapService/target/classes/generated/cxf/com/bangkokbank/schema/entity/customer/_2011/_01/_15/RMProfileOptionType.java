
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RMProfileOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RMProfileOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LoanProfile"/>
 *     &lt;enumeration value="CoreProfile"/>
 *     &lt;enumeration value="DigitalIDProfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RMProfileOptionType")
@XmlEnum
public enum RMProfileOptionType {

    @XmlEnumValue("LoanProfile")
    LOAN_PROFILE("LoanProfile"),
    @XmlEnumValue("CoreProfile")
    CORE_PROFILE("CoreProfile"),
    @XmlEnumValue("DigitalIDProfile")
    DIGITAL_ID_PROFILE("DigitalIDProfile");
    private final String value;

    RMProfileOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RMProfileOptionType fromValue(String v) {
        for (RMProfileOptionType c: RMProfileOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
