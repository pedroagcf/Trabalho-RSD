package br.quixada.ufc.rsd.Server;

import java.io.IOException;
import java.util.ArrayList;

import br.quixada.ufc.rsd.Client.MotoTaxi;

public class PersistMotoTaxi {   
	   
	   private static PersistMotoTaxi persist = null;
	   private ArrayList<MotoTaxi> listaMotoTaxi;
	   
	   private PersistMotoTaxi(){
		   listaMotoTaxi = new ArrayList<MotoTaxi>();
	   }   
	   
	   public static PersistMotoTaxi getInstance(){
	       if(persist == null) 
	    	   persist = new PersistMotoTaxi();
	       
	       return persist;
	   }
	   
	   public boolean cadastrar(String nome, String telefone, String praca) throws IOException {
		   return true;
	   }
	   public ArrayList<MotoTaxi> listar(){
		   return listaMotoTaxi;
	   }
	   // Fazer 
	   public boolean editar(String nome, String telefone, String praca) {
		   
		   return true;
	   }
	   public boolean login(int id) {
		   return false;
	   }
	   
	}
