package src.br.entity;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private int porta;

    public TCPServer(){
        this.porta = 7896;
    }

    public void keepListen() {
        try{
            ServerSocket listenSocket = new ServerSocket(this.porta);
            System.out.println("Servidor escutando na Porta: "+this.porta);

            while(true) {
                Socket clientSocket = listenSocket.accept();

                System.out.println("Cliente conectado do IP "+listenSocket.getInetAddress().getHostAddress());

                Connection conection = new Connection(clientSocket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //this.keepListen();
        }
    }
}


