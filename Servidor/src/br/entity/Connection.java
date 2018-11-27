package src.br.entity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import src.br.control.Despachante;

class Connection extends Thread{
    private DataInputStream in;
    private DataOutputStream out;
    Socket clientSocket;
    Despachante despachante;

    public Connection(Socket aClientSocket) {
        clientSocket = aClientSocket;
        despachante = new Despachante();

        try {
            this.in = new DataInputStream(this.clientSocket.getInputStream());
            this.out = new DataOutputStream(this.clientSocket.getOutputStream());
            this.start();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void run() {
        try {
            while (true) {
                if(in.available() > 0 ){
                    String request = in.readUTF();
                    System.out.println("Requested :" + request);

                    String response = despachante.invoke(request);

                    out.writeUTF(response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}