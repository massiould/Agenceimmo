import java.util.Date;

public class Appartement extends BienImmobilier {	

	 int nombreDePiece;
	 int numeroEtage;
	 int chargesMensuelles;


	public Appartement(String adresse, String orientation, int prix, String dateVente, String dateDeDisponibilite,
			int numeroBienImmobilier, Personne vendeur, int nombreDePiece, int numeroEtage, int chargesMensuelles) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, vendeur);
		this.chargesMensuelles = chargesMensuelles;
		this.numeroEtage = numeroEtage;
		this.nombreDePiece = nombreDePiece;
	}



}
