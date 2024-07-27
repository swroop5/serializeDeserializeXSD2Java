package com.java.xsd.main;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.java.xsd.jaxb.*;
import java.io.*;
import java.net.Socket;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main 
{
  public static void main(String[] args) 
  {
	  try {
          String receiverIpAddress = "127.0.0.1";
          int receiverPort = 7777;
          int i = 0;

          // Create an ObjectMapper instance
          ObjectMapper objectMapper = new ObjectMapper();

          // Create a socket connection to the server
          Socket socket = new Socket(receiverIpAddress, receiverPort);

          // Serialize and send data continuously
          while (i<1001) {
              // Serialize a Java object to JSON
        	  String filename = "nachrichten/nachricht_" + i + ".xml";
          	  
              String json = objectMapper.writeValueAsString(jaxbXmlFileToObject(filename));

              // Send the JSON data to the server
              OutputStream os = socket.getOutputStream();
              PrintWriter out = new PrintWriter(os, true);
              out.println(json);
              i++;
              
              Thread.sleep(10);
              //Thread.sleep(1000); // Simulate continuous data transmission
          }
          
          socket.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
    
    System.out.println("Finished processing all XML files!");
    
  }
 
  private static NachrichtStrafStrafverfahren0500013 jaxbXmlFileToObject(String fileName) {
     
    File xmlFile = new File(fileName);
     
    JAXBContext jaxbContext;
    try
    {
      jaxbContext = JAXBContext.newInstance(NachrichtStrafStrafverfahren0500013.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
       
      NachrichtStrafStrafverfahren0500013 nachricht = (NachrichtStrafStrafverfahren0500013) jaxbUnmarshaller.unmarshal(xmlFile);
       
      //System.out.println(nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
      return nachricht;
    }
    catch (JAXBException e) 
    {
      e.printStackTrace();
    }
	return null;
  }
}