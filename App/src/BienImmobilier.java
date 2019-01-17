/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.Date ;

public class BienImmobilier {
	String adresse ;
	String orientation;
	int prix;
	Date dateVente;
	Date dateDeDisponibilite;
	int numeroBienImmobilier;
	Personne vendeur;
	Personne acheteur;

	public BienImmobilier (String adresse , String orientation , int prix, Date dateDeDisponibilite ,int numeroBienImmobilier, Personne vendeur){
		this.adresse = adresse;
		this.orientation = orientation ;
		this.prix = prix ;
		this.dateVente = null;
		this.dateDeDisponibilite = dateDeDisponibilite;
		this.numeroBienImmobilier = numeroBienImmobilier;
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
	public Date getDateVente(){
		return this.dateVente;
	}
	
	/**
	 * 
	 * @return dateDeDisponibilite of BienImmobilier
	 */
	public Date getDateDeDisponibilite(){
		return this.dateDeDisponibilite;
	}
	
	/**
	 * 
	 * @return numeroBienImmobilier of BienImmobilier
	 */
	public int getnumeroBienImmobilier(){
		return this.numeroBienImmobilier;
	}

	/**
	 * @return the vendeur of BienImmobilier
	 */
	public Personne getVendeur() {
		return this.vendeur;
	}
}



