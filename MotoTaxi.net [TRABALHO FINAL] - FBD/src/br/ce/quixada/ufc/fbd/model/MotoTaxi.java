package br.ce.quixada.ufc.fbd.model;

public class MotoTaxi extends Pessoa{
	private int mototaxiId;
	private String telefone;
	private String nome;
	private String praca;
	private HoraAlmoco horAlmoco;
	private HoraTrabalho horTrabalho;
	
	public MotoTaxi(int mototaxiId, String nome, String telefone, String nomePraca ) {
		this.mototaxiId = mototaxiId;
		this.nome = nome;
		this.telefone = telefone;
		this.praca = nomePraca;
	}

	

	public int getMototaxiId() {
		return mototaxiId;
	}

	public void setMototaxiId(int mototaxiId) {
		this.mototaxiId = mototaxiId;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPraca() {
		return praca;
	}

	public void setPraca(String praca) {
		this.praca = praca;
	}

	public HoraAlmoco getHorAlmoco() {
		return horAlmoco;
	}

	public void setHorAlmoco(HoraAlmoco horAlmoco) {
		this.horAlmoco = horAlmoco;
	}

	public HoraTrabalho getHorTrabalho() {
		return horTrabalho;
	}

	public void setHorTrabalho(HoraTrabalho horTrabalho) {
		this.horTrabalho = horTrabalho;
	}
	
	@Override
	public String toString() {
		return "MotoTaxi [mototaxiId=" + mototaxiId + ", telefone=" + telefone + ", nome=" + nome + ", praca=" + praca
				+ ", horAlmoco=" + horAlmoco + ", horTrabalho=" + horTrabalho + "]";
	}

	
}
