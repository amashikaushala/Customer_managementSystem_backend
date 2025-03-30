package edu.icet.ecom.service;

import edu.icet.ecom.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer (Customer customer);
    List<Customer> getall();
    void deleteCustomer(Integer id);
    void updateCustomer(Customer customer);
    Customer SearchById(Integer id);
    List<Customer> SearchByName(String name);
}
