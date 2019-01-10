import java.util.Date;

public class Terrain extends BienImmobilier {
	private int SurfaceSol;
	private int LongeurFacade;
	

	public Terrain(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier);
		this.LongeurFacade=LongeurFacade;
		this.SurfaceSol=SurfaceSol;
		// TODO Auto-generated constructor stub
	}
	

}
