package com.example.demo.repos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Formation;
import com.example.demo.entity.Prescription;
import com.example.demo.entity.User;

public interface PrescriptionRepository extends CrudRepository<Prescription, Long> {
   List<Prescription> findByDatePrescription (Long id, LocalDate datePrescription, User agent, Formation formation);
}