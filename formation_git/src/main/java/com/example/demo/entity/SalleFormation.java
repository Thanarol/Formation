package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity


public class SalleFormation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private int capacite;
	public String nomSalle;
	
	public SalleFormation() {}
		public SalleFormation( int capacite , String nomSalle) {
		// TODO Auto-generated constructor stub
			this.capacite = capacite ;
			this.nomSalle  = nomSalle ;
	}
		public Long getIdSalleFormation() {
		return id;
	}
	public void setIdSalleFormation(Long idSalleFormation) {
		this.id = idSalleFormation;
	}
	

		
		public int getCapacite() {
			return capacite;
		}
		public void setCapacite(int capacite) {
			this.capacite = capacite;
		}
		
		public String getNomSalle() {
			return nomSalle;
		}
		public void setNomSalle(String nomSalle) {
			this.nomSalle = nomSalle;
		}
		@OneToMany(mappedBy = "salleFormation")
		Set<Reservation> reservation;
}