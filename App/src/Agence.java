/*
 * @author Kamal Aarab and Massi Ouldrabah
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agence {
	
	String nomAgence;
	List<RDV> listeRDV; 
	List<Annonce> listeAnnonce;
	List<BienImmobilier> listeBienImmobilier;
	List<Personne> listeClient;

	
	public Agence(String nomAgence) {
		this.nomAgence = nomAgence;
		this.listeRDV = new ArrayList<RDV>();
		this.listeAnnonce = new ArrayList<Annonce>();
		this.listeBienImmobilier = new ArrayList<BienImmobilier>();
		this.listeClient = new ArrayList<Personne>();
	}

	/**
	 * Permet d'inscrire un bien immobilier a la vente
	 * 
	 * @param personne, adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier
	 * 
	 */
	void inscrireBienImmo(Personne personne, String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite, int numeroBienImmobilier) {
		BienImmobilier bienImmo = new BienImmobilier(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, personne);
		this.listeBienImmobilier.add(bienImmo);
	}
	
	/**
	 * 
	 */
	void inscrireClient(Personne personne) {
		
	}
	/**
	 * Permet de contacter un acheteur qui a un bien immobilier conforme a son voeux 
	 * 
	 * @param personne
	 * 				Elle prend en parametre la personne a contacter.
	 */


	
	/**
	 * Permet de verifier les voeux 
	 */
	/*
	public ArrayList checkVoeux(Personne P ){
		if  (P.voeux.typeDeBien == ) {
			if(P.voeux.prixSouhaitee <= BienImmobilier.prix )
			
			
		}
	*/

	
	/**
	 * Permet de retirer une annonce de l'agence.
	 * @param Annonce
	 * 				L'annonce a retirer.
	 */
	public void retirerAnnonce(Annonce annonce) {
		this.listeAnnonce.remove(annonce);
	}	

	/**
	 * Permet de recuperer la liste des rendez-vous d'une agence
	 * 
	 * @return listeRDV of Agence
	 */
	public List<RDV> getRDV(){
		return this.listeRDV;
	}

	/**
	 * Permet de recuperer la liste des annonces d'une agence
	 * 
	 * @return listeAnnonce of Agence
	 */
	public List<Annonce> getAnnonce(){
		return this.listeAnnonce;
	}

	/**
	 * Permet de recuperer la liste des bien immobilier d'une agence immobiliere
	 * 
	 * @return listeBienImmobilier of Agence
	 */
	public List<BienImmobilier> getBienImmobilier(){
		return this.listeBienImmobilier;
	}


	public static void main(String[] args) {
		Agence agence = new Agence("Agence Toulouse Mirail");
		agence.inscrireBienImmo("Kamal", "6 rue Louis Pergaut", "sud", 3999999, (2019,3,18), numeroBienImmobilier);
	}

}
