package stud.sanak.ws_soap_test;

import stud.sanak.ws_soap_test.model.Product;
import stud.sanak.ws_soap_test.services.ProductCatalogI;
import stud.sanak.ws_soap_test.services.ProductCatalogImpl;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "stud.sanak.ws_soap_test.ProductCatalogInterface", portName = "TestCatalogPort", serviceName = "TestCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

    ProductCatalogI productCatalog = new ProductCatalogImpl();

    @Override
    public List<String> getProductCategories() {
        return productCatalog.getProductCategories();
    }

    @Override
    public List<String> getProducts(String category) {
        return productCatalog.getProducts(category);
    }

    @Override
    public boolean addProduct(String category, String product) {
        return productCatalog.addProduct(category, product);
    }

    @Override
    public List<Product> getProductsNew(String category) {
        return productCatalog.getProductsNew(category);
    }
}
