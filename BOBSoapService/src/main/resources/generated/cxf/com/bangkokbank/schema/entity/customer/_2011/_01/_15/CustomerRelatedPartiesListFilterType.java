
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerRelatedPartiesListFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerRelatedPartiesListFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GuarantorOnly"/>
 *     &lt;enumeration value="AllExceptGuarantor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerRelatedPartiesListFilterType")
@XmlEnum
public enum CustomerRelatedPartiesListFilterType {


    /**
     * 
     * 			  Returns only Guarantor Only related customers
     * 			
     * 
     */
    @XmlEnumValue("GuarantorOnly")
    GUARANTOR_ONLY("GuarantorOnly"),

    /**
     * 
     * 			  Returns all related parties except Guarantor
     * 			
     * 
     */
    @XmlEnumValue("AllExceptGuarantor")
    ALL_EXCEPT_GUARANTOR("AllExceptGuarantor");
    private final String value;

    CustomerRelatedPartiesListFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerRelatedPartiesListFilterType fromValue(String v) {
        for (CustomerRelatedPartiesListFilterType c: CustomerRelatedPartiesListFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
