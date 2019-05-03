
package com.bangkokbank.schema.entity.blacklist._2011._01._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsEntriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewsEntry" type="{http://www.bangkokbank.com/schema/entity/Blacklist/2011/01/15}NewsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsEntriesType", propOrder = {
    "newsEntry"
})
public class NewsEntriesType {

    @XmlElement(name = "NewsEntry")
    protected List<NewsEntryType> newsEntry;

    /**
     * Gets the value of the newsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsEntryType }
     * 
     * 
     */
    public List<NewsEntryType> getNewsEntry() {
        if (newsEntry == null) {
            newsEntry = new ArrayList<NewsEntryType>();
        }
        return this.newsEntry;
    }

}
