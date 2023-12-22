package com.example.demo;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Prescription;
import com.example.demo.repos.PrescriptionRepository;

@SpringBootTest
public class PrescriptionApplicationTests {
	@Autowired
	private PrescriptionRepository prescriptionRepository;
	
	@Test
	public void testCreatePrescription() {
		LocalDate ld = LocalDate.now() ;
		Prescription presc = new Prescription(ld);
		prescriptionRepository.save(presc);
	}
	
	@Test
	public void testFindPrescription()
	{
	Prescription presc = prescriptionRepository.findById(1L).get();
	System.out.println(presc);
	}
	@Test
	public void testUpdatePrescription()
	{
	Prescription presc = prescriptionRepository.findById(1L).get();
	LocalDate ld = LocalDate.now() ;
	presc.setDatePrescription(ld);
	prescriptionRepository.save(presc);
	}
}
