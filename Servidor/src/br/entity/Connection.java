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
                String request = in.readUTF();
                System.out.println("Requested :" + request);

                String response = despachante.invoke(request);

                out.writeUTF(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public String getRequest() throws IOException{
//        return in.readUTF();
//    }
//
//    public void sendResponse(String response) throws IOException{
//        out.writeUTF(response);
//    }
}