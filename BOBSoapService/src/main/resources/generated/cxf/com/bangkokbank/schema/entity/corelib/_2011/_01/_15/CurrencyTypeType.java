
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="TT"/>
 *     &lt;enumeration value="BN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyTypeType")
@XmlEnum
public enum CurrencyTypeType {

    SB,
    TT,
    BN;

    public String value() {
        return name();
    }

    public static CurrencyTypeType fromValue(String v) {
        return valueOf(v);
    }

}
