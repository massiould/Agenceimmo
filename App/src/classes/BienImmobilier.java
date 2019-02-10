package classes;

import java.io.Serializable;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */


public class BienImmobilier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7749136572413808196L;
	String adresse ;
	String orientation;
	int prix;
	String dateVente;
	String dateDeDisponibilite;
	Personne vendeur;
	Personne acheteur;

	public BienImmobilier (String adresse , String orientation , int prix, String dateDeDisponibilite, Personne vendeur){
		this.adresse = adresse;
		this.orientation = orientation ;
		this.prix = prix ;
		this.dateVente = null;
		this.dateDeDisponibilite = dateDeDisponibilite;
		this.vendeur = vendeur;
		this.acheteur = null;
	}

	/**
	 * 
	 * @return adresse of BienImmobilier
	 */
	public String getAdresse(){
		return this.adresse;
	}
	
	/**
	 * 
	 * @return orientation of BienImmobilier
	 */
	
	public String getOrientation(){
		return this.orientation;
	}
	
	/**
	 * 
	 * @return prix of BienImmobilier
	 */
	public int getPrix(){
		return this.prix;
	}
	
	/**
	 * 
	 * @return dateVente of BienImmobilier
	 */
	public String getDateVente(){
		return this.dateVente;
	}
	
	/**
	 * 
	 * @return dateDeDisponibilite of BienImmobilier
	 */
	public String getDateDeDisponibilite(){
		return this.dateDeDisponibilite;
	}
	
	/**
	 * @return the vendeur of BienImmobilier
	 */
	public Personne getVendeur() {
		return this.vendeur;
	}
	
	public String toString() {
		return "Prix : "+ this.prix + " Adresse : "+ this.adresse;
	}
}



