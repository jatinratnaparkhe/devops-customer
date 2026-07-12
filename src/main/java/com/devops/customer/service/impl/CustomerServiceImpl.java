package com.devops.customer.service.impl;

import com.devops.customer.entity.Customer;
import com.devops.customer.exception.ResourceNotFoundException;
import com.devops.customer.repository.CustomerRepository;
import com.devops.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Customer not found with id: " + id));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {

        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException(
                    "Customer not found with id: " + id);
        }

        repository.deleteById(id);
    }
}