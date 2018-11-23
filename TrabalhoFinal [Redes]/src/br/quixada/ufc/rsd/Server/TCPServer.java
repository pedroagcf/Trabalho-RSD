package br.quixada.ufc.rsd.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {    
	private static TCPServer tcpServer;
    private DataInputStream in;
    private DataOutputStream out;
    
    private TCPServer() throws IOException, Exception{        
        keepListen();
    }
    
    public static TCPServer getInstance() {
    	
    	if(tcpServer == null) {
    		try {
				tcpServer = new TCPServer();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	return tcpServer;
    	
    }
    
    private void keepListen() throws IOException, Exception{
        ServerSocket listenSocket = new ServerSocket(7896);                
        while(true) {
            Socket clientSocket = listenSocket.accept();                
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());     
            
            Despachante despachante = new Despachante();
            String request = getRequest();            
            String response = despachante.invoke(request);            
            sendResponse(response);
	}
    }
    
    public String getRequest() throws IOException{        
        return in.readUTF();
    }
	
    public void sendResponse(String response) throws IOException{                      
        out.writeUTF(response);
    }			
}

