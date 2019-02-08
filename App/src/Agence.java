
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
		
		switch (typeDeBien) {
			case "terrain":
				System.out.println("Saisir les informations suivante pour l'ajout d'un terrain � la vente");
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
				System.out.println(">>> Saisir les informations suivante pour l'ajout d'une maison � la vente");
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
				System.out.println(">>> Saisir les informations suivante pour l'ajout d'un appartement � la vente");
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
		/*if(typeDeBien == "terrain") {
			System.out.println("Saisir les informations suivante pour l'ajout d'un terrain � la vente");
			System.out.println("");
			System.out.println("Donner la surface au sol :");
			int surfaceSol = clavier.nextInt();
			System.out.println("Donner la longueur de la facade :");
			int longueurFacade = clavier.nextInt();
			BienImmobilier bienImmo = new Terrain(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceSol, longueurFacade);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);

		} else if (typeDeBien == "maison") {
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'une maison � la vente");
			System.out.println("");
			System.out.println("Donner la surface habitable :");
			int surfaceHabitable = clavier.nextInt();
			System.out.println("Donner le nombre de pieces :");
			int nombreDePiece = clavier.nextInt();
			System.out.println("Donner le nombre d'etages :");
			int nombreEtage = clavier.nextInt();
			System.out.println("Donner le moyen de chauffage :");
			String moyenDeChauffage = clavier.next();
			BienImmobilier bienImmo = new Maison(adresse, orientation, prix, dateDeDisponibilite, vendeur, surfaceHabitable, nombreDePiece, nombreEtage, moyenDeChauffage);
			this.listeBienImmobilier.add(bienImmo);
			this.listeClient.add(vendeur);

		} else if (typeDeBien == "appartement") {
			System.out.println(">>> Saisir les informations suivante pour l'ajout d'un appartement � la vente");
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
		}*/
		//clavier.close();

	}

	/**
	 * Permet d'ajouter un client � l'agence pour pouvoir lui proposer des services par la suite
	 * 
	 * @param personne
	 */
	void inscrireClient(Personne personne) {
		if(this.listeClient.contains(personne)) {
			System.out.println("Client d�j� inscrit dans l'agence.");
		} else {
			this.listeClient.add(personne);
			System.out.println("Le clien a �t� inscrit � l'agence.");
		}
	}

	/**
	 * Permet de contacter un acheteur qui a un bien immobilier conforme a son voeux 
	 * 
	 * @param personne
	 * 				Elle prend en parametre la personne a contacter.
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
		Personne p2 = new Personne("Massi", "5 rue des roses", "massi@etu.fr", "1546464656");
		
		agence.inscrireBienImmo(p1, "Toulouse Nord", "sud", 3000000, "2019-02-2", "maison");
		
		agence.inscrireClient(p1); // renvoie : client d�j� inscrit	
		agence.inscrireClient(p2); // renvoie : client inscrit	
		System.out.println(agence.getBienImmobilier());
		p1.setVoeux();
		//p1.checkVoeux()
	}
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

}
