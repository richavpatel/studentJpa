package com.richa;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.richa.model.User;
import com.richa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}




	@Bean
	CommandLineRunner runner(UserService userService){

		return args -> {
			//read json and write to db

			ObjectMapper objectMapper = new ObjectMapper();
			TypeReference<List<User>> typeReference= new TypeReference<List<User>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("json/user.json");
			try {
				List<User> users = objectMapper.readValue(inputStream,typeReference);
				userService.saveUser(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}


		};
	}
}
