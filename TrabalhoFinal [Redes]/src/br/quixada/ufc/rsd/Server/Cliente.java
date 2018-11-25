package br.quixada.ufc.rsd.Server;

public class Cliente {
	
	private static int id_cliente;
	private String nome;
	private String telefone; 
	
	public Cliente(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public static int getId_cliente() {
		return id_cliente;
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
}
