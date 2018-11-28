package control;

import entity.Corrida;
import entity.Response;

public class EsqueletoCorrida {
    private ControlCorrida controlCorrida;
    private ControlParseJSON controlParseJSON;

    public EsqueletoCorrida(){
        this.controlCorrida = ControlCorrida.getInstance();
        this.controlParseJSON = new ControlParseJSON();
    }

    public Response iniciarCorrida(String corridaJSON){
        Corrida corrida = (Corrida) controlParseJSON.fromJSON(corridaJSON, Corrida.class);

        if(controlCorrida.iniciarCorrida(corrida)){
            return new Response("Corrida iniciada com sucesso!");
        }

        return new Response("Houve um erro ao iniciar a corrida!");
    }

    public Response encerrarCorrida(String corridaJSON){
        Corrida corrida = (Corrida) controlParseJSON.fromJSON(corridaJSON, Corrida.class);

        if(controlCorrida.encerrarCorrida(corrida)){
            return new Response("Corrida encerrada com sucesso!");
        }

        return new Response("Houve um erro ao encerrar a corrida!");
    }

    public Response listar(String corridaRequestJSON){
        String listaCorridasSerializada = this.controlParseJSON.parseJSON(controlCorrida.listar());
        return new Response("Listando corridas", listaCorridasSerializada);
    }
}
