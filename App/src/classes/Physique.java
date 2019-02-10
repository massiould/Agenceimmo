package classes;

import java.io.Serializable;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Physique extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1670018402654659090L;

	public Physique(String nom, String adressePersonne, String mail, String numeroDeTelephone, Voeux voeux) {
		super(mail, numeroDeTelephone, nom, adressePersonne, voeux);
	}

	public Physique(String nom, String adressePersonne, String mail, String numeroDeTelephone) {
		super(mail, numeroDeTelephone, nom, adressePersonne);
	}
	
	/**
	 * Retourne la représentation d'une personne
	 * @return personne
	 */
	public String toString() {
		String rep = "";
		return rep += this.nom;
	}
}

