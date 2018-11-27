package src.client.control;

import java.io.*;

//import client.boundary.Prompt;
import client.entity.Conexao;

public class ControlTCPClient {
    private Conexao conexao;

    public  ControlTCPClient(String ip, int port) {
        this.conexao = new Conexao(ip, port);
    }

    public void sendRequest(String request) {
        try {
            this.conexao.getOut().writeUTF(request);

        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }

    public String getResponse() {
        try {
            String data = this.conexao.getIn().readUTF();
            return data;

        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
            return e.getMessage();
        }
    }

    public Conexao getConexao() {
        return this.conexao;
    }
}
