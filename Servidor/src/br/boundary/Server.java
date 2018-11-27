package boundary;

import src.br.entity.TCPServer;

public class Server {
    private static TCPServer server = new TCPServer();

    public static void main(String[] args) {
        try {
            server.keepListen();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
