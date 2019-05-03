
package com.bangkokbank.schema.entity.customer._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 * 
 * 			'Code' field contains the code of MaritalStatus . ( Ussed in ILOG)
 * 			  'Name' field contains the name of MaritalStatus   such as single /married with certificate
 *      					/married without certificate /widow.
 * 		
 * 
 * <p>Java class for MaritalStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritalStatusType">
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
@XmlType(name = "MaritalStatusType")
public class MaritalStatusType
    extends CodeNamePairType
{


}
