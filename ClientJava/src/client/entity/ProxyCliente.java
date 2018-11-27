package client.entity;

public class ProxyCliente {
    private int idCliente;
    private String nome;
    private String telefone;

    public ProxyCliente(int idCliente, String nome, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
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
