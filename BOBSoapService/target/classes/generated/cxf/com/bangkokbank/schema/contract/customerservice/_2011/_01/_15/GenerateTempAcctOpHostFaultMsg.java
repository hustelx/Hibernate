
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.912+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "GenerateTempAcctOpFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class GenerateTempAcctOpHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType generateTempAcctOpFault1HostFault;

    public GenerateTempAcctOpHostFaultMsg() {
        super();
    }
    
    public GenerateTempAcctOpHostFaultMsg(String message) {
        super(message);
    }
    
    public GenerateTempAcctOpHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public GenerateTempAcctOpHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType generateTempAcctOpFault1HostFault) {
        super(message);
        this.generateTempAcctOpFault1HostFault = generateTempAcctOpFault1HostFault;
    }

    public GenerateTempAcctOpHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType generateTempAcctOpFault1HostFault, Throwable cause) {
        super(message, cause);
        this.generateTempAcctOpFault1HostFault = generateTempAcctOpFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.generateTempAcctOpFault1HostFault;
    }
}