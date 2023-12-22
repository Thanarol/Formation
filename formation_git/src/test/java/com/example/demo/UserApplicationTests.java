package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repos.UserRepository;
import com.example.demo.entity.User;

@SpringBootTest
public class UserApplicationTests {
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void testCreateUser(){
		User us = new User("Bruno", "Lemaire", "Brunolm@gmail.com", "Brunoleplusbeau", "role", "40 rue du Limousin");
		userRepository.save(us);
	}
}
