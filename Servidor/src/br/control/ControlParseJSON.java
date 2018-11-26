package control;

import com.google.gson.Gson;

public class ControlParseJSON {

    private Gson gson;

    public ControlParseJSON(){
        this.gson = new Gson();
    }

    public String parseJSON(Object t){
        return this.gson.toJson(t);
    }

    public Object fromJSON(String json, Object c){
        return gson.fromJson(json, c.getClass());
    }
}