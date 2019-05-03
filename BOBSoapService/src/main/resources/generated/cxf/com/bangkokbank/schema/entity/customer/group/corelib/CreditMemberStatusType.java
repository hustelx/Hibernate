
package com.bangkokbank.schema.entity.customer.group.corelib;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditMemberStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditMemberStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="SNAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditMemberStatusType")
@XmlEnum
public enum CreditMemberStatusType {

    CONFIRM,
    ACTIVE,
    SNAP;

    public String value() {
        return name();
    }

    public static CreditMemberStatusType fromValue(String v) {
        return valueOf(v);
    }

}
