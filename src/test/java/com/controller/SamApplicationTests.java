package com.controller;

import com.controller.customer.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@ComponentScan(basePackages = {"com.module"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class SamApplicationTests {
	Customer sa =  new Customer();

	@Test
	public void contextLoads() {
	}

	/*@Test
	public void ma(){
		sa.home1();
	}
*/
}
