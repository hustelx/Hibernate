
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CTTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOT"/>
 *     &lt;enumeration value="BBL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CTTypeType")
@XmlEnum
public enum CTTypeType {


    /**
     * 
     * 						BOT Customer Type classification
     * 					
     * 
     */
    BOT,

    /**
     * 
     * 						BBL Customer Type classification
     * 					
     * 
     */
    BBL;

    public String value() {
        return name();
    }

    public static CTTypeType fromValue(String v) {
        return valueOf(v);
    }

}
