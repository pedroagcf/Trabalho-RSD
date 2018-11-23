package br.quixada.ufc.rsd.Server;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Despachante {
	
	 Class objRef;
	 Method method;
    
    public String invoke(String message) throws Exception{        
        String[] args = message.split(",");
        
        List<String> list = new ArrayList<String>(Arrays.asList(args));        
      
        objRef = Class.forName("br.quixada.ufc.rsd.Server."
				+ list.get(0) + "Esqueleto");
        
        method = objRef.getMethod(list.get(1), String[].class);
        list.remove(0);
        list.remove(0);
        args = list.toArray(new String[0]);
        
        String resposta = (String) (method.invoke(objRef.newInstance(),
				new Object[]{args})); 
        
        return resposta;
                    
    }
}
