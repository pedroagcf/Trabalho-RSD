package br.quixada.ufc.rsd.Server;

import java.util.ArrayList;

import br.quixada.ufc.rsd.client.MotoTaxi;

public class EsqueletoMotoTaxi {
    
    PersistMotoTaxi pMoto;
    
    public EsqueletoMotoTaxi(){
        pMoto = PersistMotoTaxi.getInstance();
    }
    
    public boolean cadastrar(String[] args) {
        return true;
    }
    
    public ArrayList<MotoTaxi> listar() {        
    	return new ArrayList<MotoTaxi>();
    }
    
    public boolean editar(String[] args) {        
        return true;
    }
    
    public boolean login(String[] args) {          
        return true;    
    }
}