
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessingOrderType")
@XmlEnum
public enum ProcessingOrderType {

    F,
    B;

    public String value() {
        return name();
    }

    public static ProcessingOrderType fromValue(String v) {
        return valueOf(v);
    }

}
