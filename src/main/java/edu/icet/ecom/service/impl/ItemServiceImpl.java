package edu.icet.ecom.service.impl;

import edu.icet.ecom.Entity.CustomerEntity;
import edu.icet.ecom.Entity.ItemEntity;
import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.dto.Item;
import edu.icet.ecom.dto.Product;
import edu.icet.ecom.repository.ItemRepository;
import edu.icet.ecom.repository.ProductRepository;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ItemServiceImpl implements ItemService {


    final ItemRepository repository;
    final ModelMapper mapper;

    @Override
    public void addItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public List<Item> getItem() {
        List<Item> itemList = new ArrayList<>();
        List<ItemEntity> all = repository.findAll();
        all.forEach(ItemEntity -> {
            itemList.add(mapper.map(ItemEntity, Item.class));
        });
        return itemList;
    }


    @Override
    public void deleteItem(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateItem(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
        }
    }

