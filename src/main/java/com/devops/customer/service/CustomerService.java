package com.devops.customer.service;

import com.devops.customer.entity.Customer;
import jakarta.validation.Valid;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer updateCustomer(Customer customer);
}