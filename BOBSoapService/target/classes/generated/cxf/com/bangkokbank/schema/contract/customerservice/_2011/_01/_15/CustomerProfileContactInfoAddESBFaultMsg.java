
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.925+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileContactInfoAddFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileContactInfoAddESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoAddFault2ESBFault;

    public CustomerProfileContactInfoAddESBFaultMsg() {
        super();
    }
    
    public CustomerProfileContactInfoAddESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileContactInfoAddESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileContactInfoAddESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoAddFault2ESBFault) {
        super(message);
        this.customerProfileContactInfoAddFault2ESBFault = customerProfileContactInfoAddFault2ESBFault;
    }

    public CustomerProfileContactInfoAddESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileContactInfoAddFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileContactInfoAddFault2ESBFault = customerProfileContactInfoAddFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileContactInfoAddFault2ESBFault;
    }
}