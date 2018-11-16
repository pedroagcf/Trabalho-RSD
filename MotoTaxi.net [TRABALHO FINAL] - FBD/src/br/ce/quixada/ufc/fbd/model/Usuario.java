package br.ce.quixada.ufc.fbd.model;
public class Usuario extends Pessoa {
	
	private int usuarioId;
	private String userName;
	private String telefone;
	
	public Usuario(int userId, String userName, String telefone) {
		this.usuarioId = userId;
		this.userName = userName;
		this.telefone = telefone; 
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", userName=" + userName + ", telefone=" + telefone + "]";
	}
	
	
}
