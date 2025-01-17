package com.coviam.team3bookstorebackend.customer.service;

import com.coviam.team3bookstorebackend.customer.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer);

    Optional<Customer> getCustomer(String customer_id);

    Iterable<Customer> findAll();

    String getEmail(String customer_id);

    String getName(String customer_id);
}
