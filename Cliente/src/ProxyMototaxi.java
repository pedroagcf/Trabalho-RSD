package br.quixada.ufc.rsd.client;


import java.io.IOException;

public class ProxyMototaxi  {
    
    private TcpClient tcp;
    
    public ProxyMototaxi() throws IOException{
    	tcp = new TcpClient();
    }
    
    public boolean cadastrarMotoTaxi(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest("Calculadora,add,"+op1+","+op2);        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public ArrayList<MotoTaxi> listarMotoTaxi() throws IOException{
        tcp.sendRequest("Calculadora,sub,"+op1+","+op2);
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean editarMotoTaxi(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest("Calculadora,mult,"+op1+","+op2);        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean loginMotoTaxi(int idMotoTaxi) throws IOException{
        tcp.sendRequest("Calculadora,div,"+op1+","+op2);
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean deslogar() throws IOException{
        tcp.sendRequest("Calculadora,div,"+op1+","+op2);
        return Double.parseDouble(tcp.getResponse());
    }
    
    public void close() throws IOException{
        tcp.sendRequest("Calculadora,div,"+op1+","+op2);
    }
    
    
}