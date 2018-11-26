import java.io.IOException;

public class ProxyCliente  {
    
    private TcpClient tcp;
    
    public ProxyCliente() throws IOException{
    	tcp = new TcpClient();
    }
    
    public boolean cadastrarCliente(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest("Calculadora,add,"+op1+","+op2);        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public ArrayList<MotoTaxi> listarCliente() throws IOException{
        tcp.sendRequest("Calculadora,sub,"+op1+","+op2);
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean editarCliente(String nome, String telefone, String praca) throws IOException{
        tcp.sendRequest("Calculadora,mult,"+op1+","+op2);        
        return Double.parseDouble(tcp.getResponse());
    }
    
    public boolean loginCliente(int idMotoTaxi) throws IOException{
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