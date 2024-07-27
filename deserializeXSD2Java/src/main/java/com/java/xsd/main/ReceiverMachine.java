package com.java.xsd.main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.xsd.jaxb.NachrichtStrafStrafverfahren0500013;

public class ReceiverMachine {

    public static void main(String[] args) {
        try {
            int receiverPort = 7777;
            ServerSocket serverSocket = new ServerSocket(receiverPort);
            
            while (true) {
                System.out.println("Waiting for a connection...");
                Socket socket = serverSocket.accept();

                // Handle the connection in a separate thread
                new ConnectionHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ConnectionHandler extends Thread {
    private Socket socket;

    public ConnectionHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read and process data from the client
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            int i = 0;
            String receivedJson;
            while ((receivedJson = reader.readLine()) != null) {
                //System.out.println("Data received from sender machine: " + receivedJson);

                // Deserialize the JSON data into a Java object
                NachrichtStrafStrafverfahren0500013 nachricht = objectMapper.readValue(receivedJson, NachrichtStrafStrafverfahren0500013.class);
                if(nachricht != null)
                	System.out.println("Deserialized Nachricht " + i + ": " + nachricht.getNachrichtenkopf().getEigeneNachrichtenID());
                i++;
            }
            
            System.out.println("============================== End of Deserialization ===================");
            
            // Close the socket when the connection is terminated
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
