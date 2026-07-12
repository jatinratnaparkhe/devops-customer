package com.devops.customer.repository;

import com.devops.customer.entity.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository repository;

    @Test
    @DisplayName("Should save customer successfully")
    void shouldSaveCustomer() {

        Customer customer = new Customer();

        customer.setFirstName("Jatin");
        customer.setLastName("Ratnaparkhe");
        customer.setEmail("jatin@test.com");
        customer.setPhone("9876543210");
        customer.setAccountNumber("ACC1001");
        customer.setBalance(10000.0);

        Customer savedCustomer = repository.save(customer);

        assertNotNull(savedCustomer);
        assertNotNull(savedCustomer.getId());

    }

}