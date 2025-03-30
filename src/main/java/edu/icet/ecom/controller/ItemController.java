package edu.icet.ecom.controller;


import edu.icet.ecom.dto.Item;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Item item){
        service.addItem(item);
    }

    @GetMapping("/getItem")
    public List<Item> getItem() {
        return service.getItem();}

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable Integer id){
        service.deleteItem(id);
    }

    @PutMapping("/update")
    public void updateItem(@RequestBody Item item){
        service.updateItem(item);
    }
}
