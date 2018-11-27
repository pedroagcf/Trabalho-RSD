package src.client.control;

import src.client.entity.ProxyCorrida;

public class ControlProxyCorrida {
    ControlTCPClient controlTCPClient;

    public ControlProxyCorrida(String ip, int port){
        this.controlTCPClient = new ControlTCPClient(ip, port);
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

    public void close() {
        this.controlTCPClient.getConexao().desconectar();
    }
}
