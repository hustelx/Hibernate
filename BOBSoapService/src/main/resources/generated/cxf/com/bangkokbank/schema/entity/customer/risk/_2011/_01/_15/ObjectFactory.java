
package com.bangkokbank.schema.entity.customer.risk._2011._01._15;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.bangkokbank.schema.entity.corelib._2011._01._15.CodeDescType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.entity.customer.risk._2011._01._15 package. 
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

    private final static QName _CustomerKYCUpdateInfos_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "CustomerKYCUpdateInfos");
    private final static QName _EntitySelfCertification_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "EntitySelfCertification");
    private final static QName _FATCAReportableClassification_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "FATCAReportableClassification");
    private final static QName _FATCAFinalClassification_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "FATCAFinalClassification");
    private final static QName _FATCAOnlineFlags_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "FATCAOnlineFlags");
    private final static QName _ContaminationRisks_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "ContaminationRisks");
    private final static QName _FATCACuringForms_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "FATCACuringForms");
    private final static QName _FATCACaseInfo_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "FATCACaseInfo");
    private final static QName _AMLSanctionInfos_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "AMLSanctionInfos");
    private final static QName _RiskOccupations_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "RiskOccupations");
    private final static QName _EarningFromCountries_QNAME = new QName("http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", "EarningFromCountries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.entity.customer.risk._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerKYCDetailsType }
     * 
     */
    public CustomerKYCDetailsType createCustomerKYCDetailsType() {
        return new CustomerKYCDetailsType();
    }

    /**
     * Create an instance of {@link ForeignBankCountriesType }
     * 
     */
    public ForeignBankCountriesType createForeignBankCountriesType() {
        return new ForeignBankCountriesType();
    }

    /**
     * Create an instance of {@link IndiciaMessageType }
     * 
     */
    public IndiciaMessageType createIndiciaMessageType() {
        return new IndiciaMessageType();
    }

    /**
     * Create an instance of {@link CustomerRiskRatingType }
     * 
     */
    public CustomerRiskRatingType createCustomerRiskRatingType() {
        return new CustomerRiskRatingType();
    }

    /**
     * Create an instance of {@link AMLRiskResultsType }
     * 
     */
    public AMLRiskResultsType createAMLRiskResultsType() {
        return new AMLRiskResultsType();
    }

    /**
     * Create an instance of {@link EDDPartAType }
     * 
     */
    public EDDPartAType createEDDPartAType() {
        return new EDDPartAType();
    }

    /**
     * Create an instance of {@link CreditCardDefaultInfosType }
     * 
     */
    public CreditCardDefaultInfosType createCreditCardDefaultInfosType() {
        return new CreditCardDefaultInfosType();
    }

    /**
     * Create an instance of {@link FATCACuringFormsRequiredType }
     * 
     */
    public FATCACuringFormsRequiredType createFATCACuringFormsRequiredType() {
        return new FATCACuringFormsRequiredType();
    }

    /**
     * Create an instance of {@link FATCACuringFormRequiredType }
     * 
     */
    public FATCACuringFormRequiredType createFATCACuringFormRequiredType() {
        return new FATCACuringFormRequiredType();
    }

    /**
     * Create an instance of {@link RiskHitType }
     * 
     */
    public RiskHitType createRiskHitType() {
        return new RiskHitType();
    }

    /**
     * Create an instance of {@link CustomerKYCDetailType }
     * 
     */
    public CustomerKYCDetailType createCustomerKYCDetailType() {
        return new CustomerKYCDetailType();
    }

    /**
     * Create an instance of {@link AMLContaminationRisksType }
     * 
     */
    public AMLContaminationRisksType createAMLContaminationRisksType() {
        return new AMLContaminationRisksType();
    }

    /**
     * Create an instance of {@link FATCAOnlineFlagsType }
     * 
     */
    public FATCAOnlineFlagsType createFATCAOnlineFlagsType() {
        return new FATCAOnlineFlagsType();
    }

    /**
     * Create an instance of {@link RiskRatingFilteringType }
     * 
     */
    public RiskRatingFilteringType createRiskRatingFilteringType() {
        return new RiskRatingFilteringType();
    }

    /**
     * Create an instance of {@link PEPInfoType }
     * 
     */
    public PEPInfoType createPEPInfoType() {
        return new PEPInfoType();
    }

    /**
     * Create an instance of {@link AMLRiskResultType }
     * 
     */
    public AMLRiskResultType createAMLRiskResultType() {
        return new AMLRiskResultType();
    }

    /**
     * Create an instance of {@link CustomerEnhancedDueDiligenceInfoType }
     * 
     */
    public CustomerEnhancedDueDiligenceInfoType createCustomerEnhancedDueDiligenceInfoType() {
        return new CustomerEnhancedDueDiligenceInfoType();
    }

    /**
     * Create an instance of {@link FATCAOnlineFlagType }
     * 
     */
    public FATCAOnlineFlagType createFATCAOnlineFlagType() {
        return new FATCAOnlineFlagType();
    }

    /**
     * Create an instance of {@link CustomerEnhancedDueDiligenceInfosType }
     * 
     */
    public CustomerEnhancedDueDiligenceInfosType createCustomerEnhancedDueDiligenceInfosType() {
        return new CustomerEnhancedDueDiligenceInfosType();
    }

    /**
     * Create an instance of {@link CustomerEnhancedDueDiligenceDetailType }
     * 
     */
    public CustomerEnhancedDueDiligenceDetailType createCustomerEnhancedDueDiligenceDetailType() {
        return new CustomerEnhancedDueDiligenceDetailType();
    }

    /**
     * Create an instance of {@link AMLSanctionInfosType }
     * 
     */
    public AMLSanctionInfosType createAMLSanctionInfosType() {
        return new AMLSanctionInfosType();
    }

    /**
     * Create an instance of {@link BlackListRequestType }
     * 
     */
    public BlackListRequestType createBlackListRequestType() {
        return new BlackListRequestType();
    }

    /**
     * Create an instance of {@link CreditBureauRequestType }
     * 
     */
    public CreditBureauRequestType createCreditBureauRequestType() {
        return new CreditBureauRequestType();
    }

    /**
     * Create an instance of {@link CustomerKYCUpdateInfoType }
     * 
     */
    public CustomerKYCUpdateInfoType createCustomerKYCUpdateInfoType() {
        return new CustomerKYCUpdateInfoType();
    }

    /**
     * Create an instance of {@link RiskHitsType }
     * 
     */
    public RiskHitsType createRiskHitsType() {
        return new RiskHitsType();
    }

    /**
     * Create an instance of {@link FATCAIndiciaCheckFlagsType }
     * 
     */
    public FATCAIndiciaCheckFlagsType createFATCAIndiciaCheckFlagsType() {
        return new FATCAIndiciaCheckFlagsType();
    }

    /**
     * Create an instance of {@link AMLSanctionInfoType }
     * 
     */
    public AMLSanctionInfoType createAMLSanctionInfoType() {
        return new AMLSanctionInfoType();
    }

    /**
     * Create an instance of {@link FATCACaseInfoType }
     * 
     */
    public FATCACaseInfoType createFATCACaseInfoType() {
        return new FATCACaseInfoType();
    }

    /**
     * Create an instance of {@link CustomerKYCUpdateInfosType }
     * 
     */
    public CustomerKYCUpdateInfosType createCustomerKYCUpdateInfosType() {
        return new CustomerKYCUpdateInfosType();
    }

    /**
     * Create an instance of {@link ShareHolderKYCDetailsType }
     * 
     */
    public ShareHolderKYCDetailsType createShareHolderKYCDetailsType() {
        return new ShareHolderKYCDetailsType();
    }

    /**
     * Create an instance of {@link CustomerDefaultInfoType }
     * 
     */
    public CustomerDefaultInfoType createCustomerDefaultInfoType() {
        return new CustomerDefaultInfoType();
    }

    /**
     * Create an instance of {@link AMLProductGroupsType }
     * 
     */
    public AMLProductGroupsType createAMLProductGroupsType() {
        return new AMLProductGroupsType();
    }

    /**
     * Create an instance of {@link EDDPartBType }
     * 
     */
    public EDDPartBType createEDDPartBType() {
        return new EDDPartBType();
    }

    /**
     * Create an instance of {@link FATCACaseDetailType }
     * 
     */
    public FATCACaseDetailType createFATCACaseDetailType() {
        return new FATCACaseDetailType();
    }

    /**
     * Create an instance of {@link EarningFromCountriesType }
     * 
     */
    public EarningFromCountriesType createEarningFromCountriesType() {
        return new EarningFromCountriesType();
    }

    /**
     * Create an instance of {@link ShareHolderKYCDetailType }
     * 
     */
    public ShareHolderKYCDetailType createShareHolderKYCDetailType() {
        return new ShareHolderKYCDetailType();
    }

    /**
     * Create an instance of {@link AMLContaminationCheckType }
     * 
     */
    public AMLContaminationCheckType createAMLContaminationCheckType() {
        return new AMLContaminationCheckType();
    }

    /**
     * Create an instance of {@link KYCRequestType }
     * 
     */
    public KYCRequestType createKYCRequestType() {
        return new KYCRequestType();
    }

    /**
     * Create an instance of {@link CustomerRiskRatingsType }
     * 
     */
    public CustomerRiskRatingsType createCustomerRiskRatingsType() {
        return new CustomerRiskRatingsType();
    }

    /**
     * Create an instance of {@link AMLContaminationRiskType }
     * 
     */
    public AMLContaminationRiskType createAMLContaminationRiskType() {
        return new AMLContaminationRiskType();
    }

    /**
     * Create an instance of {@link RiskOccupationsType }
     * 
     */
    public RiskOccupationsType createRiskOccupationsType() {
        return new RiskOccupationsType();
    }

    /**
     * Create an instance of {@link IndiciaRefsType }
     * 
     */
    public IndiciaRefsType createIndiciaRefsType() {
        return new IndiciaRefsType();
    }

    /**
     * Create an instance of {@link CustomerEnhancedDueDiligenceDetailsType }
     * 
     */
    public CustomerEnhancedDueDiligenceDetailsType createCustomerEnhancedDueDiligenceDetailsType() {
        return new CustomerEnhancedDueDiligenceDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerKYCUpdateInfosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "CustomerKYCUpdateInfos")
    public JAXBElement<CustomerKYCUpdateInfosType> createCustomerKYCUpdateInfos(CustomerKYCUpdateInfosType value) {
        return new JAXBElement<CustomerKYCUpdateInfosType>(_CustomerKYCUpdateInfos_QNAME, CustomerKYCUpdateInfosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "EntitySelfCertification")
    public JAXBElement<CodeDescType> createEntitySelfCertification(CodeDescType value) {
        return new JAXBElement<CodeDescType>(_EntitySelfCertification_QNAME, CodeDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "FATCAReportableClassification")
    public JAXBElement<CodeDescType> createFATCAReportableClassification(CodeDescType value) {
        return new JAXBElement<CodeDescType>(_FATCAReportableClassification_QNAME, CodeDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "FATCAFinalClassification")
    public JAXBElement<CodeDescType> createFATCAFinalClassification(CodeDescType value) {
        return new JAXBElement<CodeDescType>(_FATCAFinalClassification_QNAME, CodeDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FATCAOnlineFlagsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "FATCAOnlineFlags")
    public JAXBElement<FATCAOnlineFlagsType> createFATCAOnlineFlags(FATCAOnlineFlagsType value) {
        return new JAXBElement<FATCAOnlineFlagsType>(_FATCAOnlineFlags_QNAME, FATCAOnlineFlagsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AMLContaminationRisksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "ContaminationRisks")
    public JAXBElement<AMLContaminationRisksType> createContaminationRisks(AMLContaminationRisksType value) {
        return new JAXBElement<AMLContaminationRisksType>(_ContaminationRisks_QNAME, AMLContaminationRisksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FATCACuringFormsRequiredType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "FATCACuringForms")
    public JAXBElement<FATCACuringFormsRequiredType> createFATCACuringForms(FATCACuringFormsRequiredType value) {
        return new JAXBElement<FATCACuringFormsRequiredType>(_FATCACuringForms_QNAME, FATCACuringFormsRequiredType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FATCACaseInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "FATCACaseInfo")
    public JAXBElement<FATCACaseInfoType> createFATCACaseInfo(FATCACaseInfoType value) {
        return new JAXBElement<FATCACaseInfoType>(_FATCACaseInfo_QNAME, FATCACaseInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AMLSanctionInfosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "AMLSanctionInfos")
    public JAXBElement<AMLSanctionInfosType> createAMLSanctionInfos(AMLSanctionInfosType value) {
        return new JAXBElement<AMLSanctionInfosType>(_AMLSanctionInfos_QNAME, AMLSanctionInfosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RiskOccupationsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "RiskOccupations")
    public JAXBElement<RiskOccupationsType> createRiskOccupations(RiskOccupationsType value) {
        return new JAXBElement<RiskOccupationsType>(_RiskOccupations_QNAME, RiskOccupationsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EarningFromCountriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/Customer/Risk/2011/01/15", name = "EarningFromCountries")
    public JAXBElement<EarningFromCountriesType> createEarningFromCountries(EarningFromCountriesType value) {
        return new JAXBElement<EarningFromCountriesType>(_EarningFromCountries_QNAME, EarningFromCountriesType.class, null, value);
    }

}
