package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	private Date dateReservation;
	private int nbJours;
	@ManyToOne
	private Hotel hotel;
	@ManyToOne
	private Voyageur voyageur;
	
	public Reservation() {
		
	}

	public Reservation(Date dateReservation, int nbJours, Hotel hotel, Voyageur voyageur) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.hotel = hotel;
		this.voyageur = voyageur;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}

	@Override
	public String toString() {
		return "Reservation [idVoyageur=" + idVoyageur + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ ", hotel=" + hotel + "]";
	}
	
}
