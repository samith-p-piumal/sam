package com.module.repository;

import com.module.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.List;

/**
 * Created by samith_k on 2/16/2017.
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(final Customer _customer) {
        entityManager.persist(_customer);
        entityManager.flush();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Customer> find(final Customer _customer) {
        Query query = entityManager.createNamedQuery("Customer.find");
        query.setParameter("empId", _customer.getEmpId());

        return query.getResultList();
    }

}
