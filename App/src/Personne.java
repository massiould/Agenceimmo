/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Personne {

	String nom;
	String adressePersonne;
	String mail;
	String numeroDeTelephone;
	Voeux voeux;

	public Personne (String mail ,String numeroDeTelephone ,String nom , String adressePersonne , Voeux voeux){
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

