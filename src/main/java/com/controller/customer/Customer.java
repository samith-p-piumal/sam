
package com.controller.customer;
import com.module.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.controller","com.module"})
public class Customer {

	@Autowired
	Environment environment;


    @Autowired
    CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Customer.class, args);
	}

    @RequestMapping("/user/{name}")
    @ResponseBody
    String home1(@PathVariable String name) {
        com.module.customer.entity.Customer customer = new com.module.customer.entity.Customer();
        customer.setName(name);


        customerService.add(customer);

        return "Hello " + environment.getProperty("app.name");
    }

    @RequestMapping("/user/id/{id}")
    @ResponseBody
    String home2(@PathVariable String id) {
        com.module.customer.entity.Customer customerbean = new com.module.customer.entity.Customer();
        customerbean.setEmpId(Long.parseLong(id));

        customerbean = customerService.getById(customerbean);

        return "Hello "
                //+name"-"
                + customerbean.getName() + " "
                + environment.getProperty("app.name");
    }


}


