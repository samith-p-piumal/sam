package com.module.customer.service;

import com.module.customer.entity.Customer;

/**
 * Created by samith_k on 2/16/2017.
 */

public interface CustomerService {


    void add(final Customer _customer);

    Customer getById(Customer customer);
}
