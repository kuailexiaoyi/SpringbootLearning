package com.zrblog.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot");

			String[] names = ctx.getBeanDefinitionNames();

			Arrays.sort(names);

			for(String bean:names){
				System.out.println(bean);
			}
		};
	}*/
}
