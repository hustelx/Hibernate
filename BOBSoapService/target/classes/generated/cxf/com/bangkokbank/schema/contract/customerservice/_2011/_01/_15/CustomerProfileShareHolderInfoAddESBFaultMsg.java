
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.710+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileShareHolderInfoAddFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileShareHolderInfoAddESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileShareHolderInfoAddFault2ESBFault;

    public CustomerProfileShareHolderInfoAddESBFaultMsg() {
        super();
    }
    
    public CustomerProfileShareHolderInfoAddESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileShareHolderInfoAddESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileShareHolderInfoAddESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileShareHolderInfoAddFault2ESBFault) {
        super(message);
        this.customerProfileShareHolderInfoAddFault2ESBFault = customerProfileShareHolderInfoAddFault2ESBFault;
    }

    public CustomerProfileShareHolderInfoAddESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileShareHolderInfoAddFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileShareHolderInfoAddFault2ESBFault = customerProfileShareHolderInfoAddFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileShareHolderInfoAddFault2ESBFault;
    }
}