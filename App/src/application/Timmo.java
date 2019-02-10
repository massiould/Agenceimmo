package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import classes.Agence;
import classes.Media;
import classes.Personne;
import classes.Physique;
import classes.TypeRDV;

public class Timmo {


	/**
	 * Affichage du menu de l'application
	 * @param agence
	 * 				Agence avec laquelle on va interagir
	 */
	public static void afficherMenu(Agence agence) {
		System.out.println();
		System.out.println("Menu de " + agence.getNomAgence());
		System.out.println("1 - Gerer les biens immobiliers");
		System.out.println("2 - Vendre un bien immobilier");
		System.out.println("3 - Organiser un rendez-vous (visite d'un bien)");
		System.out.println("4 - Gerer les publicites");
		System.out.println("5 - Consulter les differentes listes");
		System.out.println("q - Quitter");
		System.out.print("Choix -> ");
		System.out.println();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		File fichier =  new File("src/application/agence.ser") ;
		ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fichier)) ;
		Agence agence = new Agence("Agence TOULOUSE");

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		String choix;
		String choix2;
		boolean continuer;
		Scanner lect = new Scanner ( System.in );

		continuer = true;
		do {
			Timmo.afficherMenu(agence);
			choix = lect.nextLine();
			choix = choix.toLowerCase();

			switch (choix) {
			case "q" :
				System.out.println("A bientôt !");
				continuer = false;
				break;

			case "1" :
				System.out.println();
				System.out.println("Que voulez-vous faire ? \n a - Enregister un bien \n b - Retirer un bien");
				System.out.println("Choix -> ");
				choix2 = lect.nextLine();
				choix2.toLowerCase();
				while(!choix2.equals("a") && !choix2.equals("b")) {
					System.out.println("Ressaisir (a ou b) :");
					choix2 = lect.nextLine();
					choix2.toLowerCase();
				}
				if (choix2.equals("a")) {
					try {
						System.out.println("Enregistrement du bien immobilier");
						System.out.println("Quel type de bien va etre mis en vente ?");
						String typeDeBien = lect.nextLine();
						typeDeBien.toLowerCase();
						while(!typeDeBien.equals("terrain") && !typeDeBien.equals("appartement") && !typeDeBien.equals("maison")) {
							System.out.println("Ressaisir (terrain, appartement ou maison) :");
							typeDeBien = lect.nextLine();
							typeDeBien.toLowerCase();
						}

						System.out.println("Adresse :");
						String adrBien = lect.nextLine();
						System.out.println("Orientation (nord, sud, sud-ouest...) :");
						String orientation = lect.nextLine();
						orientation.toLowerCase();
						while(!orientation.equals("sud") && !orientation.equals("sud-ouest") && !orientation.equals("sud-est") && !orientation.equals("nord") && !orientation.equals("nord-ouest") && !orientation.equals("nord-est") && !orientation.equals("ouest") && !orientation.equals("est")) {
							System.out.println("Ressaisir :");
							orientation = lect.nextLine();
							orientation.toLowerCase();
						}
						System.out.println("Prix :");
						int prix = lect.nextInt();
						lect.nextLine();
						System.out.println("Date de disponibilite (yyyy-mm-dd) :");
						String dateDeDisponibilite = lect.nextLine();
						format.parse(dateDeDisponibilite);
						System.out.println("Liste des clients :");
						System.out.println(agence.getClientsToString());
						System.out.println("Le vendeur est-il présent dans la liste ? (oui ou non)");
						String reponse = lect.nextLine();
						reponse.toLowerCase();
						while(!reponse.equals("oui") && !reponse.equals("non")) {
							System.out.println("Ressaisir :");
							reponse = lect.nextLine();
							reponse.toLowerCase();
						}
						if(reponse.equals("oui") && !agence.getListeClient().isEmpty()) {
							System.out.print("Choix (0...*) -> ");
							int numVendeur = lect.nextInt();
							while(numVendeur < 0 && numVendeur > agence.getListeClient().size()-1 ) {
								System.out.println("Ressaisir :");
								numVendeur = lect.nextInt();
							}
							agence.inscrireBienImmo(agence.getListeClient().get(numVendeur), adrBien, orientation, prix, dateDeDisponibilite, typeDeBien);

							System.out.println("Veuillez organiser un rendez-vous pour signer le mandat");
							System.out.println("Saisir la date (yyyy-mm-dd) :");
							String dateRDV = lect.nextLine();
							format.parse(dateRDV);
							agence.organiserRDV(agence.getListeBienImmobilier().get(agence.getListeBienImmobilier().size()-1), agence.getListeClient().get(numVendeur), dateRDV, TypeRDV.MANDAT);
							System.out.println("Bien immobilier ajouté.");
						} else {
							System.out.println("Enregistrement du vendeur");
							System.out.println("Saisie du nom :");
							String nom = lect.nextLine();
							System.out.println("Saisie de l'adresse :");
							String adr = lect.nextLine();
							System.out.println("Saisie du mail :");
							String mail = lect.nextLine();
							System.out.println("Saisie du numero de telephone :");
							String tel = lect.nextLine();
							Personne vendeur = new Physique(nom, adr, mail, tel);
							agence.inscrireBienImmo(vendeur, adrBien, orientation, prix, dateDeDisponibilite, typeDeBien);

							System.out.println("Veuillez organiser un rendez-vous pour signer le mandat");
							System.out.println("Saisir la date (yyyy-mm-dd) :");
							String dateRDV = lect.nextLine();
							format.parse(dateRDV);
							agence.organiserRDV(agence.getListeBienImmobilier().get(agence.getListeBienImmobilier().size()-1), vendeur, dateRDV, TypeRDV.MANDAT);
							System.out.println("Bien immobilier ajouté.");
						}
					} catch (Exception e) { 
						System.out.println(e.getMessage());
					} 
				} else if (choix2.equals("b")){
					try {
						System.out.println("Liste des biens en vente :");
						System.out.println(agence.getBienImmobilierToString());
						if(agence.getListeBienImmobilier().isEmpty()) {
							System.out.println("Pas de biens immobilier en vente");
						} else {
							System.out.println("Donner le numero du bien à retirer :");
							int numero = lect.nextInt();
							while(numero < 0 && numero > agence.getListeBienImmobilier().size()-1 ) {
								System.out.println("Ressaisir :");
								numero = lect.nextInt();
							}
							agence.retirerBienImmobilier(numero);
							System.out.println("Bien immobilier numero "+ numero +" retiré.");
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else { 
					System.out.println("Erreur saisie");
				}
				break;

			case "2" :
				System.out.println("Liste des biens à vendre :");
				System.out.println(agence.getBienImmobilierToString());
				if(agence.getListeBienImmobilier().isEmpty()) {
					System.out.println("Pas de biens imobilier en vente");
				} else {
					try {
						System.out.println("Choisir le numero du bien à vendre parmis la liste au dessus :");
						System.out.print("Choix (0 à *) ->");
						int numBienImmo = lect.nextInt();
						while(numBienImmo < 0 && numBienImmo > agence.getListeBienImmobilier().size()-1 ) {
							System.out.println("Ressaisir un bon numéro :");
							numBienImmo = lect.nextInt();
						}
						System.out.println("Saisir date du rendez-vous de la vente (yyyy-mm-dd) :");
						String dateRDV = lect.nextLine();
						format.parse(dateRDV);

						System.out.println("Liste des clients :");
						System.out.println(agence.getClientsToString());
						System.out.println("L'acheteur est-il présent dans la liste ? (oui ou non)");
						String reponse = lect.nextLine();
						reponse.toLowerCase();
						while(!reponse.equals("oui") && !reponse.equals("non")) {
							System.out.println("Ressaisir :");
							reponse = lect.nextLine();
							reponse.toLowerCase();
						}
						if(reponse.equals("oui") && !agence.getListeClient().isEmpty()) {
							System.out.print("Choix (0...*) -> ");
							int numAcheteur = lect.nextInt();
							while(numAcheteur < 0 && numAcheteur > agence.getListeClient().size()-1 ) {
								System.out.println("Ressaisir :");
								numAcheteur = lect.nextInt();
							}
							agence.vendreBienImmobilier(numBienImmo, numAcheteur, dateRDV);
						} else {
							System.out.println("Enregistrement de l'acheteur");
							System.out.println("Saisie du nom :");
							String nom = lect.nextLine();
							System.out.println("Saisie de l'adresse :");
							String adr = lect.nextLine();
							System.out.println("Saisie du mail :");
							String mail = lect.nextLine();
							System.out.println("Saisie du numero de telephone :");
							String tel = lect.nextLine();
							Personne acheteur = new Physique(nom, adr, mail, tel);
							agence.inscrireClient(acheteur);
							agence.vendreBienImmobilier(numBienImmo, agence.getListeClient().size()-1, dateRDV);
						}
					} catch (Exception e) {System.out.println(e.getMessage());}
				}
				break;

			case "3" :
				try {
					System.out.println("Organiser un rendez-vous pour visite d'un bien");
					System.out.println("Liste des biens à visiter : ");
					System.out.println(agence.getBienImmobilierToString());
					if(agence.getListeBienImmobilier().isEmpty()) {
						System.out.println("Pas de biens imobilier en vente");
					} else {
						System.out.println("Saisir date du rendez-vous de la vente (yyyy-mm-dd) :");
						String dateRDV = lect.nextLine();
						format.parse(dateRDV);
						System.out.println("Donner le numero du bien à visiter");
						int numBienImmo = lect.nextInt();
						while(numBienImmo < 0 && numBienImmo > agence.getListeBienImmobilier().size()-1 ) {
							System.out.println("Ressaisir un bon numéro :");
							numBienImmo = lect.nextInt();
						}

						System.out.println("Liste des clients :");
						System.out.println(agence.getClientsToString());
						System.out.println("Le visiteur est-il présent dans la liste ? (oui ou non)");
						String reponse = lect.nextLine();
						reponse.toLowerCase();

						while(!reponse.equals("oui") && !reponse.equals("non")) {
							System.out.println("Ressaisir :");
							reponse = lect.nextLine();
							reponse.toLowerCase();
						}

						if(reponse.equals("oui") && !agence.getListeClient().isEmpty()) {
							System.out.print("Choix (0...*) -> ");
							int numVisiteur = lect.nextInt();
							while(numVisiteur < 0 && numVisiteur > agence.getListeClient().size()-1 ) {
								System.out.println("Ressaisir :");
								numVisiteur = lect.nextInt();
							}
							agence.organiserRDV(agence.getListeBienImmobilier().get(numBienImmo), agence.getListeClient().get(numVisiteur), dateRDV, TypeRDV.VISITE);
							System.out.println("Rendez-vous crée.");
						} else {
							System.out.println("Enregistrement de l'acheteur");
							System.out.println("Saisie du nom :");
							String nom = lect.nextLine();
							System.out.println("Saisie de l'adresse :");
							String adr = lect.nextLine();
							System.out.println("Saisie du mail :");
							String mail = lect.nextLine();
							System.out.println("Saisie du numero de telephone :");
							String tel = lect.nextLine();
							Personne visiteur = new Physique(nom, adr, mail, tel);
							agence.inscrireClient(visiteur);
							agence.organiserRDV(agence.getListeBienImmobilier().get(numBienImmo), visiteur, dateRDV, TypeRDV.VISITE);
						}

					} 
				} catch (Exception e) { System.out.println(e.getMessage()); }
				break;

			case "4" :
				try {
					System.out.println("Que voulez-vous ? (1 : créer une publicite, 2 : supprimer une publicite)");
					System.out.print("Choix (0...*) -> ");
					String rep = lect.nextLine();
					rep.toLowerCase();
					while(!rep.equals("1") && !rep.equals("2")) {
						System.out.println("Ressaisir :");
						rep = lect.nextLine();
					}
					if(rep.equals("1")) {
						System.out.println("Créer une annonce");
						System.out.println("Liste des biens immobilier :");
						System.out.println(agence.getListeBienImmobilier());
						if(!agence.getListeBienImmobilier().isEmpty()) {
							System.out.println("Choisir le numero du bien à vendre parmis la liste au dessus :");
							System.out.print("Choix (0 à *) ->");
							int numBienImmo = lect.nextInt();
							while(numBienImmo < 0 && numBienImmo > agence.getListeBienImmobilier().size()-1 ) {
								System.out.println("Ressaisir un bon numéro :");
								numBienImmo = lect.nextInt();
							}

							System.out.println("Choisir le type de media à utiliser pour l'annonce (1 : Texte, 2 : Html, 3 : Image, 4 : Video)");
							System.out.print("Choix (0...*) -> ");
							String media = lect.nextLine();
							lect.nextLine();
							while(!media.equals("1") && !media.equals("2") && !media.equals("3") && !media.equals("4")) {
								System.out.println("Ressaisir :");
								media = lect.nextLine();
							}
							if(media.equals("1")) {
								agence.creerAnnonce(agence.getListeBienImmobilier().get(numBienImmo), Media.Texte);
							} else if(media.equals("2")) {
								agence.creerAnnonce(agence.getListeBienImmobilier().get(numBienImmo), Media.Html);
							} else if(media.equals("3")) {
								agence.creerAnnonce(agence.getListeBienImmobilier().get(numBienImmo), Media.Image);
							} else if(media.equals("4")) {
								agence.creerAnnonce(agence.getListeBienImmobilier().get(numBienImmo), Media.Video);
							}
							System.out.println("Annonce créee");
						} else {
							System.out.println("Pas de bien immobilier enregistré.");
						}
					} else {
						System.out.println("Liste des annonces :");
						System.out.println(agence.getListeAnnonce());
						System.out.println("Choisissez l'annonce à supprimer :");
						int numAnnonce = lect.nextInt();
						lect.nextLine();
						while(numAnnonce < 0 && numAnnonce > agence.getListeAnnonce().size()-1) {
							System.out.println("Ressaisir :");
							numAnnonce = lect.nextInt();
						}
						agence.retirerAnnonce(agence.getListeAnnonce().get(numAnnonce));
						System.out.println("Annonce numero "+ numAnnonce +" supprimee.");
					}

				} catch (Exception e) {System.out.println(e.getMessage());}
				break;

			case "5" :
				try {
					System.out.println("Consulter les listes (1 : liste des clients, 2 : liste des biens immobilier en vente, 3 : liste des rendez-vous, 4 : liste des biens immobilier vendus, 5 : liste des annonces)");
					System.out.print("Choix (0...*) -> ");
					String rep = lect.nextLine();
					while(!rep.equals("1") && !rep.equals("2") && !rep.equals("3") && !rep.equals("4") && !rep.equals("5") && !rep.equals("6")) {
						System.out.println("Ressaisir :");
						rep = lect.nextLine();
					}

					if(rep.equals("1")) {
						System.out.println("Liste des clients :");
						System.out.println(agence.getClientsToString());
					} else if (rep.equals("2")){
						System.out.println("Liste des biens immobiliers en vente :");
						System.out.println(agence.getBienImmobilierToString());
					} else if (rep.equals("3")){
						System.out.println("Liste des rendez-vous :");
						System.out.println(agence.getAnnonceToString());
					} else if (rep.equals("4")){
						System.out.println("Liste des biens immobilier vendus :");
						System.out.println(agence.getBienImmobilierVenduToString());
					} else if(rep.equals("5")) {
						System.out.println("Liste des annonces :");
						System.out.println(agence.getAnnonceToString());
					}
				} catch (Exception e) {System.out.println(e.getMessage());}
				break;

			default :
				System.out.println("Erreur de saisie ...");
				break;
			}
		} while (continuer);
		oos.writeObject(agence);
	}
}
