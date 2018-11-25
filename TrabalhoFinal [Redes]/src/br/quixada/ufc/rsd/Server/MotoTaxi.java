package br.quixada.ufc.rsd.Server;

public class MotoTaxi {
	
	private static int id_motoTaxi; 

	private String nome; 
	private String telefone;
	private String praca;
	
	
	public MotoTaxi (String nome, String telefone, String praca) {
		this.id_motoTaxi++;
		
		this.nome = nome;
		this.telefone = telefone; 
		this.praca = praca;
	}


	public static int getId_motoTaxi() {
		return id_motoTaxi;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getPraca() {
		return praca;
	}


	public void setPraca(String praca) {
		this.praca = praca;
	}

}
