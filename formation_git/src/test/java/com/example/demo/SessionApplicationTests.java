package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repos.SessionRepository;
import com.example.demo.entity.Session;

@SpringBootTest
public class SessionApplicationTests {
	@Autowired
	private SessionRepository sessionRepository;
	
	@Test
	public void testCreateSession(){
		Session ses = new Session();
		sessionRepository.save(ses);
	}
}
