package control;

import entity.Cliente;
import entity.Response;

public class EsqueletoCliente {
	private ControlCliente cCliente;
	private ControlParseJSON cpj;
	private Response response;

	public EsqueletoCliente() {
		this.cCliente = new ControlCliente();
		this.cpj = new ControlParseJSON();
	}

	public Response cadastrar(String clienteJSON){
        Cliente cliente = (Cliente) cpj.fromJSON(clienteJSON, Cliente.class);

	    if(cCliente.cadastrar(cliente)){
	        response = new Response("Cliente cadastrado com sucesso!");
        }else{
	        response = new Response("Um erro ocorreu ao cadastrar cliente!");
        }

        return response;
    }

    public Response listar(){
	    String listaClientesSerializada = this.cpj.parseJSON(cCliente.listarClientes());
	    return new Response("Listando clientes", listaClientesSerializada);
    }

    public Response remover(String clienteJSON){
        Cliente cliente = (Cliente) cpj.fromJSON(clienteJSON, Cliente.class);

        if(cCliente.removerCliente(cliente.getIdCliente())){
            response = new Response("Cliente removido com sucesso!");
        }else{
            response = new Response("Um erro ocorreu ao deletar cliente!");
        }

        return response;
    }
}
