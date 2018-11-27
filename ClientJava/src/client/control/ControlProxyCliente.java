package src.client.control;

import client.entity.ProxyCliente;
import client.entity.Request;
import client.entity.Response;
import java.util.Map;

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


    public String editar(int idCliente, String nome, String telefone) {
        ProxyCliente proxyCliente = new ProxyCliente(idCliente, nome, telefone);
        Request request = new Request("Cliente.editar", ControlParseJSON.createJson(proxyCliente));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        Response response = (Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), Response.class);
        return response.getMessage();
    }

    public String remover(int idCliente) {
        ProxyCliente proxyCliente = new ProxyCliente(idCliente, null, null);
        Request request = new Request("Cliente.remover", ControlParseJSON.createJson(proxyCliente));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        Response response = (Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), Response.class);
        return response.getMessage();
    }

    public Map listar() {
        Request request = new Request("Cliente.listar", null);
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        Response response = (Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), Response.class);
        Map<Integer, ProxyCliente> clienteMap = (Map<Integer, ProxyCliente>) ControlParseJSON.fromJSON(response.getData(), Map.class);
        return clienteMap;
    }

//    public void solicitarCorrida(String praca) {

//    }

    public void close() {
        this.controlTCPClient.getConexao().desconectar();
    }
}
