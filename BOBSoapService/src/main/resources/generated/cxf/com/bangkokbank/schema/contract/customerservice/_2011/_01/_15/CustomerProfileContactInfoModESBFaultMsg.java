
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.735+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileContactInfoModFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileContactInfoModESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoModFault2ESBFault;

    public CustomerProfileContactInfoModESBFaultMsg() {
        super();
    }
    
    public CustomerProfileContactInfoModESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileContactInfoModESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileContactInfoModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoModFault2ESBFault) {
        super(message);
        this.customerProfileContactInfoModFault2ESBFault = customerProfileContactInfoModFault2ESBFault;
    }

    public CustomerProfileContactInfoModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoModFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileContactInfoModFault2ESBFault = customerProfileContactInfoModFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileContactInfoModFault2ESBFault;
    }
}
