package com.module.service;

import com.module.entity.Customer;

/**
 * Created by samith_k on 2/16/2017.
 */

public interface CustomerService {


    void add(final Customer _customer);

    Customer getById(Customer customer);
}
