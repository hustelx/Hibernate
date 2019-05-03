
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="C"/>
 *     &lt;length value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerTypeType")
@XmlEnum
public enum CustomerTypeType {

    P,
    C;

    public String value() {
        return name();
    }

    public static CustomerTypeType fromValue(String v) {
        return valueOf(v);
    }

}
