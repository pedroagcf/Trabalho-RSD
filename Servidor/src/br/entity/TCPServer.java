package entity;

import control.Despachante;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private DataInputStream in;
    private DataOutputStream out;
    private int porta;

    public TCPServer(){
        this.porta = 7896;
    }

    public String getRequest() throws IOException{        
        return in.readUTF();
    }
	
    public void sendResponse(String response) throws IOException{                      
        out.writeUTF(response);
    }

    public void keepListen() {
        try{
            ServerSocket listenSocket = new ServerSocket(this.porta);
            System.out.println("Servidor escutando na Porta: "+this.porta);

            while(true) {
                Socket clientSocket = listenSocket.accept();
                System.out.println("Oi");
                in = new DataInputStream(clientSocket.getInputStream());
                out = new DataOutputStream(clientSocket.getOutputStream());

                Despachante despachante = new Despachante();
                String request = getRequest();

                String response = despachante.invoke(request);
                System.out.println(response);
                sendResponse(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            this.keepListen();
        }

    }
}

