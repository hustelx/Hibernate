
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.customer.risk._2011._01._15.IndiciaMessageType;


/**
 * <p>Java class for CodeDescMsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeDescMsgType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType">
 *       &lt;sequence>
 *         &lt;element name="Msg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeDescMsgType", propOrder = {
    "msg"
})
@XmlSeeAlso({
    IndiciaMessageType.class
})
public class CodeDescMsgType
    extends CodeDescType
{

    @XmlElement(name = "Msg", required = true)
    protected String msg;

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

}
