package control;

import entity.Mototaxi;
import entity.Response;

public class EsqueletoMototaxi {

    private ControlMototaxi cMototaxi;
    private ControlParseJSON cpj;
    private Response response;

    public EsqueletoMototaxi() {
        this.cMototaxi = ControlMototaxi.getInstance();
        this.cpj = new ControlParseJSON();
    }

    public Response cadastrar(String mototaxiJSON){
        Mototaxi mototaxi = (Mototaxi) cpj.fromJSON(mototaxiJSON, Mototaxi.class);

        if(cMototaxi.cadastrarMototaxi(mototaxi)){
            response = new Response("Mototáxi cadastrado com sucesso!");
        }else {
            response = new Response("Um erro ocorreu ao cadastrar mototáxi!");
        }

        return response;
    }

    public Response editar(String mototaxiJSON) {
        Mototaxi mototaxi = (Mototaxi) cpj.fromJSON(mototaxiJSON, Mototaxi.class);

        if (cMototaxi.editar(mototaxi))
            return new Response("Mototaxi editado com sucesso!");
        return new Response("Um erro ocorreu ao editar mototaxi!");
    }

    public Response remover(String mototaxiJSON){
        Mototaxi mototaxi = (Mototaxi) cpj.fromJSON(mototaxiJSON, Mototaxi.class);

        if(cMototaxi.removerMototaxi(mototaxi.getId_mototaxi())){
            response = new Response("Mototaxi removido com sucesso!");
        }else{
            response = new Response("Um erro ocorreu ao deletar mototaxi!");
        }
        return response;
    }

    public Response listar(String mototaxiJSON){
        String listaMototaxisSerializada = this.cpj.parseJSON(cMototaxi.listarMototaxis());
        return new Response("Listando mototáxis", listaMototaxisSerializada);
    }
}