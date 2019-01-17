/*
 * @author Kamal Aarab
 */



public class Annonce {

	private Media media;
	private BienImmobilier bienImmobilier;
	private Agence agence;
	
	public Annonce(Media media, Agence agence) {
		this.media = media;
		this.bienImmobilier = null;



		this.agence = agence;

		
	}
	
	/*
	 * Permet d'ajouter une annonce à une agence pour un bien immobilier.
	 *
	 * @param bienImmo
	 * 				Le bien immobilier à qui ajouter l'annonce.
	 */
	public void ajouterAnnonce(BienImmobilier bienImmo) {
		this.bienImmobilier = bienImmo;
		
	}
}
