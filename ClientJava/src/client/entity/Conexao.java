package client.entity;

import java.net.*;
import java.io.*;

public class Conexao {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;

    public Conexao(String ip, int serverPort) {
        try {
            this.socket = new Socket(ip, serverPort);

            this.in = new DataInputStream(this.socket.getInputStream());
            this.out = new DataOutputStream(this.socket.getOutputStream());

        } catch (UnknownHostException e){
            System.out.println("Sock:"+e.getMessage());
        } catch (EOFException e){
            System.out.println("EOF:"+e.getMessage());
        } catch (IOException e){
            System.out.println("IO:"+e.getMessage());
        }
    }

    public void desconectar () {
        try {
            this.socket.close();
        } catch (IOException e){
            System.out.println("close:"+e.getMessage());
        }
    }

    public Socket getSocket() {
        return this.socket;
    }

    public DataInputStream getIn() {
        return this.in;
    }

    public DataOutputStream getOut() {
        return this.out;
    }
}
