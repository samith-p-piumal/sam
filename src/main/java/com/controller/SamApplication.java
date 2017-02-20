
package com.controller;
import com.module.entity.Customer;
import com.module.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
@RestController
@ComponentScan(basePackages = {"com"})
public class SamApplication {

	@Autowired
	Environment environment;


    @Autowired
    CustomerService customerService;

	/*public CustomerService getCustomerService() {
		return customerService;
	}*/


	/*public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SamApplication.class, args);
	}


    @RequestMapping("/user/{name}")
    @ResponseBody
    String home1(@PathVariable String name) {
        Customer customer = new Customer();
        customer.setName(name);


        customerService.add(customer);

        return "Hello "
                //+name"-"
                //+customerService.getCustomer().getName()
                + environment.getProperty("app.name");
    }

    @RequestMapping("/user/id/{id}")
    @ResponseBody
    String home2(@PathVariable String id) {
        Customer customerbean = new Customer();
        customerbean.setEmpId(Long.parseLong(id));

        customerbean = customerService.getById(customerbean);

        return "Hello "
                //+name"-"
                + customerbean.getName() + " "
                + environment.getProperty("app.name");
    }


}


