package com.example.mdbspringboot;


import com.example.mdbspringboot.Repository.UserRepository;
import com.example.mdbspringboot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MdbSpringBootApplication {




	public static void main(String[] args) {
		SpringApplication.run(MdbSpringBootApplication.class, args);
	}



}
