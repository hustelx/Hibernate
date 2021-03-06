
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.963+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerRelatedPartiesDelFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerRelatedPartiesDelHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesDelFault1HostFault;

    public CustomerRelatedPartiesDelHostFaultMsg() {
        super();
    }
    
    public CustomerRelatedPartiesDelHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerRelatedPartiesDelHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerRelatedPartiesDelHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesDelFault1HostFault) {
        super(message);
        this.customerRelatedPartiesDelFault1HostFault = customerRelatedPartiesDelFault1HostFault;
    }

    public CustomerRelatedPartiesDelHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesDelFault1HostFault, Throwable cause) {
        super(message, cause);
        this.customerRelatedPartiesDelFault1HostFault = customerRelatedPartiesDelFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.customerRelatedPartiesDelFault1HostFault;
    }
}
