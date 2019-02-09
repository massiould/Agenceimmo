
import java.util.Date ;

public class BienImmobilier {
	 String adresse ;
	 String orientation;
	 int prix;
	 String dateVente ;
	 String dateDeDisponibilite;
	 int numeroBienImmobilier;
	 static Personne vendeur;
	 Personne acheteur;

	public BienImmobilier (String adresse , String orientation , int prix , String dateVente ,String dateDeDisponibilite ,int numeroBienImmobilier, Personne vendeur){
		this.adresse = adresse;
		this.orientation = orientation ;
		this.prix = prix ;
		this.dateVente = dateVente;
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
	public static Personne getVendeur() {
		return vendeur;
	}
}



