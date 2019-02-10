/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class RDV {
	String dateRDV;
	String typeRDV;
	Personne vendeur;
	Personne acheteur;

	public RDV(String dateRDV, String typeRDV, Personne vendeur, Personne acheteur) {
		this.dateRDV = dateRDV;
		this.typeRDV = typeRDV;
		this.vendeur = vendeur;
		this.acheteur = acheteur;
	}
}