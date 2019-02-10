package classes;
/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.io.Serializable;

public class Terrain extends BienImmobilier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243124643131078937L;
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
