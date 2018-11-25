package br.quixada.ufc.rsd.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient {

	private Socket s;
    private DataInputStream in;
    private DataOutputStream out;
    
    public TcpClient() throws IOException {
        abrirConexao();
    }
    
    private void abrirConexao() throws IOException{
        s = new Socket("localhost", 7896);
        in = new DataInputStream( s.getInputStream());
        out =new DataOutputStream( s.getOutputStream());
    }
    
    public void sendRequest(String request) throws IOException{
        out.writeUTF(request);
    }
    
    public String getResponse() throws IOException{       
        return in.readUTF();
    }
	
}
