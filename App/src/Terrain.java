/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.Date;

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


	/**
	 * @param surfaceSol the surfaceSol to set
	 */
	public void setSurfaceSol(int surfaceSol) {
		this.surfaceSol = surfaceSol;
	}


	/**
	 * @return the longueurFacade
	 */
	public int getLongueurFacade() {
		return longueurFacade;
	}


	/**
	 * @param longueurFacade the longueurFacade to set
	 */
	public void setLongueurFacade(int longueurFacade) {
		this.longueurFacade = longueurFacade;
	}
}
