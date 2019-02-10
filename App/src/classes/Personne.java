package classes;
import java.io.Serializable;
import java.util.Scanner;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Personne implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3655884138078119163L;
	String nom;
	String adressePersonne;
	String mail;
	String numeroDeTelephone;
	Voeux voeux;

	public Personne(String nom, String adressePersonne, String mail, String numeroDeTelephone){
		this.nom = nom;
		this.adressePersonne = adressePersonne;
		this.mail = mail;
		this.numeroDeTelephone = numeroDeTelephone;
		this.voeux = null;
	}

	public Personne(String nom, String adressePersonne, String mail, String numeroDeTelephone, Voeux voeux){
		this.nom = nom;
		this.adressePersonne = adressePersonne;
		this.mail = mail;
		this.numeroDeTelephone = numeroDeTelephone;
		this.voeux = voeux;
	}

	/**
	 * Retourne le nom d'une personne
	 * 
	 * @return nom of Personne
	 */
	public String getNom(){
		return this.nom;
	}

	/**
	 * Retourne le voeux d'une personne
	 * 
	 * @return voeux of Personne
	 */
	public Voeux getVoeux() {
		return this.voeux;
	}

	/**
	 * Modifie le voeux d'une personne 
	 * @param voeux
	 */
	public void setVoeux() {
		Scanner cl = new Scanner(System.in);
		System.out.println();
		//System.out.println("**************************************************************");
		System.out.println("Quel type de bien cherchez-vous ?");
		String typeDeBien = cl.next();
		while(!typeDeBien.equals("terrain") && !typeDeBien.equals("appartement") && !typeDeBien.equals("maison")) {
			System.out.println("Ressaisir (terrain, appartement ou maison) :");
			System.out.println(typeDeBien);
			typeDeBien = cl.next();		
		}
		try {
			if (typeDeBien.equals("terrain")) {
				System.out.println(">>> Saisir les informations pour un voeux");
				System.out.println("");
				System.out.println("Saisir le prix :");
				int prixSouhaite = cl.nextInt();
				System.out.println("Saisir la surface (m2) :");
				int surfaceSouhaitee = cl.nextInt();
				System.out.println("Saisir la localisation :");
				String localisationSouhaitee = cl.next();
				voeux = new Voeux(prixSouhaite, surfaceSouhaitee, localisationSouhaitee, 0, typeDeBien, surfaceSouhaitee, surfaceSouhaitee, surfaceSouhaitee);

			} else if(typeDeBien.equals("maison") || typeDeBien.equals("appartement")) {
				System.out.println(">>> Saisir les informations pour un voeux");
				System.out.println("");
				System.out.println("Saisir le prix :");
				int prixSouhaite = cl.nextInt();
				System.out.println("Saisir la surface (m2) :");
				int surfaceSouhaitee = cl.nextInt();
				System.out.println("Saisir le nombre de piece (si terrain ne rien saisir et taper sur entrer) :");
				int nbPieceSouhaitee = cl.nextInt();
				System.out.println("Saisir la localisation :");
				String localisationSouhaitee = cl.next();
				voeux = new Voeux(prixSouhaite, surfaceSouhaitee, localisationSouhaitee, nbPieceSouhaitee, typeDeBien, nbPieceSouhaitee, nbPieceSouhaitee, nbPieceSouhaitee);
			}
			this.voeux = voeux;
			System.out.println("Le voeux a été changé !");
		} catch (Exception e) {
			System.out.println("Erreur de saisie");
		}
	}

	/**
	 * Retourne l'adresse d'une personne
	 * 
	 * @return adressePersonne of Personne
	 */
	public String getAdressePersonne(){
		return this.adressePersonne;
	}

	/**
	 * Retourne le mail d'une personne
	 * 
	 * @return mail of Personne
	 */
	public String getMail(){
		return this.mail;
	}

	/**
	 * Retourne le numero de telephone d'une perosonne
	 * @return numeroDeTelephone of Personne
	 */
	public String getNumeroDeTelephone(){
		return this.numeroDeTelephone;
	}

}

