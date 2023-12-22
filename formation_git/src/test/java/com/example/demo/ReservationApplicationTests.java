package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Reservation;
import com.example.demo.repos.ReservationRepository;

@SpringBootTest
public class ReservationApplicationTests {
	@Autowired
	private ReservationRepository reservationRepository;
	
	@Test
	public void testFindReservation()
	{
		Reservation res = reservationRepository.findById(1L).get();
	System.out.println(res);
	}
	@Test
	public void testUpdateReservation()
	{
		Reservation res = reservationRepository.findById(1L).get();
	    res.setStatus(true);
	    reservationRepository.save(res);
	}
}