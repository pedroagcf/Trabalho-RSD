package control;

import entity.Mototaxi;

import java.util.HashMap;
import java.util.Map;

public class ControlMototaxi {

    private Map<Integer, Mototaxi> mototaxis;

    public ControlMototaxi(){
        this.mototaxis = new HashMap<>();
    }

    public boolean cadastrarMototaxi(Mototaxi mototaxi){
        if(!this.mototaxis.containsKey(mototaxi.getId_mototaxi())){
            this.mototaxis.put(mototaxi.getId_mototaxi(), mototaxi);
            return true;
        }

        return false;
    }

    public Map listarMototaxis(){
        return this.mototaxis;
    }


}
