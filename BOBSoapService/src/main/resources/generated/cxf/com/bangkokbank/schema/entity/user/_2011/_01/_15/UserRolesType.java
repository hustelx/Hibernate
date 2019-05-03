
package com.bangkokbank.schema.entity.user._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;


/**
 * <p>Java class for UserRolesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRolesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserRole" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeDescType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRolesType", propOrder = {
    "userRole"
})
public class UserRolesType {

    @XmlElement(name = "UserRole", required = true)
    protected List<CodeDescType> userRole;

    /**
     * Gets the value of the userRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeDescType }
     * 
     * 
     */
    public List<CodeDescType> getUserRole() {
        if (userRole == null) {
            userRole = new ArrayList<CodeDescType>();
        }
        return this.userRole;
    }

}
