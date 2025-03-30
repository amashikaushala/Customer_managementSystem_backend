package edu.icet.ecom.repository;

import edu.icet.ecom.Entity.ItemEntity;
import edu.icet.ecom.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    List<ProductEntity> findByName(String name);
}
