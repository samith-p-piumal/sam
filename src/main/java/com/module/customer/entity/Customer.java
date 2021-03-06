package com.module.customer.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

/**
 * Created by samith_k on 2/16/2017.
 */
@Entity
@Table(name = "customer")
@NamedQueries({
        @NamedQuery(name = "Customer.find", query = "select c from Customer c" +
                "  where" +
                "    (:empId is null or c.empId = :empId)")})
public class Customer {//implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long empId;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private Blob image;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
