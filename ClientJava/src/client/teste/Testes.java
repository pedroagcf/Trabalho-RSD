package client.teste;

import client.control.ControlProxyCliente;
import client.control.ControlTCPClient;

public class Testes {
    private int port =7896;
    private String ip = "localhost";
    ControlProxyCliente controlProxyCliente;

    public void testando() {
        controlProxyCliente = new ControlProxyCliente(this.ip, this.port);

        System.out.println(controlProxyCliente.cadastrar(1, "Rafael", "88996420761"));
        System.out.println(controlProxyCliente.cadastrar(2, "Victor", "88976524235"));
    }
}
