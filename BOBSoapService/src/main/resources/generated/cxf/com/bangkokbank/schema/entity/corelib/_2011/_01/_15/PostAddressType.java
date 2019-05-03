
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.contract.contractcorelib._2016._01._31.RMPostAddressType;


/**
 * <p>Java class for PostAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Road" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Village" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subdistrict" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}SubdistrictType" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}DistrictType" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}ProvinceType" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CountryType" minOccurs="0"/>
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLines" type="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AddressLines" minOccurs="0"/>
 *         &lt;element ref="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}AddressContactNumRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAddressType", propOrder = {
    "addressType",
    "addressNum",
    "street",
    "road",
    "group",
    "village",
    "subdistrict",
    "district",
    "province",
    "postCode",
    "country",
    "addressLine",
    "addressLines",
    "addressContactNumRef"
})
@XmlSeeAlso({
    RMPostAddressType.class
})
public class PostAddressType {

    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "AddressNum")
    protected String addressNum;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Road")
    protected String road;
    @XmlElement(name = "Group")
    protected String group;
    @XmlElement(name = "Village")
    protected String village;
    @XmlElement(name = "Subdistrict")
    protected SubdistrictType subdistrict;
    @XmlElement(name = "District")
    protected DistrictType district;
    @XmlElement(name = "Province")
    protected ProvinceType province;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "AddressLine")
    protected String addressLine;
    @XmlElement(name = "AddressLines")
    protected AddressLines addressLines;
    @XmlElement(name = "AddressContactNumRef", namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15")
    protected String addressContactNumRef;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNum() {
        return addressNum;
    }

    /**
     * Sets the value of the addressNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNum(String value) {
        this.addressNum = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the road property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoad() {
        return road;
    }

    /**
     * Sets the value of the road property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoad(String value) {
        this.road = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the village property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the value of the village property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVillage(String value) {
        this.village = value;
    }

    /**
     * Gets the value of the subdistrict property.
     * 
     * @return
     *     possible object is
     *     {@link SubdistrictType }
     *     
     */
    public SubdistrictType getSubdistrict() {
        return subdistrict;
    }

    /**
     * Sets the value of the subdistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubdistrictType }
     *     
     */
    public void setSubdistrict(SubdistrictType value) {
        this.subdistrict = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link DistrictType }
     *     
     */
    public DistrictType getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictType }
     *     
     */
    public void setDistrict(DistrictType value) {
        this.district = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link ProvinceType }
     *     
     */
    public ProvinceType getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvinceType }
     *     
     */
    public void setProvince(ProvinceType value) {
        this.province = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Sets the value of the addressLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    /**
     * Gets the value of the addressLines property.
     * 
     * @return
     *     possible object is
     *     {@link AddressLines }
     *     
     */
    public AddressLines getAddressLines() {
        return addressLines;
    }

    /**
     * Sets the value of the addressLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressLines }
     *     
     */
    public void setAddressLines(AddressLines value) {
        this.addressLines = value;
    }

    /**
     * This is used to refer to a contact number, if it is
     * 						available. This must be aligned with the ContactNumberType
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressContactNumRef() {
        return addressContactNumRef;
    }

    /**
     * Sets the value of the addressContactNumRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressContactNumRef(String value) {
        this.addressContactNumRef = value;
    }

}
