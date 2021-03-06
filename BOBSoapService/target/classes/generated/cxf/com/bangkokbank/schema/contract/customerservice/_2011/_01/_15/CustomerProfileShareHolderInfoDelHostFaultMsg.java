
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.855+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileShareHolderInfoDelFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileShareHolderInfoDelHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoDelFault1HostFault;

    public CustomerProfileShareHolderInfoDelHostFaultMsg() {
        super();
    }
    
    public CustomerProfileShareHolderInfoDelHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileShareHolderInfoDelHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileShareHolderInfoDelHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoDelFault1HostFault) {
        super(message);
        this.customerProfileShareHolderInfoDelFault1HostFault = customerProfileShareHolderInfoDelFault1HostFault;
    }

    public CustomerProfileShareHolderInfoDelHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoDelFault1HostFault, Throwable cause) {
        super(message, cause);
        this.customerProfileShareHolderInfoDelFault1HostFault = customerProfileShareHolderInfoDelFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.customerProfileShareHolderInfoDelFault1HostFault;
    }
}
