
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.746+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "HostFault", targetNamespace = "http://www.bangkokbank.com/bbl/soap/fault")
public class CustomerIDCardDetailInqHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType hostFault;

    public CustomerIDCardDetailInqHostFaultMsg() {
        super();
    }
    
    public CustomerIDCardDetailInqHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerIDCardDetailInqHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerIDCardDetailInqHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType hostFault) {
        super(message);
        this.hostFault = hostFault;
    }

    public CustomerIDCardDetailInqHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType hostFault, Throwable cause) {
        super(message, cause);
        this.hostFault = hostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.hostFault;
    }
}
