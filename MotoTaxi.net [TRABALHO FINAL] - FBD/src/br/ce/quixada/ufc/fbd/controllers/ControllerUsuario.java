package br.ce.quixada.ufc.fbd.controllers;

import java.util.List;

import br.ce.quixada.ufc.fbd.Dao.UsuarioDao;
import br.ce.quixada.ufc.fbd.model.Usuario;

public class ControllerUsuario  {

	
	public void addUser(Usuario user){
		
		new UsuarioDao().add(user);
	}
	
	public List<Usuario> listUser(){		
		
		return new UsuarioDao().list();
	}
	
	public Usuario findUser(int idUser) {

		return new UsuarioDao().find(idUser);
	}
	
	public boolean deleteUser(int idUser) {
			
		return (new UsuarioDao().delete(idUser)) ? true : false;	
	}	
	
}
