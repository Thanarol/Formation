package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity


public class Session {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		private float nbMaxParticip;
		private LocalDate dateSession;
		@ManyToOne
		Formation formation;
		@OneToMany(mappedBy = "session")
		
		public float getNbMaxParticip() {
			return nbMaxParticip;
		}

		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		public void setNbMaxParticip(float nbMaxParticip) {
			this.nbMaxParticip = nbMaxParticip;
		}

		public LocalDate getDateSession() {
			return dateSession;
		}

		public void setDateSession(LocalDate dateSession) {
			this.dateSession = dateSession;
		}
		
}
