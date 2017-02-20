package com.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@ComponentScan(basePackages = {"com.module"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class SamApplicationTests {
	SamApplication sa =  new SamApplication();

	@Test
	public void contextLoads() {
	}

	/*@Test
	public void ma(){
		sa.home1();
	}
*/
}
