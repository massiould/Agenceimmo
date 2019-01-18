/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Morale extends Personne {
	long numeroSiren;
	String formeJuridique;
	
	public Morale(String nom, String adressePersonne, String mail, String numeroDeTelephone, Voeux voeux, String formeJuridique, long numeroSiren) {
		super(mail, numeroDeTelephone, nom, adressePersonne, voeux);
		this.formeJuridique = formeJuridique;
		this.numeroSiren = numeroSiren;
	}
	
	/**
	 * Retourne la forme juridique d'une personne morale
	 * 
	 * @return formeJuridique of Personne Morale
	 */
	public String getformeJuridique(){
		   return this.formeJuridique;
		 }

	/**
	 * Retourne le numero siren d'une persone morale
	 * 
	 * @return numeroSiren of Personne Morale
	 */
	public long numeroSiren(){
		   return this.numeroSiren;
		 }
}
