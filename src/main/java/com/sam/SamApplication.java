
package com.sam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}
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