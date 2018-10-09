package stud.sanak.ws_soap_test;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/productService", new ProductCatalog());
    }
}
