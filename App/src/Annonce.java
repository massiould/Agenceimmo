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
	 * Permet d'ajouter une annonce à une agence pour un bien immobilier.
	 * @param agence
	 * 				L'agence à qui ajouter l'annonce.
	 * @param bienImmo
	 * 				Le bien immobilier à qui ajouter l'annonce.
	 */
	public void ajouterAnnonce(Agence agence, BienImmobilier bienImmo) {
		this.agence = agence;
		this.bienImmobilier = bienImmo;
		
	}
}
