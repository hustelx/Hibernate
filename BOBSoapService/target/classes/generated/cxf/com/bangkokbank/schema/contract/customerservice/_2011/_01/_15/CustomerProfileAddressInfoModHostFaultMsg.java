
package com.bangkokbank.schema.contract.customerservice._2011._01._15;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2019-03-20T15:21:48.971+05:30
 * Generated source version: 2.7.0
 */

@WebFault(name = "CustomerProfileAddressInfoModFault1_HostFault", targetNamespace = "http://www.bangkokbank.com/schema/contract/CustomerService/2011/01/15")
public class CustomerProfileAddressInfoModHostFaultMsg extends Exception {
    
    private com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileAddressInfoModFault1HostFault;

    public CustomerProfileAddressInfoModHostFaultMsg() {
        super();
    }
    
    public CustomerProfileAddressInfoModHostFaultMsg(String message) {
        super(message);
    }
    
    public CustomerProfileAddressInfoModHostFaultMsg(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerProfileAddressInfoModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileAddressInfoModFault1HostFault) {
        super(message);
        this.customerProfileAddressInfoModFault1HostFault = customerProfileAddressInfoModFault1HostFault;
    }

    public CustomerProfileAddressInfoModHostFaultMsg(String message, com.bangkokbank.bbl.soap.fault.HostFaultType customerProfileAddressInfoModFault1HostFault, Throwable cause) {
        super(message, cause);
        this.customerProfileAddressInfoModFault1HostFault = customerProfileAddressInfoModFault1HostFault;
    }

    public com.bangkokbank.bbl.soap.fault.HostFaultType getFaultInfo() {
        return this.customerProfileAddressInfoModFault1HostFault;
    }
}
