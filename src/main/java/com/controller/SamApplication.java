
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
@ComponentScan(basePackages = {"com.controller"})
public class SamApplication {

	@Autowired
	Environment environment;

	@Autowired
    CustomerService customerService;

	/*@Autowired
	DataSource dataSource;
*/

	public static void main(String[] args) {
		SpringApplication.run(SamApplication.class, args);
	}

	/*@RequestMapping("/user")
	@ResponseBody
	//String home(@PathVariable String name) {
	String home() {

		*//*try {
			Connection connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}*//*
        Customer customer = new Customer();
        customer.setEmpId(23L);
        customer.setName("sagafgag");


		customerService.add(customer);

		return "Hello "
				//+name"-"
				//+customerService.getCustomer().getName()
				+ environment.getProperty("app.name");
	}*/

    @RequestMapping("/user/{name}")
    @ResponseBody
    String home1(@PathVariable String name) {
        Customer customer = new Customer();
        customer.setEmpId(23L);
        customer.setName(name);


        customerService.add(customer);

        return "Hello "
                //+name"-"
                //+customerService.getCustomer().getName()
                + environment.getProperty("app.name");
    }

   /* @RequestMapping("/error1")
    @ResponseBody
    String home2() {
        return "Hello error";
    }*/

}


/*import org.springframework.boot.*;
		import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.*;
		import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SamApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SamApplication.class, args);
	}
}*/