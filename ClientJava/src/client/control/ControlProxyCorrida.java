package src.client.control;

import src.client.entity.ProxyCorrida;

import java.util.Map;

public class ControlProxyCorrida {
    private ControlTCPClient controlTCPClient;

    public ControlProxyCorrida(ControlTCPClient controlTCPClient){
        this.controlTCPClient = controlTCPClient;
    }

    public String iniciarCorrida(int id_cliente, int id_mototaxi){
        ProxyCorrida proxyCorrida = new ProxyCorrida(id_cliente, id_mototaxi);
        client.entity.Request request = new client.entity.Request("Corrida.iniciarCorrida", ControlParseJSON.createJson(proxyCorrida));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        return response.getMessage();
    }

    public String encerrarCorrida(int id_cliente, int id_mototaxi){
        ProxyCorrida proxyCorrida = new ProxyCorrida(id_cliente, id_mototaxi);
        client.entity.Request request = new client.entity.Request("Corrida.encerrarCorrida", ControlParseJSON.createJson(proxyCorrida));
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        return response.getMessage();
    }

    public Map listar(){
        client.entity.Request request = new client.entity.Request("Corrida.listar", null);
        controlTCPClient.sendRequest(ControlParseJSON.createJson(request));
        client.entity.Response response = (client.entity.Response) ControlParseJSON.fromJSON(controlTCPClient.getResponse(), client.entity.Response.class);
        Map<Integer, ProxyCorrida> corridaMap = (Map<Integer, ProxyCorrida>) ControlParseJSON.fromJSON(response.getData(), Map.class);
        return corridaMap;
    }

    public void close() {
        this.controlTCPClient.getConexao().desconectar();
    }
}
