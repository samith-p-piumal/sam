package com.module.service;

import com.module.entity.Customer;
import com.module.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    private CustomerRepository repository;

  /*  public Customer getCustomer(){

        return customerRepository.getCustomer();
    }*/

/*
    public void create(){
        Customer customer = new Customer();
        customer.setName("sdferwer");
        customer.setEmpId(1L);

        customerRepository.create(customer);

    }
*/

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void add(final Customer _customer) {
        repository.add(_customer);
    }
}
