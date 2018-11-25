package br.quixada.ufc.rsd.client;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import br.quixada.ufc.rsd.Server.Cliente;

public class User {
	
	private Scanner input; 
		
	public User() throws IOException {
		input = new Scanner(System.in);
		
	}
	
    public boolean cadastrarMotoTaxi() throws IOException{
    	ProxyMototaxi proxy = new ProxyMototaxi();
    	
        System.out.println("Vamos adicionar um mototaxi");        
        String nome = input.nextLine();
        String telefone = input.nextLine();
        String praca = input.nextLine();
        
        return proxy.cadastrarMotoTaxi(nome, telefone, praca);
    }
    
    public ArrayList<MotoTaxi> listarMotoTaxi() throws IOException{
    	ProxyMototaxi proxy = new ProxyMototaxi();
    	
        System.out.println("Vamos listar os mototaxis");
        return proxy.listarMotoTaxi();
    }
    
    public boolean editarMotoTaxi() throws IOException{
    	ProxyMototaxi proxy = new ProxyMototaxi();
    	
        System.out.println("Vamos editar o mototaxi:  ");
            
        return proxy.editarMotoTaxi(nome, telefone, praca);
    }
    
    public boolean loginMotoTaxi() throws IOException{
    	ProxyMototaxi proxy = new ProxyMototaxi();
    	
        System.out.println("Vamos fazer o login: ");
        
        return proxy.loginMotoTaxi(idMotoTaxi);
    }
    
    //nada implementado - revisar funcionalidades
    public boolean deslogar() throws IOException, ParseException{
    	ProxyMototaxi proxy = new ProxyMototaxi();
    	
    	return proxy.deslogar(); 
    }
    
    public boolean cadastrarCliente() throws IOException{
    	ProxyCliente proxy = new ProxyCliente();
    	
        System.out.println("Vamos adicionar um Cliente");        
        String nome = input.nextLine();
        String telefone = input.nextLine();
        String praca = input.nextLine();
        
        return proxy.cadastrarCliente(nome, telefone, praca);
    }
    
    public ArrayList<Cliente> listarCliente() throws IOException{
    	ProxyCliente proxy = new ProxyCliente();
    	
        System.out.println("Vamos listar os mototaxis");
        return proxy.listarCliente();
    }
    
    public boolean editarCliente() throws IOException{
    	ProxyCliente proxy = new ProxyCliente();
    	
        System.out.println("Vamos editar o mototaxi:  ");
            
        return proxy.editarCliente(nome, telefone, praca);
    }
    
    public boolean loginMotoTaxi() throws IOException{
    	ProxyCliente proxy = new ProxyCliente();
    	
        System.out.println("Vamos fazer o login: ");
        
        return proxy.loginMotoTaxi(idMotoTaxi);
    }
    
}
