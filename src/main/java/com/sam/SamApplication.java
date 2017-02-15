
package com.sam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.jdbc.odbc.ee.DataSource;

import java.sql.Connection;
import java.sql.SQLException;


@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
@RestController
public class SamApplication {

	@Autowired
	Environment environment;

	/*@Autowired
	DataSource dataSource;
*/

	public static void main(String[] args) {
		SpringApplication.run(SamApplication.class, args);
	}

	@RequestMapping("/user/{name}")
	@ResponseBody
	String home(@PathVariable String name) {
		/*try {
			Connection connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		return "Hello "+name+ environment.getProperty("app.name");
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