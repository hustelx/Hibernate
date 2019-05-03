
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.908+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "GenerateTempAcctOpFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class GenerateTempAcctOpESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType generateTempAcctOpFault2ESBFault;

    public GenerateTempAcctOpESBFaultMsg() {
        super();
    }
    
    public GenerateTempAcctOpESBFaultMsg(String message) {
        super(message);
    }
    
    public GenerateTempAcctOpESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public GenerateTempAcctOpESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType generateTempAcctOpFault2ESBFault) {
        super(message);
        this.generateTempAcctOpFault2ESBFault = generateTempAcctOpFault2ESBFault;
    }

    public GenerateTempAcctOpESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType generateTempAcctOpFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.generateTempAcctOpFault2ESBFault = generateTempAcctOpFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.generateTempAcctOpFault2ESBFault;
    }
}