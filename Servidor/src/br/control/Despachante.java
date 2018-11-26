package control;

import entity.Request;
import entity.Response;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Despachante {


    private ControlParseJSON cpj;
    private Class objRef;
    private Method method;

    public Despachante(){
        this.cpj = new ControlParseJSON();
    }

    public String invoke(String message) throws Exception{
        Request request = (Request) cpj.fromJSON(message, Request.class);
        String [] requestClassWithMethod = request.getMethod().split(".");

        String requestedClass = requestClassWithMethod[0];
        String requestedMethod = requestClassWithMethod[1];

        objRef = Class.forName("control.Esqueleto"+ requestedClass);
        
        method = objRef.getMethod(request.getMethod(), String.class);


        Response resposta = (Response) method.invoke(objRef.newInstance(), requestedMethod);
        
        return cpj.parseJSON(resposta);
                    
    }
}
