package br.quixada.ufc.rsd.Server;

import java.io.IOException;
import java.util.ArrayList;

import br.quixada.ufc.rsd.client.MotoTaxi;

public class PersistCliente {
	   private static PersistCliente persist = null;
	   private ArrayList<Cliente> listaCliente;
	   
	   private PersistCliente(){
		   listaCliente = new ArrayList<Cliente>();
	   }   
	   
	   public static PersistCliente getInstance(){
	       if(persist == null) 
	    	   persist = new PersistCliente();
	       
	       return persist;
	   }
	   
	   public boolean cadastrar(String nome, String telefone) throws IOException {
		   return true;
	   }
	   public ArrayList<Cliente> listarClientes(){
		   return listaCliente;
	   }
	   public boolean remover(int idCliente) {
		   return true;
	   }
	   public boolean editar(int idCliente, String nome, String telefone, String praca) {
		   
		   return true;
	   }
	   public boolean logar(int id) {
		   return false;
	   }
	   public boolean solicitarCorrida(String praca) {
		   return true;
	   }
	   public boolean deslogar() {
		   return true;
	   }

}
