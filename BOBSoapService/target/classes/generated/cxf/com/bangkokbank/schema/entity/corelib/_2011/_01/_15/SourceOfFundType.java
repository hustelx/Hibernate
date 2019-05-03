
package com.bangkokbank.schema.entity.corelib._2011._01._15;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		  Source of fund. Currently the valid values are: 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			1 - \u0e40\u0e07\u0e34\u0e19\u0e2d\u0e2d\u0e21
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			2 - \u0e18\u0e38\u0e23\u0e01\u0e34\u0e08\u0e2a\u0e48\u0e27\u0e19\u0e15\u0e31\u0e27
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			3 - \u0e23\u0e31\u0e1a\u0e08\u0e49\u0e32\u0e07
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			4 � \u0e21\u0e23\u0e14\u0e01/\u0e02\u0e2d\u0e07\u0e02\u0e27\u0e31\u0e0d
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 			5 - \u0e2d\u0e37\u0e48\u0e19
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:bblh99="http://www.bangkokbank.com/bbl/soap/header/" xmlns:bons1="http://www.bangkokbank.com/schema/contract/SearchCustomer/2011/01/15" xmlns:bons10="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAdd/2011/01/15" xmlns:bons11="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileKYCMod/2011/01/15" xmlns:bons12="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelAdd/2011/01/15" xmlns:bons13="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileRelDel/2011/01/15" xmlns:bons14="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoAdd/2011/01/15" xmlns:bons15="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoInq/2011/01/15" xmlns:bons16="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileAddressInfoMod/2011/01/15" xmlns:bons17="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoInq/2011/01/15" xmlns:bons18="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoMod/2011/01/15" xmlns:bons19="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoAdd/2011/01/15" xmlns:bons2="http://www.bangkokbank.com/schema/contract/CustomerProfileInq/2011/01/15" xmlns:bons20="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoInq/2011/01/15" xmlns:bons21="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoAdd/2011/01/15" xmlns:bons22="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEmploymentInfoDel/2011/01/15" xmlns:bons23="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileShareHolderInfoDel/2011/01/15" xmlns:bons24="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoAdd/2011/01/15" xmlns:bons25="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoMod/2011/01/15" xmlns:bons26="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileEDDMod/2011/01/15" xmlns:bons27="http://www.bangkokbank.com/schema/contract/Customer/FATCAIndiciaCheckOp/2016/08/13" xmlns:bons28="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesAdd/2011/01/15" xmlns:bons29="http://www.bangkokbank.com/schema/contract/Customer/SearchFATCACase/2016/08/13" xmlns:bons3="http://www.bangkokbank.com/schema/contract/CustomerRelatedPartiesInq/2011/01/15" xmlns:bons30="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesDel/2011/01/15" xmlns:bons31="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesMod/2011/01/15" xmlns:bons32="http://www.bangkokbank.com/schema/contract/Customer/CustomerRelatedPartiesKYCMod/2011/01/15" xmlns:bons33="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileMod/2011/01/15" xmlns:bons34="http://www.bangkokbank.com/schema/contract/Customer/GenerateTempAcctOp/2011/01/15" xmlns:bons35="http://www.bangkokbank.com/schema/contract/Customer/CustomerIDCardDetailInq/2011/01/15" xmlns:bons36="http://www.bangkokbank.com/schema/contract/Customer/CustomerApplAcctSummaryInq/2011/01/15" xmlns:bons37="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctInq/2011/01/15" xmlns:bons38="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctMod/2011/01/15" xmlns:bons39="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctDel/2011/01/15" xmlns:bons4="http://www.bangkokbank.com/schema/contract/SearchBlacklist/2011/01/15" xmlns:bons40="http://www.bangkokbank.com/schema/contract/Customer/CustomerSuspiciousAcctAdd/2011/01/15" xmlns:bons41="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileContactInfoInq/2011/01/15" xmlns:bons42="http://www.bangkokbank.com/schema/contract/Customer/CustomerProfileIALMod/2011/01/15" xmlns:bons43="http://www.bangkokbank.com/schema/contract/Customer/CustomerIndiciaCheckInq/2016/08/13" xmlns:bons5="http://www.bangkokbank.com/schema/contract/FinancialNewsInq/2011/01/15" xmlns:bons6="http://www.bangkokbank.com/schema/contract/CustomerDefaultInq/2011/01/15" xmlns:bons7="http://www.bangkokbank.com/bbl/soap/fault" xmlns:bons8="http://www.bangkokbank.com/schema/contract/CreditCardBlockFlagInq/2011/01/15" xmlns:bons9="http://www.bangkokbank.com/schema/contract/CustomerAccessibilityInq/2011/01/15" xmlns:ecore="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SourceOfFundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceOfFundType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.bangkokbank.com/schema/entity/CoreLib/2011/01/15}CodeNamePairType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceOfFundType")
public class SourceOfFundType
    extends CodeNamePairType
{


}
