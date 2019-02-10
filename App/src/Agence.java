
/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agence {

	String nomAgence;
	List<RDV> listeRDV; 
	List<Annonce> listeAnnonce;
	List<BienImmobilier> listeBienImmobilier;
	List<Personne> listeClient;
	List<BienImmobilier> listeBienImmobilierVendu;


	public Agence(String nomAgence) {
		this.nomAgence = nomAgence;
		this.listeRDV = new ArrayList<RDV>();
		this.listeAnnonce = new ArrayList<Annonce>();
		this.listeBienImmobilier = new ArrayList<BienImmobilier>();
		this.listeClient = new ArrayList<Personne>();
		this.listeBienImmobilierVendu = new ArrayList<BienImmobilier>();
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
		try {
		switch (typeDeBien) {
		case "terrain":
			System.out.println("Saisir les informations suivante pour l'ajout d'un terrain a la vente");
			System.out.println("");
			System.out.println("Donner la surface au sol :");
			int surfaceSol = clavier.nextInt();
			System.out.println("Donner la longueur de la facade :");
			int longueurFacade = clavier.nextInt();
			BienImmobilier bienImmo = new Terrain(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceSol, longueurFacade);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);
			break;

		case "appartement":
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'un appartement a la vente");
			System.out.println("");
			System.out.println("Donner la surface habitable :");
			int surfaceHabitable = clavier.nextInt();
			System.out.println("Donner le nombre de pieces :");
			int nombreDePiece = clavier.nextInt();
			System.out.println("Donner le nombre d'etages :");
			int nombreEtage = clavier.nextInt();
			System.out.println("Donner le moyen de chauffage :");
			String moyenDeChauffage = clavier.next();
			BienImmobilier bienImmo1 = new Maison(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceHabitable, nombreDePiece, nombreEtage, moyenDeChauffage);
			this.listeBienImmobilier.add(bienImmo1);
			this.listeClient.add(vendeur);
			break;

		case "maison":
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'une maison a la vente");
			System.out.println("");
			System.out.println("Donner le nombre de pieces :");
			int nombreDePiece1 = clavier.nextInt();
			System.out.println("Donner le numero de l'etage ou se situe l'appartement :");
			int numeroEtage = clavier.nextInt();
			System.out.println("Donner les charges mensuelles :");
			int chargesMensuelles = clavier.nextInt();
			BienImmobilier bienImmo2 = new Appartement(adresse, orientation, prix, dateDeDisponibilite, vendeur, nombreDePiece1, numeroEtage, chargesMensuelles);
			this.listeBienImmobilier.add(bienImmo2);
			this.listeClient.add(vendeur);
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Permet de retirer un bien immobilier à la vente
	 * @param bienImmobilier
	 */
	void retirerBienImmobilier(int numero) {
		this.listeBienImmobilier.remove(numero);
		System.out.println("Le bien immobilier numero "+numero+" a ete supprime.");
	}
	
	/**
	 * Permet de vendre un bien immobilier
	 * @param bienImmobilier, acheteur
	 */
	void vendreBienImmobilier(int numBienImmo, int numAcheteur, String dateRDV) {
		BienImmobilier bienImmobilier = this.listeBienImmobilier.get(numBienImmo);
		Personne acheteur = this.listeClient.get(numAcheteur);
		this.listeBienImmobilierVendu.add(bienImmobilier);
		this.listeBienImmobilier.remove(bienImmobilier);
		RDV rdvVente = new RDV(dateRDV, TypeRDV.VENTE, bienImmobilier.vendeur, acheteur);	
	}
	
	/**
	 * Permet d'ajouter un client a l'agence pour pouvoir lui proposer des services par la suite
	 * 
	 * @param personne
	 */
	void inscrireClient(Personne personne) {
		if(this.listeClient.contains(personne)) {
			System.out.println("Client deja inscrit dans l'agence.");
		} else {
			this.listeClient.add(personne);
			System.out.println("Le client a ete inscrit dans l'agence.");
		}
	}

	/**
	 * Permet de contacter un acheteur qui a un bien immobilier conforme a son voeux 
	 * 
	 * @param Personne
	 * 				Elle prend en parametre la personne a contacter.
	 */
	public String checkVoeux(Personne P){
		String choix ="patate";
		for (  BienImmobilier i : this.listeBienImmobilier) {
			if  (P.voeux.typeDeBien == "terrain" && (i instanceof Terrain)) {
				Terrain TER = (Terrain)i;
				if(P.voeux.prixSouhaitee == i.prix && P.voeux.localisationSouhaitee == i.adresse && P.voeux.longueurFacadeSouhaiteeTERR== TER.longueurFacade && P.voeux.surfaceSolSouhaitee == TER.surfaceSol) {
					choix=("Ce terrain pourrait vous convenir: \n" +i +TER);
				}
				/**else {
					choix=("Desole Pas de terrain correspandant a votre recherche ");
				}*/
			}

			else if  (P.voeux.typeDeBien == "appartement" && (i instanceof Appartement) ) {
				Appartement APP = (Appartement)i;
				if(P.voeux.prixSouhaitee == i.prix && P.voeux.localisationSouhaitee == i.adresse && P.voeux.nbrPieceSouhaitee== APP.nombreDePiece ) {
					choix=("Cet appartement pourrait vous convenir: \n" +i +APP);
				}
				/**else {
					choix=("Desole Pas d'appartement correspandant a votre recherche ");
				}*/
			}
			else if  (P.voeux.typeDeBien == "maison" && (i instanceof Maison) ) {
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

	/**
	 * Permet de retirer une annonce de l'agence.
	 * @param annonce
	 * 				L'annonce a retirer.
	 */
	void retirerAnnonce(Annonce annonce) {
		this.listeAnnonce.remove(annonce);
	}
	
	/**
	 * Permet d'organiser un rendez-vous
	 * @param bienImmobilier, personne
	 */
	void organiserRDV(BienImmobilier bienImmobilier, Personne personne, String dateRDV, TypeRDV typeRDV) {
		Personne vendeur = bienImmobilier.vendeur;
		RDV rdv = new RDV(dateRDV, typeRDV, vendeur, personne);
		this.listeRDV.add(rdv);	
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
	 * Permet de recuperer la liste des annonces d'une agence
	 * 
	 * @return listeAnnonce of Agence
	 */
	List<BienImmobilier> getBienImmobilier(){
		return this.listeBienImmobilier;
	}
	
	/**
	 * Permet de recuperer le nom de l'agence
	 * 
	 * @return nomAgence de Agence
	 */
	String getNomAgence() {
		return this.nomAgence;
	}

	/**
	 * Permet de recuperer la liste des bien immobilier d'une agence immobiliere (format string)
	 * 
	 * @return rep
	 * 			Liste des biens immobilier de Agence
	 */
	String getBienImmobilierString(){
		String rep = "[";
		for (int i = 0; i < this.listeBienImmobilier.size(); i ++) {
			rep = "Index : "+ i +" " + this.listeBienImmobilier.get(i).toString();
		}
		return rep += "]";
	}
	
	/**
	 * Permet de recuperer la liste des clients d'une agence immobiliere (format string)
	 * 
	 * @return rep
	 * 			Liste des clients de Agence
	 */
	String getClients() {
		String rep = "[";
		for (int i = 0; i < this.listeClient.size(); i++) {
			rep = "Index : "+i+ " " + this.listeClient.get(i).toString();
		}
		return rep += "]";
	}
}
>>>>>>> cd725fcdb6c689e9a31f8466848ed192336d2086
