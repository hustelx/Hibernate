
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.839+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "HostFault", targetNamespace = "http://www.bangkokbank.com/bbl/soap/fault")
public class CustomerProfileAddHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType hostFault;

    public CustomerProfileAddHostFaultMsg() {
        super();
    }
    
    public CustomerProfileAddHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileAddHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileAddHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType hostFault) {
        super(message);
        this.hostFault = hostFault;
    }

    public CustomerProfileAddHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType hostFault, Throwable cause) {
        super(message, cause);
        this.hostFault = hostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.hostFault;
    }
}
