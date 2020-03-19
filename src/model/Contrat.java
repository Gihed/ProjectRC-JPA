package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: contrat
 *
 */
@Entity

public class Contrat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero_contrat;

	private Date date_debut;

	private Date date_fin;

	@ManyToOne
	@JoinColumn(name = "id_client", nullable = false)
	private Client client;

	@ManyToOne
	@JoinColumn(name = "id_voiture", nullable = false)
	private Voiture voiture;

	private static final long serialVersionUID = 1L;

	// bi-directional many-to-many association to Contrat
	@ManyToMany
	@JoinTable(
		name="contrat_service"
		, joinColumns={
			@JoinColumn(name="id_contrat")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_service")
			}
		)

	private List<Service> services;

	/**
	 * @param numero_contrat
	 * @param date_debut
	 * @param date_fin
	 * @param client
	 */
	public Contrat(Date date_debut, Date date_fin, Client client, Voiture voiture) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.client = client;
		this.voiture = voiture;
	}

	public Contrat() {
		super();
	}

	public int getNumero_contrat() {
		return numero_contrat;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	

}
