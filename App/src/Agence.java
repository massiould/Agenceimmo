/*
 * @author Kamal Aarab and Massi Ouldrabah
 */


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
	void inscrireBienImmo(Personne vendeur, String adresse, String orientation, int prix, String dateDeDisponibilite, String typeDeBien) {
		Scanner clavier = new Scanner(System.in);
		System.out.println("**************************************************************");
		if(typeDeBien == "terrain") {
			System.out.println("Saisir les informations suivante pour l'ajout d'un terrain à la vente :");
			System.out.println("");
			System.out.println("Donner la surface au sol :");
			int surfaceSol = clavier.nextInt();
			System.out.println("Donner la longueur de la facade :");
			int longueurFacade = clavier.nextInt();
			BienImmobilier bienImmo = new Terrain(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceSol, longueurFacade);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);

		} else if (typeDeBien == "maison") {
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'une maison à la vente :");
			System.out.println("");
			System.out.println("Donner la surface habitable :");
			int surfaceHabitable = clavier.nextInt();
			System.out.println("Donner le nombre de pieces :");
			int nombreDePiece = clavier.nextInt();
			System.out.println("Donner le nombre d'etages :");
			int nombreEtage = clavier.nextInt();
			System.out.println("Donner le moyen de chauffage :");
			String moyenDeChauffage = clavier.nextLine();
			BienImmobilier bienImmo = new Maison(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceHabitable, nombreDePiece, nombreEtage, moyenDeChauffage);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);

		} else if (typeDeBien == "appartement") {
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'un appartement à la vente :");
			System.out.println("");
			System.out.println("Donner le nombre de pieces :");
			int nombreDePiece = clavier.nextInt();
			System.out.println("Donner le numero de l'etage ou se situe l'appartement :");
			int numeroEtage = clavier.nextInt();
			System.out.println("Donner les charges mensuelles :");
			int chargesMensuelles = clavier.nextInt();
			BienImmobilier bienImmo = new Appartement(adresse, orientation, prix, dateDeDisponibilite, vendeur, nombreDePiece, numeroEtage, chargesMensuelles);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);
		}

	}

	/**
	 * Permet d'ajouter un client à l'agence pour pouvoir lui proposer des services par la suite
	 * 
	 * @param personne
	 */
	void inscrireClient(Personne personne) {
		if(this.listeClient.contains(personne)) {
			System.out.println("Client déjà inscrit dans l'agence.");
		} else {
			this.listeClient.add(personne);
		}
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
	void retirerAnnonce(Annonce annonce) {
		this.listeAnnonce.remove(annonce);
	}

	/**
	 * Permet de recuperer la liste des rendez-vous d'une agence
	 * 
	 * @return listeRDV of Agence
	 */
	List<RDV> getRDV(){
		return this.listeRDV;
	}

	/**
	 * Permet de recuperer la liste des annonces d'une agence
	 * 
	 * @return listeAnnonce of Agence
	 */
	List<Annonce> getAnnonce(){
		return this.listeAnnonce;
	}

	/**
	 * Permet de recuperer la liste des bien immobilier d'une agence immobiliere
	 * 
	 * @return listeBienImmobilier of Agence
	 */
	List<BienImmobilier> getBienImmobilier(){
		return this.listeBienImmobilier;
	}


	public static void main(String[] args) {
		Agence agence = new Agence("Agence Toulouse Mirail");
		Personne p1 = new Personne("Kamal", "6 rue des roses", "kamal@etu.fr", "0629564521");
		agence.inscrireBienImmo(p1, "Toulouse Nord", "sud", 3000000, "2019-02-2", "terrain");
		agence.inscrireClient(p1); // renvoie : client déjà inscrit	
		p1.setVoeux();
		//p1.checkVoeux()
	}

}
