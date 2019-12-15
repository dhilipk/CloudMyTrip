package com.oscar.mytrip.search.service;

import java.util.HashSet;
import java.util.Set;

import com.oscar.mytrip.domain.Customer;

import org.springframework.stereotype.Service;

@Service(value = "customerDetailService")
public class CustomerDetailService {
    private Set<Customer> customerSet = new HashSet<>();

    public CustomerDetailService(){
        Customer customer = new Customer();
        customer.setName("Kumar");
        customer.setNumber("2398fd984");
        customerSet.add(customer);
    }

    public Customer getCustomerByID(String number) {
        if(customerSet.stream().noneMatch(a -> a.getNumber().equals(number))) {
            return customerSet.stream().findAny().get();
        } else {
            return customerSet.stream().filter(a -> a.getNumber().equals(number)).findFirst().get();
        }
    }
}