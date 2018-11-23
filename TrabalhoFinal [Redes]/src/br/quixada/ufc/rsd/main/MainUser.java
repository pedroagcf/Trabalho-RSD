package br.quixada.ufc.rsd.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.quixada.ufc.rsd.client.User;

public class MainUser {

    public static void main(String[] args) throws ParseException {
        try {
        	
            User usuario = new User();
            Scanner scanner = new Scanner(System.in);
            int menu = 0;
            
                System.out.println("Bem vindo a calculadora !");
                System.out.println("Digite 1 para adicionar um mototaxi");
                System.out.println("Digite 2 para vamos listar o mototaxi");
                System.out.println("Digite 3 para editar o mototaxi:");
                System.out.println("Digite 4 para fazer o login do mototaxi");
                System.out.println("Digite 5 para adicionar um cliente");
                System.out.println("Digite 6 para vamos listar os clientes");
                System.out.println("Digite 7 para editar o cliente:");
                System.out.println("Digite 8 para fazer o login do cliente");
               
                menu = scanner.nextInt(); 
                
                switch (menu) {
                    case 1:                        
                        System.out.println(usuario.cadastrarMotoTaxi());
                        System.out.println("---------------------------------");                        
                        break;
                        
                    case 2:
                    	
                    	ArrayList<Object> listaMotoTaxi = usuario.listarMotoTaxi();
                    	for (Object m : listaMotoTaxi) {
                            System.out.println(m);
						}
                        System.out.println("---------------------------------");
                        break;
                        
                    case 3:
                        System.out.println(usuario.editarMotoTaxi());
                        System.out.println("---------------------------------");
                        break;
                        
                    case 4:
                        System.out.println(usuario.loginMotoTaxi());
                        System.out.println("---------------------------------");
                        break; 
                        
                    case 5:
                        System.out.println(usuario.cadastrarCliente());
                        System.out.println("---------------------------------");
                        break;
                        
                    case 6:
                        System.out.println(usuario.loginMotoTaxi());
                        System.out.println("---------------------------------");
                        break;
                        
                    case 7:
                    	ArrayList<Object> listaCliente = usuario.listarCliente();
                    	for (Object c : listaCliente) {
                            System.out.println(c);
						}
                        System.out.println("---------------------------------");
                        break;
                        
                    case 8:
                        System.out.println(usuario.editarCliente());
                        System.out.println("---------------------------------");
                        break;
                 
                    default:
                    	
                    	System.out.println("deu ruim! ");
                        break;
                }                
                       
            
        } catch (IOException ex) {
            Logger.getLogger(MainUser.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
}
