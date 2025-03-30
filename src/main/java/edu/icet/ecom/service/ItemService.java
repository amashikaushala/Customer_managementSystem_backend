package edu.icet.ecom.service;


import edu.icet.ecom.dto.Item;

import java.util.List;

public interface ItemService {
    void addItem (Item item);
    List<Item> getItem();
    void deleteItem(Integer id);
    void updateItem(Item item);

}





