package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
	Formation findByNomFormation (String nom);
	Formation findByNomFormationContains (String nom);
}