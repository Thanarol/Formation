package com.example.demo.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity


public class Reservation {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		private LocalDate dateDebut;
		private LocalDate dateFin;
		private boolean status;
		@ManyToOne
		Session session;
		@ManyToOne
		SalleFormation salleFormation;
		@ManyToOne
		User user;
	
	public Reservation(long id, LocalDate dateDebut, LocalDate dateFin, boolean status, Session session,
				SalleFormation salleFormation, User user) {
			super();
			this.id = id;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.status = status;
			this.session = session;
			this.salleFormation = salleFormation;
			this.user = user;
		}
	public Reservation() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public SalleFormation getSalleFormation() {
		return salleFormation;
	}
	public void setSalleFormation(SalleFormation salleFormation) {
		this.salleFormation = salleFormation;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", status=" + status
				+ ", session=" + session + ", salleFormation=" + salleFormation + ", user=" + user + "]";
	}
	
	
	
}

