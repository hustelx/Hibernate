
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.871+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerRelatedPartiesModFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerRelatedPartiesModHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesModFault1HostFault;

    public CustomerRelatedPartiesModHostFaultMsg() {
        super();
    }
    
    public CustomerRelatedPartiesModHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerRelatedPartiesModHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerRelatedPartiesModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesModFault1HostFault) {
        super(message);
        this.customerRelatedPartiesModFault1HostFault = customerRelatedPartiesModFault1HostFault;
    }

    public CustomerRelatedPartiesModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerRelatedPartiesModFault1HostFault, Throwable cause) {
        super(message, cause);
        this.customerRelatedPartiesModFault1HostFault = customerRelatedPartiesModFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.customerRelatedPartiesModFault1HostFault;
    }
}