package client.entity;

public class Response {
    private String message;
    private String data;

    public Response (String message, String data) {
        this.message = message;
        this.data = data;
    }

    public Response(String message){
        this.message = message;
        this.data = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}