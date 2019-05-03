
package com.bangkokbank.schema.entity.creditriskcorelib._2012._07._21;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterOptionType")
@XmlEnum
public enum FilterOptionType {


    /**
     * 
     * 			  Returns Irregularity Flag Only
     * 			
     * 
     */
    F,

    /**
     * 
     * 			  Returns Irregularity Account Only
     * 			
     * 
     */
    I,

    /**
     * 
     * 			  Returns All Account
     * 			
     * 
     */
    A;

    public String value() {
        return name();
    }

    public static FilterOptionType fromValue(String v) {
        return valueOf(v);
    }

}
