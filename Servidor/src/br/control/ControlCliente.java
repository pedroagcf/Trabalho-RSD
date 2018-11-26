package control;

import entity.Cliente;

import javax.crypto.Cipher;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControlCliente {
    private Map<Integer, Cliente> clientes;

    public ControlCliente(){
        this.clientes = new HashMap<>();
    }

    public boolean cadastrar(Cliente cliente){
        if(!this.clientes.containsKey(cliente.getId_cliente())){
            this.clientes.put(cliente.getId_cliente(), cliente);
            return true;
        }

        return false;
    }

    public Map listarClientes(){
        return this.clientes;
    }

    public boolean removerCliente(int id_cliente){
        if(!this.clientes.containsKey(id_cliente)){
            this.clientes.remove(id_cliente);
            return true;
        }

        return false;
    }


}
