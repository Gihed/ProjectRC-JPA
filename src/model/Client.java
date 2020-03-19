package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String adresse;

	private int cin;

	private String civilite;

	private String nom;

	private String permis;

	private String prenom;

	private String tel;

	public Client() {
	}
	
	

	public Client(String adresse, int cin, String civilite, String nom, String permis, String prenom,
			String tel) {
		super();
		this.adresse = adresse;
		this.cin = cin;
		this.civilite = civilite;
		this.nom = nom;
		this.permis = permis;
		this.prenom = prenom;
		this.tel = tel;
	}



	public int getId() {
		return this.id;
	}


	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getCivilite() {
		return this.civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPermis() {
		return this.permis;
	}

	public void setPermis(String permis) {
		this.permis = permis;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}