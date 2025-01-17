package com.coviam.team3bookstorebackend.customer.service.serviceimpl;

import com.coviam.team3bookstorebackend.customer.entity.Customer;
import com.coviam.team3bookstorebackend.customer.repositery.CustomerRepositery;
import com.coviam.team3bookstorebackend.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    CustomerRepositery customerRepositery;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepositery.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepositery.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(String customer_id) {
        return customerRepositery.findById(customer_id);
    }

    @Override
    public String getEmail(String customer_id) {
       Customer customer= customerRepositery.findById(customer_id).get();
       return customer.getEmail();
    }

    @Override
    public String getName(String customer_id) {
        return customerRepositery.findById(customer_id).get().getName();
    }
}
