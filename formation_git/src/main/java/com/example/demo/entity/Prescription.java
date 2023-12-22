package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity

public class Prescription {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		private LocalDate datePrescription;
		@ManyToOne
		User agent ;
		@ManyToOne
		Formation formation  ;
		
	
		public Prescription( LocalDate datePrescription/*, User agent, Formation formation*/) {
			super();
			this.datePrescription = datePrescription;
			/*this.agent = agent;
			this.formation = formation;*/
		}
		public Prescription() {
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public LocalDate getDatePrescription() {
			return datePrescription;
		}
		public void setDatePrescription(LocalDate localDate) {
			this.datePrescription = localDate;
		}
		public User getAgent() {
			return agent;
		}
		public void setAgent(User agent) {
			this.agent = agent;
		}
		
	

}
