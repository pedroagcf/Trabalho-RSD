package br.ce.quixada.ufc.fbd.main;


import java.util.List;
import java.util.Scanner;

import br.ce.quixada.ufc.fbd.controllers.ControllerMotoTaxi;
import br.ce.quixada.ufc.fbd.controllers.ControllerUsuario;
import br.ce.quixada.ufc.fbd.model.MotoTaxi;
import br.ce.quixada.ufc.fbd.model.Usuario;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	
		while(true) {

			System.out.println("Digite um numero: ");
			System.out.println("1 ----------- add MOTOTAXI");
			System.out.println("2 ----------- listar MOTOTAXI");
			System.out.println("3 ----------- find MOTOTAXI");
			System.out.println("4 ----------- remove MOTOTAXI");
			System.out.println("5 ----------- add USUARIO");
			System.out.println("6 ----------- listar USUARIO");
			System.out.println("7 ----------- find USUARIO");
			System.out.println("8 ----------- remove USUARIO");
			
			int menu = scn.nextInt();
			
			menuChoice(menu);
			
		}
	}
	
	public static void menuChoice(int numero) {
		
		int idMoto, idUser;
		MotoTaxi moto;
		Usuario user;
		
//		criar factories "geral" 
		ControllerMotoTaxi ctrlMoto;
		ControllerUsuario ctrlUser;
		Scanner scn = new Scanner(System.in);
		
		switch(numero) {
			
		case 1: 
			
			System.out.println("id: ");
			int id = scn.nextInt();

			System.out.println("Nome: ");
			String nome = scn.next();
			
			System.out.println("Telefone: ");
			String telefone = scn.next();
			
			System.out.println("Praça: ");
			String praca = scn.next();
			
			ctrlMoto = new ControllerMotoTaxi();
			ctrlMoto.addMotoTaxi(new MotoTaxi(id, nome, telefone, praca));
			
			
			break;
		
		case 2: 
			
			ctrlMoto = new ControllerMotoTaxi();
			List<MotoTaxi> motoTaxis = ctrlMoto.listMotoTaxi();
			
			for (MotoTaxi m : motoTaxis) {
				System.out.println(m.toString());
			}
			
			break;
			
		case 3: 
			
			System.out.println("id: ");
			idMoto = scn.nextInt();
			
			ctrlMoto = new ControllerMotoTaxi();
			moto = ctrlMoto.findMotoTaxi(idMoto);
			
			System.out.println(moto.toString());
			
			break;	
			
		case 4: 
			
			System.out.println("id: ");
			idMoto = scn.nextInt();
			
			ctrlMoto = new ControllerMotoTaxi();
			
			if(ctrlMoto.deleteMotoTaxi(idMoto))
				System.out.println("Removido com Sucesso!");
			
			else
				System.out.println("Nao foi removido!");
			
			break;		
		
		case 5:
			
			System.out.println("id: ");
			int idUsuario = scn.nextInt();

			System.out.println("Nome: ");
			String nomeUser = scn.next();
			
			System.out.println("Telefone: ");
			String telUsuario = scn.next();
					
			ctrlUser = new ControllerUsuario();
			ctrlUser.addUser(new Usuario(idUsuario, nomeUser, telUsuario));
			
			break;
			
		case 6:
			
			ctrlUser = new ControllerUsuario();
			List<Usuario> usuarios = ctrlUser.listUser();
			
			for (Usuario u : usuarios) {
				System.out.println(u.toString());
			}
			
			break;
		
		case 7:
			
			System.out.println("id: ");
			idUser = scn.nextInt();
			
			ctrlUser = new ControllerUsuario();
			user = ctrlUser.findUser(idUser);
			
			System.out.println(user.toString());
			
			break;
			
		case 8:
			
			System.out.println("id: ");
			idUser = scn.nextInt();
			
			ctrlUser = new ControllerUsuario();
			
			if(ctrlUser.deleteUser(idUser))
				System.out.println("Removido com Sucesso!");
			
			else
				System.out.println("Nao foi removido!");
				
			break;
			
			default: 
		
				System.out.println("Digita a opcao certa carai! :s");
		
				break;
		
		}
	}
}
