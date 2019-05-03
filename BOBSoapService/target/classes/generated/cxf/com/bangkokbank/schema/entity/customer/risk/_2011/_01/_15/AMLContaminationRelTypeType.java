
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AMLContaminationRelTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AMLContaminationRelTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AMLContaminationRelTypeType")
@XmlEnum
public enum AMLContaminationRelTypeType {


    /**
     * 
     * 	          Contamination Risks of Customer and 
     * 	          Related Accounts?
     * 	        
     * 
     */
    A,

    /**
     * 
     * 	          Contamination Risks of Customer and 
     * 	          Related Customer
     * 	        
     * 
     */
    C;

    public String value() {
        return name();
    }

    public static AMLContaminationRelTypeType fromValue(String v) {
        return valueOf(v);
    }

}
