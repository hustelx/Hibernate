
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * 
 * 	  Customer Type information will be generated in CCIS prior to create case  such as  99, 88 = personal (P)   / 1 - 77, 89 = juristic (C)
 * 	  
 * 	  'Code' field contain the Code of Registration from CCIS system  such as 
 * 							1 = company limited /2 = public company limited/3 = partnership /88 = joint personal/89 = joint venture 
 * 							/99 = personal , etc 
 * 
 *         'Name' field  contains  name of Registration Type. 
 *       
 * 
 * <p>Java class for CustomerRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerRegistrationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRegistrationType")
public class CustomerRegistrationType
    extends CodeNamePairType
{


}
