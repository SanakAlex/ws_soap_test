package stud.sanak.ws_soap_test.services;

import stud.sanak.ws_soap_test.model.Product;

import java.util.List;

public interface ProductCatalogI {

    List<String> getProductCategories();

    List<String> getProducts(String category);

    boolean addProduct(String category, String product);

    List<Product> getProductsNew(String category);
}
