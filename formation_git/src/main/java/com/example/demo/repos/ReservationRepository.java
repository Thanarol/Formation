package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Reservation;
import com.example.demo.entity.SalleFormation;
import com.example.demo.entity.Session;
import com.example.demo.entity.User;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
   List<Reservation> findByDateDebut (Long id, LocalDate dateDebut, LocalDate dateFin, Boolean status, Session session, SalleFormation salleFormation, User user);
}