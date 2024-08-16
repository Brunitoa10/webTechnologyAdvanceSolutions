package com.TechnologyAdvanceSolutions.TechnologyAdvanceSolutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.TechnologyAdvanceSolutions.Controladores")
public class TechnologyAdvanceSolutionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologyAdvanceSolutionsApplication.class, args);
	}

}
