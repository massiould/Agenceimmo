import java.util.Date;

public class Terrain extends BienImmobilier {
	 int surfaceSol;
	 int longueurFacade;


	public Terrain(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier, Personne vendeur, int surfaceSol, int longueurFacade) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, vendeur);
		this.longueurFacade= longueurFacade;
		this.surfaceSol = surfaceSol;
	}


}
