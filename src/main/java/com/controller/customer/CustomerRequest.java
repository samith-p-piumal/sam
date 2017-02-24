package com.controller.customer;

import com.controller.common.Request;

import java.sql.Blob;

/**
 * Created by samith_k on 2/24/2017.
 */
public class CustomerRequest extends Request{

    private String empId;
    private String name;
    private Blob image;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
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
