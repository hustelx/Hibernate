
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.742+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "ESBFault", targetNamespace = "http://www.bangkokbank.com/bbl/soap/fault")
public class CustomerIDCardDetailInqESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault;

    public CustomerIDCardDetailInqESBFaultMsg() {
        super();
    }
    
    public CustomerIDCardDetailInqESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerIDCardDetailInqESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerIDCardDetailInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault) {
        super(message);
        this.esbFault = esbFault;
    }

    public CustomerIDCardDetailInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault, Throwable cause) {
        super(message, cause);
        this.esbFault = esbFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.esbFault;
    }
}
