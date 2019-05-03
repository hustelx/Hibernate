
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bangkokbank.schema.entity.corelib._2011._01._15 package. 
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

    private final static QName _AddressContactNumRef_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AddressContactNumRef");
    private final static QName _AnyIDRegNum_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AnyIDRegNum");
    private final static QName _AppAcctRef_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AppAcctRef");
    private final static QName _ChequeStatus_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "ChequeStatus");
    private final static QName _SourceOfFund_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "SourceOfFund");
    private final static QName _AdditionalInfos_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AdditionalInfos");
    private final static QName _StateToken_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "stateToken");
    private final static QName _OTPRequestInfo_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "OTPRequestInfo");
    private final static QName _AdditionalInfosV2_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AdditionalInfosV2");
    private final static QName _OTPVerifyInfo_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "OTPVerifyInfo");
    private final static QName _MsgLines_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "MsgLines");
    private final static QName _ChequePaymentInfo_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "ChequePaymentInfo");
    private final static QName _NextKey_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "nextKey");
    private final static QName _PIN_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "PIN");
    private final static QName _SignatureTransferPaperRef_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "SignatureTransferPaperRef");
    private final static QName _CaseID_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "CaseID");
    private final static QName _ChequeReturnInfo_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "ChequeReturnInfo");
    private final static QName _TransDateTime_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "TransDateTime");
    private final static QName _PassbookNum_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "PassbookNum");
    private final static QName _AccountOpeningObjective_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AccountOpeningObjective");
    private final static QName _AnyIDNum_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "AnyIDNum");
    private final static QName _P2PTokenType_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "P2PTokenType");
    private final static QName _P2PTokenNum_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "P2PTokenNum");
    private final static QName _CcyType_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "CcyType");
    private final static QName _MaxNumOfTrans_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "maxNumOfTrans");
    private final static QName _WarningMsgType_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "WarningMsgType");
    private final static QName _OTPTokenNum_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "OTPTokenNum");
    private final static QName _ChequeClearingType_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "ChequeClearingType");
    private final static QName _AppSysID_QNAME = new QName("http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", "appSysID");
    private final static QName _SpareTypeField_QNAME = new QName("", "Field");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bangkokbank.schema.entity.corelib._2011._01._15
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChequeInventoryType }
     * 
     */
    public ChequeInventoryType createChequeInventoryType() {
        return new ChequeInventoryType();
    }

    /**
     * Create an instance of {@link FieldValidationType }
     * 
     */
    public FieldValidationType createFieldValidationType() {
        return new FieldValidationType();
    }

    /**
     * Create an instance of {@link CurrencyCodeNameType }
     * 
     */
    public CurrencyCodeNameType createCurrencyCodeNameType() {
        return new CurrencyCodeNameType();
    }

    /**
     * Create an instance of {@link SubdistrictType }
     * 
     */
    public SubdistrictType createSubdistrictType() {
        return new SubdistrictType();
    }

    /**
     * Create an instance of {@link AreaSizesType }
     * 
     */
    public AreaSizesType createAreaSizesType() {
        return new AreaSizesType();
    }

    /**
     * Create an instance of {@link PostAddressesType }
     * 
     */
    public PostAddressesType createPostAddressesType() {
        return new PostAddressesType();
    }

    /**
     * Create an instance of {@link PostAddressType }
     * 
     */
    public PostAddressType createPostAddressType() {
        return new PostAddressType();
    }

    /**
     * Create an instance of {@link ProvinceType }
     * 
     */
    public ProvinceType createProvinceType() {
        return new ProvinceType();
    }

    /**
     * Create an instance of {@link EmailContactInfoType }
     * 
     */
    public EmailContactInfoType createEmailContactInfoType() {
        return new EmailContactInfoType();
    }

    /**
     * Create an instance of {@link FlagsType }
     * 
     */
    public FlagsType createFlagsType() {
        return new FlagsType();
    }

    /**
     * Create an instance of {@link CodeDescType }
     * 
     */
    public CodeDescType createCodeDescType() {
        return new CodeDescType();
    }

    /**
     * Create an instance of {@link EmailContactInfosType }
     * 
     */
    public EmailContactInfosType createEmailContactInfosType() {
        return new EmailContactInfosType();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link BooleanFlagsType }
     * 
     */
    public BooleanFlagsType createBooleanFlagsType() {
        return new BooleanFlagsType();
    }

    /**
     * Create an instance of {@link SourceOfFundType }
     * 
     */
    public SourceOfFundType createSourceOfFundType() {
        return new SourceOfFundType();
    }

    /**
     * Create an instance of {@link HolidayDateInfosType }
     * 
     */
    public HolidayDateInfosType createHolidayDateInfosType() {
        return new HolidayDateInfosType();
    }

    /**
     * Create an instance of {@link ChequeReceiveInfoType }
     * 
     */
    public ChequeReceiveInfoType createChequeReceiveInfoType() {
        return new ChequeReceiveInfoType();
    }

    /**
     * Create an instance of {@link AgeType }
     * 
     */
    public AgeType createAgeType() {
        return new AgeType();
    }

    /**
     * Create an instance of {@link MsgLinesType }
     * 
     */
    public MsgLinesType createMsgLinesType() {
        return new MsgLinesType();
    }

    /**
     * Create an instance of {@link AdditionalInfosType }
     * 
     */
    public AdditionalInfosType createAdditionalInfosType() {
        return new AdditionalInfosType();
    }

    /**
     * Create an instance of {@link CodeNamePairType }
     * 
     */
    public CodeNamePairType createCodeNamePairType() {
        return new CodeNamePairType();
    }

    /**
     * Create an instance of {@link SpareType }
     * 
     */
    public SpareType createSpareType() {
        return new SpareType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link AccountOpeningObjectiveType }
     * 
     */
    public AccountOpeningObjectiveType createAccountOpeningObjectiveType() {
        return new AccountOpeningObjectiveType();
    }

    /**
     * Create an instance of {@link ChequeReturnInfoType }
     * 
     */
    public ChequeReturnInfoType createChequeReturnInfoType() {
        return new ChequeReturnInfoType();
    }

    /**
     * Create an instance of {@link MsgContentType }
     * 
     */
    public MsgContentType createMsgContentType() {
        return new MsgContentType();
    }

    /**
     * Create an instance of {@link ContactNumsType }
     * 
     */
    public ContactNumsType createContactNumsType() {
        return new ContactNumsType();
    }

    /**
     * Create an instance of {@link LangElementType }
     * 
     */
    public LangElementType createLangElementType() {
        return new LangElementType();
    }

    /**
     * Create an instance of {@link OTPRequestInfoType }
     * 
     */
    public OTPRequestInfoType createOTPRequestInfoType() {
        return new OTPRequestInfoType();
    }

    /**
     * Create an instance of {@link AreaSizeType }
     * 
     */
    public AreaSizeType createAreaSizeType() {
        return new AreaSizeType();
    }

    /**
     * Create an instance of {@link LangElementsType }
     * 
     */
    public LangElementsType createLangElementsType() {
        return new LangElementsType();
    }

    /**
     * Create an instance of {@link TrackingInfoType }
     * 
     */
    public TrackingInfoType createTrackingInfoType() {
        return new TrackingInfoType();
    }

    /**
     * Create an instance of {@link CurrencyCodesType }
     * 
     */
    public CurrencyCodesType createCurrencyCodesType() {
        return new CurrencyCodesType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link AddressLines }
     * 
     */
    public AddressLines createAddressLines() {
        return new AddressLines();
    }

    /**
     * Create an instance of {@link StateTokenType }
     * 
     */
    public StateTokenType createStateTokenType() {
        return new StateTokenType();
    }

    /**
     * Create an instance of {@link HolidayDateInfoType }
     * 
     */
    public HolidayDateInfoType createHolidayDateInfoType() {
        return new HolidayDateInfoType();
    }

    /**
     * Create an instance of {@link RateTierType }
     * 
     */
    public RateTierType createRateTierType() {
        return new RateTierType();
    }

    /**
     * Create an instance of {@link NameCurrAmtType }
     * 
     */
    public NameCurrAmtType createNameCurrAmtType() {
        return new NameCurrAmtType();
    }

    /**
     * Create an instance of {@link ReferencesType }
     * 
     */
    public ReferencesType createReferencesType() {
        return new ReferencesType();
    }

    /**
     * Create an instance of {@link OTPVerifyInfoType }
     * 
     */
    public OTPVerifyInfoType createOTPVerifyInfoType() {
        return new OTPVerifyInfoType();
    }

    /**
     * Create an instance of {@link NameValueV2Type }
     * 
     */
    public NameValueV2Type createNameValueV2Type() {
        return new NameValueV2Type();
    }

    /**
     * Create an instance of {@link InfosType }
     * 
     */
    public InfosType createInfosType() {
        return new InfosType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link DisplayStrType }
     * 
     */
    public DisplayStrType createDisplayStrType() {
        return new DisplayStrType();
    }

    /**
     * Create an instance of {@link PeriodsType }
     * 
     */
    public PeriodsType createPeriodsType() {
        return new PeriodsType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link ContactNumType }
     * 
     */
    public ContactNumType createContactNumType() {
        return new ContactNumType();
    }

    /**
     * Create an instance of {@link PassbookInfoType }
     * 
     */
    public PassbookInfoType createPassbookInfoType() {
        return new PassbookInfoType();
    }

    /**
     * Create an instance of {@link XMLFreeFormatType }
     * 
     */
    public XMLFreeFormatType createXMLFreeFormatType() {
        return new XMLFreeFormatType();
    }

    /**
     * Create an instance of {@link DatesType }
     * 
     */
    public DatesType createDatesType() {
        return new DatesType();
    }

    /**
     * Create an instance of {@link BusinessTypeType }
     * 
     */
    public BusinessTypeType createBusinessTypeType() {
        return new BusinessTypeType();
    }

    /**
     * Create an instance of {@link CurrAmtType }
     * 
     */
    public CurrAmtType createCurrAmtType() {
        return new CurrAmtType();
    }

    /**
     * Create an instance of {@link CustomerStatusType }
     * 
     */
    public CustomerStatusType createCustomerStatusType() {
        return new CustomerStatusType();
    }

    /**
     * Create an instance of {@link RemarksType }
     * 
     */
    public RemarksType createRemarksType() {
        return new RemarksType();
    }

    /**
     * Create an instance of {@link FlagType }
     * 
     */
    public FlagType createFlagType() {
        return new FlagType();
    }

    /**
     * Create an instance of {@link ChequeInventoriesType }
     * 
     */
    public ChequeInventoriesType createChequeInventoriesType() {
        return new ChequeInventoriesType();
    }

    /**
     * Create an instance of {@link ChequePaymentInfoType }
     * 
     */
    public ChequePaymentInfoType createChequePaymentInfoType() {
        return new ChequePaymentInfoType();
    }

    /**
     * Create an instance of {@link DescLinesType }
     * 
     */
    public DescLinesType createDescLinesType() {
        return new DescLinesType();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link FromToType }
     * 
     */
    public FromToType createFromToType() {
        return new FromToType();
    }

    /**
     * Create an instance of {@link DistrictType }
     * 
     */
    public DistrictType createDistrictType() {
        return new DistrictType();
    }

    /**
     * Create an instance of {@link ChequeProcessingStatusType }
     * 
     */
    public ChequeProcessingStatusType createChequeProcessingStatusType() {
        return new ChequeProcessingStatusType();
    }

    /**
     * Create an instance of {@link RateTiersType }
     * 
     */
    public RateTiersType createRateTiersType() {
        return new RateTiersType();
    }

    /**
     * Create an instance of {@link NameValueType }
     * 
     */
    public NameValueType createNameValueType() {
        return new NameValueType();
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link AdditionalInfosV2Type }
     * 
     */
    public AdditionalInfosV2Type createAdditionalInfosV2Type() {
        return new AdditionalInfosV2Type();
    }

    /**
     * Create an instance of {@link SubBusinessTypeType }
     * 
     */
    public SubBusinessTypeType createSubBusinessTypeType() {
        return new SubBusinessTypeType();
    }

    /**
     * Create an instance of {@link TransactionEntryRefType }
     * 
     */
    public TransactionEntryRefType createTransactionEntryRefType() {
        return new TransactionEntryRefType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link MiscType }
     * 
     */
    public MiscType createMiscType() {
        return new MiscType();
    }

    /**
     * Create an instance of {@link ChequeProcessingStatusesType }
     * 
     */
    public ChequeProcessingStatusesType createChequeProcessingStatusesType() {
        return new ChequeProcessingStatusesType();
    }

    /**
     * Create an instance of {@link FeeCollectionFrequencyType }
     * 
     */
    public FeeCollectionFrequencyType createFeeCollectionFrequencyType() {
        return new FeeCollectionFrequencyType();
    }

    /**
     * Create an instance of {@link NameCurrAmtsType }
     * 
     */
    public NameCurrAmtsType createNameCurrAmtsType() {
        return new NameCurrAmtsType();
    }

    /**
     * Create an instance of {@link NameLineType }
     * 
     */
    public NameLineType createNameLineType() {
        return new NameLineType();
    }

    /**
     * Create an instance of {@link CodeDescMsgType }
     * 
     */
    public CodeDescMsgType createCodeDescMsgType() {
        return new CodeDescMsgType();
    }

    /**
     * Create an instance of {@link StatusesType }
     * 
     */
    public StatusesType createStatusesType() {
        return new StatusesType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link AppAcctRefType }
     * 
     */
    public AppAcctRefType createAppAcctRefType() {
        return new AppAcctRefType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AddressContactNumRef")
    public JAXBElement<String> createAddressContactNumRef(String value) {
        return new JAXBElement<String>(_AddressContactNumRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AnyIDRegNum")
    public JAXBElement<String> createAnyIDRegNum(String value) {
        return new JAXBElement<String>(_AnyIDRegNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppAcctRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AppAcctRef")
    public JAXBElement<AppAcctRefType> createAppAcctRef(AppAcctRefType value) {
        return new JAXBElement<AppAcctRefType>(_AppAcctRef_QNAME, AppAcctRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "ChequeStatus")
    public JAXBElement<String> createChequeStatus(String value) {
        return new JAXBElement<String>(_ChequeStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceOfFundType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "SourceOfFund")
    public JAXBElement<SourceOfFundType> createSourceOfFund(SourceOfFundType value) {
        return new JAXBElement<SourceOfFundType>(_SourceOfFund_QNAME, SourceOfFundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInfosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AdditionalInfos")
    public JAXBElement<AdditionalInfosType> createAdditionalInfos(AdditionalInfosType value) {
        return new JAXBElement<AdditionalInfosType>(_AdditionalInfos_QNAME, AdditionalInfosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "stateToken")
    public JAXBElement<StateTokenType> createStateToken(StateTokenType value) {
        return new JAXBElement<StateTokenType>(_StateToken_QNAME, StateTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTPRequestInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "OTPRequestInfo")
    public JAXBElement<OTPRequestInfoType> createOTPRequestInfo(OTPRequestInfoType value) {
        return new JAXBElement<OTPRequestInfoType>(_OTPRequestInfo_QNAME, OTPRequestInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInfosV2Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AdditionalInfosV2")
    public JAXBElement<AdditionalInfosV2Type> createAdditionalInfosV2(AdditionalInfosV2Type value) {
        return new JAXBElement<AdditionalInfosV2Type>(_AdditionalInfosV2_QNAME, AdditionalInfosV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OTPVerifyInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "OTPVerifyInfo")
    public JAXBElement<OTPVerifyInfoType> createOTPVerifyInfo(OTPVerifyInfoType value) {
        return new JAXBElement<OTPVerifyInfoType>(_OTPVerifyInfo_QNAME, OTPVerifyInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgLinesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "MsgLines")
    public JAXBElement<MsgLinesType> createMsgLines(MsgLinesType value) {
        return new JAXBElement<MsgLinesType>(_MsgLines_QNAME, MsgLinesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChequePaymentInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "ChequePaymentInfo")
    public JAXBElement<ChequePaymentInfoType> createChequePaymentInfo(ChequePaymentInfoType value) {
        return new JAXBElement<ChequePaymentInfoType>(_ChequePaymentInfo_QNAME, ChequePaymentInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "nextKey")
    public JAXBElement<String> createNextKey(String value) {
        return new JAXBElement<String>(_NextKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "PIN")
    public JAXBElement<String> createPIN(String value) {
        return new JAXBElement<String>(_PIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "SignatureTransferPaperRef")
    public JAXBElement<String> createSignatureTransferPaperRef(String value) {
        return new JAXBElement<String>(_SignatureTransferPaperRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "CaseID")
    public JAXBElement<String> createCaseID(String value) {
        return new JAXBElement<String>(_CaseID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChequeReturnInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "ChequeReturnInfo")
    public JAXBElement<ChequeReturnInfoType> createChequeReturnInfo(ChequeReturnInfoType value) {
        return new JAXBElement<ChequeReturnInfoType>(_ChequeReturnInfo_QNAME, ChequeReturnInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "TransDateTime")
    public JAXBElement<DateTimeType> createTransDateTime(DateTimeType value) {
        return new JAXBElement<DateTimeType>(_TransDateTime_QNAME, DateTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "PassbookNum")
    public JAXBElement<String> createPassbookNum(String value) {
        return new JAXBElement<String>(_PassbookNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountOpeningObjectiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AccountOpeningObjective")
    public JAXBElement<AccountOpeningObjectiveType> createAccountOpeningObjective(AccountOpeningObjectiveType value) {
        return new JAXBElement<AccountOpeningObjectiveType>(_AccountOpeningObjective_QNAME, AccountOpeningObjectiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "AnyIDNum")
    public JAXBElement<String> createAnyIDNum(String value) {
        return new JAXBElement<String>(_AnyIDNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link P2PTokenTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "P2PTokenType")
    public JAXBElement<P2PTokenTypeType> createP2PTokenType(P2PTokenTypeType value) {
        return new JAXBElement<P2PTokenTypeType>(_P2PTokenType_QNAME, P2PTokenTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "P2PTokenNum")
    public JAXBElement<String> createP2PTokenNum(String value) {
        return new JAXBElement<String>(_P2PTokenNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "CcyType")
    public JAXBElement<CurrencyTypeType> createCcyType(CurrencyTypeType value) {
        return new JAXBElement<CurrencyTypeType>(_CcyType_QNAME, CurrencyTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "maxNumOfTrans")
    public JAXBElement<BigInteger> createMaxNumOfTrans(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaxNumOfTrans_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarningMsgTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "WarningMsgType")
    public JAXBElement<WarningMsgTypeType> createWarningMsgType(WarningMsgTypeType value) {
        return new JAXBElement<WarningMsgTypeType>(_WarningMsgType_QNAME, WarningMsgTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "OTPTokenNum")
    public JAXBElement<String> createOTPTokenNum(String value) {
        return new JAXBElement<String>(_OTPTokenNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChequeClearingTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "ChequeClearingType")
    public JAXBElement<ChequeClearingTypeType> createChequeClearingType(ChequeClearingTypeType value) {
        return new JAXBElement<ChequeClearingTypeType>(_ChequeClearingType_QNAME, ChequeClearingTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15", name = "appSysID")
    public JAXBElement<String> createAppSysID(String value) {
        return new JAXBElement<String>(_AppSysID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLFreeFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Field", scope = SpareType.class)
    public JAXBElement<XMLFreeFormatType> createSpareTypeField(XMLFreeFormatType value) {
        return new JAXBElement<XMLFreeFormatType>(_SpareTypeField_QNAME, XMLFreeFormatType.class, SpareType.class, value);
    }

}
