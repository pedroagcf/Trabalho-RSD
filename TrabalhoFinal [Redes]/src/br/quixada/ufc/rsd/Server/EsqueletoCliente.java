package br.quixada.ufc.rsd.Server;

import java.io.IOException;
import java.util.ArrayList;

public class EsqueletoCliente {
	PersistCliente cliente;
    
    public EsqueletoCliente(){
        cliente = PersistCliente.getInstance();
    }
    public boolean cadastrar(String nome, String telefone) throws IOException {
		   return true;
	   }
	   public ArrayList<Cliente> listarClientes(){
		   return new ArrayList<Cliente>();
	   }
	   public boolean remover(String[] args) {
		   return true;
	   }
	   public boolean editar(String[] args) {
		   
		   return true;
	   }
	   public boolean logar(String[] args) {
		   return false;
	   }
	   public boolean solicitarCorrida(String[] args) {
		   return true;
	   }
	   public boolean deslogar() {
		   return true;
	   }
    
    
    
    
	
}
