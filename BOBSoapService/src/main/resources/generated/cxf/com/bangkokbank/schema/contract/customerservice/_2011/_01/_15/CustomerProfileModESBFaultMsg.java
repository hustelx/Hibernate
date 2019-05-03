
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.624+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileModFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileModESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileModFault2ESBFault;

    public CustomerProfileModESBFaultMsg() {
        super();
    }
    
    public CustomerProfileModESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileModESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileModFault2ESBFault) {
        super(message);
        this.customerProfileModFault2ESBFault = customerProfileModFault2ESBFault;
    }

    public CustomerProfileModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileModFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileModFault2ESBFault = customerProfileModFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileModFault2ESBFault;
    }
}
