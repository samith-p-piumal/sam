package com.module.service;

import com.module.entity.Customer;
import com.module.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by samith_k on 2/16/2017.
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void add(final Customer _customer) {

        customerRepository.add(_customer);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Customer getById(Customer customer) {

        return customerRepository.find(customer).get(0);
    }
}
