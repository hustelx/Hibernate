
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.887+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileShareHolderInfoModFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileShareHolderInfoModHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoModFault1HostFault;

    public CustomerProfileShareHolderInfoModHostFaultMsg() {
        super();
    }
    
    public CustomerProfileShareHolderInfoModHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileShareHolderInfoModHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileShareHolderInfoModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoModFault1HostFault) {
        super(message);
        this.customerProfileShareHolderInfoModFault1HostFault = customerProfileShareHolderInfoModFault1HostFault;
    }

    public CustomerProfileShareHolderInfoModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileShareHolderInfoModFault1HostFault, Throwable cause) {
        super(message, cause);
        this.customerProfileShareHolderInfoModFault1HostFault = customerProfileShareHolderInfoModFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.customerProfileShareHolderInfoModFault1HostFault;
    }
}
