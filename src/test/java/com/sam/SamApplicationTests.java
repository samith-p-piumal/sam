package com.sam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SamApplicationTests {
	SamApplication sa =  new SamApplication();

	@Test
	public void contextLoads() {
	}

	@Test
	public void ma(){
		sa.home("25");
	}

}
