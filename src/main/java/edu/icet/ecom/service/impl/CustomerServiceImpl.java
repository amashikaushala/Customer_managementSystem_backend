package edu.icet.ecom.service.impl;

import com.fasterxml.jackson.databind.node.ArrayNode;
import edu.icet.ecom.Entity.CustomerEntity;
import edu.icet.ecom.dto.Customer;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;
    final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getall(){
        List<Customer> customerList= new ArrayList<>();
        List<CustomerEntity> all = repository.findAll();

        all.forEach(CustomerEntity ->{
            customerList.add(mapper.map(CustomerEntity,Customer.class));


        });

        return customerList;
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);

    }
@Override
    public void updateCustomer(Customer customer){
        repository.save(mapper.map(customer,CustomerEntity.class));
    }

    @Override
    public Customer SearchById(Integer id) {
        return mapper.map(repository.findById(id),Customer.class);


    }

    @Override
    public List<Customer> SearchByName(String name) {
        List<CustomerEntity> byName=repository.findByName(name);
        List<Customer>customerList=new ArrayList<>();
        byName.forEach(CustomerEntity-> {

            customerList.add(mapper.map(CustomerEntity,Customer.class));

        });
        return customerList;
    }


}
