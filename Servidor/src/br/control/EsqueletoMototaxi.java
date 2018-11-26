package control;

import entity.Mototaxi;
import entity.Response;

import java.util.ArrayList;

public class EsqueletoMototaxi {

    private ControlMototaxi cMototaxi;
    private ControlParseJSON cpj;
    private Response response;

    public EsqueletoMototaxi() {
        this.cMototaxi = new ControlMototaxi();
        this.cpj = new ControlParseJSON();
    }

    public Response cadastrarMototaxi(String mototaxiJSON){
        Mototaxi mototaxi = (Mototaxi) cpj.fromJSON(mototaxiJSON, Mototaxi.class);

        if(cMototaxi.cadastrarMototaxi(mototaxi)){
            response = new Response("Mototáxi cadastrado com sucesso!");
        }else {
            response = new Response("Um erro ocorreu ao cadastrar mototáxi!");
        }

        return response;
    }

    public Response listarMototaxis(){
        String listaMototaxisSerializada = this.cpj.parseJSON(cMototaxi.listarMototaxis());
        return new Response("Listando mototáxis", listaMototaxisSerializada);
    }
}