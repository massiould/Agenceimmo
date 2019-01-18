import java.util.Scanner;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Personne {
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
		Scanner clavier = new Scanner(System.in);
		System.out.println("**************************************************************");
		System.out.println("Quel bien cherchez-vous (maison, appartement ou terrain) ?");
		String typeDeBien = "";
		while(typeDeBien != "terrain" || typeDeBien != "maison" || typeDeBien != "appartement") {
			System.out.println("Le nom du bien n'est pas correct, r�pondre : maison, appartement ou terrain.");
			System.out.println("");
			typeDeBien = clavier.nextLine();
		}	
		if (typeDeBien == "terrain") {
			System.out.println(">>> Saisir les informations pour un voeux :");
			System.out.println("");
			System.out.println("Saisir le prix :");
			int prixSouhaite = clavier.nextInt();
			System.out.println("Saisir la surface (m2) :");
			int surfaceSouhaitee = clavier.nextInt();
			System.out.println("Saisir la localisation :");
			String localisationSouhaitee = clavier.nextLine();
			voeux = new Voeux(prixSouhaite, surfaceSouhaitee, localisationSouhaitee, 0, typeDeBien);
		} else if(typeDeBien == "maison" || typeDeBien == "appartement") {
			System.out.println(">>> Saisir les informations pour un voeux :");
			System.out.println("");
			System.out.println("Saisir le prix :");
			int prixSouhaite = clavier.nextInt();
			System.out.println("Saisir la surface (m2) :");
			int surfaceSouhaitee = clavier.nextInt();
			System.out.println("Saisir le nombre de piece (si terrain ne rien saisir et taper sur entrer) :");
			int nbPieceSouhaitee = clavier.nextInt();
			System.out.println("Saisir la localisation :");
			String localisationSouhaitee = clavier.nextLine();
			voeux = new Voeux(prixSouhaite, surfaceSouhaitee, localisationSouhaitee, nbPieceSouhaitee, typeDeBien);
		}
		this.voeux = voeux;
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

