import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer servidor = HttpServer.create(new InetSocketAddress(8080), 0);

        servidor.createContext("/hello", new HelloHandler());
        servidor.start();
        System.out.println("Servidor rodando em http://localhost:8080/");
    }
}