package src.client.teste;


import src.client.control.ControlProxyCliente;
import src.client.control.ControlProxyMototaxi;

public class Testes {
    private int port =7896;
    private String ip = "localhost";
    ControlProxyCliente controlProxyCliente;
    ControlProxyMototaxi controlProxyMototaxi;

    public void testando() {
        controlProxyCliente = new ControlProxyCliente(this.ip, this.port);

        System.out.println(controlProxyCliente.cadastrar(1, "Rafael", "88996420761"));
        System.out.println(controlProxyCliente.listar().values());

        System.out.println(controlProxyCliente.editar(1, "Guilherme", "88924424235"));
        System.out.println(controlProxyCliente.listar().values());

        System.out.println(controlProxyCliente.remover(1));
        System.out.println(controlProxyCliente.listar().values());

        controlProxyMototaxi = new ControlProxyMototaxi(this.ip, this.port);

        System.out.println(controlProxyMototaxi.cadastrar(1, "Rafael", "88996420761", "Praça do Leão"));
        System.out.println(controlProxyMototaxi.listar().values());

        System.out.println(controlProxyMototaxi.editar(1, "Guilherme", "88924424235", "Praça da Estação"));
        System.out.println(controlProxyMototaxi.listar().values());

        System.out.println(controlProxyMototaxi.remover(1));
        System.out.println(controlProxyMototaxi.listar().values());

    }
}
