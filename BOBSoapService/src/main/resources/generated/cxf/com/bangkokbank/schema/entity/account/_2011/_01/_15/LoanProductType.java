
package com.bangkokbank.schema.entity.account._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeNamePairType;


/**
 *  For Code attribte: The possible value is
 * 				TERC,TERL,ENGC,ENGL,SYNC,SYNL,SMEC ,LGBB,LGPB,LGMN,LGMS , etc For Name attribute:
 * 				Possible value is Term Credit Line ,Term Loan,Energy Reserve Credit Line,Energy
 * 				Reserve Loan,Synicated Credit Line , etc 
 * 
 * <p>Java class for LoanProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanProductType">
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
@XmlType(name = "LoanProductType")
public class LoanProductType
    extends CodeNamePairType
{


}
