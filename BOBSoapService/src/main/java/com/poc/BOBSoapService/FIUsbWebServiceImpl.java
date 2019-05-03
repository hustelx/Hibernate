package com.poc.BOBSoapService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.infosys.ci.fiusb.webservice.ExecuteServiceResponse;

public class FIUsbWebServiceImpl {
	
	public String executeService(String str) throws IOException{
		
		ExecuteServiceResponse executeServiceResponse = new ExecuteServiceResponse();
		executeServiceResponse.setExecuteServiceReturn(str);
		
		BufferedReader br = new BufferedReader(new FileReader(new File("C:/SASProjects/BOBSoapService/src/main/resources/Response.txt")));
    	String line;
    	StringBuilder sb = new StringBuilder();

    	while((line=br.readLine())!= null){
    	    sb.append(line.trim());
    	}
		
		return sb.toString();
		
	}

}
