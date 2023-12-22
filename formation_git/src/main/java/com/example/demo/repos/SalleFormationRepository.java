package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.SalleFormation;

public interface SalleFormationRepository extends CrudRepository<SalleFormation, Long> {
   List<SalleFormation> findByNomSalle(Long id, int capacite, String nomSalle);
}