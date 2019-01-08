import java.util.Date;

public class Maison extends BienImmobilier{
		private int SurfaceHabitable;
		private int NombrePiece;
		private int NombreEtage;
		private String MoyenDeChauffage ;
	public Maison(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier);
		this.MoyenDeChauffage=MoyenDeChauffage;
		this.NombreEtage=NombreEtage;
		this.NombrePiece=NombrePiece;
		// TODO Auto-generated constructor stub
	}

}
