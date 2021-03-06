
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.671+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileAddressInfoInqFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileAddressInfoInqESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileAddressInfoInqFault2ESBFault;

    public CustomerProfileAddressInfoInqESBFaultMsg() {
        super();
    }
    
    public CustomerProfileAddressInfoInqESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileAddressInfoInqESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileAddressInfoInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileAddressInfoInqFault2ESBFault) {
        super(message);
        this.customerProfileAddressInfoInqFault2ESBFault = customerProfileAddressInfoInqFault2ESBFault;
    }

    public CustomerProfileAddressInfoInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileAddressInfoInqFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileAddressInfoInqFault2ESBFault = customerProfileAddressInfoInqFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileAddressInfoInqFault2ESBFault;
    }
}
