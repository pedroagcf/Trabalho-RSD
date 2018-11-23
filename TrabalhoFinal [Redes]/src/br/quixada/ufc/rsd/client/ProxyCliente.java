package br.quixada.ufc.rsd.client;


import java.io.IOException;

public class ProxyCliente  {
    
    private TcpClient tcp;
    
    public ProxyCliente() throws IOException{
    	tcp = new TcpClient();
    }
    
    public boolean cadastrarCliente(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest();        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public ArrayList<MotoTaxi> listarCliente() throws IOException{
        tcp.sendRequest();
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean editarCliente(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest();        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean loginCliente(int idMotoTaxi) throws IOException{
        tcp.sendRequest();
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean deslogar() throws IOException{
        tcp.sendRequest();
        return Double.parseDouble(tcp.getResponse());
    }
    
    public void close() throws IOException{
        tcp.sendRequest();
    }
    
    
}
