
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.949+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileEDDModFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileEDDModESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEDDModFault2ESBFault;

    public CustomerProfileEDDModESBFaultMsg() {
        super();
    }
    
    public CustomerProfileEDDModESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileEDDModESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileEDDModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEDDModFault2ESBFault) {
        super(message);
        this.customerProfileEDDModFault2ESBFault = customerProfileEDDModFault2ESBFault;
    }

    public CustomerProfileEDDModESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEDDModFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileEDDModFault2ESBFault = customerProfileEDDModFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileEDDModFault2ESBFault;
    }
}
