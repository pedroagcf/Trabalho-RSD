package client.entity;

public class Request {
    private String method;
    private String data;

    public Request(String method, String data) {
        this.method = method;
        this.data = data;
    }
}
