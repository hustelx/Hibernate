/**
 * 
 */
package com.poc.BOBSoapService;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * @author sinkal
 *
 */
public class BoBClient {

	/**
	 * @param args
	 */
	
	 private static final QName SERVICE_NAME = 
			    new QName("http://soap.sso.sas.com/", 
			    "AccountBalanceService");
	 private BoBClient() { }
	 private static final String RESPONSE_STATUS = "FIXML/Header/ResponseHeader/HostTransaction/Status";
	 private static final String ACCOUNT_BALANCE = "FIXML/Body/getOnlineAcctBalanceResponse/AccountSummary/availableBalance/amountValue"; 
	 private static final String CURRENCY_CODE ="FIXML/Body/getOnlineAcctBalanceResponse/AccountSummary/availableBalance/currencyCode";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 /*   URL wsdlURL = null;
		    //File wsdlFile = new File("C:\\SASProjects\\BOBSoapService\\src\\main\\resources\\fiusbwebservice.wsdl");
		    if (wsdlFile.exists()) {
		      try {
				wsdlURL = new URL("http://lsinsnyina4:8080/SampeSoapWebService/services/AccountBalancePort?wsdl");
						//wsdlFile.toURL(); 
						
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    } else {
		      try {
				wsdlURL = new URL(args[0]);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //}
		 
		    System.out.println(wsdlURL);
		    FIUsbWebServiceService ss = new FIUsbWebServiceService(wsdlURL, SERVICE_NAME);
		    FIUsbWebService port = ss.getFIUsbWebService();
		    String resp;
		 
		    BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(new File("C:/SASProjects/BOBSoapService/src/main/resources/Request.txt")));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    	String line;
	    	StringBuilder sb = new StringBuilder();

	    	try {
				while((line=br.readLine())!= null){
				    sb.append(line.trim());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Request :  " +sb.toString());
		    resp = port.executeService(sb.toString() );
		    System.out.println("Server responded with: " + resp);
		    System.exit(0);*/
			String xmlString= "<?xml version='1.0' encoding='UTF-8'?>"
+"<FIXML xmlns='http://www.finacle.com/fixml' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xsi:schemaLocation='http://www.finacle.com/fixml getOnlineAcctBalance.xsd'>"
   +" <Header>"
       +"  <ResponseHeader>"
      +"       <RequestMessageKey>"
        +"         <RequestUUID>Req_1540558351673</RequestUUID>"
         +"        <ServiceRequestId>getOnlineAcctBalance</ServiceRequestId>"
          +"       <ServiceRequestVersion>10.2</ServiceRequestVersion>"
          +"       <ChannelId>COR</ChannelId>"
          +"   </RequestMessageKey>"
           +"  <ResponseMessageInfo>"
           +"      <BankId>01</BankId>"
           +"      <TimeZone>GMT+05:30</TimeZone>"
            +"     <MessageDateTime>2018-10-28T11:46:52.845</MessageDateTime>"
            +" </ResponseMessageInfo>"
            +" <UBUSTransaction>"
           +"      <Id/>"
            +"     <Status/>"
            +" </UBUSTransaction>"
            +" <HostTransaction>"
              +"   <Id/>"
              +"   <Status>SUCCESS</Status>"
             +"</HostTransaction>"
             +"<HostParentTransaction>"
                +"  <Id/>"
              +"    <Status/>"
             +" </HostParentTransaction>"
            +"  <CustomInfo/>"
          +"</ResponseHeader>"
      +"</Header>"
     +" <Body>"
      +"    <getOnlineAcctBalanceResponse>"
          +"    <AccountSummary>"
              +"    <acid>12345678</acid>"
              +"    <availableBalance>"
              +"        <amountValue>300.68</amountValue>"
              +"        <currencyCode>INR</currencyCode>"
             +"     </availableBalance>"
             +"     <branchId>0001</branchId>"
              +"    <currencyCode>INR</currencyCode>"
              +"    <fFDBalance>"
               +"       <amountValue>0.00</amountValue>"
               +"       <currencyCode>INR</currencyCode>"
               +"   </fFDBalance>"
               +"   <floatingBalance>"
                +"      <amountValue>0.00</amountValue>"
                +"      <currencyCode>INR</currencyCode>"
                +"  </floatingBalance>"
                +"  <ledgerBalance>"
                +"      <amountValue>300.68</amountValue>"
                +"        <currencyCode>INR</currencyCode>"
                +"  </ledgerBalance>"
                +"  <userDefinedBalance>"
                   +"   <amountValue>300.68</amountValue>"
                   +"   <currencyCode>INR</currencyCode>"
                 +" </userDefinedBalance>"
             +" </AccountSummary>"
             +" <getOnlineAcctBalance_CustomData>"
                +"  <THB>49</THB>"
              +"</getOnlineAcctBalance_CustomData>"
        +"  </getOnlineAcctBalanceResponse>"
     +" </Body>"
  +"</FIXML>";

            Map<String , String> resultMap = new HashMap<String , String>();
            String account_bal = null;
            try{
                  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                  DocumentBuilder db = dbf.newDocumentBuilder();
                  InputSource is = new InputSource(new StringReader(xmlString));
                  Document xml = db.parse(is);

                  XPathFactory xpathFactory = XPathFactory.newInstance();
                  XPath xpath = xpathFactory.newXPath();

                  XPathExpression expr = xpath.compile(RESPONSE_STATUS);
                  String status = (String) expr.evaluate(xml, XPathConstants.STRING);
                  if (status.equalsIgnoreCase("SUCCESS")) {
                        expr = xpath.compile(ACCOUNT_BALANCE);
                        account_bal = (String) expr.evaluate(xml, XPathConstants.STRING);
                       
                  }
            }catch(Exception ex){
                  
            }
            resultMap.put("acct_bal", account_bal);
          System.out.println(resultMap);
      }

		
		
		
		

	

}
