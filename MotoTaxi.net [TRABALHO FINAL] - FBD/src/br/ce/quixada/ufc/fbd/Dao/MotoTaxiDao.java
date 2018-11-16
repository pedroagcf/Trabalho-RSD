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
import br.ce.quixada.ufc.fbd.model.MotoTaxi;

public class MotoTaxiDao implements CrudDAO<MotoTaxi> {
	
	private Connection con;
	
	public MotoTaxiDao() {
		this.con = new ConnectionFactory().getConnection();
	}

	
	@Override
	public boolean delete(int idMoto) {
		
		String SQL = "DELETE FROM mototaxi where mototaxiId = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, idMoto);
			
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
	public MotoTaxi find(int idMoto) {
		
		String SQL = "SELECT * FROM mototaxi where mototaxiId = ?";
		
		MotoTaxi moto = null;
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, idMoto);
			
			ResultSet rs = stmt.executeQuery();
			
			rs.next();
				
				String nome = rs.getString("nome");
				String tel = rs.getString("telefone");
				String nomepraca = rs.getString("nomepraca");
				
				moto = new MotoTaxi(idMoto, nome, tel, nomepraca);
				
				stmt.close();
				return moto;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return moto;
	}
	
	@Override
	public void add(MotoTaxi moto) {
		
		String SQL = "INSERT INTO mototaxi(mototaxiId, nome, telefone, nomepraca)"
				+ "VALUES(?,?,?,?)";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(SQL);
			stmt.setInt(1, moto.getMototaxiId());
			stmt.setString(2, moto.getNome());
			stmt.setString(3, moto.getTelefone());
			stmt.setString(4, moto.getPraca());
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Adicionado com sucesso!");
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}
	
	}



	@Override
	public List<MotoTaxi> list() {
		
		String SQL = "SELECT * FROM MotoTaxi";
		ArrayList<MotoTaxi> motoTaxis = new ArrayList<>(); 
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);
			
			while (rs.next()) {
				motoTaxis.add(
						new MotoTaxi(rs.getInt("mototaxiId"), 
						rs.getString("nome"), rs.getString("telefone"), 
						rs.getString("nomepraca")));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return motoTaxis;
		
	}
}
