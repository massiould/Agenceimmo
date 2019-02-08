
/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.Date ;

public class BienImmobilier {
	String adresse ;
	String orientation;
	int prix;
	//Date en string car par encore g�r�
	String dateVente;
	String dateDeDisponibilite;
	int numeroBienImmobilier = 0;
	Personne vendeur;
	Personne acheteur;

	public BienImmobilier (String adresse , String orientation , int prix, String dateDeDisponibilite, Personne vendeur){
		this.adresse = adresse;
		this.orientation = orientation ;
		this.prix = prix ;
		this.dateVente = null;
		this.dateDeDisponibilite = dateDeDisponibilite;
		this.numeroBienImmobilier = numeroBienImmobilier +1;
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
	
	public String toString() {
		return "Bien immobilier num�ro "+ this.numeroBienImmobilier+"vendu par "+this.vendeur;
	}
}



