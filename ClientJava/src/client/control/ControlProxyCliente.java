package client.control;

import client.entity.ProxyCliente;
import client.entity.Request;
import client.entity.Response;

public class ControlProxyCliente {
    ControlTCPClient controlTCPClient;

    public ControlProxyCliente(String ip, int port) {
        this.controlTCPClient = new ControlTCPClient(ip, port);
    }

    public String cadastrar(int idCliente, String nome, String telefone) {
        ProxyCliente proxyCliente = new ProxyCliente(idCliente, nome, telefone);
        Request request = new Request("Cliente.cadastrar", ControlParseJSON.createJson(proxyCliente));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        Response response = (Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), Response.class);
        return response.getMessage();
    }

//
//    public boolean editar(int idCliente, String nome, String telefone) {
//        return false;
//    }
//
//    public boolean remover(int idCliente) {
//        return false;
//    }
//
//    public void listar() {
//
//    }
//
//    public void solicitarCorrida(String praca) {

//    }
}
