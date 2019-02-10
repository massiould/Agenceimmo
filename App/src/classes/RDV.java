package classes;
/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.io.Serializable;

public class RDV implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7482020368226344875L;
	String dateRDV;
	TypeRDV typeRDV;
	Personne vendeur;
	Personne acheteur;

	public RDV(String dateRDV, TypeRDV typeRDV, Personne vendeur, Personne acheteur) {
		this.dateRDV = dateRDV;
		this.typeRDV = typeRDV;
		this.vendeur = vendeur;
		this.acheteur = acheteur;
	}
	
	/**
	 * Constructeur spécifique pour le rendez-vous mandat qui ne concerce que le vendeur ou bien rendez-vous visite propre à un client
	 * @param dateRDV
	 * @param typeRDV
	 * @param vendeur
	 */
	public RDV(String dateRDV, TypeRDV typeRDV, Personne vendeur) {
		this.dateRDV = dateRDV;
		this.typeRDV = typeRDV;
		this.vendeur = vendeur;		
	}
}