
package com.bangkokbank.schema.contract.searchcustomer._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserIDTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserIDTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllocationCode"/>
 *     &lt;enumeration value="OA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserIDTypeType")
@XmlEnum
public enum UserIDTypeType {

    @XmlEnumValue("AllocationCode")
    ALLOCATION_CODE("AllocationCode"),
    OA("OA");
    private final String value;

    UserIDTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserIDTypeType fromValue(String v) {
        for (UserIDTypeType c: UserIDTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
