package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repos.SalleFormationRepository;
import com.example.demo.entity.SalleFormation;

@SpringBootTest
public class SalleFormationApplicationTest {
	@Autowired
	private SalleFormationRepository salleFormationRepository;
	
	@Test
	public void testFindSalleFormation()
	{
		SalleFormation sf = salleFormationRepository.findById(1L).get();
	System.out.println(sf);
	}
	@Test
	public void testUpdateSalleFormation()
	{
		SalleFormation sf = salleFormationRepository.findById(1L).get();
	       sf.setCapacite(12);
		salleFormationRepository.save(sf);
	}

}
