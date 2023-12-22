package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Reservation;

public interface ReservationService {
	Reservation saveReservation(Reservation r);
	Reservation updateReservation(Reservation r);
	void deleteReservation(Reservation r);
	void deleteReservationById(Long id);
	Reservation getReservation(Long id);
	List<Reservation> getAllReservations();
}
