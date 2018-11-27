package client.control;

import com.google.gson.Gson;

public class ControlParseJSON {

    public static String createJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    public static Object fromJSON(String json, Class c) {
        Gson gson = new Gson();
        return gson.fromJson(json, c);
    }
}
