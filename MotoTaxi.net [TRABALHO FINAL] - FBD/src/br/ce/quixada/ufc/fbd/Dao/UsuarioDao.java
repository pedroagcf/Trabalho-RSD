package br.ce.quixada.ufc.fbd.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ce.quixada.ufc.fbd.Interface.CrudDAO;
import br.ce.quixada.ufc.fbd.factory.ConnectionFactory;
import br.ce.quixada.ufc.fbd.model.Usuario;

public class UsuarioDao implements CrudDAO<Usuario>{

	private Connection con;
	
	public UsuarioDao() {
		
		this.con = new ConnectionFactory().getConnection();
	}
	
	@Override
	public void add(Usuario user) {
	
		String SQL = "INSERT INTO usuario(usuarioId, username, telefone) VALUES"
				+ "(?,?,?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			
			stmt.setInt(1, user.getUsuarioId());
			stmt.setString(2, user.getUserName());
			stmt.setString(3, user.getTelefone());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Adicionado com sucesso!");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public List<Usuario> list() {
		
		String SQL = "SELECT * FROM usuario";
		ArrayList<Usuario> usuarios = new ArrayList<>(); 
		
		Statement stmt; 
		try {
			
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			while(rs.next()) {
				usuarios.add(new Usuario(rs.getInt("usuarioId"), 
						rs.getString("username"), rs.getString("telefone")));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return usuarios;
	}

	@Override
	public boolean delete(int idUser) {
		
		String SQL = "DELETE FROM usuario where usuarioid = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, idUser);
			
			int rowsAffected = stmt.executeUpdate();
			
			stmt.close();
			
			if(rowsAffected > 0) {
				return true;
			}
			
			return false; 
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return false; 
	}
	
	
	@Override
	public Usuario find(int idUser) {
		
		String SQL = "SELECT * FROM usuario where usuarioid = ?";
		
		Usuario user = null;
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, idUser);
			
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
				
			String nome = rs.getString("username");
			String tel = rs.getString("telefone");
				
			user = new Usuario(idUser, nome, tel);
				
			stmt.close();
					
			return user;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return user;
	}
	
}
