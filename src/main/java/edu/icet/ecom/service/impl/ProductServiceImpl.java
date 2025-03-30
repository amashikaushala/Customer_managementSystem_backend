package edu.icet.ecom.service.impl;

import edu.icet.ecom.Entity.ItemEntity;
import edu.icet.ecom.Entity.ProductEntity;
import edu.icet.ecom.dto.Item;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.repository.ItemRepository;
import edu.icet.ecom.repository.ProductRepository;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductServiceImpl implements ProductService {


    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public void addProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));
    }

    @Override
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();
        List<ProductEntity> all = repository.findAll();
        all.forEach(ProductEntity -> {
            productList.add(mapper.map(ProductEntity, Product.class));
        });
        return productList;
    }

    @Override
    public void deleteProduct(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateProduct(Product product) {
        repository.save(mapper.map(product, ProductEntity.class));
    }
}
