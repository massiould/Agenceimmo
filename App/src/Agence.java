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
	 * 
	 * 
	 */
	
	public void inscrireBienImmo(Personne personne,String adresse , String orientation , int prix , Date dateVente ,Date dateDeDisponibilite ,int numeroBienImmobilier) {
		BienImmobilier bienImmo = new BienImmobilier(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, personne);
		
	}
	/*
	 * Permet de contacter un acheteur qui a un bien immobilier conforme à son voeux 
	 */
	public void contacterAcheteur(Personne personne) {
		 //if(personne.checkVoeux() == true) {
			 
		 //}
	}
	
	/*
	 * Permet de vérifier les voeux 
	 */
	public boolean checkVoeux() {
		return (Boolean) null;
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
