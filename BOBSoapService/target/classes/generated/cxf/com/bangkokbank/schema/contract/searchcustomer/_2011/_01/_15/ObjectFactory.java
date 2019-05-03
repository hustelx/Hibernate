
package com.bangkokbank.schema.contract.searchcustomer._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.searchcustomer._2011._01._15 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchCustomerReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15", "SearchCustomerReq");
    private final static QName _SearchCustomerResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15", "SearchCustomerResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.searchcustomer._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchCustomerRespType.SearchCustomerResults.CustomerRecords }
     * 
     */
    public SearchCustomerRespType.SearchCustomerResults.CustomerRecords createSearchCustomerRespTypeSearchCustomerResultsCustomerRecords() {
        return new SearchCustomerRespType.SearchCustomerResults.CustomerRecords();
    }

    /**
     * Create an instance of {@link SearchCustomerRespType.SearchCustomerResults }
     * 
     */
    public SearchCustomerRespType.SearchCustomerResults createSearchCustomerRespTypeSearchCustomerResults() {
        return new SearchCustomerRespType.SearchCustomerResults();
    }

    /**
     * Create an instance of {@link SearchCustomerRespType }
     * 
     */
    public SearchCustomerRespType createSearchCustomerRespType() {
        return new SearchCustomerRespType();
    }

    /**
     * Create an instance of {@link SearchCustomerReqType }
     * 
     */
    public SearchCustomerReqType createSearchCustomerReqType() {
        return new SearchCustomerReqType();
    }

    /**
     * Create an instance of {@link SearchCustomerReqType.SearchCustomerCriteria }
     * 
     */
    public SearchCustomerReqType.SearchCustomerCriteria createSearchCustomerReqTypeSearchCustomerCriteria() {
        return new SearchCustomerReqType.SearchCustomerCriteria();
    }

    /**
     * Create an instance of {@link SearchOptionType }
     * 
     */
    public SearchOptionType createSearchOptionType() {
        return new SearchOptionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCustomerReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15", name = "SearchCustomerReq")
    public JAXBElement<SearchCustomerReqType> createSearchCustomerReq(SearchCustomerReqType value) {
        return new JAXBElement<SearchCustomerReqType>(_SearchCustomerReq_QNAME, SearchCustomerReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCustomerRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15", name = "SearchCustomerResp")
    public JAXBElement<SearchCustomerRespType> createSearchCustomerResp(SearchCustomerRespType value) {
        return new JAXBElement<SearchCustomerRespType>(_SearchCustomerResp_QNAME, SearchCustomerRespType.class, null, value);
    }

}
