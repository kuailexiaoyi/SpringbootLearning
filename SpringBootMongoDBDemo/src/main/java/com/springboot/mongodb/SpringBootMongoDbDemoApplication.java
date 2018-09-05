package com.springboot.mongodb;

import com.springboot.mongodb.dao.CustomerMapper;
import com.springboot.mongodb.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoDbDemoApplication implements CommandLineRunner{

	@Autowired
	private CustomerMapper repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		repository.deleteAll();

		//save a couple of customer
		repository.save(new Customer("Alick","Smith"));
		repository.save(new Customer("Bob","Smitha"));

		//fatch All Customers
		System.out.println("Customer found with findAll()");
		for (Customer customer : repository.findAll()){
			System.out.println(customer);
		}

		System.out.println();

		System.out.println("Customer find with findFirstName('Alice')");

		System.out.println(repository.findByFirstName("Alick"));

		System.out.println("Customer find with findLastName('Smith')");

		System.out.println(repository.findByLastName("Smitha"));
	}
}
