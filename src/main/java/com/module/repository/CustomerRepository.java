package com.module.repository;

import com.module.entity.Customer;

import java.util.List;

/**
 * Created by samith_k on 2/16/2017.
 */

public interface CustomerRepository {

    public List<Customer> find(final Customer _customer);

    void add(final Customer _customer);
}
