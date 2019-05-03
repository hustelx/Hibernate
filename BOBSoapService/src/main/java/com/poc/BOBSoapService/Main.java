package com.poc.BOBSoapService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	
	private static ProducerTemplate template;

	public static void main(String[] args) throws Exception {
		System.setProperty("port1", "9001");
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CamelContext camelContext = SpringCamelContext.springCamelContext(
				appContext, false);
		try {
			template = camelContext.createProducerTemplate();
			System.out.println("Start camel context");
			camelContext.start();
			
			BufferedReader br = new BufferedReader(new FileReader(new File("C:/SASProjects/BOBSoapService/src/main/resources/Request.txt")));
	    	String line;
	    	StringBuilder sb = new StringBuilder();

	    	while((line=br.readLine())!= null){
	    	    sb.append(line.trim());
	    	}
			System.out.println("Request :  " +sb.toString());
			String response = template.requestBody("direct:start",
					sb.toString(), String.class);
			System.out.println("Response : "+ response);
		} finally {
			System.out.println("Stop camel context");
			//camelContext.stop();
		}
	}

}
