package stud.sanak.ws_soap_test;

import stud.sanak.ws_soap_test.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "TestCatalog", targetNamespace = "http://soaptest.com")
public interface ProductCatalogInterface {
    @WebMethod(action = "fetch_categories", operationName = "fetchCategory")
    List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    boolean addProduct(String category, String product);

    @WebMethod
    @WebResult(name = "product")
    List<Product> getProductsNew(String category);
}
