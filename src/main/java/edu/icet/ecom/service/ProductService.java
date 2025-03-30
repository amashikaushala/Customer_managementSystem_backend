package edu.icet.ecom.service;

import edu.icet.ecom.dto.Item;
import edu.icet.ecom.dto.Product;

import java.util.List;

public interface ProductService {
    void addProduct (Product product);
    List<Product> getProduct();
    void deleteProduct(Integer id);
    void updateProduct(Product product);


}
