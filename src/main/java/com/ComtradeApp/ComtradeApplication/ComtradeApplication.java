package com.ComtradeApp.ComtradeApplication;

import com.ComtradeApp.ComtradeApplication.model.HelloWorldModel;
import com.ComtradeApp.ComtradeApplication.repository.HelloWorldRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComtradeApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(ComtradeApplication.class, args);

		HelloWorldRepository helloWorldRepository =
				configurableApplicationContext.getBean(HelloWorldRepository.class);

		HelloWorldModel helloWorldModel = new HelloWorldModel("test", "te");
	}

	@GetMapping({"/hello-rest"})
	public String hello() {
		return "Hello World";
	}

}
