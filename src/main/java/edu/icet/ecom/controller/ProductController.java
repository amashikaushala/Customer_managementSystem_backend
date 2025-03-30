package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Item;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.ItemService;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Product product){
        service.addProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct() {
        return service.getProduct();}

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id){
        service.deleteProduct(id);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
}
