/*
 * @author Kamal Aarab
 */



public class Annonce {

	private Media media;
	private BienImmobilier bienImmobilier;
	private Agence agence;
	
	public Annonce(Media media) {
		this.media = media;
		this.bienImmobilier = null;
		this.agence = null;
		
	}
	
	/*
	 * Permet d'ajouter une annonce � une agence pour un bien immobilier.
	 * @param agence
	 * 				L'agence � qui ajouter l'annonce.
	 * @param bienImmo
	 * 				Le bien immobilier � qui ajouter l'annonce.
	 */
	public void ajouterAnnonce(Agence agence, BienImmobilier bienImmo) {
		this.agence = agence;
		this.bienImmobilier = bienImmo;
		
	}
}
