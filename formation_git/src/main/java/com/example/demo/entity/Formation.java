package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity


public class Formation {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long idFormation;
		@OneToMany(mappedBy = "formation")
		Set<Session> session;
		private String nomFormation;
		@Column(nullable = false)
		private String description;
		private float cout ;
		private int duree ;
		@Column(nullable = false)
		private LocalDate dateCreation ;
		
		
		
		public Formation( String nomFormation, String description, float cout, int duree,
				LocalDate dateCreation) {
			super();
			this.nomFormation = nomFormation;
			this.description = description;
			this.cout = cout;
			this.duree = duree;
			this.dateCreation = dateCreation;
		}
		public Formation() {
			// TODO Auto-generated constructor stub
		}
		public float getCout() {
			return cout;
		}
		public void setCout(float cout) {
			this.cout = cout;
		}
		public int getDuree() {
			return duree;
		}
		public void setDuree(int duree) {
			this.duree = duree;
		}
		public LocalDate getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(LocalDate dateCreation) {
			this.dateCreation = dateCreation;
		}
		public Long getIdFormation() {
			return idFormation;
		}
		public void setIdFormation(Long idFormation) {
			this.idFormation = idFormation;
		}
		public String getNomFormation() {
			return nomFormation;
		}
		public void setNomFormation(String nomFormation) {
			this.nomFormation = nomFormation;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		

}
