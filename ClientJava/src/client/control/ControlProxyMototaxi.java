package src.client.control;

import src.client.entity.ProxyMototaxi;

import java.util.Map;

public class ControlProxyMototaxi {
    private ControlTCPClient controlTCPClient;

    public ControlProxyMototaxi(ControlTCPClient controlTCPClient) {
        this.controlTCPClient = controlTCPClient;
    }

    public String cadastrar(int id_mototaxi, String nome, String telefone, String praca) {
        ProxyMototaxi proxyMototaxi = new ProxyMototaxi(id_mototaxi, nome, telefone, praca);
        client.entity.Request request = new client.entity.Request("Mototaxi.cadastrar", ControlParseJSON.createJson(proxyMototaxi));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        return response.getMessage();
    }


    public String editar(int id_mototaxi, String nome, String telefone, String praca) {
        ProxyMototaxi proxyMototaxi = new ProxyMototaxi(id_mototaxi, nome, telefone, praca);
        client.entity.Request request = new client.entity.Request("Mototaxi.editar", ControlParseJSON.createJson(proxyMototaxi));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        return response.getMessage();
    }

    public String remover(int idCliente) {
        ProxyMototaxi proxyMototaxi = new ProxyMototaxi(idCliente, null, null, null);
        client.entity.Request request = new client.entity.Request("Mototaxi.remover", ControlParseJSON.createJson(proxyMototaxi));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        return response.getMessage();
    }

    public Map listar() {
        client.entity.Request request = new client.entity.Request("Mototaxi.listar", null);
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        Map<Integer, ProxyMototaxi> clienteMap = (Map<Integer, ProxyMototaxi>) ControlParseJSON.fromJSON(response.getData(), Map.class);
        return clienteMap;
    }

    public void close() {
        this.controlTCPClient.getConexao().desconectar();
    }
}
