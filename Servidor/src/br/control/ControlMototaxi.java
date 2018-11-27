package control;

import entity.Mototaxi;

import java.util.HashMap;
import java.util.Map;

public class ControlMototaxi {
    private Map<Integer, Mototaxi> mototaxis;
    private static ControlMototaxi uniqueInstance;

    public static synchronized ControlMototaxi getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new ControlMototaxi();
        return uniqueInstance;
    }

    private ControlMototaxi(){
        this.mototaxis = new HashMap<>();
    }

    public boolean cadastrarMototaxi(Mototaxi mototaxi){
        if(!this.mototaxis.containsKey(mototaxi.getId_mototaxi())){
            this.mototaxis.put(mototaxi.getId_mototaxi(), mototaxi);
            return true;
        }

        return false;
    }

    public boolean editar(Mototaxi mototaxi) {
        if (this.mototaxis.containsKey(mototaxi.getId_mototaxi())) {
            this.mototaxis.replace(mototaxi.getId_mototaxi(), mototaxi);
            return true;
        }
        return false;
    }

    public boolean removerMototaxi(int id_cliente){
        if(this.mototaxis.containsKey(id_cliente)){
            this.mototaxis.remove(id_cliente);
            return true;
        }
        return false;
    }

    public Map listarMototaxis(){
        return this.mototaxis;
    }

    public boolean existeMototaxi(int id_mototaxi){
        return this.mototaxis.containsKey(id_mototaxi);
    }
}
