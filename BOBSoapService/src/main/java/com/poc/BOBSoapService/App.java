package com.poc.BOBSoapService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(new FileReader(new File("C:/Users/sinsny/Desktop/BOB/Request.txt")));
    	String line;
    	StringBuilder sb = new StringBuilder();

    	while((line=br.readLine())!= null){
    	    sb.append(line.trim());
    	}
    	System.out.println(sb);
    }
}
