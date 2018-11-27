package control;

import entity.Corrida;

import java.util.HashMap;
import java.util.Map;

public class ControlCorrida {
    private Map<Integer, Corrida> corridas;
    private ControlMototaxi controlMototaxi;
    private ControlCliente controlCliente;
    private static ControlCorrida uniqueInstance;

    public static synchronized ControlCorrida getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new ControlCorrida();
        }

        return uniqueInstance;
    }

    private ControlCorrida(){
        this.corridas = new HashMap<>();
        this.controlMototaxi = ControlMototaxi.getInstance();
        this.controlCliente = ControlCliente.getInstance();
    }

    public boolean iniciarCorrida(Corrida corrida){
        if(!this.corridas.containsKey(corrida.getId_mototaxi())){
            this.corridas.put(corrida.getId_mototaxi(),corrida);
            return true;
        }

        return false;
    }

    public boolean encerrarCorrida(Corrida corrida){
        if(this.corridas.containsKey(corrida.getId_mototaxi())){
            if(this.controlCliente.existeCliente(corrida.getId_cliente()) && this.controlMototaxi.existeMototaxi(corrida.getId_mototaxi())){
                this.corridas.remove(corrida.getId_mototaxi());
                return true;
            }

            return false;
        }

        return false;
    }
}
