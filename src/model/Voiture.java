package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: voiture
 *
 */
@Entity

public class Voiture implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String marque;
	private String modele;
	private int kilometrage;
	private int prix;
	private String statut;
	private static final long serialVersionUID = 1L;

	public Voiture() {
		super();
	} 
	
	
	
	public Voiture(String marque, String modele, int kilometrage, int prix, String statut) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.kilometrage = kilometrage;
		this.prix = prix;
		this.statut = statut;
	}



	public int getId() {
		return this.id;
	}

	
	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}   
	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}   
	public int getKilometrage() {
		return this.kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}   
	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}   
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
   
}
