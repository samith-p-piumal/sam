package com.module.repository;

import com.module.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Calendar;

/**
 * Created by samith_k on 2/16/2017.
 */
@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(final Customer _customer) {
        entityManager.persist(_customer);
        entityManager.flush();
    }

  /*  public Customer getCustomer(){
        return entityManager.find(Customer.class,1);

    }*/

}
