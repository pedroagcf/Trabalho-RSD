package src.client.entity;

public class ProxyCorrida {
    private int id_cliente;
    private int id_mototaxi;

    public ProxyCorrida(int id_cliente, int id_mototaxi) {
        this.id_cliente = id_cliente;
        this.id_mototaxi = id_mototaxi;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_mototaxi() {
        return id_mototaxi;
    }

    public void setId_mototaxi(int id_mototaxi) {
        this.id_mototaxi = id_mototaxi;
    }
}
