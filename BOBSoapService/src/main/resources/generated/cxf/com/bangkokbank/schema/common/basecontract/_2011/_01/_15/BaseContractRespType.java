
package com.bangkokbank.schema.common.basecontract._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bangkokbank.schema.common.exception._2011._01._15.BusinessExceptionsType;
import com.bangkokbank.schema.contract.creditcardblockflaginq._2011._01._15.CreditCardBlockFlagInqRespType;
import com.bangkokbank.schema.contract.customer.customerapplacctsummaryinq._2011._01._15.CustomerApplAcctSummaryInqRespType;
import com.bangkokbank.schema.contract.customer.customeridcarddetailinq._2011._01._15.CustomerIDCardDetailInqRespType;
import com.bangkokbank.schema.contract.customer.customerindiciacheckinq._2016._08._13.CustomerIndiciaCheckInqRespType;
import com.bangkokbank.schema.contract.customer.customerprofileadd._2011._01._15.CustomerProfileAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfoadd._2011._01._15.CustomerProfileAddressInfoAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfoinq._2011._01._15.CustomerProfileAddressInfoInqRespType;
import com.bangkokbank.schema.contract.customer.customerprofileaddressinfomod._2011._01._15.CustomerProfileAddressInfoModRespType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoadd._2011._01._15.CustomerProfileContactInfoAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfoinq._2011._01._15.CustomerProfileContactInfoInqRespType;
import com.bangkokbank.schema.contract.customer.customerprofilecontactinfomod._2011._01._15.CustomerProfileContactInfoModRespType;
import com.bangkokbank.schema.contract.customer.customerprofileeddmod._2011._01._15.CustomerProfileEDDModRespType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoadd._2011._01._15.CustomerProfileEmploymentInfoAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfodel._2011._01._15.CustomerProfileEmploymentInfoDelRespType;
import com.bangkokbank.schema.contract.customer.customerprofileemploymentinfoinq._2011._01._15.CustomerProfileEmploymentInfoInqRespType;
import com.bangkokbank.schema.contract.customer.customerprofileialmod._2011._01._15.CustomerProfileIALModRespType;
import com.bangkokbank.schema.contract.customer.customerprofilekycmod._2011._01._15.CustomerProfileKYCModRespType;
import com.bangkokbank.schema.contract.customer.customerprofilemod._2011._01._15.CustomerProfileModRespType;
import com.bangkokbank.schema.contract.customer.customerprofilereladd._2011._01._15.CustomerProfileRelAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofilereldel._2011._01._15.CustomerProfileRelDelRespType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoadd._2011._01._15.CustomerProfileShareHolderInfoAddRespType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfodel._2011._01._15.CustomerProfileShareHolderInfoDelRespType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfoinq._2011._01._15.CustomerProfileShareHolderInfoInqRespType;
import com.bangkokbank.schema.contract.customer.customerprofileshareholderinfomod._2011._01._15.CustomerProfileShareHolderInfoModRespType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesadd._2011._01._15.CustomerRelatedPartiesAddRespType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesdel._2011._01._15.CustomerRelatedPartiesDelRespType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartieskycmod._2011._01._15.CustomerRelatedPartiesKYCModRespType;
import com.bangkokbank.schema.contract.customer.customerrelatedpartiesmod._2011._01._15.CustomerRelatedPartiesModRespType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctadd._2011._01._15.CustomerSuspiciousAcctAddRespType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctdel._2011._01._15.CustomerSuspiciousAcctDelRespType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctinq._2011._01._15.CustomerSuspiciousAcctInqRespType;
import com.bangkokbank.schema.contract.customer.customersuspiciousacctmod._2011._01._15.CustomerSuspiciousAcctModRespType;
import com.bangkokbank.schema.contract.customer.fatcaindiciacheckop._2016._08._13.FATCAIndiciaCheckOpRespType;
import com.bangkokbank.schema.contract.customer.generatetempacctop._2011._01._15.GenerateTempAcctOpRespType;
import com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13.SearchFATCACaseRespType;
import com.bangkokbank.schema.contract.customeraccessibilityinq._2011._01._15.CustomerAccessibilityInqRespType;
import com.bangkokbank.schema.contract.customerdefaultinq._2011._01._15.CustomerDefaultInqRespType;
import com.bangkokbank.schema.contract.customerprofileinq._2011._01._15.CustomerProfileInqRespType;
import com.bangkokbank.schema.contract.customerrelatedpartiesinq._2011._01._15.CustomerRelatedPartiesInqRespType;
import com.bangkokbank.schema.contract.financialnewsinq._2011._01._15.FinancialNewsInqRespType;
import com.bangkokbank.schema.contract.searchblacklist._2011._01._15.SearchBlacklistRespType;
import com.bangkokbank.schema.contract.searchcustomer._2011._01._15.SearchCustomerRespType;


/**
 * 
 *           Basic Service Response Message Structure
 *     	
 * 
 * <p>Java class for BaseContractRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseContractRespType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BusinessExceptions" type="{http://www.bangkokbank.com/schema/common/Exception/2011/01/15}BusinessExceptionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseContractRespType", propOrder = {
    "isError",
    "businessExceptions"
})
@XmlSeeAlso({
    GenerateTempAcctOpRespType.class,
    CustomerProfileContactInfoAddRespType.class,
    CustomerProfileShareHolderInfoModRespType.class,
    CustomerAccessibilityInqRespType.class,
    CustomerRelatedPartiesDelRespType.class,
    CustomerIndiciaCheckInqRespType.class,
    CustomerProfileShareHolderInfoDelRespType.class,
    CreditCardBlockFlagInqRespType.class,
    CustomerProfileRelAddRespType.class,
    CustomerProfileEmploymentInfoAddRespType.class,
    CustomerIDCardDetailInqRespType.class,
    CustomerProfileShareHolderInfoInqRespType.class,
    CustomerProfileEmploymentInfoInqRespType.class,
    CustomerProfileAddressInfoAddRespType.class,
    SearchFATCACaseRespType.class,
    CustomerSuspiciousAcctInqRespType.class,
    SearchCustomerRespType.class,
    CustomerProfileContactInfoModRespType.class,
    FATCAIndiciaCheckOpRespType.class,
    FinancialNewsInqRespType.class,
    CustomerProfileEmploymentInfoDelRespType.class,
    CustomerProfileRelDelRespType.class,
    CustomerRelatedPartiesModRespType.class,
    CustomerProfileInqRespType.class,
    CustomerDefaultInqRespType.class,
    CustomerProfileEDDModRespType.class,
    CustomerSuspiciousAcctAddRespType.class,
    CustomerRelatedPartiesAddRespType.class,
    CustomerProfileAddRespType.class,
    CustomerProfileAddressInfoModRespType.class,
    CustomerSuspiciousAcctDelRespType.class,
    CustomerApplAcctSummaryInqRespType.class,
    CustomerRelatedPartiesInqRespType.class,
    CustomerProfileShareHolderInfoAddRespType.class,
    CustomerProfileKYCModRespType.class,
    CustomerProfileModRespType.class,
    SearchBlacklistRespType.class,
    CustomerSuspiciousAcctModRespType.class,
    CustomerProfileContactInfoInqRespType.class,
    CustomerProfileAddressInfoInqRespType.class,
    CustomerRelatedPartiesKYCModRespType.class,
    CustomerProfileIALModRespType.class
})
public class BaseContractRespType {

    @XmlElement(defaultValue = "false")
    protected boolean isError;
    @XmlElement(name = "BusinessExceptions")
    protected BusinessExceptionsType businessExceptions;

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the businessExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessExceptionsType }
     *     
     */
    public BusinessExceptionsType getBusinessExceptions() {
        return businessExceptions;
    }

    /**
     * Sets the value of the businessExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessExceptionsType }
     *     
     */
    public void setBusinessExceptions(BusinessExceptionsType value) {
        this.businessExceptions = value;
    }

}
