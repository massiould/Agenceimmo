/*
 * @author Kamal Aarab
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agence {

	private List<RDV> listeRDV; 
	private List<Annonce> listeAnnonce;
	private List<BienImmobilier> listeBienImmobilier;

	public Agence(List<RDV> listeRDV, List<Annonce> listeAnnonce, List<BienImmobilier> listeBienImmo) {
		this.listeRDV = new ArrayList<RDV>();
		this.listeAnnonce = new ArrayList<Annonce>();
		this.listeBienImmobilier = new ArrayList<BienImmobilier>();
	}

	/*
	 * Permet d'inscrire un bien immobilier à la vente
	 * 
	 * @param personne, adresse, orientation, prixn dateVente, dateDeDisponibilite, numeroBienImmobilier
	 * 
	 * 
	 */

	void inscrireBienImmo(Personne personne, String adresse , String orientation , int prix , Date dateVente ,Date dateDeDisponibilite ,int numeroBienImmobilier) {
		BienImmobilier bienImmo = new BienImmobilier(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, personne);
		this.listeBienImmobilier.add(bienImmo);
	}
	/*
	 * Permet de contacter un acheteur qui a un bien immobilier conforme à son voeux 
	 * 
	 * @param personne
	 * 				Elle prend en paramètre la personne à contacter.
	 */
	List<BienImmobilier> contacterAcheteur(Personne personne) {
		return checkVoeux(personne);
	}

	/*
	 * Permet de vérifier les voeux 
	 */
	public List<BienImmobilier> checkVoeux(Personne personne) {
		return null;
	}

	/*
	 * Permet de retirer une annonce de l'agence.
	 * @param Annonce
	 * 				L'annonce à retirer.
	 */
	public void retirerAnnonce(Annonce annonce) {
		this.listeAnnonce.remove(annonce);
	}	

	/*
	 * Permet de récupérer la liste des rendez-vous d'une agence
	 */
	public List<RDV> getRDV(){
		return this.listeRDV;
	}

	/*
	 * Permet de récupérer la liste des annonces d'une agence
	 */
	public List<Annonce> getAnnonce(){
		return this.listeAnnonce;
	}

	/*
	 * Permet de récupérer la liste des bien immobilier d'une agence immobilière
	 */
	public List<BienImmobilier> getBienImmobilier(){
		return this.listeBienImmobilier;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
