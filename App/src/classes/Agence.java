package classes;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3738094593710862796L;
	private String nomAgence;
	private List<RDV> listeRDV; 
	private List<Annonce> listeAnnonce;
	private List<BienImmobilier> listeBienImmobilier;
	private List<Personne> listeClient;
	private List<BienImmobilier> listeBienImmobilierVendu;


	public Agence(String nomAgence) {
		this.setNomAgence(nomAgence);
		this.listeRDV = new ArrayList<RDV>();
		this.setListeAnnonce(new ArrayList<Annonce>());
		this.setListeBienImmobilier(new ArrayList<BienImmobilier>());
		this.setListeClient(new ArrayList<Personne>());
		this.setListeBienImmobilierVendu(new ArrayList<BienImmobilier>());
	}

	/**
	 * Permet d'inscrire un bien immobilier a la vente
	 * 
	 * @param personne, adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier
	 * 
	 */
	public void inscrireBienImmo(Personne vendeur, String adresse, String orientation, int prix, String dateDeDisponibilite, String typeDeBien) {
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
			this.getListeBienImmobilier().add(bienImmo);
			if(!this.listeClient.contains(vendeur)) {
				this.getListeClient().add(vendeur);
			}
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
			this.getListeBienImmobilier().add(bienImmo1);
			if(!this.listeClient.contains(vendeur)) {
				this.getListeClient().add(vendeur);
			}
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
			System.out.println("Donner le moyen de chauffage :");
			String moyenDeChauffage1 = clavier.next();
			BienImmobilier bienImmo2 = new Maison(adresse, orientation, prix, dateDeDisponibilite, vendeur, nombreDePiece1, numeroEtage, chargesMensuelles, moyenDeChauffage1);
			this.getListeBienImmobilier().add(bienImmo2);
			if(!this.listeClient.contains(vendeur)) {
				this.getListeClient().add(vendeur);
			}
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Permet de retirer un bien immobilier à la vente
	 * @param bienImmobilier
	 */
	public void retirerBienImmobilier(int numero) {
		this.getListeBienImmobilier().remove(numero);
		System.out.println("Le bien immobilier numero "+numero+" a ete supprime.");
	}
	
	/**
	 * Permet de vendre un bien immobilier
	 * @param bienImmobilier, acheteur
	 */
	public void vendreBienImmobilier(int numBienImmo, int numAcheteur, String dateRDV) {
		//BienImmobilier bienImmobilier = this.listeBienImmobilier.get(numBienImmo);
		Personne acheteur = this.listeClient.get(numAcheteur);
		this.listeBienImmobilierVendu.add(this.listeBienImmobilier.get(numBienImmo));
		this.listeBienImmobilier.remove(this.listeBienImmobilier.get(numBienImmo));
		RDV rdvVente = new RDV(dateRDV, TypeRDV.VENTE, this.listeBienImmobilierVendu.get(numBienImmo).vendeur, acheteur);
		this.listeRDV.add(rdvVente);
	}
	
	/**
	 * Permet d'ajouter un client a l'agence pour pouvoir lui proposer des services par la suite
	 * 
	 * @param personne
	 */
	public void inscrireClient(Personne personne) {
		if(this.getListeClient().contains(personne)) {
			System.out.println("Client deja inscrit dans l'agence.");
		} else {
			this.getListeClient().add(personne);
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
		String choix ="";
		for (  BienImmobilier i : this.getListeBienImmobilier()) {
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
	public void retirerAnnonce(Annonce annonce) {
		this.getListeAnnonce().remove(annonce);
	}
	
	/**
	 * Permet d'organiser un rendez-vous
	 * @param bienImmobilier, personne
	 */
	public void organiserRDV(BienImmobilier bienImmobilier, Personne personne, String dateRDV, TypeRDV typeRDV) {
		if(typeRDV == TypeRDV.VENTE) {
			Personne vendeur = bienImmobilier.vendeur;
			RDV rdv = new RDV(dateRDV, typeRDV, vendeur, personne);
			this.listeRDV.add(rdv);
		} else if(typeRDV == TypeRDV.MANDAT) {
			Personne vendeur = bienImmobilier.vendeur;
			RDV rdv = new RDV(dateRDV, typeRDV, vendeur);
			this.listeRDV.add(rdv);
		} else if(typeRDV == TypeRDV.VISITE){
			RDV rdv = new RDV(dateRDV, typeRDV, personne);
			this.listeRDV.add(rdv);
		}
			
	}
	
	/**
	 * 
	 */
	public void creerAnnonce(BienImmobilier bienImmobilier, Media media) {
		Annonce annonce = new Annonce(media, bienImmobilier);
		this.listeAnnonce.add(annonce);
	}
	/**
	 * Permet de recuperer la liste des biens immobilier d'une agence immobiliere (format string)
	 * 
	 * @return rep
	 * 			Liste des biens immobilier de Agence
	 */
	public String getBienImmobilierToString(){
		String rep = "[";
		for (int i = 0; i < this.listeBienImmobilier.size(); i ++) {
			rep += " Index : "+ i +" " + this.listeBienImmobilier.get(i).toString();
		}
		return rep += " ]";
	}
	
	/**
	 * Permet de recuperer la liste des biens immobilier vendus d'une agence immobiliere (format string)
	 * 
	 * @return rep
	 * 			Liste des biens immobilier de Agence
	 */
	public String getBienImmobilierVenduToString(){
		String rep = "[";
		for (int i = 0; i < this.listeBienImmobilierVendu.size(); i ++) {
			rep += " Index : "+ i +" " + this.listeBienImmobilierVendu.get(i).toString();
		}
		return rep += " ]";
	}
	
	/**
	 * Permet de recuperer la liste des clients d'une agence immobiliere (format string)
	 * 
	 * @return rep
	 * 			Liste des clients de Agence
	 */
	public String getClientsToString() {
		String rep = "[";
		for (int i = 0; i < this.getListeClient().size(); i++) {
			rep += " Index : "+ i + " " + this.getListeClient().get(i).toString();
		}
		return rep += " ]";
	}
	
	/**
	 * Permet de recuperer la liste des annonces (format string)
	 * @return rep
	 * 			Liste des annonces de Agence
	 */
	public String getAnnonceToString() {
		String rep = "[";
		for (int i = 0; i < this.getListeAnnonce().size(); i++) {
			rep += "Index : "+ i + " " + this.getListeAnnonce().get(i).toString();
		}
		return rep += "]";
	}
	
	/**
	 * @return the listeClient
	 */
	public List<Personne> getListeClient() {
		return listeClient;
	}

	/**
	 * @param listeClient the listeClient to set
	 */
	public void setListeClient(List<Personne> listeClient) {
		this.listeClient = listeClient;
	}

	/**
	 * @return the listeBienImmobilier
	 */
	public List<BienImmobilier> getListeBienImmobilier() {
		return listeBienImmobilier;
	}

	/**
	 * @param listeBienImmobilier the listeBienImmobilier to set
	 */
	public void setListeBienImmobilier(List<BienImmobilier> listeBienImmobilier) {
		this.listeBienImmobilier = listeBienImmobilier;
	}

	/**
	 * @return the nomAgence
	 */
	public String getNomAgence() {
		return nomAgence;
	}

	/**
	 * @param nomAgence the nomAgence to set
	 */
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	/**
	 * @return the listeAnnonce
	 */
	public List<Annonce> getListeAnnonce() {
		return listeAnnonce;
	}

	/**
	 * @param listeAnnonce the listeAnnonce to set
	 */
	public void setListeAnnonce(List<Annonce> listeAnnonce) {
		this.listeAnnonce = listeAnnonce;
	}

	/**
	 * @return the listeBienImmobilierVendu
	 */
	public List<BienImmobilier> getListeBienImmobilierVendu() {
		return listeBienImmobilierVendu;
	}

	/**
	 * @param listeBienImmobilierVendu the listeBienImmobilierVendu to set
	 */
	public void setListeBienImmobilierVendu(List<BienImmobilier> listeBienImmobilierVendu) {
		this.listeBienImmobilierVendu = listeBienImmobilierVendu;
	}
	
	public static void main(String args[]) {
		Agence agence = new Agence("Agence Toulouse");
		Personne p1 = new Physique("Kamal", "6 rue Antonio", "mail@hotmail.fr", "0698565681");
		Personne p2 = new Physique("Massi", "5 rue Antonio", "mail@baba.fr", "1894894984");
		
		agence.inscrireClient(p1);
		agence.inscrireClient(p2);
		
		agence.inscrireBienImmo(p1, "11 rue les Lillas", "sud", 3000, "2019-04-03", "maison");
		
		System.out.println(agence.getBienImmobilierToString());
		System.out.println(agence.getClientsToString());
		
		agence.vendreBienImmobilier(0, 1, "2019-03-09");
		System.out.println(agence.getBienImmobilierToString());
		System.out.println(agence.getBienImmobilierVenduToString());
		
		p2.setVoeux();
	}
}
