
package com.controller.customer;

import com.controller.common.Response;
import com.module.customer.service.CustomerService;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.LoggerConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.controller", "com.module"})
@RequestMapping(consumes = "application/json", produces = "application/json")
public class Customer {

    @Autowired
    Environment environment;


    @Autowired
    CustomerService customerService;

    Logger logger = org.slf4j.LoggerFactory.getLogger(Customer.class);

    public static void main(String[] args) {
        SpringApplication.run(Customer.class, args);
    }

    @RequestMapping(method = RequestMethod.GET,value={"/user/"})

    //@RequestMapping("/user/{name}")
    @ResponseBody
    Response insertCustomer(/*@RequestBody CustomerRequest customerRequest*/) {
        com.module.customer.entity.Customer customer = new com.module.customer.entity.Customer();
        customer.setName("123"/*customerRequest.getName()*/);

        CustomerResponse customerResponse = new CustomerResponse();

        try {

            //logger.info("Request : ",customerRequest);
            customerService.add(customer);

            customerResponse.setName(customer.getEmpId()+"");
            customerResponse.setEmpId(customer.getName());
            customerResponse.setImage(customer.getImage());

            logger.info("Request : ",customerResponse);


        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        return customerResponse;
    }

    @RequestMapping("/user/id/{id}")
    @ResponseBody
    com.module.customer.entity.Customer home2(@PathVariable String id) {
        com.module.customer.entity.Customer customerbean = new com.module.customer.entity.Customer();
        customerbean.setEmpId(Long.parseLong(id));

        customerbean = customerService.getById(customerbean);

        return customerbean;
    }


}


