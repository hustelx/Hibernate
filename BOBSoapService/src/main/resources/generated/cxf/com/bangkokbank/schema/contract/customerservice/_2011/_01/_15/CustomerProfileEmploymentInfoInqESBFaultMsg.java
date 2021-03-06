
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.994+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileEmploymentInfoInqFault2_ESBFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileEmploymentInfoInqESBFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEmploymentInfoInqFault2ESBFault;

    public CustomerProfileEmploymentInfoInqESBFaultMsg() {
        super();
    }
    
    public CustomerProfileEmploymentInfoInqESBFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileEmploymentInfoInqESBFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileEmploymentInfoInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEmploymentInfoInqFault2ESBFault) {
        super(message);
        this.customerProfileEmploymentInfoInqFault2ESBFault = customerProfileEmploymentInfoInqFault2ESBFault;
    }

    public CustomerProfileEmploymentInfoInqESBFaultMsg(String message, com.bangkokbank.bbl.soap.fault.ESBFaultType customerProfileEmploymentInfoInqFault2ESBFault, Throwable cause) {
        super(message, cause);
        this.customerProfileEmploymentInfoInqFault2ESBFault = customerProfileEmploymentInfoInqFault2ESBFault;
    }

    public com.bangkokbank.bbl.soap.fault.ESBFaultType getFaultInfo() {
        return this.customerProfileEmploymentInfoInqFault2ESBFault;
    }
}
