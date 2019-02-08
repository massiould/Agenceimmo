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

	
	public Agence(List<RDV> listeRDV, List<Annonce> listeAnnonce, List<BienImmobilier> listeBienImmobilier) {

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


	
	/*
	 * Permet de vérifier les voeux 
	 */
	public String checkVoeux(Personne P ){
		String choix ="";
		for (  BienImmobilier i : this.listeBienImmobilier) {
			if  (P.voeux.typeDeBien == "TERRAIN" ) {
				Terrain TER = (Terrain)i;
					if(P.voeux.prixSouhaitee == i.prix && P.voeux.localisationSouhaitee == i.adresse && P.voeux.longueurFacadeSouhaiteeTERR== TER.longueurFacade && P.voeux.surfaceSolSouhaitee == TER.surfaceSol) {
						choix=("Ce terrain pourrait vous convenir: \n" +i +TER);
					}
					else {
						choix=("Desole Pas de terrain correspandant a votre recherche ");
					}
			}
			
			if  (P.voeux.typeDeBien == "APPARTEMENT" ) {
					Appartement APP = (Appartement)i;
						if(P.voeux.prixSouhaitee == i.prix && P.voeux.localisationSouhaitee == i.adresse && P.voeux.nbrPieceSouhaitee== APP.nombreDePiece ) {
							choix=("Cet appartement pourrait vous convenir: \n" +i +APP);
				}
						else {
							choix=("Desole Pas d'appartement correspandant a votre recherche ");
						}
			}
			if  (P.voeux.typeDeBien == "MAISON" ) {
					Maison MAI = (Maison)i;
						if(P.voeux.prixSouhaitee == i.prix && P.voeux.localisationSouhaitee == i.adresse && P.voeux.nbrPieceSouhaitee== MAI.getNombrePiece() ) {
								choix=("Cette maison pourrait vous convenir: \n" +i +MAI);
				}
						else {
								choix=("Desole Pas de maison correspandant a votre recherche ");
							}
			}
			
		}
		return choix;
			
		
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
