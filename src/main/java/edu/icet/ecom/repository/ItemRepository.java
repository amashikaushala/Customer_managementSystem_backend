package edu.icet.ecom.repository;

import edu.icet.ecom.Entity.CustomerEntity;
import edu.icet.ecom.Entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<ItemEntity,Integer> {
    List<ItemEntity> findByName(String name);
}
