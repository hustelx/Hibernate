
package com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13 package. 
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

    private final static QName _SearchFATCACaseReq_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13", "SearchFATCACaseReq");
    private final static QName _SearchFATCACaseResp_QNAME = new QName("http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13", "SearchFATCACaseResp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.contract.customer.searchfatcacase._2016._08._13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchFATCACaseRespType }
     * 
     */
    public SearchFATCACaseRespType createSearchFATCACaseRespType() {
        return new SearchFATCACaseRespType();
    }

    /**
     * Create an instance of {@link SearchFATCACaseResultsType }
     * 
     */
    public SearchFATCACaseResultsType createSearchFATCACaseResultsType() {
        return new SearchFATCACaseResultsType();
    }

    /**
     * Create an instance of {@link SearchFATCACaseCriteriaType }
     * 
     */
    public SearchFATCACaseCriteriaType createSearchFATCACaseCriteriaType() {
        return new SearchFATCACaseCriteriaType();
    }

    /**
     * Create an instance of {@link SearchOptionType }
     * 
     */
    public SearchOptionType createSearchOptionType() {
        return new SearchOptionType();
    }

    /**
     * Create an instance of {@link SearchFATCACaseReqType }
     * 
     */
    public SearchFATCACaseReqType createSearchFATCACaseReqType() {
        return new SearchFATCACaseReqType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFATCACaseReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13", name = "SearchFATCACaseReq")
    public JAXBElement<SearchFATCACaseReqType> createSearchFATCACaseReq(SearchFATCACaseReqType value) {
        return new JAXBElement<SearchFATCACaseReqType>(_SearchFATCACaseReq_QNAME, SearchFATCACaseReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFATCACaseRespType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13", name = "SearchFATCACaseResp")
    public JAXBElement<SearchFATCACaseRespType> createSearchFATCACaseResp(SearchFATCACaseRespType value) {
        return new JAXBElement<SearchFATCACaseRespType>(_SearchFATCACaseResp_QNAME, SearchFATCACaseRespType.class, null, value);
    }

}
