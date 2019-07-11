package org.usersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.usersystem.entities.User;
import org.usersystem.repositories.UserRepository;

@SpringBootApplication
public class UserApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("phelo", "mpalala"));
		userRepository.save(new User("sneh", "mpalala"));
		userRepository.save(new User("lee", "mpalala"));
		
	}
}
