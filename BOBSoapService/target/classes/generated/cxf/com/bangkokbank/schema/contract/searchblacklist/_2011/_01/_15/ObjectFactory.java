
package com.bangkokbank.schema.contract.searchblacklist._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.searchblacklist._2011._01._15 package. 
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

    private final static QName _SearchBlacklistResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", "SearchBlacklistResp");
    private final static QName _SearchBlacklistReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", "SearchBlacklistReq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.searchblacklist._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails }
     * 
     */
    public SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails createSearchBlacklistRespTypeSearchBlacklistResultsCustomerDetails() {
        return new SearchBlacklistRespType.SearchBlacklistResults.CustomerDetails();
    }

    /**
     * Create an instance of {@link SearchBlacklistRespType }
     * 
     */
    public SearchBlacklistRespType createSearchBlacklistRespType() {
        return new SearchBlacklistRespType();
    }

    /**
     * Create an instance of {@link SearchBlacklistReqType }
     * 
     */
    public SearchBlacklistReqType createSearchBlacklistReqType() {
        return new SearchBlacklistReqType();
    }

    /**
     * Create an instance of {@link SearchBlacklistRespType.SearchBlacklistResults }
     * 
     */
    public SearchBlacklistRespType.SearchBlacklistResults createSearchBlacklistRespTypeSearchBlacklistResults() {
        return new SearchBlacklistRespType.SearchBlacklistResults();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBlacklistRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", name = "SearchBlacklistResp")
    public JAXBElement<SearchBlacklistRespType> createSearchBlacklistResp(SearchBlacklistRespType value) {
        return new JAXBElement<SearchBlacklistRespType>(_SearchBlacklistResp_QNAME, SearchBlacklistRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBlacklistReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15", name = "SearchBlacklistReq")
    public JAXBElement<SearchBlacklistReqType> createSearchBlacklistReq(SearchBlacklistReqType value) {
        return new JAXBElement<SearchBlacklistReqType>(_SearchBlacklistReq_QNAME, SearchBlacklistReqType.class, null, value);
    }

}
