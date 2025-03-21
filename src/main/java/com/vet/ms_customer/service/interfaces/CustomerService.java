package com.vet.ms_customer.service.interfaces;

import com.vet.ms_customer.persistence.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
}
