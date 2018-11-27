package src.client.entity;

public class ProxyMototaxi {

    private int id_mototaxi;
    private String nome;
    private String telefone;
    private String praca;


    public ProxyMototaxi (int id_mototaxi, String nome, String telefone, String praca) {
        this.id_mototaxi = id_mototaxi;
        this.nome = nome;
        this.telefone = telefone;
        this.praca = praca;
    }

    public int getId_mototaxi() {
        return id_mototaxi;
    }

    public void setId_mototaxi(int id_mototaxi) {
        this.id_mototaxi = id_mototaxi;
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
