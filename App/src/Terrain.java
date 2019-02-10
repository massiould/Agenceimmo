
/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Terrain extends BienImmobilier {

	int surfaceSol;
	int longueurFacade;


	public Terrain(String adresse, String orientation, int prix, String dateDeDisponibilite, Personne vendeur, int surfaceSol, int longueurFacade) {
		super(adresse, orientation, prix, dateDeDisponibilite, vendeur);
		this.surfaceSol = surfaceSol;
		this.longueurFacade = longueurFacade;
	}


	/**
	 * @return the surfaceSol
	 */
	public int getSurfaceSol() {
		return surfaceSol;
	}
}

