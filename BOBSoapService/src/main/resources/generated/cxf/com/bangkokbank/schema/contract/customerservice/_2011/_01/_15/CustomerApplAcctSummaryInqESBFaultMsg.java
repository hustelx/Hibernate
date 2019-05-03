
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.726+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "ESBFault", targetNamespace = "http://www.bangkokbank.com/bbl/soap/fault")
public class CustomerApplAcctSummaryInqESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault;

    public CustomerApplAcctSummaryInqESBFaultMsg() {
        super();
    }
    
    public CustomerApplAcctSummaryInqESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerApplAcctSummaryInqESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerApplAcctSummaryInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault) {
        super(message);
        this.esbFault = esbFault;
    }

    public CustomerApplAcctSummaryInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType esbFault, Throwable cause) {
        super(message, cause);
        this.esbFault = esbFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.esbFault;
    }
}
