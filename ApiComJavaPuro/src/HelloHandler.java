import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            String resposta = "Olá, Mundo!";
            exchange.sendResponseHeaders(200, resposta.getBytes().length);

            OutputStream os = exchange.getResponseBody();
            os.close();
        } else {
            exchange.sendResponseHeaders(405, -1);
        }
    }
}
