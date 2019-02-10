import java.util.Locale;
import java.util.Scanner;

public class Application {


	/**
	 * Affichage du menu de l'application
	 * @param pfAg	AgenceBancaire pour r�cup�rer le nom et la localisation
	 */
	public static void afficherMenu(Agence agence) {
		System.out.println();
		System.out.println("Menu de " + agence.getNomAgence());
		System.out.println("1 - Gerer les biens immobiliers");
		System.out.println("2 - Vendre un bien immobilier");
		System.out.println("3 - Organiser des rendez-vous");
		System.out.println("4 - Gerer les publicites");
		System.out.println("5 - ");
		System.out.println("q - Quitter");
		System.out.print("Choix -> ");
		System.out.println();
	}


	public static void main(String[] args) {
		String choix;
		String choix2;
		boolean continuer;
		Scanner lect = new Scanner ( System.in );
		Agence agence = new Agence("Agence test");

		continuer = true;
		while (continuer) {
			Application.afficherMenu(agence);
			choix = lect.next();
			choix = choix.toLowerCase();

			switch (choix) {
			case "q" :
				System.out.println("A bient�t !");
				continuer = false;
				break;

			case "1" :
				System.out.println();
				System.out.println("Que voulez-vous faire ? \n a - Enregister un bien \n b - Retirer un bien");
				System.out.println("Choix -> ");
				choix2 = lect.next();
				while(!choix2.equals("a") && !choix2.equals("b")) {
					System.out.println("Ressaisir (a ou b) :");
					choix2 = lect.next();
				}
				if (choix2.equals("a")) {
					try {
						System.out.println();
						System.out.println("Enregistrement du bien immobilier");

						System.out.println("Quel type de bien va etre mis en vente ?");
						String typeDeBien = lect.next();
						while(!typeDeBien.equals("terrain") && !typeDeBien.equals("appartement") && !typeDeBien.equals("maison")) {
							System.out.println("Ressaisir (terrain, appartement ou maison) :");
							typeDeBien = lect.next();		
						}
						System.out.println("Adresse :");
						String adrBien = lect.next();
						System.out.println("Orientation (nord, sud, sud-ouest...) :");
						String orientation = lect.next();
						System.out.println("Prix :");
						int prix = lect.nextInt();
						System.out.println("Date de disponibilite :");
						String dateDeDisponibilite = lect.next();

						System.out.println("Liste des clients :");
						System.out.println(agence.getClients());
						System.out.println("Le vendeur est-il pr�sent dans la liste ? (r�pondre : oui ou non)");
						String reponse = lect.next();
						while(!reponse.equals("oui") && !reponse.equals("non")) {
							System.out.println("Ressaisir la reponse :");
							System.out.println(reponse);
							reponse = lect.next();		
						}
						reponse.toLowerCase();
						if(reponse.equals("oui") && !agence.listeClient.isEmpty()) {
							System.out.print("Choix (0...*) -> ");
							int numVendeur = lect.nextInt();
							while(numVendeur < 0 && numVendeur > agence.listeClient.size()-1 ) {
								System.out.println("Ressaisir la reponse :");
								System.out.println(numVendeur);
								numVendeur = lect.nextInt();		
							}
							agence.inscrireBienImmo(agence.listeClient.get(numVendeur), adrBien, orientation, prix, dateDeDisponibilite, typeDeBien);
						} else {
							System.out.println("Enregistrement du vendeur");
							System.out.println("Saisie du nom :");
							String nom = lect.next();
							System.out.println("Saisie de l'adresse :");
							String adr = lect.next();
							System.out.println("Saisie du mail :");
							String mail = lect.next();
							System.out.println("Saisie du numero de telephone :");
							String tel = lect.next();
							Personne vendeur = new Personne(nom, adr, mail, tel);
							agence.inscrireBienImmo(vendeur, adrBien, orientation, prix, dateDeDisponibilite, typeDeBien);
							System.out.println(agence.listeBienImmobilier);
						}
					} catch (Exception e) { 
						System.out.println(e.getMessage());
					} 
				} else if (choix2.equals("b")){
					try {
						System.out.println();
						System.out.println("Liste des biens � vendre : ");
						System.out.println(agence.getBienImmobilierString());
						if(agence.listeBienImmobilier.isEmpty()) {
							System.out.println("Pas de biens imobilier en vente");
						} else {
							System.out.println("Donner le numero du bien � enlever");
							int numero = lect.nextInt();
							agence.retirerBienImmobilier(numero);
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} else { 
					System.out.println("Erreur saisie"); 
				}
				break;

			case "2" :
				System.out.println();
				System.out.println("Liste des biens � vendre : ");
				System.out.println(agence.getBienImmobilierString());
				if(agence.listeBienImmobilier.isEmpty()) {
					System.out.println("Pas de biens imobilier en vente");
				} else {
					try {
						System.out.print("Choix (0 � *) ->");
						int numBienImmo = lect.nextInt();

						System.out.println("Saisir date du rendez-vous de la vente :");
						String dateRDV = lect.next();

						System.out.println("Liste des clients :");
						System.out.println(agence.getClients());
						System.out.println("L'acheteur est-il pr�sent dans la liste ? (r�pondre : oui ou non)");
						String reponse = lect.next();
						while(!reponse.equals("oui") && !reponse.equals("non")) {
							System.out.println("Ressaisir la reponse :");
							System.out.println(reponse);
							reponse = lect.next();		
						}
						if(reponse.equals("oui") && !agence.listeClient.isEmpty()) {
							System.out.print("Choix (0...*) -> ");
							int numAcheteur = lect.nextInt();
							while(numAcheteur < 0 && numAcheteur > agence.listeClient.size()-1 ) {
								System.out.println("Ressaisir la reponse :");
								System.out.println(numAcheteur);
								numAcheteur = lect.nextInt();		
							}
							agence.vendreBienImmobilier(numBienImmo, numAcheteur, dateRDV);
						} else {
							System.out.println("Enregistrement de l'acheteur");
							System.out.println("Saisie du nom :");
							String nom = lect.next();
							System.out.println("Saisie de l'adresse :");
							String adr = lect.next();
							System.out.println("Saisie du mail :");
							String mail = lect.next();
							System.out.println("Saisie du numero de telephone :");
							String tel = lect.next();
							Personne acheteur = new Personne(nom, adr, mail, tel);
							agence.inscrireClient(acheteur);
							System.out.println();
							agence.vendreBienImmobilier(numBienImmo, agence.listeClient.size()-1, dateRDV);
						}
					} catch (Exception e) {System.out.println(e.getMessage());}
				}
				break;

			default :
				System.out.println("Erreur de saisie ...");
				break;
			}
		}

	}

}
