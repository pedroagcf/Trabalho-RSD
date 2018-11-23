package br.quixada.ufc.rsd.main;

import java.util.logging.Level;
import java.util.logging.Logger;

import br.quixada.ufc.rsd.Server.TCPServer;

public class MainServer {
    
    public static void main(String[] args) {
        try {
            System.out.println("Ouvindo");
            TCPServer tcp = TCPServer.getInstance();
            
        } catch (Exception e) {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}