package stud.sanak.ws_soap_test.services;

import stud.sanak.ws_soap_test.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogImpl implements ProductCatalogI {

    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductCatalogImpl() {
        bookList.add("Book 1");
        bookList.add("Book 2");
        bookList.add("Book 3");

        musicList.add("Music 1");
        musicList.add("Music 2");
        musicList.add("Music 3");

        movieList.add("Movie 1");
        movieList.add("Movie 2");
        movieList.add("Movie 3");
    }

    @Override
    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    @Override
    public List<String> getProducts(String category) {
        switch (category) {
            case "books":
                return bookList;
            case "movies":
                return movieList;
            case "music":
                return musicList;
            default:
                return null;
        }
    }

    @Override
    public boolean addProduct(String category, String product) {
        switch (category) {
            case "books":
                bookList.add(product);
                return true;
            case "movies":
                movieList.add(product);
                return true;
            case "music":
                musicList.add(product);
                return true;
        }
        return false;
    }

    @Override
    public List<Product> getProductsNew(String category) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Java book", "prog", 1200));
        products.add(new Product("JavaScript book", "prog", 1500));
        products.add(new Product("Earth book", "Science", 900));
        products.add(new Product("Harry Potter", "Novel", 500));
        return products;
    }
}
