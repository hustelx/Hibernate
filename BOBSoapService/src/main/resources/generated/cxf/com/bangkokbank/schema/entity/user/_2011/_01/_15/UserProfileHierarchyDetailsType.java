
package com.bangkokbank.schema.entity.user._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserProfileHierarchyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserProfileHierarchyDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserProfileHierarchyDetail" type="{http://www.bangkokbank.com/schema/entity/User/2011/01/15}UserProfileHierarchyDetailType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserProfileHierarchyDetailsType", propOrder = {
    "userProfileHierarchyDetail"
})
public class UserProfileHierarchyDetailsType {

    @XmlElement(name = "UserProfileHierarchyDetail", required = true)
    protected List<UserProfileHierarchyDetailType> userProfileHierarchyDetail;

    /**
     * Gets the value of the userProfileHierarchyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userProfileHierarchyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserProfileHierarchyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserProfileHierarchyDetailType }
     * 
     * 
     */
    public List<UserProfileHierarchyDetailType> getUserProfileHierarchyDetail() {
        if (userProfileHierarchyDetail == null) {
            userProfileHierarchyDetail = new ArrayList<UserProfileHierarchyDetailType>();
        }
        return this.userProfileHierarchyDetail;
    }

}
